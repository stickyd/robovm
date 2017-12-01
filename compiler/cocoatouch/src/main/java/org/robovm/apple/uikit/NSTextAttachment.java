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

/*<javadoc>*/
/**
 * @since Available in iOS 7.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextAttachment/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSTextAttachmentContainer, NSCoding, UIAccessibilityContentSizeCategoryImageAdjusting/*</implements>*/ {

    /*<ptr>*/public static class NSTextAttachmentPtr extends Ptr<NSTextAttachment, NSTextAttachmentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTextAttachment.class); }/*</bind>*/
    /*<constants>*/
    public static final char AttachmentCharacter = 65532;
    /*</constants>*/
    /*<constructors>*/
    public NSTextAttachment() {}
    protected NSTextAttachment(Handle h, long handle) { super(h, handle); }
    protected NSTextAttachment(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "initWithData:ofType:")
    public NSTextAttachment(NSData contentData, String uti) { super((SkipInit) null); initObject(init(contentData, uti)); }
    @Method(selector = "initWithCoder:")
    public NSTextAttachment(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "contents")
    public native NSData getContents();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setContents:")
    public native void setContents(NSData v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "fileType")
    public native String getFileType();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setFileType:")
    public native void setFileType(String v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "image")
    public native UIImage getImage();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "bounds")
    public native @ByVal CGRect getBounds();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Property(selector = "setBounds:")
    public native void setBounds(@ByVal CGRect v);
    @Property(selector = "fileWrapper")
    public native NSFileWrapper getFileWrapper();
    @Property(selector = "setFileWrapper:")
    public native void setFileWrapper(NSFileWrapper v);
    @Property(selector = "adjustsImageSizeForAccessibilityContentSizeCategory")
    public native boolean adjustsImageSizeForAccessibilityContentSizeCategory();
    @Property(selector = "setAdjustsImageSizeForAccessibilityContentSizeCategory:")
    public native void setAdjustsImageSizeForAccessibilityContentSizeCategory(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "initWithData:ofType:")
    protected native @Pointer long init(NSData contentData, String uti);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "imageForBounds:textContainer:characterIndex:")
    public native UIImage getImageForBounds(@ByVal CGRect imageBounds, NSTextContainer textContainer, @MachineSizedUInt long charIndex);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "attachmentBoundsForTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
    public native @ByVal CGRect getAttachmentBounds(NSTextContainer textContainer, @ByVal CGRect lineFrag, @ByVal CGPoint position, @MachineSizedUInt long charIndex);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
