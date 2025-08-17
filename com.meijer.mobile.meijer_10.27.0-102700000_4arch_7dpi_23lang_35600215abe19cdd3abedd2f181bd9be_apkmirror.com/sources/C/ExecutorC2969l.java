package C;

import F.InterfaceC3626x;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: C.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ExecutorC2969l implements Executor {

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadFactory f3397c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Object f3398a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private ThreadPoolExecutor f3399b = b();

    /* renamed from: C.l$a */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f3400a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f3400a.getAndIncrement())));
            return thread;
        }

        a() {
        }
    }

    private static ThreadPoolExecutor b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f3397c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: C.k
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                P.c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    void c(InterfaceC3626x interfaceC3626x) {
        ThreadPoolExecutor threadPoolExecutor;
        o2.i.g(interfaceC3626x);
        synchronized (this.f3398a) {
            try {
                if (this.f3399b.isShutdown()) {
                    this.f3399b = b();
                }
                threadPoolExecutor = this.f3399b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iMax = Math.max(1, interfaceC3626x.b().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        o2.i.g(runnable);
        synchronized (this.f3398a) {
            this.f3399b.execute(runnable);
        }
    }
}
