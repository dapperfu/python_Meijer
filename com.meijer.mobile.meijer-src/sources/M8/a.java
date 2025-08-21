package M8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final e f19691a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Integer> f19692b = new HashSet();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
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

    public static a c(e eVar, Activity activity) {
        a aVar = new a(eVar);
        if (activity != null) {
            aVar.b(activity);
        }
        return aVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f19692b.remove(Integer.valueOf(a(activity)));
    }

    private a(e eVar) {
        this.f19691a = eVar;
    }

    private int a(Activity activity) {
        return System.identityHashCode(activity);
    }

    private void b(Activity activity) {
        int iA = a(activity);
        if (!this.f19692b.contains(Integer.valueOf(iA))) {
            this.f19691a.a(activity.getWindow());
            this.f19692b.add(Integer.valueOf(iA));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        b(activity);
    }
}
