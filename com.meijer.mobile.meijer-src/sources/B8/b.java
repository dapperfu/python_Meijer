package B8;

import android.app.Application;
import android.os.Build;
import i8.C14693B;
import s8.f;
import s8.g;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private Application.ActivityLifecycleCallbacks f2567a;

    public void a(Application application, C14693B c14693b) {
        c cVar = new c(new C8.c(), new f(), new g(), new v8.c(c14693b), new L8.a(new L8.g()));
        H8.a aVar = new H8.a();
        Application.ActivityLifecycleCallbacks bVar = Build.VERSION.SDK_INT >= 29 ? new H8.b(cVar, aVar) : new H8.c(cVar, aVar);
        this.f2567a = bVar;
        application.registerActivityLifecycleCallbacks(bVar);
    }

    public void b(Application application) {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f2567a;
        if (activityLifecycleCallbacks != null) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            this.f2567a = null;
        }
    }
}
