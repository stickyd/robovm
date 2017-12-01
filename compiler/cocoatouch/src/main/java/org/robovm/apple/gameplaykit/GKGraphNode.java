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
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("GameplayKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GKGraphNode/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class GKGraphNodePtr extends Ptr<GKGraphNode, GKGraphNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GKGraphNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GKGraphNode() {}
    protected GKGraphNode(Handle h, long handle) { super(h, handle); }
    protected GKGraphNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public GKGraphNode(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "connectedNodes")
    public native NSArray<GKGraphNode> getConnectedNodes();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addConnectionsToNodes:bidirectional:")
    public native void addConnectionsToNodes(NSArray<GKGraphNode> nodes, boolean bidirectional);
    @Method(selector = "removeConnectionsToNodes:bidirectional:")
    public native void removeConnectionsToNodes(NSArray<GKGraphNode> nodes, boolean bidirectional);
    @Method(selector = "estimatedCostToNode:")
    public native float getEstimatedCostToNode(GKGraphNode node);
    @Method(selector = "costToNode:")
    public native float getCostToNode(GKGraphNode node);
    @Method(selector = "findPathToNode:")
    public native NSArray<GKGraphNode> findPathToNode(GKGraphNode goalNode);
    @Method(selector = "findPathFromNode:")
    public native NSArray<GKGraphNode> findPathFromNode(GKGraphNode startNode);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
