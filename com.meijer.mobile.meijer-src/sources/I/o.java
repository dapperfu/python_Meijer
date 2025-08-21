package I;

import C.P;
import com.google.common.util.concurrent.q;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
abstract class o<V> implements q<V> {

    static class a<V> extends o<V> {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f14103a;

        @Override // I.o, java.util.concurrent.Future
        public V get() throws ExecutionException {
            throw new ExecutionException(this.f14103a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f14103a + "]]";
        }

        a(Throwable th2) {
            this.f14103a = th2;
        }
    }

    static final class b<V> extends a<V> implements ScheduledFuture<V> {
        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }

        b(Throwable th2) {
            super(th2);
        }
    }

    static final class c<V> extends o<V> {

        /* renamed from: b, reason: collision with root package name */
        static final o<Object> f14104b = new c(null);

        /* renamed from: a, reason: collision with root package name */
        private final V f14105a;

        @Override // I.o, java.util.concurrent.Future
        public V get() {
            return this.f14105a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f14105a + "]]";
        }

        c(V v10) {
            this.f14105a = v10;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get() throws ExecutionException;

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException {
        o2.i.g(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public static <V> q<V> a() {
        return c.f14104b;
    }

    o() {
    }

    @Override // com.google.common.util.concurrent.q
    public void addListener(Runnable runnable, Executor executor) {
        o2.i.g(runnable);
        o2.i.g(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            P.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e10);
        }
    }
}
