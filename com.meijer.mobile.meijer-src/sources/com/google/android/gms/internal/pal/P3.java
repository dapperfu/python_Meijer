package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
final class P3 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final Application f83667a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f83668b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f83669c = false;

    protected final void a(O3 o32) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f83668b.get();
            if (activityLifecycleCallbacks != null) {
                o32.zza(activityLifecycleCallbacks);
            } else {
                if (this.f83669c) {
                    return;
                }
                this.f83667a.unregisterActivityLifecycleCallbacks(this);
                this.f83669c = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new H3(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new N3(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new K3(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new J3(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new M3(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new I3(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new L3(this, activity));
    }

    public P3(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f83668b = new WeakReference(activityLifecycleCallbacks);
        this.f83667a = application;
    }
}
