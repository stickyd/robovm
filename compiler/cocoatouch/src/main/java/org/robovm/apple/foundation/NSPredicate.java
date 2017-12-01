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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 3.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSPredicate/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSPredicatePtr extends Ptr<NSPredicate, NSPredicatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSPredicate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSPredicate() {}
    protected NSPredicate(Handle h, long handle) { super(h, handle); }
    protected NSPredicate(SkipInit skipInit) { super(skipInit); }
    public NSPredicate(String predicateFormat, NSArray<?> arguments) { super((Handle) null, create(predicateFormat, arguments)); retain(getHandle()); }
    public NSPredicate(boolean value) { super((Handle) null, create(value)); retain(getHandle()); }
    /**
     * @since Available in iOS 4.0 and later.
     */
    public NSPredicate(@Block Block2<NSObject, NSDictionary<NSString, ?>, Boolean> block) { super((Handle) null, create(block)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public NSPredicate(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    public NSPredicate(String predicateFormat, Object... arguments) {
        super(create(predicateFormat, arguments));
    }
    public NSPredicate(String predicateFormat, NSObject ... arguments) {
        super(create(predicateFormat, new NSArray<NSObject>(arguments)));
    }
    
    private static long create(String predicateFormat, Object... arguments) {
        NSArray<NSObject> args = new NSMutableArray<>();
        int i = 0;
        for (Object o : arguments) {
            if (o instanceof Number) {
                args.add(NSNumber.valueOf((Number) o));
            } else if (o instanceof String) {
                args.add(new NSString((String) o));
            } else if (o instanceof NSPredicateKeyPath) {
                args.add(((NSPredicateKeyPath) o).value());
            } else if (o instanceof Collection) {
                Collection<?> c = (Collection<?>) o;
                NSArray<NSString> a = new NSMutableArray<>();
                for (Object e : c) {
                    a.add(new NSString(e.toString()));
                }
                args.add(a);
            } else if (o instanceof Map) {
                Map<?, ?> m = (Map<?, ?>) o;
                NSDictionary<NSString, NSString> d = new NSMutableDictionary<>();
                for (Map.Entry<?, ?> e : m.entrySet()) {
                    d.put(new NSString(e.getKey().toString()), new NSString(e.getValue().toString()));
                }
                args.add(d);
            } else if (o instanceof NSObject) {
               args.add((NSObject) o); 
            } else if (o == null) {
                throw new IllegalArgumentException("argument " + i + " cannot be null!");
            } else {
                throw new IllegalArgumentException("type of argument " + i + " not supported: " + o.getClass());
            }
            i++;
        }
        
        return create(predicateFormat, args);
    }
    /*<properties>*/
    @Property(selector = "predicateFormat")
    public native String getPredicateFormat();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "predicateWithSubstitutionVariables:")
    public native NSPredicate newPredicate(NSDictionary<NSString, ?> variables);
    @Method(selector = "evaluateWithObject:")
    public native boolean evaluate(NSObject object);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Method(selector = "evaluateWithObject:substitutionVariables:")
    public native boolean evaluate(NSObject object, NSDictionary<NSString, ?> variables);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "allowEvaluation")
    public native void allowEvaluation();
    @Method(selector = "predicateWithFormat:argumentArray:")
    protected static native @Pointer long create(String predicateFormat, NSArray<?> arguments);
    @Method(selector = "predicateWithValue:")
    protected static native @Pointer long create(boolean value);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Method(selector = "predicateWithBlock:")
    protected static native @Pointer long create(@Block Block2<NSObject, NSDictionary<NSString, ?>, Boolean> block);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
