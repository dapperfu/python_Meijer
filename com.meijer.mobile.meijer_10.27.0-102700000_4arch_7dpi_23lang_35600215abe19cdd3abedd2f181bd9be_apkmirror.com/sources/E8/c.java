package E8;

import F8.d;
import F8.e;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import g8.x;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import x8.f;

/* loaded from: classes4.dex */
public class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e, reason: collision with root package name */
    private static final String f7670e = x.f133195a + "ApplicationStateTracker";

    /* renamed from: c, reason: collision with root package name */
    private final d<Activity> f7673c;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet<a> f7671a = new LinkedHashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private boolean f7674d = false;

    /* renamed from: b, reason: collision with root package name */
    private final Set<e> f7672b = new HashSet();

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
            this.f7671a.add(aVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f7672b.add(this.f7673c.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f7672b.add(this.f7673c.a(activity));
        if (this.f7672b.size() != 1 || this.f7674d) {
            return;
        }
        if (x.f133196b) {
            f.u(f7670e, "app returns to foreground");
        }
        Iterator<a> it = this.f7671a.iterator();
        while (it.hasNext()) {
            it.next().onForeground();
        }
    }

    public c(d<Activity> dVar) {
        this.f7673c = dVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.f7674d = activity.isChangingConfigurations();
        this.f7672b.remove(this.f7673c.a(activity));
        if (this.f7672b.isEmpty() && !this.f7674d) {
            if (x.f133196b) {
                f.u(f7670e, "app goes into background");
            }
            Iterator<a> it = this.f7671a.iterator();
            while (it.hasNext()) {
                it.next().onBackground();
            }
        }
    }
}
