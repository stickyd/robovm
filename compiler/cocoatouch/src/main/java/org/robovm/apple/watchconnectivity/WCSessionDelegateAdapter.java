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
package org.robovm.apple.watchconnectivity;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WCSessionDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements WCSessionDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.3 and later.
     */
    @NotImplemented("session:activationDidCompleteWithState:error:")
    public void activationDidComplete(WCSession session, WCSessionActivationState activationState, NSError error) {}
    /**
     * @since Available in iOS 9.3 and later.
     */
    @NotImplemented("sessionDidBecomeInactive:")
    public void sessionDidBecomeInactive(WCSession session) {}
    /**
     * @since Available in iOS 9.3 and later.
     */
    @NotImplemented("sessionDidDeactivate:")
    public void sessionDidDeactivate(WCSession session) {}
    @NotImplemented("sessionWatchStateDidChange:")
    public void watchStateDidChange(WCSession session) {}
    @NotImplemented("sessionReachabilityDidChange:")
    public void reachabilityDidChange(WCSession session) {}
    @NotImplemented("session:didReceiveMessage:")
    public void didReceiveMessage(WCSession session, NSDictionary<NSString, ?> message) {}
    @NotImplemented("session:didReceiveMessage:replyHandler:")
    public void didReceiveMessage(WCSession session, NSDictionary<NSString, ?> message, @Block VoidBlock1<NSDictionary<NSString, ?>> replyHandler) {}
    @NotImplemented("session:didReceiveMessageData:")
    public void didReceiveMessageData(WCSession session, NSData messageData) {}
    @NotImplemented("session:didReceiveMessageData:replyHandler:")
    public void didReceiveMessageData(WCSession session, NSData messageData, @Block VoidBlock1<NSData> replyHandler) {}
    @NotImplemented("session:didReceiveApplicationContext:")
    public void didReceiveApplicationContext(WCSession session, NSDictionary<NSString, ?> applicationContext) {}
    @NotImplemented("session:didFinishUserInfoTransfer:error:")
    public void didFinishUserInfoTransfer(WCSession session, WCSessionUserInfoTransfer userInfoTransfer, NSError error) {}
    @NotImplemented("session:didReceiveUserInfo:")
    public void didReceiveUserInfo(WCSession session, NSDictionary<NSString, ?> userInfo) {}
    @NotImplemented("session:didFinishFileTransfer:error:")
    public void didFinishFileTransfer(WCSession session, WCSessionFileTransfer fileTransfer, NSError error) {}
    @NotImplemented("session:didReceiveFile:")
    public void didReceiveFile(WCSession session, WCSessionFile file) {}
    /*</methods>*/
}
