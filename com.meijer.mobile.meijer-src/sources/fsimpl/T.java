package fsimpl;

import android.app.Activity;
import android.app.Application;
import java.util.Iterator;

/* loaded from: classes15.dex */
class T implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Application f132685a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C14145cr f132686b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ R f132687c;

    T(R r10, Application application, C14145cr c14145cr) {
        this.f132687c = r10;
        this.f132685a = application;
        this.f132686b = c14145cr;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f132685a.unregisterActivityLifecycleCallbacks(this.f132686b);
        this.f132685a.registerActivityLifecycleCallbacks(this.f132687c.f132672j);
        C14228fu.a("Iterating over initial activities.", new Object[0]);
        Iterator it = this.f132686b.getCreated().iterator();
        while (it.hasNext()) {
            this.f132687c.f132672j.onActivityCreated((Activity) it.next(), null);
        }
        Iterator it2 = this.f132686b.getStarted().iterator();
        while (it2.hasNext()) {
            this.f132687c.f132672j.onActivityStarted((Activity) it2.next());
        }
        Iterator it3 = this.f132686b.getResumed().iterator();
        while (it3.hasNext()) {
            this.f132687c.f132672j.onActivityResumed((Activity) it3.next());
        }
    }
}
