package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.ca, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7689ca implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final Application f73197a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f73198b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f73199c = false;

    protected final void a(InterfaceC7583ba interfaceC7583ba) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f73198b.get();
            if (activityLifecycleCallbacks != null) {
                interfaceC7583ba.zza(activityLifecycleCallbacks);
            } else {
                if (this.f73199c) {
                    return;
                }
                this.f73197a.unregisterActivityLifecycleCallbacks(this);
                this.f73199c = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new U9(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new C7476aa(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new X9(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new W9(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new Z9(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new V9(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new Y9(this, activity));
    }

    public C7689ca(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f73198b = new WeakReference(activityLifecycleCallbacks);
        this.f73197a = application;
    }
}
