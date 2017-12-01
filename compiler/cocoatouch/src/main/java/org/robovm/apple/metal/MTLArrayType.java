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
package org.robovm.apple.metal;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLArrayType/*</name>*/ 
    extends /*<extends>*/MTLType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLArrayTypePtr extends Ptr<MTLArrayType, MTLArrayTypePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLArrayType.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLArrayType() {}
    protected MTLArrayType(Handle h, long handle) { super(h, handle); }
    protected MTLArrayType(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "elementType")
    public native MTLDataType getElementType();
    @Property(selector = "arrayLength")
    public native @MachineSizedUInt long getArrayLength();
    @Property(selector = "stride")
    public native @MachineSizedUInt long getStride();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "argumentIndexStride")
    public native @MachineSizedUInt long getArgumentIndexStride();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "elementStructType")
    public native MTLStructType getElementStructType();
    @Method(selector = "elementArrayType")
    public native MTLArrayType getElementArrayType();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "elementTextureReferenceType")
    public native MTLTextureReferenceType elementTextureReferenceType();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "elementPointerType")
    public native MTLPointerType elementPointerType();
    /*</methods>*/
}
