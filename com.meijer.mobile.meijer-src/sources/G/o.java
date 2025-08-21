package G;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class o {
    private static Handler b() {
        return new Handler(Looper.getMainLooper());
    }

    public static void a() {
        o2.i.j(c(), "Not in application's main thread");
    }

    public static boolean c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static void d(Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            o2.i.j(b().post(runnable), "Unable to post to main thread");
        }
    }
}
