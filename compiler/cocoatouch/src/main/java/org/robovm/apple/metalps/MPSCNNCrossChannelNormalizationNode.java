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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNCrossChannelNormalizationNode/*</name>*/ 
    extends /*<extends>*/MPSCNNNormalizationNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNCrossChannelNormalizationNodePtr extends Ptr<MPSCNNCrossChannelNormalizationNode, MPSCNNCrossChannelNormalizationNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNCrossChannelNormalizationNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNCrossChannelNormalizationNode() {}
    protected MPSCNNCrossChannelNormalizationNode(Handle h, long handle) { super(h, handle); }
    protected MPSCNNCrossChannelNormalizationNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSource:kernelSize:")
    public MPSCNNCrossChannelNormalizationNode(MPSNNImageNode sourceNode, @MachineSizedUInt long kernelSize) { super((SkipInit) null); initObject(init(sourceNode, kernelSize)); }
    @Method(selector = "initWithSource:")
    public MPSCNNCrossChannelNormalizationNode(MPSNNImageNode sourceNode) { super((SkipInit) null); initObject(initWithSource(sourceNode)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "kernelSizeInFeatureChannels")
    public native @MachineSizedUInt long getKernelSizeInFeatureChannels();
    @Property(selector = "setKernelSizeInFeatureChannels:")
    public native void setKernelSizeInFeatureChannels(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSource:kernelSize:")
    protected native @Pointer long init(MPSNNImageNode sourceNode, @MachineSizedUInt long kernelSize);
    @Method(selector = "initWithSource:")
    protected native @Pointer long initWithSource(MPSNNImageNode sourceNode);
    /*</methods>*/
}
