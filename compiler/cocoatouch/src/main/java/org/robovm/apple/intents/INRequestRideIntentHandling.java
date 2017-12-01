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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/INRequestRideIntentHandling/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "handleRequestRide:completion:")
    void handleRequestRide(INRequestRideIntent intent, @Block VoidBlock1<INRequestRideIntentResponse> completion);
    @Method(selector = "confirmRequestRide:completion:")
    void confirmRequestRide(INRequestRideIntent intent, @Block VoidBlock1<INRequestRideIntentResponse> completion);
    @Method(selector = "resolvePickupLocationForRequestRide:withCompletion:")
    void resolvePickupLocationForRequestRide(INRequestRideIntent intent, @Block VoidBlock1<INPlacemarkResolutionResult> completion);
    @Method(selector = "resolveDropOffLocationForRequestRide:withCompletion:")
    void resolveDropOffLocationForRequestRide(INRequestRideIntent intent, @Block VoidBlock1<INPlacemarkResolutionResult> completion);
    @Method(selector = "resolveRideOptionNameForRequestRide:withCompletion:")
    void resolveRideOptionNameForRequestRide(INRequestRideIntent intent, @Block VoidBlock1<INSpeakableStringResolutionResult> completion);
    @Method(selector = "resolvePartySizeForRequestRide:withCompletion:")
    void resolvePartySizeForRequestRide(INRequestRideIntent intent, @Block VoidBlock1<INIntegerResolutionResult> completion);
    /**
     * @since Available in iOS 10.3 and later.
     */
    @Method(selector = "resolveScheduledPickupTimeForRequestRide:withCompletion:")
    void resolveScheduledPickupTimeForRequestRide(INRequestRideIntent intent, @Block VoidBlock1<INDateComponentsRangeResolutionResult> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
