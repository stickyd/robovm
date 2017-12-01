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

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/GKGameModel/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*/
    public static final int MaxScore = 16777216;
    public static final int MinScore = -16777216;
    /*</constants>*/
    /*<properties>*/
    @Property(selector = "players")
    @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<GKGameModelPlayer> getPlayers();
    @Property(selector = "activePlayer")
    GKGameModelPlayer getActivePlayer();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "setGameModel:")
    void setGameModel(GKGameModel gameModel);
    @Method(selector = "gameModelUpdatesForPlayer:")
    @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<GKGameModelUpdate> getGameModelUpdatesForPlayer(GKGameModelPlayer player);
    @Method(selector = "applyGameModelUpdate:")
    void applyGameModelUpdate(GKGameModelUpdate gameModelUpdate);
    @Method(selector = "scoreForPlayer:")
    @MachineSizedSInt long getScoreForPlayer(GKGameModelPlayer player);
    @Method(selector = "isWinForPlayer:")
    boolean isWinForPlayer(GKGameModelPlayer player);
    @Method(selector = "isLossForPlayer:")
    boolean isLossForPlayer(GKGameModelPlayer player);
    @Method(selector = "unapplyGameModelUpdate:")
    void unapplyGameModelUpdate(GKGameModelUpdate gameModelUpdate);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
