package z8;

import android.app.Application;
import android.os.Build;
import g8.C14217B;
import q8.f;
import q8.g;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private Application.ActivityLifecycleCallbacks f171653a;

    public void a(Application application, C14217B c14217b) {
        c cVar = new c(new A8.c(), new f(), new g(), new t8.c(c14217b), new J8.a(new J8.g()));
        F8.a aVar = new F8.a();
        Application.ActivityLifecycleCallbacks bVar = Build.VERSION.SDK_INT >= 29 ? new F8.b(cVar, aVar) : new F8.c(cVar, aVar);
        this.f171653a = bVar;
        application.registerActivityLifecycleCallbacks(bVar);
    }

    public void b(Application application) {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f171653a;
        if (activityLifecycleCallbacks != null) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            this.f171653a = null;
        }
    }
}
