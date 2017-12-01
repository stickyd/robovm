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
/*<annotations>*/@Library("Metal") @NativeProtocolProxy/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/MTLBuffer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MTLResource/*</implements>*/ {

    /*<ptr>*/public static class MTLBufferPtr extends Ptr<MTLBuffer, MTLBufferPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLBuffer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "length")
    public native @MachineSizedUInt long getLength();
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "device")
    public native MTLDevice getDevice();
    @Property(selector = "cpuCacheMode")
    public native MTLCPUCacheMode getCpuCacheMode();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "storageMode")
    public native MTLStorageMode getStorageMode();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Property(selector = "heap")
    public native MTLHeap getHeap();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "allocatedSize")
    public native @MachineSizedUInt long getAllocatedSize();
    /*</properties>*/
    /*<members>*//*</members>*/
    public ByteBuffer getContents() {
        return VM.newDirectByteBuffer(getContents0(), (int) getLength());
    }
    /*<methods>*/
    @Method(selector = "contents")
    protected native @Pointer long getContents0();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "newTextureWithDescriptor:offset:bytesPerRow:")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSObject.NoRetainMarshaler.class) MTLTexture newTexture(MTLTextureDescriptor descriptor, @MachineSizedUInt long offset, @MachineSizedUInt long bytesPerRow);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "addDebugMarker:range:")
    public native void addDebugMarker(String marker, @ByVal NSRange range);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "removeAllDebugMarkers")
    public native void removeAllDebugMarkers();
    @Method(selector = "setPurgeableState:")
    public native MTLPurgeableState setPurgeableState(MTLPurgeableState state);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "makeAliasable")
    public native void makeAliasable();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "isAliasable")
    public native boolean isAliasable();
    /*</methods>*/
}
