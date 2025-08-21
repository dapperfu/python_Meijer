package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.u1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10660u1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10669v1 f83263a;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f83263a.i(new C10589m1(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f83263a.i(new C10642s1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f83263a.i(new C10616p1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f83263a.i(new C10607o1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        BinderC10641s0 binderC10641s0 = new BinderC10641s0();
        this.f83263a.i(new C10633r1(this, activity, binderC10641s0));
        Bundle bundleI2 = binderC10641s0.I2(50L);
        if (bundleI2 != null) {
            bundle.putAll(bundleI2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f83263a.i(new C10598n1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f83263a.i(new C10625q1(this, activity));
    }

    C10660u1(C10669v1 c10669v1) {
        Objects.requireNonNull(c10669v1);
        this.f83263a = c10669v1;
    }
}
