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
package org.robovm.apple.coreimage;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.iosurface.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreImage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CIQRCodeFeature/*</name>*/ 
    extends /*<extends>*/CIFeature/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CIQRCodeFeaturePtr extends Ptr<CIQRCodeFeature, CIQRCodeFeaturePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CIQRCodeFeature.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CIQRCodeFeature() {}
    protected CIQRCodeFeature(Handle h, long handle) { super(h, handle); }
    protected CIQRCodeFeature(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "bounds")
    public native @ByVal CGRect getBounds();
    @Property(selector = "topLeft")
    public native @ByVal CGPoint getTopLeft();
    @Property(selector = "topRight")
    public native @ByVal CGPoint getTopRight();
    @Property(selector = "bottomLeft")
    public native @ByVal CGPoint getBottomLeft();
    @Property(selector = "bottomRight")
    public native @ByVal CGPoint getBottomRight();
    @Property(selector = "messageString")
    public native String getMessageString();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "symbolDescriptor")
    public native CIQRCodeDescriptor getSymbolDescriptor();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
