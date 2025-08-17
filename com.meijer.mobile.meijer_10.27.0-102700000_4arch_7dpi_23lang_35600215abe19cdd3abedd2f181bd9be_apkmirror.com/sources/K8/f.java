package K8;

import android.app.Activity;
import android.app.Application;
import java.util.List;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private a f16335a;

    public void b(Application application) {
        a aVar = this.f16335a;
        if (aVar != null) {
            application.unregisterActivityLifecycleCallbacks(aVar);
            this.f16335a = null;
        }
    }

    public void a(Application application, Activity activity, List<j> list) {
        if (!list.isEmpty()) {
            a aVarC = a.c(new e(list), activity);
            this.f16335a = aVarC;
            application.registerActivityLifecycleCallbacks(aVarC);
        }
    }
}
