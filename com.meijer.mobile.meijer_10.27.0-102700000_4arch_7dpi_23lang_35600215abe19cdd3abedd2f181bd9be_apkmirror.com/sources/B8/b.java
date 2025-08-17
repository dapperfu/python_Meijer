package B8;

import android.app.Application;
import u8.C17233a;

/* loaded from: classes4.dex */
public class b implements a, C8.c {

    /* renamed from: a, reason: collision with root package name */
    private c f2081a;

    public void c(Application application) {
        c cVar = new c(new F8.a(), this, new h(), this);
        this.f2081a = cVar;
        application.registerActivityLifecycleCallbacks(cVar);
    }

    public void d(Application application) {
        c cVar = this.f2081a;
        if (cVar != null) {
            application.unregisterActivityLifecycleCallbacks(cVar);
            this.f2081a = null;
        }
    }

    @Override // C8.c
    public void a(C8.a aVar) {
        V7.b metricsCache;
        C17233a.h().y(aVar);
        I7.c cVarA = I7.c.INSTANCE.a();
        if (cVarA != null && (metricsCache = cVarA.getMetricsCache()) != null) {
            metricsCache.A(aVar);
        }
    }

    @Override // B8.a
    public void b(String str) {
        C17233a.h().o(str);
    }
}
