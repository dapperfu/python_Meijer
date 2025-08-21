package F8;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes4.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final d f9101a;

    /* renamed from: b, reason: collision with root package name */
    private final v8.b f9102b;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        this.f9101a.a(this.f9102b.a(), activity.getComponentName().getClassName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (Build.VERSION.SDK_INT < 29) {
            this.f9101a.a(this.f9102b.a(), activity.getComponentName().getClassName());
        }
    }

    public a(d dVar, v8.b bVar) {
        this.f9101a = dVar;
        this.f9102b = bVar;
    }
}
