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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioCompressedBuffer/*</name>*/ 
    extends /*<extends>*/AVAudioBuffer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAudioCompressedBufferPtr extends Ptr<AVAudioCompressedBuffer, AVAudioCompressedBufferPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAudioCompressedBuffer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAudioCompressedBuffer() {}
    protected AVAudioCompressedBuffer(Handle h, long handle) { super(h, handle); }
    protected AVAudioCompressedBuffer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFormat:packetCapacity:maximumPacketSize:")
    public AVAudioCompressedBuffer(AVAudioFormat format, int packetCapacity, @MachineSizedSInt long maximumPacketSize) { super((SkipInit) null); initObject(init(format, packetCapacity, maximumPacketSize)); }
    @Method(selector = "initWithFormat:packetCapacity:")
    public AVAudioCompressedBuffer(AVAudioFormat format, int packetCapacity) { super((SkipInit) null); initObject(init(format, packetCapacity)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "packetCapacity")
    public native int getPacketCapacity();
    @Property(selector = "packetCount")
    public native int getPacketCount();
    @Property(selector = "setPacketCount:")
    public native void setPacketCount(int v);
    @Property(selector = "maximumPacketSize")
    public native @MachineSizedSInt long getMaximumPacketSize();
    @Property(selector = "data")
    public native @Pointer long getDataPointer();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "byteCapacity")
    public native int getByteCapacity();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "byteLength")
    public native int getByteLength();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setByteLength:")
    public native void setByteLength(int v);
    @Property(selector = "packetDescriptions")
    public native AudioStreamPacketDescription getPacketDescriptions();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFormat:packetCapacity:maximumPacketSize:")
    protected native @Pointer long init(AVAudioFormat format, int packetCapacity, @MachineSizedSInt long maximumPacketSize);
    @Method(selector = "initWithFormat:packetCapacity:")
    protected native @Pointer long init(AVAudioFormat format, int packetCapacity);
    /*</methods>*/
}
