package H;

import I.n;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.q;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class c extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal<ScheduledExecutorService> f13261b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Handler f13262a;

    class b implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f13263a;

        b(Runnable runnable) {
            this.f13263a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f13263a.run();
            return null;
        }
    }

    /* renamed from: H.c$c, reason: collision with other inner class name */
    private static class RunnableScheduledFutureC0194c<V> implements RunnableScheduledFuture<V> {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference<c.a<V>> f13265a = new AtomicReference<>(null);

        /* renamed from: b, reason: collision with root package name */
        private final long f13266b;

        /* renamed from: c, reason: collision with root package name */
        private final Callable<V> f13267c;

        /* renamed from: d, reason: collision with root package name */
        private final q<V> f13268d;

        /* renamed from: H.c$c$a */
        class a implements c.InterfaceC1101c<V> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Handler f13269a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Callable f13270b;

            /* renamed from: H.c$c$a$a, reason: collision with other inner class name */
            class RunnableC0195a implements Runnable {
                RunnableC0195a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (RunnableScheduledFutureC0194c.this.f13265a.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f13269a.removeCallbacks(RunnableScheduledFutureC0194c.this);
                    }
                }
            }

            a(Handler handler, Callable callable) {
                this.f13269a = handler;
                this.f13270b = callable;
            }

            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public Object a(c.a<V> aVar) throws RejectedExecutionException {
                aVar.a(new RunnableC0195a(), H.a.a());
                RunnableScheduledFutureC0194c.this.f13265a.set(aVar);
                return "HandlerScheduledFuture-" + this.f13270b.toString();
            }
        }

        @Override // java.util.concurrent.Future
        public V get() throws ExecutionException, InterruptedException {
            return this.f13268d.get();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return this.f13268d.cancel(z10);
        }

        @Override // java.util.concurrent.Future
        public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f13268d.get(j10, timeUnit);
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f13266b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f13268d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f13268d.isDone();
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            c.a andSet = this.f13265a.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.c(this.f13267c.call());
                } catch (Exception e10) {
                    andSet.f(e10);
                }
            }
        }

        RunnableScheduledFutureC0194c(Handler handler, long j10, Callable<V> callable) {
            this.f13266b = j10;
            this.f13267c = callable;
            this.f13268d = androidx.concurrent.futures.c.a(new a(handler, callable));
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return schedule(new b(runnable), j10, timeUnit);
    }

    class a extends ThreadLocal<ScheduledExecutorService> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return H.a.d();
            }
            if (Looper.myLooper() != null) {
                return new c(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    private RejectedExecutionException a() {
        return new RejectedExecutionException(this.f13262a + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f13262a.post(runnable)) {
            throw a();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    c(Handler handler) {
        this.f13262a = handler;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        long jUptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j10, timeUnit);
        RunnableScheduledFutureC0194c runnableScheduledFutureC0194c = new RunnableScheduledFutureC0194c(this.f13262a, jUptimeMillis, callable);
        return this.f13262a.postAtTime(runnableScheduledFutureC0194c, jUptimeMillis) ? runnableScheduledFutureC0194c : n.o(a());
    }
}
