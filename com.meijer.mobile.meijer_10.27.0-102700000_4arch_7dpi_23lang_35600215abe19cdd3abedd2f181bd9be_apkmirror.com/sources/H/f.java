package H;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ScheduledExecutorService f11948a;

    static ScheduledExecutorService a() {
        if (f11948a != null) {
            return f11948a;
        }
        synchronized (f.class) {
            try {
                if (f11948a == null) {
                    f11948a = new c(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f11948a;
    }

    private f() {
    }
}
