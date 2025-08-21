package com.radiusnetworks.flybuy.sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.view.InterfaceC6131E;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class c implements Application.ActivityLifecycleCallbacks {
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
                ((InterfaceC6131E) it.next()).onChanged(new Object());
            }
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
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
                ((InterfaceC6131E) it.next()).onChanged(new Object());
            }
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }
}
