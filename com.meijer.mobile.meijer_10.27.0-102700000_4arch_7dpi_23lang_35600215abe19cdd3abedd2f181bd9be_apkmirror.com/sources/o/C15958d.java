package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C15958d extends AbstractC15959e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f152857a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f152858b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c, reason: collision with root package name */
    private volatile Handler f152859c;

    /* renamed from: o.d$a */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f152860a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f152860a.getAndIncrement());
            return thread;
        }
    }

    /* renamed from: o.d$b */
    private static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private static Handler e(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // o.AbstractC15959e
    public void a(Runnable runnable) {
        this.f152858b.execute(runnable);
    }

    @Override // o.AbstractC15959e
    public void d(Runnable runnable) {
        if (this.f152859c == null) {
            synchronized (this.f152857a) {
                try {
                    if (this.f152859c == null) {
                        this.f152859c = e(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f152859c.post(runnable);
    }

    @Override // o.AbstractC15959e
    public boolean c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
