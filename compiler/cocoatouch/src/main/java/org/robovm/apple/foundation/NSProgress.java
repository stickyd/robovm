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
 * @since Available in iOS 7.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSProgress/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSProgressPtr extends Ptr<NSProgress, NSProgressPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSProgress.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSProgress() {}
    protected NSProgress(Handle h, long handle) { super(h, handle); }
    protected NSProgress(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithParent:userInfo:")
    public NSProgress(NSProgress parentProgressOrNil, NSProgressUserInfo userInfoOrNil) { super((SkipInit) null); initObject(init(parentProgressOrNil, userInfoOrNil)); }
    public NSProgress(long unitCount) { super((Handle) null, create(unitCount)); retain(getHandle()); }
    /**
     * @since Available in iOS 9.0 and later.
     */
    public NSProgress(long unitCount, NSProgress parent, long portionOfParentTotalUnitCount) { super((Handle) null, create(unitCount, parent, portionOfParentTotalUnitCount)); retain(getHandle()); }
    /*</constructors>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    public NSProgress(long unitCount, boolean discrete) {
        super(discrete ? createDiscrete(unitCount) : create(unitCount));
        retain(getHandle());
    }
    /*<properties>*/
    @Property(selector = "totalUnitCount")
    public native long getTotalUnitCount();
    @Property(selector = "setTotalUnitCount:")
    public native void setTotalUnitCount(long v);
    @Property(selector = "completedUnitCount")
    public native long getCompletedUnitCount();
    @Property(selector = "setCompletedUnitCount:")
    public native void setCompletedUnitCount(long v);
    @Property(selector = "localizedDescription")
    public native String getLocalizedDescription();
    @Property(selector = "setLocalizedDescription:")
    public native void setLocalizedDescription(String v);
    @Property(selector = "localizedAdditionalDescription")
    public native String getLocalizedAdditionalDescription();
    @Property(selector = "setLocalizedAdditionalDescription:")
    public native void setLocalizedAdditionalDescription(String v);
    @Property(selector = "isCancellable")
    public native boolean isCancellable();
    @Property(selector = "setCancellable:")
    public native void setCancellable(boolean v);
    @Property(selector = "isPausable")
    public native boolean isPausable();
    @Property(selector = "setPausable:")
    public native void setPausable(boolean v);
    @Property(selector = "isCancelled")
    public native boolean isCancelled();
    @Property(selector = "isPaused")
    public native boolean isPaused();
    @Property(selector = "cancellationHandler")
    public native @Block Runnable getCancellationHandler();
    @Property(selector = "setCancellationHandler:")
    public native void setCancellationHandler(@Block Runnable v);
    @Property(selector = "pausingHandler")
    public native @Block Runnable getPausingHandler();
    @Property(selector = "setPausingHandler:")
    public native void setPausingHandler(@Block Runnable v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "resumingHandler")
    public native @Block Runnable getResumingHandler();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setResumingHandler:")
    public native void setResumingHandler(@Block Runnable v);
    @Property(selector = "isIndeterminate")
    public native boolean isIndeterminate();
    @Property(selector = "fractionCompleted")
    public native double getFractionCompleted();
    @Property(selector = "isFinished")
    public native boolean isFinished();
    @Property(selector = "userInfo")
    public native NSProgressUserInfo getUserInfo();
    @Property(selector = "kind")
    public native NSProgressKind getKind();
    @Property(selector = "setKind:")
    public native void setKind(NSProgressKind v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "estimatedTimeRemaining")
    public native NSNumber getEstimatedTimeRemaining();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setEstimatedTimeRemaining:")
    public native void setEstimatedTimeRemaining(NSNumber v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "throughput")
    public native NSNumber getThroughput();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setThroughput:")
    public native void setThroughput(NSNumber v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "fileOperationKind")
    public native String getFileOperationKind();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setFileOperationKind:")
    public native void setFileOperationKind(String v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "fileURL")
    public native NSURL getFileURL();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setFileURL:")
    public native void setFileURL(NSURL v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "fileTotalCount")
    public native NSNumber getFileTotalCount();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setFileTotalCount:")
    public native void setFileTotalCount(NSNumber v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "fileCompletedCount")
    public native NSNumber getFileCompletedCount();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setFileCompletedCount:")
    public native void setFileCompletedCount(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public void putUserInfoObject(String key, NSObject value) {
        setUserInfoObject(value, new NSString(key));
    }
    public void putUserInfoObject(NSProgressUserInfoKey key, NSObject value) {
        setUserInfoObject(value, key.value());
    }
    /*<methods>*/
    @Method(selector = "initWithParent:userInfo:")
    protected native @Pointer long init(NSProgress parentProgressOrNil, NSProgressUserInfo userInfoOrNil);
    @Method(selector = "becomeCurrentWithPendingUnitCount:")
    public native void becomeCurrent(long unitCount);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "performAsCurrentWithPendingUnitCount:usingBlock:")
    public native void performAsCurrent(long unitCount, @Block Runnable work);
    @Method(selector = "resignCurrent")
    public native void resignCurrent();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "addChild:withPendingUnitCount:")
    public native void addChild(NSProgress child, long inUnitCount);
    @Method(selector = "setUserInfoObject:forKey:")
    protected native void setUserInfoObject(NSObject objectOrNil, NSString key);
    @Method(selector = "cancel")
    public native void cancel();
    @Method(selector = "pause")
    public native void pause();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "resume")
    public native void resume();
    @Method(selector = "currentProgress")
    public static native NSProgress getCurrentProgress();
    @Method(selector = "progressWithTotalUnitCount:")
    protected static native @Pointer long create(long unitCount);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "discreteProgressWithTotalUnitCount:")
    protected static native @Pointer long createDiscrete(long unitCount);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "progressWithTotalUnitCount:parent:pendingUnitCount:")
    protected static native @Pointer long create(long unitCount, NSProgress parent, long portionOfParentTotalUnitCount);
    /*</methods>*/
}
