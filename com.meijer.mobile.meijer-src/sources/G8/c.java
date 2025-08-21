package G8;

import H8.d;
import H8.e;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import i8.x;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import z8.f;

/* loaded from: classes4.dex */
public class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e, reason: collision with root package name */
    private static final String f11222e = x.f137411a + "ApplicationStateTracker";

    /* renamed from: c, reason: collision with root package name */
    private final d<Activity> f11225c;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet<a> f11223a = new LinkedHashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private boolean f11226d = false;

    /* renamed from: b, reason: collision with root package name */
    private final Set<e> f11224b = new HashSet();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.f11223a.add(aVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f11224b.add(this.f11225c.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f11224b.add(this.f11225c.a(activity));
        if (this.f11224b.size() != 1 || this.f11226d) {
            return;
        }
        if (x.f137412b) {
            f.u(f11222e, "app returns to foreground");
        }
        Iterator<a> it = this.f11223a.iterator();
        while (it.hasNext()) {
            it.next().onForeground();
        }
    }

    public c(d<Activity> dVar) {
        this.f11225c = dVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.f11226d = activity.isChangingConfigurations();
        this.f11224b.remove(this.f11225c.a(activity));
        if (this.f11224b.isEmpty() && !this.f11226d) {
            if (x.f137412b) {
                f.u(f11222e, "app goes into background");
            }
            Iterator<a> it = this.f11223a.iterator();
            while (it.hasNext()) {
                it.next().onBackground();
            }
        }
    }
}
