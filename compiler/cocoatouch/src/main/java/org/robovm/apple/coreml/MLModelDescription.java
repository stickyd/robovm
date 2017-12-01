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
package org.robovm.apple.coreml;

/*<imports>*/
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreML") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLModelDescription/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLModelDescriptionPtr extends Ptr<MLModelDescription, MLModelDescriptionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLModelDescription.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MLModelDescription() {}
    protected MLModelDescription(Handle h, long handle) { super(h, handle); }
    protected MLModelDescription(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "inputDescriptionsByName")
    public native NSDictionary<NSString, MLFeatureDescription> getInputDescriptionsByName();
    @Property(selector = "outputDescriptionsByName")
    public native NSDictionary<NSString, MLFeatureDescription> getOutputDescriptionsByName();
    @Property(selector = "predictedFeatureName")
    public native String getPredictedFeatureName();
    @Property(selector = "predictedProbabilitiesName")
    public native String getPredictedProbabilitiesName();
    @Property(selector = "metadata")
    public native NSDictionary<?, ?> getMetadata();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
