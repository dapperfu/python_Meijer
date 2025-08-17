package fsimpl;

import android.app.Activity;
import android.app.Application;
import java.util.Iterator;

/* loaded from: classes14.dex */
class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Application f131435a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C14020cr f131436b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ R f131437c;

    T(R r10, Application application, C14020cr c14020cr) {
        this.f131437c = r10;
        this.f131435a = application;
        this.f131436b = c14020cr;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f131435a.unregisterActivityLifecycleCallbacks(this.f131436b);
        this.f131435a.registerActivityLifecycleCallbacks(this.f131437c.f131422j);
        C14103fu.a("Iterating over initial activities.", new Object[0]);
        Iterator it = this.f131436b.getCreated().iterator();
        while (it.hasNext()) {
            this.f131437c.f131422j.onActivityCreated((Activity) it.next(), null);
        }
        Iterator it2 = this.f131436b.getStarted().iterator();
        while (it2.hasNext()) {
            this.f131437c.f131422j.onActivityStarted((Activity) it2.next());
        }
        Iterator it3 = this.f131436b.getResumed().iterator();
        while (it3.hasNext()) {
            this.f131437c.f131422j.onActivityResumed((Activity) it3.next());
        }
    }
}
