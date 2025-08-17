package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.eb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7905eb0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private boolean f73907a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f73908b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC7799db0 f73909c;

    protected void b(boolean z10) {
    }

    protected boolean c() {
        return false;
    }

    public final void e(InterfaceC7799db0 interfaceC7799db0) {
        this.f73909c = interfaceC7799db0;
    }

    public final void f() {
        this.f73907a = true;
        boolean zH = h();
        this.f73908b = zH;
        b(zH);
    }

    public final void g() {
        this.f73907a = false;
        this.f73909c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(true);
    }

    private final void a(boolean z10) {
        if (this.f73908b != z10) {
            this.f73908b = z10;
            if (this.f73907a) {
                b(z10);
                InterfaceC7799db0 interfaceC7799db0 = this.f73909c;
                if (interfaceC7799db0 != null) {
                    interfaceC7799db0.zzc(z10);
                }
            }
        }
    }

    private final boolean h() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || c();
    }

    public final void d(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(h());
    }
}
