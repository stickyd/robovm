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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ModelIO") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MDLVertexAttributeData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MDLVertexAttributeDataPtr extends Ptr<MDLVertexAttributeData, MDLVertexAttributeDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MDLVertexAttributeData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MDLVertexAttributeData() {}
    protected MDLVertexAttributeData(Handle h, long handle) { super(h, handle); }
    protected MDLVertexAttributeData(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "map")
    public native MDLMeshBufferMap getMap();
    @Property(selector = "setMap:")
    public native void setMap(MDLMeshBufferMap v);
    @Property(selector = "dataStart")
    public native VoidPtr getDataStart();
    @Property(selector = "setDataStart:")
    public native void setDataStart(VoidPtr v);
    @Property(selector = "stride")
    public native @MachineSizedUInt long getStride();
    @Property(selector = "setStride:")
    public native void setStride(@MachineSizedUInt long v);
    @Property(selector = "format")
    public native MDLVertexFormat getFormat();
    @Property(selector = "setFormat:")
    public native void setFormat(MDLVertexFormat v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "bufferSize")
    public native @MachineSizedUInt long getBufferSize();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setBufferSize:")
    public native void setBufferSize(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
