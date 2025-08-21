package H;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class e implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private static volatile Executor f13276b;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f13277a = Executors.newFixedThreadPool(2, new a());

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f13278a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f13278a.getAndIncrement())));
            return thread;
        }
    }

    static Executor a() {
        if (f13276b != null) {
            return f13276b;
        }
        synchronized (e.class) {
            try {
                if (f13276b == null) {
                    f13276b = new e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f13276b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f13277a.execute(runnable);
    }

    e() {
    }
}
