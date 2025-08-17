package H;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class d implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private static volatile Executor f11941b;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f11942a = Executors.newSingleThreadExecutor(new a());

    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    static Executor a() {
        if (f11941b != null) {
            return f11941b;
        }
        synchronized (d.class) {
            try {
                if (f11941b == null) {
                    f11941b = new d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f11941b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f11942a.execute(runnable);
    }

    d() {
    }
}
