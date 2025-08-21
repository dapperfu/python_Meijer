package F8;

import L8.g;
import android.app.Application;
import i8.C14693B;
import s8.C17029a;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private a f9110a;

    /* renamed from: b, reason: collision with root package name */
    private d f9111b;

    public void a(Application application) {
        a aVar = this.f9110a;
        if (aVar != null) {
            application.unregisterActivityLifecycleCallbacks(aVar);
            this.f9110a = null;
            this.f9111b = null;
        }
    }

    public void b(Application application, C14693B c14693b) {
        d dVar = new d(new v8.c(c14693b), new L8.c(new g()), new C17029a(), application);
        this.f9111b = dVar;
        this.f9110a = dVar.d();
    }
}
