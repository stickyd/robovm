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
package org.robovm.apple.modelio;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ModelIO") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLPackedJointAnimation/*</name>*/ 
    extends /*<extends>*/MDLObject/*</extends>*/ 
    /*<implements>*/implements MDLJointAnimation/*</implements>*/ {

    /*<ptr>*/public static class MDLPackedJointAnimationPtr extends Ptr<MDLPackedJointAnimation, MDLPackedJointAnimationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLPackedJointAnimation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLPackedJointAnimation() {}
    protected MDLPackedJointAnimation(Handle h, long handle) { super(h, handle); }
    protected MDLPackedJointAnimation(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:jointPaths:")
    public MDLPackedJointAnimation(String name, NSArray<NSString> jointPaths) { super((SkipInit) null); initObject(init(name, jointPaths)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "jointPaths")
    public native NSArray<NSString> getJointPaths();
    @Property(selector = "translations")
    public native MDLAnimatedVector3Array getTranslations();
    @Property(selector = "rotations")
    public native MDLAnimatedQuaternionArray getRotations();
    @Property(selector = "scales")
    public native MDLAnimatedVector3Array getScales();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:jointPaths:")
    protected native @Pointer long init(String name, NSArray<NSString> jointPaths);
    /*</methods>*/
}
