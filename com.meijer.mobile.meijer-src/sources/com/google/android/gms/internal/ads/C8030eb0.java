package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.eb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8030eb0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private boolean f74747a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f74748b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC7924db0 f74749c;

    protected void b(boolean z10) {
    }

    protected boolean c() {
        return false;
    }

    public final void e(InterfaceC7924db0 interfaceC7924db0) {
        this.f74749c = interfaceC7924db0;
    }

    public final void f() {
        this.f74747a = true;
        boolean zH = h();
        this.f74748b = zH;
        b(zH);
    }

    public final void g() {
        this.f74747a = false;
        this.f74749c = null;
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
        if (this.f74748b != z10) {
            this.f74748b = z10;
            if (this.f74747a) {
                b(z10);
                InterfaceC7924db0 interfaceC7924db0 = this.f74749c;
                if (interfaceC7924db0 != null) {
                    interfaceC7924db0.zzc(z10);
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
