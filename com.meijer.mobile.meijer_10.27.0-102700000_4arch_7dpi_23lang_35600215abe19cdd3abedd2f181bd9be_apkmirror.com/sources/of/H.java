package of;

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

/* loaded from: classes7.dex */
public final class H {

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f153445a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicLong f153446b;

        /* renamed from: of.H$a$a, reason: collision with other inner class name */
        class C2387a extends AbstractRunnableC16036d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f153447a;

            C2387a(Runnable runnable) {
                this.f153447a = runnable;
            }

            @Override // of.AbstractRunnableC16036d
            public void a() {
                this.f153447a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f153445a = str;
            this.f153446b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C2387a(runnable));
            threadNewThread.setName(this.f153445a + this.f153446b.getAndIncrement());
            return threadNewThread;
        }
    }

    class b extends AbstractRunnableC16036d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f153449a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExecutorService f153450b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f153451c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TimeUnit f153452d;

        b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f153449a = str;
            this.f153450b = executorService;
            this.f153451c = j10;
            this.f153452d = timeUnit;
        }

        @Override // of.AbstractRunnableC16036d
        public void a() {
            try {
                lf.g.f().b("Executing shutdown hook for " + this.f153449a);
                this.f153450b.shutdown();
                if (!this.f153450b.awaitTermination(this.f153451c, this.f153452d)) {
                    lf.g.f().b(this.f153449a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f153450b.shutdownNow();
                }
            } catch (InterruptedException unused) {
                lf.g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f153449a));
                this.f153450b.shutdownNow();
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
