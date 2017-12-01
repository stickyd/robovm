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
package org.robovm.apple.gameplaykit;

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
import org.robovm.apple.spritekit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameplayKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKScene/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class GKScenePtr extends Ptr<GKScene, GKScenePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKScene.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKScene() {}
    protected GKScene(Handle h, long handle) { super(h, handle); }
    protected GKScene(SkipInit skipInit) { super(skipInit); }
    public GKScene(String filename, GKSceneRootNodeType rootNode) { super((Handle) null, create(filename, rootNode)); retain(getHandle()); }
    @Method(selector = "initWithCoder:")
    public GKScene(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "entities")
    public native NSArray<GKEntity> getEntities();
    @Property(selector = "rootNode")
    public native GKSceneRootNodeType getRootNode();
    @Property(selector = "setRootNode:")
    public native void setRootNode(GKSceneRootNodeType v);
    @Property(selector = "graphs")
    public native NSDictionary<NSString, GKGraph> getGraphs();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addEntity:")
    public native void addEntity(GKEntity entity);
    @Method(selector = "removeEntity:")
    public native void removeEntity(GKEntity entity);
    @Method(selector = "addGraph:name:")
    public native void addGraph(GKGraph graph, String name);
    @Method(selector = "removeGraph:")
    public native void removeGraph(String name);
    @Method(selector = "sceneWithFileNamed:")
    public static native GKScene sceneWithFileNamed(String filename);
    @Method(selector = "sceneWithFileNamed:rootNode:")
    protected static native @Pointer long create(String filename, GKSceneRootNodeType rootNode);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
