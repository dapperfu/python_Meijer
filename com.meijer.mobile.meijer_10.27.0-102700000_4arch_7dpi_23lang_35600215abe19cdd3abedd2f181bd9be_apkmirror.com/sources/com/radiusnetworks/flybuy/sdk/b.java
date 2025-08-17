package com.radiusnetworks.flybuy.sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.view.InterfaceC5989E;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.j(activity, "activity");
        Intrinsics.j(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) throws Exception {
        Intrinsics.j(activity, "activity");
        try {
            FlyBuyCore.getOrders().onActivityStarted$core_defaultRelease();
            Iterator it = FlyBuyCore.onActivityStartedSubscriber.iterator();
            while (it.hasNext()) {
                ((InterfaceC5989E) it.next()).onChanged(new Object());
            }
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) throws Exception {
        Intrinsics.j(activity, "activity");
        try {
            FlyBuyCore.getOrders().onActivityStopped$core_defaultRelease();
            Iterator it = FlyBuyCore.onActivityStoppedSubscriber.iterator();
            while (it.hasNext()) {
                ((InterfaceC5989E) it.next()).onChanged(new Object());
            }
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }
}
