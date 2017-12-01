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
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEVPNProtocol/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NEVPNProtocolPtr extends Ptr<NEVPNProtocol, NEVPNProtocolPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEVPNProtocol.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEVPNProtocol() {}
    protected NEVPNProtocol(Handle h, long handle) { super(h, handle); }
    protected NEVPNProtocol(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NEVPNProtocol(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "serverAddress")
    public native String getServerAddress();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setServerAddress:")
    public native void setServerAddress(String v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "username")
    public native String getUsername();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setUsername:")
    public native void setUsername(String v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "passwordReference")
    public native NSData getPasswordReference();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setPasswordReference:")
    public native void setPasswordReference(NSData v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "identityReference")
    public native NSData getIdentityReference();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setIdentityReference:")
    public native void setIdentityReference(NSData v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "identityData")
    public native NSData getIdentityData();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setIdentityData:")
    public native void setIdentityData(NSData v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "identityDataPassword")
    public native String getIdentityDataPassword();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setIdentityDataPassword:")
    public native void setIdentityDataPassword(String v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "disconnectOnSleep")
    public native boolean disconnectsOnSleep();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setDisconnectOnSleep:")
    public native void setDisconnectsOnSleep(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "proxySettings")
    public native NEProxySettings getProxySettings();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setProxySettings:")
    public native void setProxySettings(NEProxySettings v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
