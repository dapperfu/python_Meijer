package c7;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.fullstory.FS;
import com.google.android.gms.common.api.a;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: c7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ExecutorServiceC6490a implements ExecutorService {

    /* renamed from: b, reason: collision with root package name */
    private static final long f61435b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c, reason: collision with root package name */
    private static volatile int f61436c;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f61437a;

    /* renamed from: c7.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f61438a;

        /* renamed from: b, reason: collision with root package name */
        private int f61439b;

        /* renamed from: c, reason: collision with root package name */
        private int f61440c;

        /* renamed from: d, reason: collision with root package name */
        private ThreadFactory f61441d = new c();

        /* renamed from: e, reason: collision with root package name */
        private e f61442e = e.f61456d;

        /* renamed from: f, reason: collision with root package name */
        private String f61443f;

        /* renamed from: g, reason: collision with root package name */
        private long f61444g;

        public ExecutorServiceC6490a a() {
            if (TextUtils.isEmpty(this.f61443f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f61443f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f61439b, this.f61440c, this.f61444g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f61441d, this.f61443f, this.f61442e, this.f61438a));
            if (this.f61444g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new ExecutorServiceC6490a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f61443f = str;
            return this;
        }

        public b c(int i10) {
            this.f61439b = i10;
            this.f61440c = i10;
            return this;
        }

        b(boolean z10) {
            this.f61438a = z10;
        }
    }

    /* renamed from: c7.a$c */
    private static final class c implements ThreadFactory {

        /* renamed from: c7.a$c$a, reason: collision with other inner class name */
        class C1226a extends Thread {
            C1226a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C1226a(runnable);
        }
    }

    /* renamed from: c7.a$d */
    private static final class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadFactory f61446a;

        /* renamed from: b, reason: collision with root package name */
        private final String f61447b;

        /* renamed from: c, reason: collision with root package name */
        final e f61448c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f61449d;

        /* renamed from: e, reason: collision with root package name */
        private final AtomicInteger f61450e = new AtomicInteger();

        /* renamed from: c7.a$d$a, reason: collision with other inner class name */
        class RunnableC1227a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f61451a;

            RunnableC1227a(Runnable runnable) {
                this.f61451a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f61449d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f61451a.run();
                } catch (Throwable th2) {
                    d.this.f61448c.a(th2);
                }
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f61446a.newThread(new RunnableC1227a(runnable));
            threadNewThread.setName("glide-" + this.f61447b + "-thread-" + this.f61450e.getAndIncrement());
            return threadNewThread;
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f61446a = threadFactory;
            this.f61447b = str;
            this.f61448c = eVar;
            this.f61449d = z10;
        }
    }

    /* renamed from: c7.a$e */
    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f61453a = new C1228a();

        /* renamed from: b, reason: collision with root package name */
        public static final e f61454b;

        /* renamed from: c, reason: collision with root package name */
        public static final e f61455c;

        /* renamed from: d, reason: collision with root package name */
        public static final e f61456d;

        /* renamed from: c7.a$e$b */
        class b implements e {
            @Override // c7.ExecutorServiceC6490a.e
            public void a(Throwable th2) {
                if (th2 == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                FS.log_e("GlideExecutor", "Request threw uncaught throwable", th2);
            }

            b() {
            }
        }

        /* renamed from: c7.a$e$c */
        class c implements e {
            @Override // c7.ExecutorServiceC6490a.e
            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }

            c() {
            }
        }

        void a(Throwable th2);

        /* renamed from: c7.a$e$a, reason: collision with other inner class name */
        class C1228a implements e {
            @Override // c7.ExecutorServiceC6490a.e
            public void a(Throwable th2) {
            }

            C1228a() {
            }
        }

        static {
            b bVar = new b();
            f61454b = bVar;
            f61455c = new c();
            f61456d = bVar;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f61437a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f61437a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f61437a.submit(runnable);
    }

    public static int b() {
        if (f61436c == 0) {
            f61436c = Math.min(4, c7.b.a());
        }
        return f61436c;
    }

    public static b e() {
        return new b(true).c(1).b("disk-cache");
    }

    public static b g() {
        return new b(false).c(b()).b("source");
    }

    public static ExecutorServiceC6490a i() {
        return new ExecutorServiceC6490a(new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, f61435b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f61456d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f61437a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f61437a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f61437a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f61437a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f61437a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f61437a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f61437a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f61437a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f61437a.submit(runnable, t10);
    }

    public String toString() {
        return this.f61437a.toString();
    }

    ExecutorServiceC6490a(ExecutorService executorService) {
        this.f61437a = executorService;
    }

    static int a() {
        if (b() >= 4) {
            return 2;
        }
        return 1;
    }

    public static b c() {
        return new b(true).c(a()).b("animation");
    }

    public static ExecutorServiceC6490a d() {
        return c().a();
    }

    public static ExecutorServiceC6490a f() {
        return e().a();
    }

    public static ExecutorServiceC6490a h() {
        return g().a();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f61437a.submit(callable);
    }
}
