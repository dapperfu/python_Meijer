package qf;

import android.annotation.SuppressLint;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes8.dex */
public final class H {

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f158297a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicLong f158298b;

        /* renamed from: qf.H$a$a, reason: collision with other inner class name */
        class C2463a extends AbstractRunnableC16644d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f158299a;

            C2463a(Runnable runnable) {
                this.f158299a = runnable;
            }

            @Override // qf.AbstractRunnableC16644d
            public void a() {
                this.f158299a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f158297a = str;
            this.f158298b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C2463a(runnable));
            threadNewThread.setName(this.f158297a + this.f158298b.getAndIncrement());
            return threadNewThread;
        }
    }

    class b extends AbstractRunnableC16644d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f158301a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExecutorService f158302b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f158303c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TimeUnit f158304d;

        b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f158301a = str;
            this.f158302b = executorService;
            this.f158303c = j10;
            this.f158304d = timeUnit;
        }

        @Override // qf.AbstractRunnableC16644d
        public void a() {
            try {
                nf.g.f().b("Executing shutdown hook for " + this.f158301a);
                this.f158302b.shutdown();
                if (!this.f158302b.awaitTermination(this.f158303c, this.f158304d)) {
                    nf.g.f().b(this.f158301a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f158302b.shutdownNow();
                }
            } catch (InterruptedException unused) {
                nf.g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f158301a));
                this.f158302b.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static void b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j10, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService executorServiceE = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, executorServiceE);
        return executorServiceE;
    }
}
