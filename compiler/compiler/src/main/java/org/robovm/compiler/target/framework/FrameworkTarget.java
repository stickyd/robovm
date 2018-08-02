package org.robovm.compiler.target.framework;

import com.dd.plist.NSDictionary;
import com.dd.plist.NSObject;
import com.dd.plist.PropertyListParser;
import org.apache.commons.io.FileUtils;
import org.robovm.compiler.clazz.Path;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.OS;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.log.LoggerProxy;
import org.robovm.compiler.target.AbstractTarget;
import org.robovm.compiler.target.ios.SDK;
import org.robovm.compiler.util.Executor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrameworkTarget extends AbstractTarget {

	public static final String TYPE = "framework";

    private OS os;
    private Arch arch;
    private SDK sdk;

    public FrameworkTarget() {
	}

	@Override
	public String getType() {
		return TYPE;
	}

	@Override
	public OS getOs() {
		return os;
	}

	@Override
	public Arch getArch() {
		return arch;
	}

    @Override
	public boolean canLaunch() {
		return false;
	}

	public static boolean isSimulatorArch(Arch arch) {
        return arch == Arch.x86 || arch == Arch.x86_64;
    }

    public static boolean isDeviceArch(Arch arch) {
        return arch == Arch.thumbv7 || arch == Arch.arm64;
    }


    public List<SDK> getSDKs() {
        if (isSimulatorArch(arch)) {
            return SDK.listSimulatorSDKs();
        } else {
            return SDK.listDeviceSDKs();
        }
    }

	public void init(Config paramConfig) {
		super.init(paramConfig);

		os = config.getOs();
        if (os == null)
            os = OS.getDefaultOS();

        arch = config.getArch();
        if (arch == null)
            arch = Arch.getDefaultArch();

		if (os.getFamily() != OS.Family.darwin)
			throw new IllegalArgumentException("Frameworks can only be built for Darwin platforms");
		
		if (paramConfig.getInfoPList() == null)
			throw new IllegalArgumentException("Frameworks must have a Info.plist file");
		paramConfig.getIosInfoPList().parse(paramConfig.getProperties());
		
		String sdkVersion = config.getIosSdkVersion();
        
		List<SDK> sdks = getSDKs();
        if (sdkVersion == null) {
            if (sdks.isEmpty()) {
                throw new IllegalArgumentException("No " + (isDeviceArch(arch) ? "device" : "simulator")
                        + " SDKs installed");
            }
            Collections.sort(sdks);
            this.sdk = sdks.get(sdks.size() - 1);
        }
        else {
            for (SDK sdk : sdks) {
                if (sdk.getVersion().equals(sdkVersion)) {
                    this.sdk = sdk;
                    break;
                }
            }
            if (sdk == null) {
                throw new IllegalArgumentException("No SDK found matching version string " + sdkVersion);
            }
        }		
	}

	@Override
	public String getInstallRelativeArchivePath(Path path) {
		return config.getImageName() + ".bundle/Resources/" + super.getInstallRelativeArchivePath(path);
	}

	@Override
	protected List<String> getTargetExportedSymbols() {
		return Arrays.asList("JNI_*", "rvmInstantiateFramework");
	}
	
	private String getMinimumOSVersion() {
		NSObject minimumOSVersion = config.getInfoPList().getDictionary().objectForKey("MinimumOSVersion");
		if (minimumOSVersion != null)
			return minimumOSVersion.toString();
		return "8.0";
	}

	@Override
	protected List<String> getTargetCcArgs() {
		List<String> ccArgs = new ArrayList<String>();
		
		ccArgs.add("-stdlib=libc++");
		
		if (isDeviceArch(arch))
			ccArgs.add("-miphoneos-version-min=" + getMinimumOSVersion());
		else
			ccArgs.add("-mios-simulator-version-min=" + getMinimumOSVersion());
		
		ccArgs.add("-isysroot");
		ccArgs.add(sdk.getRoot().getAbsolutePath());
		
		ccArgs.add("-dynamiclib");
		ccArgs.add("-single_module");
		ccArgs.add("-compatibility_version");
		ccArgs.add("1");
		ccArgs.add("-current_version");
		ccArgs.add("1");
		
		if (this.config.getArch() == Arch.x86) {
			ccArgs.add("-read_only_relocs");
			ccArgs.add("suppress");
		}
		
		ccArgs.add("-install_name");
		ccArgs.add(String.format("@rpath/%s.framework/%s", config.getImageName(), config.getImageName()));

		return ccArgs;
	}

	@Override
	protected List<String> getTargetLibs() {
    	// adding framework support library
		String libSuffix = config.isUseDebugLibs() ? "-dbg" : "";
		return Collections.singletonList("-lrobovm-frameworksupport" + libSuffix);
	}


	@Override
	protected void doInstall(File installDir, String image, File resourcesDir) throws IOException {
		File frameworkDir = new File(installDir, image + ".framework");
		
		config.getLogger().info("Creating framework: %s", frameworkDir);
		
		if (frameworkDir.exists())
			FileUtils.deleteDirectory(frameworkDir);
		frameworkDir.mkdirs();
		
		File bundleDir = new File(frameworkDir, image + ".bundle");
		bundleDir.mkdirs();
		
		File bundleResourcesDir = new File(bundleDir, "Resources");
		bundleResourcesDir.mkdirs();
				
		super.doInstall(frameworkDir, image, bundleResourcesDir);
		
		File frameworkBinaryFile = new File(frameworkDir, image);
		File dsymDir = new File(installDir, image + ".dSYM");
		
		config.getLogger().info("Creating framework symbol directory: %s", dsymDir);
		if (dsymDir.exists())
			FileUtils.deleteDirectory(dsymDir);
		dsymDir.mkdirs();
		new Executor(config.getLogger(), "xcrun").args("dsymutil", "-o", dsymDir, frameworkBinaryFile).exec();
		
		if (!config.isDebug()) {
			config.getLogger().info("Striping framework binary: %s", frameworkBinaryFile);
			new Executor(config.getLogger(), "xcrun").args("strip", "-x", frameworkBinaryFile).exec();
		}
		
		NSDictionary infoPlist = config.getInfoPList().getDictionary();
		if (infoPlist.objectForKey("MinimumOSVersion") == null)
			infoPlist.put("MinimumOSVersion", "8.0");
		
		File infoPlistBin = new File(frameworkDir, "Info.plist");
		config.getLogger().info("Installing Info.plist to: %s", infoPlistBin);
		PropertyListParser.saveAsBinary(infoPlist, infoPlistBin);
	}
}
