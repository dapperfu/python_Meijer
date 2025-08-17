package fsimpl;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes14.dex */
public class fZ {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f132244a = new AtomicReference();

    public static void a(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            b(runnable);
        }
    }

    public static void a(Runnable runnable, long j10) {
        b().postDelayed(runnable, j10);
    }

    public static boolean a() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    private static Handler b() {
        AtomicReference atomicReference = f132244a;
        Handler handler = (Handler) atomicReference.get();
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        atomicReference.set(handler2);
        return handler2;
    }

    public static void b(Runnable runnable) {
        b().post(runnable);
    }

    public static void c(Runnable runnable) {
        b().postAtFrontOfQueue(runnable);
    }
}
