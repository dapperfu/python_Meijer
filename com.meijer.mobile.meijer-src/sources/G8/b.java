package G8;

import android.app.Application;
import i8.C14697d;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private c f11221a;

    public void a(Application application) {
        c cVar = new c(new H8.a());
        this.f11221a = cVar;
        cVar.a(new C14697d());
        application.registerActivityLifecycleCallbacks(this.f11221a);
    }

    public void b(Application application) {
        c cVar = this.f11221a;
        if (cVar != null) {
            application.unregisterActivityLifecycleCallbacks(cVar);
            this.f11221a = null;
        }
    }
}
