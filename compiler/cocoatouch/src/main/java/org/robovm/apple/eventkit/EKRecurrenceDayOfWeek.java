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
package org.robovm.apple.eventkit;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.addressbook.*;
import org.robovm.apple.mapkit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 4.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("EventKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/EKRecurrenceDayOfWeek/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class EKRecurrenceDayOfWeekPtr extends Ptr<EKRecurrenceDayOfWeek, EKRecurrenceDayOfWeekPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(EKRecurrenceDayOfWeek.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public EKRecurrenceDayOfWeek() {}
    protected EKRecurrenceDayOfWeek(Handle h, long handle) { super(h, handle); }
    protected EKRecurrenceDayOfWeek(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDayOfTheWeek:weekNumber:")
    public EKRecurrenceDayOfWeek(EKWeekday dayOfTheWeek, @MachineSizedSInt long weekNumber) { super((SkipInit) null); initObject(init(dayOfTheWeek, weekNumber)); }
    public EKRecurrenceDayOfWeek(EKWeekday dayOfTheWeek) { super((Handle) null, create(dayOfTheWeek)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dayOfTheWeek")
    public native EKWeekday getDayOfTheWeek();
    @Property(selector = "weekNumber")
    public native @MachineSizedSInt long getWeekNumber();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDayOfTheWeek:weekNumber:")
    protected native @Pointer long init(EKWeekday dayOfTheWeek, @MachineSizedSInt long weekNumber);
    @Method(selector = "dayOfWeek:")
    protected static native @Pointer long create(EKWeekday dayOfTheWeek);
    /*</methods>*/
}
