package H;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ScheduledExecutorService f13280a;

    static ScheduledExecutorService a() {
        if (f13280a != null) {
            return f13280a;
        }
        synchronized (f.class) {
            try {
                if (f13280a == null) {
                    f13280a = new c(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f13280a;
    }

    private f() {
    }
}
