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
package org.robovm.apple.coremotion;

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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreMotion") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CMSensorRecorder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CMSensorRecorderPtr extends Ptr<CMSensorRecorder, CMSensorRecorderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CMSensorRecorder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CMSensorRecorder() {}
    protected CMSensorRecorder(Handle h, long handle) { super(h, handle); }
    protected CMSensorRecorder(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "accelerometerDataFromDate:toDate:")
    public native CMSensorDataList getAccelerometerDataBetween(NSDate fromDate, NSDate toDate);
    @Method(selector = "recordAccelerometerForDuration:")
    public native void recordAccelerometerForDuration(double duration);
    @Method(selector = "isAccelerometerRecordingAvailable")
    public static native boolean isAccelerometerRecordingAvailable();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "authorizationStatus")
    public static native CMAuthorizationStatus authorizationStatus();
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 11.0.
     */
    @Deprecated
    @Method(selector = "isAuthorizedForRecording")
    public static native boolean isAuthorizedForRecording();
    /*</methods>*/
}
