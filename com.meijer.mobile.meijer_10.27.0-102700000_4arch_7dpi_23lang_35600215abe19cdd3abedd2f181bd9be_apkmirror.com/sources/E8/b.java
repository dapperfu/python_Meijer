package E8;

import android.app.Application;
import g8.C14221d;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private c f7669a;

    public void a(Application application) {
        c cVar = new c(new F8.a());
        this.f7669a = cVar;
        cVar.a(new C14221d());
        application.registerActivityLifecycleCallbacks(this.f7669a);
    }

    public void b(Application application) {
        c cVar = this.f7669a;
        if (cVar != null) {
            application.unregisterActivityLifecycleCallbacks(cVar);
            this.f7669a = null;
        }
    }
}
