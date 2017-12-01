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
 * @since Available in iOS 9.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKFetchWebAuthTokenOperation/*</name>*/ 
    extends /*<extends>*/CKDatabaseOperation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKFetchWebAuthTokenOperationPtr extends Ptr<CKFetchWebAuthTokenOperation, CKFetchWebAuthTokenOperationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKFetchWebAuthTokenOperation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKFetchWebAuthTokenOperation() {}
    protected CKFetchWebAuthTokenOperation(Handle h, long handle) { super(h, handle); }
    protected CKFetchWebAuthTokenOperation(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAPIToken:")
    public CKFetchWebAuthTokenOperation(String APIToken) { super((SkipInit) null); initObject(initWithAPIToken(APIToken)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "APIToken")
    public native String getAPIToken();
    @Property(selector = "setAPIToken:")
    public native void setAPIToken(String v);
    @Property(selector = "fetchWebAuthTokenCompletionBlock")
    public native @Block VoidBlock2<String, NSError> getFetchWebAuthTokenCompletionBlock();
    @Property(selector = "setFetchWebAuthTokenCompletionBlock:")
    public native void setFetchWebAuthTokenCompletionBlock(@Block VoidBlock2<String, NSError> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAPIToken:")
    protected native @Pointer long initWithAPIToken(String APIToken);
    /*</methods>*/
}
