package M8;

import android.app.Activity;
import android.app.Application;
import java.util.List;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private a f19694a;

    public void b(Application application) {
        a aVar = this.f19694a;
        if (aVar != null) {
            application.unregisterActivityLifecycleCallbacks(aVar);
            this.f19694a = null;
        }
    }

    public void a(Application application, Activity activity, List<j> list) {
        if (!list.isEmpty()) {
            a aVarC = a.c(new e(list), activity);
            this.f19694a = aVarC;
            application.registerActivityLifecycleCallbacks(aVarC);
        }
    }
}
