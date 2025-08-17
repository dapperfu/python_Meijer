package D8;

import J8.g;
import android.app.Application;
import g8.C14217B;
import q8.C16481a;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private a f5077a;

    /* renamed from: b, reason: collision with root package name */
    private d f5078b;

    public void a(Application application) {
        a aVar = this.f5077a;
        if (aVar != null) {
            application.unregisterActivityLifecycleCallbacks(aVar);
            this.f5077a = null;
            this.f5078b = null;
        }
    }

    public void b(Application application, C14217B c14217b) {
        d dVar = new d(new t8.c(c14217b), new J8.c(new g()), new C16481a(), application);
        this.f5078b = dVar;
        this.f5077a = dVar.d();
    }
}
