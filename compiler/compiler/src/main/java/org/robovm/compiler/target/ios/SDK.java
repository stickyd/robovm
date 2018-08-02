/*
 * Copyright (C) 2013 RoboVM AB
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.compiler.target.ios;

import static java.util.Collections.emptyList;
import static org.apache.commons.lang3.Validate.notNull;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.dd.plist.NSDictionary;
import com.dd.plist.NSObject;
import com.dd.plist.PropertyListParser;
import org.apache.commons.exec.util.StringUtils;
import org.apache.commons.lang3.Validate;
import org.robovm.compiler.util.ToolchainUtil;

/**
 * Contains info on an SDK installed on the system.
 */
public class SDK implements Comparable<SDK> {
    private static final String ADDITIONAL_SDK_LOCATION = "/Library/Developer/CoreSimulator/Profiles/Runtimes";
    private static final String IOS_SIMULATOR_MAJOR_MINOR_VERSION_REGEX = "iOS ([0-9]{1,2}).([0-9]{1,2}).simruntime";
    private static final Pattern IOS_SIMULATOR_MAJOR_MINOR_VERSION_REGEX_PATTERN = Pattern.compile(IOS_SIMULATOR_MAJOR_MINOR_VERSION_REGEX);

    private String displayName;
    private String minimalDisplayName;
    private String canonicalName;
    private String version;
    private File root;
    private NSDictionary defaultProperties;
    private int major;
    private int minor;
    private int revision;
    private String build;
    private String platformBuild;
    private String platformVersion;
    private String platformName;

    /**
     * Create an SDK instance for an SDK root bundled with Xcode.
     */
    public static SDK create(File root) throws Exception {
        File sdkSettingsFile = new File(root, "SDKSettings.plist");
        File sdkSysVersionFile = new File(root, "System/Library/CoreServices/SystemVersion.plist");
        File platformVersionFile = new File(root, "../../../version.plist");
        File platformInfoFile = new File(root, "../../../Info.plist");
        if (sdkSettingsFile.exists() && platformInfoFile.exists()) {
            NSDictionary sdkSettingsDict = (NSDictionary) PropertyListParser.parse(sdkSettingsFile);
            NSDictionary sdkSysVersionDict = (NSDictionary) PropertyListParser.parse(sdkSysVersionFile);
            NSDictionary platformInfoDict = (NSDictionary) PropertyListParser.parse(platformInfoFile);

            SDK sdk = new SDK();

            sdk.root = root;

            sdk.displayName = toString(sdkSettingsDict.objectForKey("DisplayName"));
            sdk.minimalDisplayName = toString(sdkSettingsDict.objectForKey("MinimalDisplayName"));
            sdk.canonicalName = toString(sdkSettingsDict.objectForKey("CanonicalName"));
            sdk.version = toString(sdkSettingsDict.objectForKey("Version"));
            sdk.defaultProperties = (NSDictionary) sdkSettingsDict.objectForKey("DefaultProperties");

            sdk.build = toString(sdkSysVersionDict.objectForKey("ProductBuildVersion"));

            if (platformVersionFile.exists()) {
                NSDictionary platformVersionDict = (NSDictionary) PropertyListParser.parse(platformVersionFile);
                sdk.platformBuild = toString(platformVersionDict.objectForKey("ProductBuildVersion"));
            } else {
                // iOS 9 and above, there's no version.plist file anymore
                // however, the ProductBuildVersion in SystemVersion.plist
                // seems to always be the same as the ProductBuildVersion
                // in the now missing version.plist file
                sdk.platformBuild = sdk.build;
            }

            NSDictionary additionalInfo = (NSDictionary) platformInfoDict.objectForKey("AdditionalInfo");
            sdk.platformVersion = toString(additionalInfo.objectForKey("DTPlatformVersion"));
            sdk.platformName = toString(additionalInfo.objectForKey("DTPlatformName"));

            String[] parts = StringUtils.split(sdk.version, ".");
            sdk.major = Integer.parseInt(parts[0]);
            sdk.minor = parts.length >= 2 ? Integer.parseInt(parts[1]) : 0;
            sdk.revision = parts.length >= 3 ? Integer.parseInt(parts[2]) : 0;

            return sdk;
        }
        throw new IllegalArgumentException(root.getAbsolutePath() + " is not an SDK root path");
    }

    private static String toString(NSObject o) {
        return o != null ? o.toString() : null;
    }

    private static List<SDK> listSDKs(String platform) {
        List<SDK> allSdks = new ArrayList<>(listBundledFileFormatSdks(platform));
        return allSdks;
    }

