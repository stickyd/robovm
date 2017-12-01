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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
/*</imports>*/
import org.robovm.apple.corefoundation.CFDictionary;
import org.robovm.apple.coremedia.CMTextMarkupAttributes;

/*<javadoc>*/
/**
 * @since Available in iOS 2.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UINavigationBar/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements NSCoding, UIBarPositioning/*</implements>*/ {

    /*<ptr>*/public static class UINavigationBarPtr extends Ptr<UINavigationBar, UINavigationBarPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UINavigationBar.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UINavigationBar() {}
    protected UINavigationBar(Handle h, long handle) { super(h, handle); }
    protected UINavigationBar(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    public UINavigationBar(CGRect frame) {
        super(frame);
    }
    public UINavigationBar(NSCoder decoder) {
        super(decoder);
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    public NSAttributedStringAttributes getTitleTextAttributes() {
        NSDictionary dict = getTitleTextAttributesDictionary();
        if (dict == null) return null;
        return new NSAttributedStringAttributes(dict);
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    public CMTextMarkupAttributes getTitleTextMarkupAttributes() {
        NSDictionary dict = getTitleTextAttributesDictionary();
        if (dict == null) return null;
        return new CMTextMarkupAttributes(dict.as(CFDictionary.class));
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    public CTAttributedStringAttributes getTitleCoreTextAttributes() {
        NSDictionary dict = getTitleTextAttributesDictionary();
        if (dict == null) return null;
        return new CTAttributedStringAttributes(dict.as(CFDictionary.class));
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    public void setTitleTextAttributes(NSAttributedStringAttributes v) {
        if (v == null) {
            setTitleTextAttributesDictionary(null);
        } else {
            setTitleTextAttributesDictionary(v.getDictionary());
        }
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    public void setTitleTextMarkupAttributes(CMTextMarkupAttributes v) {
        if (v == null) {
            setTitleTextAttributesDictionary(null);
        } else {
            setTitleTextAttributesDictionary(v.getDictionary().as(NSDictionary.class));
        }
    }
    /**
     * @since Available in iOS 5.0 and later.
     */
    @WeaklyLinked
    public void setTitleCoreTextAttributes(CTAttributedStringAttributes v) {
        if (v == null) {
            setTitleTextAttributesDictionary(null);
        } else {
            setTitleTextAttributesDictionary(v.getDictionary().as(NSDictionary.class));
        }
    }
    /*<properties>*/
    @Property(selector = "barStyle")
    public native UIBarStyle getBarStyle();
    @Property(selector = "setBarStyle:")
    public native void setBarStyle(UIBarStyle v);
    @Property(selector = "delegate")
    public native UINavigationBarDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UINavigationBarDelegate v);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Property(selector = "isTranslucent")
    public native boolean isTranslucent();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Property(selector = "setTranslucent:")
    public native void setTranslucent(boolean v);
    @Property(selector = "topItem")
    public native UINavigationItem getTopItem();
    @Property(selector = "backItem")
    public native UINavigationItem getBackItem();
    @Property(selector = "items")
    public native NSArray<UINavigationItem> getItems();
    @Property(selector = "setItems:")
    public native void setItems(NSArray<UINavigationItem> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "prefersLargeTitles")
    public native boolean prefersLargeTitles();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setPrefersLargeTitles:")
    public native void setPrefersLargeTitles(boolean v);
    @Property(selector = "tintColor")
    public native UIColor getTintColor();
    @Property(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "barTintColor")
    public native UIColor getBarTintColor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setBarTintColor:")
    public native void setBarTintColor(UIColor v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Property(selector = "shadowImage")
    public native UIImage getShadowImage();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Property(selector = "setShadowImage:")
    public native void setShadowImage(UIImage v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "titleTextAttributes")
    public native NSDictionary<NSString, ?> getTitleTextAttributesDictionary();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Property(selector = "setTitleTextAttributes:")
    public native void setTitleTextAttributesDictionary(NSDictionary<NSString, ?> v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "largeTitleTextAttributes")
    public native NSDictionary<NSString, ?> getLargeTitleTextAttributes();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setLargeTitleTextAttributes:")
    public native void setLargeTitleTextAttributes(NSDictionary<NSString, ?> v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "backIndicatorImage")
    public native UIImage getBackIndicatorImage();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setBackIndicatorImage:")
    public native void setBackIndicatorImage(UIImage v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "backIndicatorTransitionMaskImage")
    public native UIImage getBackIndicatorTransitionMaskImage();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setBackIndicatorTransitionMaskImage:")
    public native void setBackIndicatorTransitionMaskImage(UIImage v);
    @Property(selector = "barPosition")
    public native UIBarPosition getBarPosition();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "pushNavigationItem:animated:")
    public native void pushNavigationItem(UINavigationItem item, boolean animated);
    @Method(selector = "popNavigationItemAnimated:")
    public native UINavigationItem popNavigationItem(boolean animated);
    @Method(selector = "setItems:animated:")
    public native void setItems(NSArray<UINavigationItem> items, boolean animated);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "setBackgroundImage:forBarPosition:barMetrics:")
    public native void setBackgroundImage(UIImage backgroundImage, UIBarPosition barPosition, UIBarMetrics barMetrics);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "backgroundImageForBarPosition:barMetrics:")
    public native UIImage getBackgroundImage(UIBarPosition barPosition, UIBarMetrics barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "setBackgroundImage:forBarMetrics:")
    public native void setBackgroundImage(UIImage backgroundImage, UIBarMetrics barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "backgroundImageForBarMetrics:")
    public native UIImage getBackgroundImage(UIBarMetrics barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "setTitleVerticalPositionAdjustment:forBarMetrics:")
    public native void setTitleVerticalPositionAdjustment(@MachineSizedFloat double adjustment, UIBarMetrics barMetrics);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "titleVerticalPositionAdjustmentForBarMetrics:")
    public native @MachineSizedFloat double getTitleVerticalPositionAdjustment(UIBarMetrics barMetrics);
    /*</methods>*/
}
