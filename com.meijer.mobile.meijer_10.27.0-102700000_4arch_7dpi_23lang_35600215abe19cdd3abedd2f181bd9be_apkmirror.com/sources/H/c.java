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
    private static ThreadLocal<ScheduledExecutorService> f11929b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Handler f11930a;

    class b implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f11931a;

        b(Runnable runnable) {
            this.f11931a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f11931a.run();
            return null;
        }
    }

    /* renamed from: H.c$c, reason: collision with other inner class name */
    private static class RunnableScheduledFutureC0179c<V> implements RunnableScheduledFuture<V> {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference<c.a<V>> f11933a = new AtomicReference<>(null);

        /* renamed from: b, reason: collision with root package name */
        private final long f11934b;

        /* renamed from: c, reason: collision with root package name */
        private final Callable<V> f11935c;

        /* renamed from: d, reason: collision with root package name */
        private final q<V> f11936d;

        /* renamed from: H.c$c$a */
        class a implements c.InterfaceC1088c<V> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Handler f11937a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Callable f11938b;

            /* renamed from: H.c$c$a$a, reason: collision with other inner class name */
            class RunnableC0180a implements Runnable {
                RunnableC0180a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (RunnableScheduledFutureC0179c.this.f11933a.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f11937a.removeCallbacks(RunnableScheduledFutureC0179c.this);
                    }
                }
            }

            a(Handler handler, Callable callable) {
                this.f11937a = handler;
                this.f11938b = callable;
            }

            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public Object a(c.a<V> aVar) throws RejectedExecutionException {
                aVar.a(new RunnableC0180a(), H.a.a());
                RunnableScheduledFutureC0179c.this.f11933a.set(aVar);
                return "HandlerScheduledFuture-" + this.f11938b.toString();
            }
        }

        @Override // java.util.concurrent.Future
        public V get() throws ExecutionException, InterruptedException {
            return this.f11936d.get();
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
            return this.f11936d.cancel(z10);
        }

        @Override // java.util.concurrent.Future
        public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f11936d.get(j10, timeUnit);
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f11934b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f11936d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f11936d.isDone();
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            c.a andSet = this.f11933a.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.c(this.f11935c.call());
                } catch (Exception e10) {
                    andSet.f(e10);
                }
            }
        }

        RunnableScheduledFutureC0179c(Handler handler, long j10, Callable<V> callable) {
            this.f11934b = j10;
            this.f11935c = callable;
            this.f11936d = androidx.concurrent.futures.c.a(new a(handler, callable));
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
        return new RejectedExecutionException(this.f11930a + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f11930a.post(runnable)) {
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
        this.f11930a = handler;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        long jUptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j10, timeUnit);
        RunnableScheduledFutureC0179c runnableScheduledFutureC0179c = new RunnableScheduledFutureC0179c(this.f11930a, jUptimeMillis, callable);
        return this.f11930a.postAtTime(runnableScheduledFutureC0179c, jUptimeMillis) ? runnableScheduledFutureC0179c : n.o(a());
    }
}
