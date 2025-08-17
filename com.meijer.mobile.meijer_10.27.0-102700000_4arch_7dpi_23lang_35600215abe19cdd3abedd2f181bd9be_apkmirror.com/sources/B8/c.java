package B8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import g8.x;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g, reason: collision with root package name */
    private static final String f2082g = x.f133195a + "ActiveActivityTracker";

    /* renamed from: a, reason: collision with root package name */
    private final F8.d<Activity> f2083a;

    /* renamed from: b, reason: collision with root package name */
    private final a f2084b;

    /* renamed from: c, reason: collision with root package name */
    private final C8.b f2085c;

    /* renamed from: d, reason: collision with root package name */
    private final C8.c f2086d;

    /* renamed from: e, reason: collision with root package name */
    private final LinkedList<F8.e> f2087e = new LinkedList<>();

    /* renamed from: f, reason: collision with root package name */
    private F8.e f2088f;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    private void a(F8.e eVar) {
        if (this.f2088f == eVar) {
            return;
        }
        if (x.f133196b) {
            if (eVar == null) {
                x8.f.u(f2082g, "unset current activity");
            } else {
                x8.f.u(f2082g, "set current activity to " + eVar.a());
            }
        }
        if (eVar == null) {
            this.f2084b.b(null);
        } else {
            this.f2084b.b(eVar.a());
        }
        this.f2088f = eVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f2086d.a(this.f2085c.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f2087e.remove(this.f2083a.a(activity));
        if (this.f2087e.size() > 0) {
            a(this.f2087e.peekFirst());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        F8.e eVarA = this.f2083a.a(activity);
        if (eVarA.equals(this.f2088f)) {
            return;
        }
        this.f2087e.addFirst(eVarA);
        a(eVarA);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.f2087e.size() == 0) {
            a(null);
        }
    }

    public c(F8.d<Activity> dVar, a aVar, C8.b bVar, C8.c cVar) {
        this.f2083a = dVar;
        this.f2084b = aVar;
        this.f2085c = bVar;
        this.f2086d = cVar;
    }
}
