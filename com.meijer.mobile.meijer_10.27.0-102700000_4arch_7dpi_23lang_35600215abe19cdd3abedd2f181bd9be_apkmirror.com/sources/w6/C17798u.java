package w6;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: w6.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17798u implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private int f165949a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f165950b = 0;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        r.c("LifecycleCallbacks", "Activity Created: " + activity.getLocalClassName(), new Throwable[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        r.c("LifecycleCallbacks", "Activity Destroyed: " + activity.getLocalClassName(), new Throwable[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        r.c("LifecycleCallbacks", "Activity Paused: " + activity.getLocalClassName(), new Throwable[0]);
        int i10 = this.f165949a + (-1);
        this.f165949a = i10;
        if (i10 == 0) {
            com.cyberfend.cyfsecurity.a.a();
            com.cyberfend.cyfsecurity.a.e(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        r.c("LifecycleCallbacks", "Activity Resumed:" + activity.getLocalClassName(), new Throwable[0]);
        if (this.f165949a == 0) {
            com.cyberfend.cyfsecurity.a.b(activity);
            com.cyberfend.cyfsecurity.a.e(true);
        }
        this.f165949a++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f165950b == 0) {
            com.cyberfend.cyfsecurity.a.c(activity.getApplication());
        }
        this.f165950b++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f165950b--;
    }
}