    private static Collection<? extends SDK> listAdditionalFileFormatSdks() {
        File sdksDir = new File(ADDITIONAL_SDK_LOCATION);
        if (!sdksDir.isDirectory()) {
            return emptyList();
        }

        List<SDK> sdks = new ArrayList<>();

        for (File sdkRoot : notNull(sdksDir.listFiles())) {
            if (sdkRoot.getName().matches(IOS_SIMULATOR_MAJOR_MINOR_VERSION_REGEX)) {
                sdks.add(createAdditionalFileFormatSdk(sdkRoot));
            }
        }

        return sdks;
    }

    /**
     * New directory format SDKs, as downloaded by Xcode version >= 8.3.
     * <p>Fills only some of the data of the SDK, but enough to use it as Simulator.</p>
     */
    static SDK createAdditionalFileFormatSdk(File sdkRootDir) {

        Matcher matcher = IOS_SIMULATOR_MAJOR_MINOR_VERSION_REGEX_PATTERN.matcher(sdkRootDir.getName());
        Validate.isTrue(matcher.find());

        String majorVersion = matcher.group(1);
        String minorVersion = matcher.group(2);

        String name = sdkRootDir.getName();

        SDK sdk = new SDK();
        sdk.major = Integer.valueOf(majorVersion);
        sdk.minor = Integer.valueOf(minorVersion);
        sdk.minimalDisplayName = name;
        sdk.displayName = name;
        sdk.canonicalName = name;
        sdk.version = majorVersion + "." + minorVersion;
        sdk.root = sdkRootDir;

        return sdk;
    }

    /**
     * List SDKs bundled with Xcode.
     */
    private static Collection<? extends SDK> listBundledFileFormatSdks(String platform) {
        try {
            List<SDK> sdks = new ArrayList<SDK>();
            File sdksDir = new File(ToolchainUtil.findXcodePath() + "/Platforms/"
                    + platform + ".platform/Developer/SDKs");
            if (sdksDir.exists() && sdksDir.isDirectory()) {
                for (File root : sdksDir.listFiles()) {
                    try {
                        sdks.add(SDK.create(root));
                    } catch (Exception e) {
                    }
                }
            }

            return sdks;
        } catch (RuntimeException e) {
            throw e;
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static List<SDK> listDeviceSDKs() {
        return listSDKs("iPhoneOS");
    }

    public static List<SDK> listSimulatorSDKs() {
        List<SDK> sdks = listSDKs("iPhoneSimulator");
        sdks.addAll(listAdditionalFileFormatSdks());
        return sdks;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getMinimalDisplayName() {
        return minimalDisplayName;
    }

    public String getCanonicalName() {
        return canonicalName;
    }

    public String getVersion() {
        return version;
    }

    public File getRoot() {
        return root;
    }

    public NSDictionary getDefaultProperties() {
        return defaultProperties;
    }

    public NSObject getDefaultProperty(String key) {
        return defaultProperties.objectForKey(key);
    }

    public String getBuild() {
        return build;
    }

    public String getPlatformBuild() {
        return platformBuild;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public String getPlatformName() {
        return platformName;
    }

    public int getMajor() {
        return major;
    }

    public int getMinor() {
        return minor;
    }

    public int getRevision() {
        return revision;
    }

    /**
     * @return version code packed in int as it is used widely in Apple Mach-o
     */
    public int getVersionCode() {
        // there is overflow possible but this should not happen if SDK is not corrupted
        return (major << 16) | (minor << 8) | revision;
    }

    @Override
    public int compareTo(SDK o) {
        int c = major < o.major ? -1 : (major > o.major ? 1 : 0);
        if (c == 0) {
            c = minor < o.minor ? -1 : (minor > o.minor ? 1 : 0);
            if (c == 0) {
                c = revision < o.revision ? -1 : (revision > o.revision ? 1 : 0);
                if (c == 0) {
                    // exactly same
                    // special sorting case: but if the path contains iPhoneOS.sdk without version make version lower
                    c = getRoot().getAbsolutePath().contains("iPhoneOS.sdk") ? 0 : 1;
                    c -= o.getRoot().getAbsolutePath().contains("iPhoneOS.sdk") ? 0 : 1;
                }
            }
        }
        return c;
    }

    @Override
    public String toString() {
        return "SDK [displayName=" + displayName + ", minimalDisplayName="
                + minimalDisplayName + ", canonicalName=" + canonicalName
                + ", version=" + version + ", root=" + root + ", major="
                + major + ", minor=" + minor + ", revision=" + revision
                + ", build=" + build + ", platformBuild=" + platformBuild
                + ", platformVersion=" + platformVersion + ", platformName="
                + platformName + "]";
    }
}
