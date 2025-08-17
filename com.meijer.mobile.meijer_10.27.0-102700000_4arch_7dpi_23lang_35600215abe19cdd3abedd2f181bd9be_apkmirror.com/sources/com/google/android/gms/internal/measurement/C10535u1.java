package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.u1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10535u1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10544v1 f82423a;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f82423a.i(new C10464m1(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f82423a.i(new C10517s1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f82423a.i(new C10491p1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f82423a.i(new C10482o1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        BinderC10516s0 binderC10516s0 = new BinderC10516s0();
        this.f82423a.i(new C10508r1(this, activity, binderC10516s0));
        Bundle bundleF2 = binderC10516s0.F2(50L);
        if (bundleF2 != null) {
            bundle.putAll(bundleF2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f82423a.i(new C10473n1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f82423a.i(new C10500q1(this, activity));
    }

    C10535u1(C10544v1 c10544v1) {
        Objects.requireNonNull(c10544v1);
        this.f82423a = c10544v1;
    }
}
