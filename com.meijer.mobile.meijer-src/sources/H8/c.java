package H8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

@Deprecated
/* loaded from: classes4.dex */
public class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final B8.c f13436a;

    /* renamed from: b, reason: collision with root package name */
    private final d<Activity> f13437b;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f13436a.a(this.f13437b.a(activity), I8.a.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f13436a.b(this.f13437b.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f13436a.a(this.f13437b.a(activity), I8.a.ON_RESUME);
        this.f13436a.b(this.f13437b.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f13436a.a(this.f13437b.a(activity), I8.a.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.f13436a.b(this.f13437b.a(activity));
    }

    public c(B8.c cVar, d<Activity> dVar) {
        this.f13436a = cVar;
        this.f13437b = dVar;
    }
}
