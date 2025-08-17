package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Jb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6852Jb implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final Application f67944a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f67945b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f67946c = false;

    protected final void a(InterfaceC6818Ib interfaceC6818Ib) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f67945b.get();
            if (activityLifecycleCallbacks != null) {
                interfaceC6818Ib.zza(activityLifecycleCallbacks);
            } else {
                if (this.f67946c) {
                    return;
                }
                this.f67944a.unregisterActivityLifecycleCallbacks(this);
                this.f67946c = true;
            }
        } catch (Exception e10) {
            Qc.p.e("Error while dispatching lifecycle callback.", e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new C6580Bb(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new C6784Hb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new C6682Eb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new C6648Db(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new C6750Gb(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new C6614Cb(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new C6716Fb(this, activity));
    }

    public C6852Jb(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f67945b = new WeakReference(activityLifecycleCallbacks);
        this.f67944a = application;
    }
}
