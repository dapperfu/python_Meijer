package a7;

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

/* renamed from: a7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ExecutorServiceC5584a implements ExecutorService {

    /* renamed from: b, reason: collision with root package name */
    private static final long f44420b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c, reason: collision with root package name */
    private static volatile int f44421c;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f44422a;

    /* renamed from: a7.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f44423a;

        /* renamed from: b, reason: collision with root package name */
        private int f44424b;

        /* renamed from: c, reason: collision with root package name */
        private int f44425c;

        /* renamed from: d, reason: collision with root package name */
        private ThreadFactory f44426d = new c();

        /* renamed from: e, reason: collision with root package name */
        private e f44427e = e.f44441d;

        /* renamed from: f, reason: collision with root package name */
        private String f44428f;

        /* renamed from: g, reason: collision with root package name */
        private long f44429g;

        public ExecutorServiceC5584a a() {
            if (TextUtils.isEmpty(this.f44428f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f44428f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f44424b, this.f44425c, this.f44429g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f44426d, this.f44428f, this.f44427e, this.f44423a));
            if (this.f44429g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new ExecutorServiceC5584a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f44428f = str;
            return this;
        }

        public b c(int i10) {
            this.f44424b = i10;
            this.f44425c = i10;
            return this;
        }

        b(boolean z10) {
            this.f44423a = z10;
        }
    }

    /* renamed from: a7.a$c */
    private static final class c implements ThreadFactory {

        /* renamed from: a7.a$c$a, reason: collision with other inner class name */
        class C0943a extends Thread {
            C0943a(Runnable runnable) {
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
            return new C0943a(runnable);
        }
    }

    /* renamed from: a7.a$d */
    private static final class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadFactory f44431a;

        /* renamed from: b, reason: collision with root package name */
        private final String f44432b;

        /* renamed from: c, reason: collision with root package name */
        final e f44433c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f44434d;

        /* renamed from: e, reason: collision with root package name */
        private final AtomicInteger f44435e = new AtomicInteger();

        /* renamed from: a7.a$d$a, reason: collision with other inner class name */
        class RunnableC0944a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f44436a;

            RunnableC0944a(Runnable runnable) {
                this.f44436a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f44434d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f44436a.run();
                } catch (Throwable th2) {
                    d.this.f44433c.a(th2);
                }
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f44431a.newThread(new RunnableC0944a(runnable));
            threadNewThread.setName("glide-" + this.f44432b + "-thread-" + this.f44435e.getAndIncrement());
            return threadNewThread;
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f44431a = threadFactory;
            this.f44432b = str;
            this.f44433c = eVar;
            this.f44434d = z10;
        }
    }

    /* renamed from: a7.a$e */
    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f44438a = new C0945a();

        /* renamed from: b, reason: collision with root package name */
        public static final e f44439b;

        /* renamed from: c, reason: collision with root package name */
        public static final e f44440c;

        /* renamed from: d, reason: collision with root package name */
        public static final e f44441d;

        /* renamed from: a7.a$e$b */
        class b implements e {
            @Override // a7.ExecutorServiceC5584a.e
            public void a(Throwable th2) {
                if (th2 == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                FS.log_e("GlideExecutor", "Request threw uncaught throwable", th2);
            }

            b() {
            }
        }

        /* renamed from: a7.a$e$c */
        class c implements e {
            @Override // a7.ExecutorServiceC5584a.e
            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }

            c() {
            }
        }

        void a(Throwable th2);

        /* renamed from: a7.a$e$a, reason: collision with other inner class name */
        class C0945a implements e {
            @Override // a7.ExecutorServiceC5584a.e
            public void a(Throwable th2) {
            }

            C0945a() {
            }
        }

        static {
            b bVar = new b();
            f44439b = bVar;
            f44440c = new c();
            f44441d = bVar;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f44422a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f44422a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f44422a.submit(runnable);
    }

    public static int b() {
        if (f44421c == 0) {
            f44421c = Math.min(4, a7.b.a());
        }
        return f44421c;
    }

    public static b e() {
        return new b(true).c(1).b("disk-cache");
    }

    public static b g() {
        return new b(false).c(b()).b("source");
    }

    public static ExecutorServiceC5584a i() {
        return new ExecutorServiceC5584a(new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, f44420b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f44441d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f44422a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f44422a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f44422a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f44422a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f44422a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f44422a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f44422a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f44422a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f44422a.submit(runnable, t10);
    }

    public String toString() {
        return this.f44422a.toString();
    }

    ExecutorServiceC5584a(ExecutorService executorService) {
        this.f44422a = executorService;
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

    public static ExecutorServiceC5584a d() {
        return c().a();
    }

    public static ExecutorServiceC5584a f() {
        return e().a();
    }

    public static ExecutorServiceC5584a h() {
        return g().a();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f44422a.submit(callable);
    }
}
