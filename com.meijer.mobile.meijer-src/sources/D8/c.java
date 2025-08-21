package D8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import i8.x;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g, reason: collision with root package name */
    private static final String f6027g = x.f137411a + "ActiveActivityTracker";

    /* renamed from: a, reason: collision with root package name */
    private final H8.d<Activity> f6028a;

    /* renamed from: b, reason: collision with root package name */
    private final a f6029b;

    /* renamed from: c, reason: collision with root package name */
    private final E8.b f6030c;

    /* renamed from: d, reason: collision with root package name */
    private final E8.c f6031d;

    /* renamed from: e, reason: collision with root package name */
    private final LinkedList<H8.e> f6032e = new LinkedList<>();

    /* renamed from: f, reason: collision with root package name */
    private H8.e f6033f;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    private void a(H8.e eVar) {
        if (this.f6033f == eVar) {
            return;
        }
        if (x.f137412b) {
            if (eVar == null) {
                z8.f.u(f6027g, "unset current activity");
            } else {
                z8.f.u(f6027g, "set current activity to " + eVar.a());
            }
        }
        if (eVar == null) {
            this.f6029b.b(null);
        } else {
            this.f6029b.b(eVar.a());
        }
        this.f6033f = eVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f6031d.a(this.f6030c.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f6032e.remove(this.f6028a.a(activity));
        if (this.f6032e.size() > 0) {
            a(this.f6032e.peekFirst());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        H8.e eVarA = this.f6028a.a(activity);
        if (eVarA.equals(this.f6033f)) {
            return;
        }
        this.f6032e.addFirst(eVarA);
        a(eVarA);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.f6032e.size() == 0) {
            a(null);
        }
    }

    public c(H8.d<Activity> dVar, a aVar, E8.b bVar, E8.c cVar) {
        this.f6028a = dVar;
        this.f6029b = aVar;
        this.f6030c = bVar;
        this.f6031d = cVar;
    }
}
