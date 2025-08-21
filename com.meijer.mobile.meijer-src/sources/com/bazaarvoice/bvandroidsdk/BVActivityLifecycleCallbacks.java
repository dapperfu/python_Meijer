package com.bazaarvoice.bvandroidsdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bazaarvoice.bvandroidsdk.BVEventValues;

/* loaded from: classes4.dex */
class BVActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    private static final String TAG = "BVActivityLifecycleCallbacks";
    private int activeActivityCount = 0;
    private final BVLogger bvLogger;
    private final BVPixel bvPixel;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (this.activeActivityCount == 0) {
            this.bvLogger.v(TAG, "application resume");
            this.bvPixel.track(new BVMobileAppLifecycleEvent(BVEventValues.AppState.RESUMED));
        }
        this.activeActivityCount++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i10 = this.activeActivityCount - 1;
        this.activeActivityCount = i10;
        if (i10 == 0) {
            this.bvLogger.v(TAG, "application pause");
            this.bvPixel.track(new BVMobileAppLifecycleEvent(BVEventValues.AppState.PAUSED));
        }
    }

    BVActivityLifecycleCallbacks(BVPixel bVPixel, BVLogger bVLogger) {
        this.bvPixel = bVPixel;
        this.bvLogger = bVLogger;
    }
}
