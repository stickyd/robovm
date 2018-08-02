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
package org.robovm.apple.metalps;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSNNImageNode/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSNNImageNodePtr extends Ptr<MPSNNImageNode, MPSNNImageNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSNNImageNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MPSNNImageNode() {}
    protected MPSNNImageNode(Handle h, long handle) { super(h, handle); }
    protected MPSNNImageNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithHandle:")
    public MPSNNImageNode(MPSHandle handle) { super((SkipInit) null); initObject(initWithHandle(handle)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "handle")
    public native MPSHandle getGetMpsHandle();
    @Property(selector = "setHandle:")
    public native void setGetMpsHandle(MPSHandle v);
    @Property(selector = "format")
    public native MPSImageFeatureChannelFormat getFormat();
    @Property(selector = "setFormat:")
    public native void setFormat(MPSImageFeatureChannelFormat v);
    @Property(selector = "imageAllocator")
    public native MPSImageAllocator getImageAllocator();
    @Property(selector = "setImageAllocator:")
    public native void setImageAllocator(MPSImageAllocator v);
    @Property(selector = "exportFromGraph")
    public native boolean isExportFromGraph();
    @Property(selector = "setExportFromGraph:")
    public native void setExportFromGraph(boolean v);
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "synchronizeResource")
    public native boolean isSynchronizeResource();
    /**
     * @since Available in iOS 11.3 and later.
     */
    @Property(selector = "setSynchronizeResource:")
    public native void setSynchronizeResource(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithHandle:")
    protected native @Pointer long initWithHandle(MPSHandle handle);
    @Method(selector = "nodeWithHandle:")
    public static native MPSNNImageNode nodeWithHandle(MPSHandle handle);
    @Method(selector = "exportedNodeWithHandle:")
    public static native MPSNNImageNode exportedNodeWithHandle(MPSHandle handle);
    /*</methods>*/
}
