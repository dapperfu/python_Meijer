package F8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

@Deprecated
/* loaded from: classes4.dex */
public class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final z8.c f10309a;

    /* renamed from: b, reason: collision with root package name */
    private final d<Activity> f10310b;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f10309a.a(this.f10310b.a(activity), G8.a.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f10309a.b(this.f10310b.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f10309a.a(this.f10310b.a(activity), G8.a.ON_RESUME);
        this.f10309a.b(this.f10310b.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f10309a.a(this.f10310b.a(activity), G8.a.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.f10309a.b(this.f10310b.a(activity));
    }

    public c(z8.c cVar, d<Activity> dVar) {
        this.f10309a = cVar;
        this.f10310b = dVar;
    }
}
