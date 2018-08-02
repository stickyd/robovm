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
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNSpatialNormalizationGradientNode/*</name>*/ 
    extends /*<extends>*/MPSNNGradientFilterNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNSpatialNormalizationGradientNodePtr extends Ptr<MPSCNNSpatialNormalizationGradientNode, MPSCNNSpatialNormalizationGradientNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNSpatialNormalizationGradientNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNSpatialNormalizationGradientNode() {}
    protected MPSCNNSpatialNormalizationGradientNode(Handle h, long handle) { super(h, handle); }
    protected MPSCNNSpatialNormalizationGradientNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSourceGradient:sourceImage:gradientState:kernelSize:")
    public MPSCNNSpatialNormalizationGradientNode(MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNGradientStateNode gradientState, @MachineSizedUInt long kernelSize) { super((SkipInit) null); initObject(init(sourceGradient, sourceImage, gradientState, kernelSize)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "kernelWidth")
    public native @MachineSizedUInt long getKernelWidth();
    @Property(selector = "setKernelWidth:")
    public native void setKernelWidth(@MachineSizedUInt long v);
    @Property(selector = "kernelHeight")
    public native @MachineSizedUInt long getKernelHeight();
    @Property(selector = "setKernelHeight:")
    public native void setKernelHeight(@MachineSizedUInt long v);
    @Property(selector = "alpha")
    public native float getAlpha();
    @Property(selector = "setAlpha:")
    public native void setAlpha(float v);
    @Property(selector = "beta")
    public native float getBeta();
    @Property(selector = "setBeta:")
    public native void setBeta(float v);
    @Property(selector = "delta")
    public native float getDelta();
    @Property(selector = "setDelta:")
    public native void setDelta(float v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSourceGradient:sourceImage:gradientState:kernelSize:")
    protected native @Pointer long init(MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNGradientStateNode gradientState, @MachineSizedUInt long kernelSize);
    /*</methods>*/
}
