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
package org.robovm.apple.cloudkit;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.fileprovider.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 * @deprecated Deprecated in iOS 10.0.
 */
@Deprecated
/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKDiscoverUserInfosOperation/*</name>*/ 
    extends /*<extends>*/CKOperation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKDiscoverUserInfosOperationPtr extends Ptr<CKDiscoverUserInfosOperation, CKDiscoverUserInfosOperationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKDiscoverUserInfosOperation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKDiscoverUserInfosOperation() {}
    protected CKDiscoverUserInfosOperation(Handle h, long handle) { super(h, handle); }
    protected CKDiscoverUserInfosOperation(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEmailAddresses:userRecordIDs:")
    public CKDiscoverUserInfosOperation(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> emailAddresses, NSArray<CKRecordID> userRecordIDs) { super((SkipInit) null); initObject(init(emailAddresses, userRecordIDs)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "emailAddresses")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getEmailAddresses();
    @Property(selector = "setEmailAddresses:")
    public native void setEmailAddresses(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "userRecordIDs")
    public native NSArray<CKRecordID> getUserRecordIDs();
    @Property(selector = "setUserRecordIDs:")
    public native void setUserRecordIDs(NSArray<CKRecordID> v);
    @Property(selector = "discoverUserInfosCompletionBlock")
    public native @Block VoidBlock3<NSDictionary<NSString, CKDiscoveredUserInfo>, NSDictionary<CKRecordID, CKDiscoveredUserInfo>, NSError> getDiscoverUserInfosCompletionBlock();
    @Property(selector = "setDiscoverUserInfosCompletionBlock:")
    public native void setDiscoverUserInfosCompletionBlock(@Block VoidBlock3<NSDictionary<NSString, CKDiscoveredUserInfo>, NSDictionary<CKRecordID, CKDiscoveredUserInfo>, NSError> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEmailAddresses:userRecordIDs:")
    protected native @Pointer long init(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> emailAddresses, NSArray<CKRecordID> userRecordIDs);
    /*</methods>*/
}
