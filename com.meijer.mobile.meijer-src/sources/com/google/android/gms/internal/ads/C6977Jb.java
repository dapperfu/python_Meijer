package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Jb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6977Jb implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final Application f68784a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f68785b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f68786c = false;

    protected final void a(InterfaceC6943Ib interfaceC6943Ib) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f68785b.get();
            if (activityLifecycleCallbacks != null) {
                interfaceC6943Ib.zza(activityLifecycleCallbacks);
            } else {
                if (this.f68786c) {
                    return;
                }
                this.f68784a.unregisterActivityLifecycleCallbacks(this);
                this.f68786c = true;
            }
        } catch (Exception e10) {
            Sc.p.e("Error while dispatching lifecycle callback.", e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new C6705Bb(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new C6909Hb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new C6807Eb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new C6773Db(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new C6875Gb(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new C6739Cb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new C6841Fb(this, activity));
    }

    public C6977Jb(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f68785b = new WeakReference(activityLifecycleCallbacks);
        this.f68784a = application;
    }
}
