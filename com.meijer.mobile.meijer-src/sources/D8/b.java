package D8;

import android.app.Application;
import w8.C17850a;

/* loaded from: classes4.dex */
public class b implements a, E8.c {

    /* renamed from: a, reason: collision with root package name */
    private c f6026a;

    public void c(Application application) {
        c cVar = new c(new H8.a(), this, new h(), this);
        this.f6026a = cVar;
        application.registerActivityLifecycleCallbacks(cVar);
    }

    public void d(Application application) {
        c cVar = this.f6026a;
        if (cVar != null) {
            application.unregisterActivityLifecycleCallbacks(cVar);
            this.f6026a = null;
        }
    }

    @Override // E8.c
    public void a(E8.a aVar) {
        X7.b metricsCache;
        C17850a.h().y(aVar);
        K7.c cVarA = K7.c.INSTANCE.a();
        if (cVarA != null && (metricsCache = cVarA.getMetricsCache()) != null) {
            metricsCache.A(aVar);
        }
    }

    @Override // D8.a
    public void b(String str) {
        C17850a.h().o(str);
    }
}
