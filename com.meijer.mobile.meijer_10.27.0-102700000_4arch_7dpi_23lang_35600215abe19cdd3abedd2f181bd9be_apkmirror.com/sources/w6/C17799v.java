package w6;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: w6.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17799v implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<Pair<String, Long>> f165951a = new ArrayList<>();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final String a() {
        try {
            Iterator<Pair<String, Long>> it = this.f165951a.iterator();
            String str = "";
            while (it.hasNext()) {
                Pair<String, Long> next = it.next();
                str = str + ((String) next.first) + "," + next.second + ";";
            }
            this.f165951a.clear();
            return str;
        } catch (Exception e10) {
            C17774A.a(e10);
            return "";
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f165951a.size() < 10) {
            this.f165951a.add(new Pair<>("2", Long.valueOf(System.currentTimeMillis())));
        }
        r.c("BackgroundEventManager", "Activity paused: " + activity.getLocalClassName(), new Throwable[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.f165951a.size() < 10) {
            this.f165951a.add(new Pair<>("3", Long.valueOf(System.currentTimeMillis())));
        }
        r.c("BackgroundEventManager", "Activity resumed: " + activity.getLocalClassName(), new Throwable[0]);
    }

    C17799v() {
    }
}
