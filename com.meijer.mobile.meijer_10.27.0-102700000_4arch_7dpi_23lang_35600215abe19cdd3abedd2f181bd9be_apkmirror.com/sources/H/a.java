package H;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class a {
    public static ScheduledExecutorService e(Handler handler) {
        return new c(handler);
    }

    public static Executor f(Executor executor) {
        return new g(executor);
    }

    public static Executor a() {
        return b.a();
    }

    public static Executor b() {
        return d.a();
    }

    public static Executor c() {
        return e.a();
    }

    public static ScheduledExecutorService d() {
        return f.a();
    }
}
