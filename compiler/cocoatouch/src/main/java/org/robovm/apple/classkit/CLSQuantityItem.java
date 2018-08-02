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
package org.robovm.apple.classkit;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ClassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLSQuantityItem/*</name>*/ 
    extends /*<extends>*/CLSActivityItem/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CLSQuantityItemPtr extends Ptr<CLSQuantityItem, CLSQuantityItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CLSQuantityItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CLSQuantityItem() {}
    protected CLSQuantityItem(Handle h, long handle) { super(h, handle); }
    protected CLSQuantityItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:title:")
    public CLSQuantityItem(String identifier, String title) { super((SkipInit) null); initObject(init(identifier, title)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "quantity")
    public native double getQuantity();
    @Property(selector = "setQuantity:")
    public native void setQuantity(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:title:")
    protected native @Pointer long init(String identifier, String title);
    /*</methods>*/
}
