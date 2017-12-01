/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.networkextension;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEHotspotConfigurationManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NEHotspotConfigurationManagerPtr extends Ptr<NEHotspotConfigurationManager, NEHotspotConfigurationManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEHotspotConfigurationManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEHotspotConfigurationManager() {}
    protected NEHotspotConfigurationManager(Handle h, long handle) { super(h, handle); }
    protected NEHotspotConfigurationManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedManager")
    public static native NEHotspotConfigurationManager getSharedManager();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "applyConfiguration:completionHandler:")
    public native void applyConfiguration(NEHotspotConfiguration configuration, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "removeConfigurationForSSID:")
    public native void removeConfigurationForSSID(String SSID);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "removeConfigurationForHS20DomainName:")
    public native void removeConfigurationForHS20DomainName(String domainName);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "getConfiguredSSIDsWithCompletionHandler:")
    public native void getConfiguredSSIDsWithCompletionHandler(@Block VoidBlock1<NSArray<NSString>> completionHandler);
    /*</methods>*/
}
