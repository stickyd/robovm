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
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INGetUserCurrentRestaurantReservationBookingsIntentResponse/*</name>*/ 
    extends /*<extends>*/INIntentResponse/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INGetUserCurrentRestaurantReservationBookingsIntentResponsePtr extends Ptr<INGetUserCurrentRestaurantReservationBookingsIntentResponse, INGetUserCurrentRestaurantReservationBookingsIntentResponsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INGetUserCurrentRestaurantReservationBookingsIntentResponse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INGetUserCurrentRestaurantReservationBookingsIntentResponse() {}
    protected INGetUserCurrentRestaurantReservationBookingsIntentResponse(Handle h, long handle) { super(h, handle); }
    protected INGetUserCurrentRestaurantReservationBookingsIntentResponse(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithUserCurrentBookings:code:userActivity:")
    public INGetUserCurrentRestaurantReservationBookingsIntentResponse(NSArray<INRestaurantReservationUserBooking> userCurrentBookings, INGetUserCurrentRestaurantReservationBookingsIntentResponseCode code, NSUserActivity userActivity) { super((SkipInit) null); initObject(init(userCurrentBookings, code, userActivity)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "code")
    public native INGetUserCurrentRestaurantReservationBookingsIntentResponseCode getCode();
    @Property(selector = "userCurrentBookings")
    public native NSArray<INRestaurantReservationUserBooking> getUserCurrentBookings();
    @Property(selector = "setUserCurrentBookings:")
    public native void setUserCurrentBookings(NSArray<INRestaurantReservationUserBooking> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithUserCurrentBookings:code:userActivity:")
    protected native @Pointer long init(NSArray<INRestaurantReservationUserBooking> userCurrentBookings, INGetUserCurrentRestaurantReservationBookingsIntentResponseCode code, NSUserActivity userActivity);
    /*</methods>*/
}
