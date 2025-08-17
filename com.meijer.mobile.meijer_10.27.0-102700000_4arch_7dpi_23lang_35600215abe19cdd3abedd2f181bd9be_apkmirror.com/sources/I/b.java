package I;

import com.google.common.util.concurrent.q;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
class b<I, O> extends d<O> implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    private I.a<? super I, ? extends O> f13393c;

    /* renamed from: d, reason: collision with root package name */
    private final BlockingQueue<Boolean> f13394d = new LinkedBlockingQueue(1);

    /* renamed from: e, reason: collision with root package name */
    private final CountDownLatch f13395e = new CountDownLatch(1);

    /* renamed from: f, reason: collision with root package name */
    private q<? extends I> f13396f;

    /* renamed from: g, reason: collision with root package name */
    volatile q<? extends O> f13397g;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f13398a;

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        b.this.b(n.m(this.f13398a));
                    } catch (CancellationException unused) {
                        b.this.cancel(false);
                    }
                } catch (ExecutionException e10) {
                    b.this.c(e10.getCause());
                }
            } finally {
                b.this.f13397g = null;
            }
        }

        a(q qVar) {
            this.f13398a = qVar;
        }
    }

    private <E> void g(BlockingQueue<E> blockingQueue, E e10) {
        boolean z10 = false;
        while (true) {
            try {
                blockingQueue.put(e10);
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private <E> E h(BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z10 = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return eTake;
    }

    @Override // I.d, java.util.concurrent.Future
    public O get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            q<? extends I> qVar = this.f13396f;
            if (qVar != null) {
                qVar.get();
            }
            this.f13395e.await();
            q<? extends O> qVar2 = this.f13397g;
            if (qVar2 != null) {
                qVar2.get();
            }
        }
        return (O) super.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [I.a<? super I, ? extends O>, com.google.common.util.concurrent.q<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [I.a<? super I, ? extends O>, com.google.common.util.concurrent.q<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public void run() {
        I.a<? super I, ? extends O> aVar;
        ?? r02 = (I.a<? super I, ? extends O>) null;
        try {
            try {
                try {
                    try {
                        try {
                            q<? extends O> qVarApply = this.f13393c.apply(n.m(this.f13396f));
                            this.f13397g = qVarApply;
                            if (isCancelled()) {
                                qVarApply.cancel(((Boolean) h(this.f13394d)).booleanValue());
                                this.f13397g = null;
                            } else {
                                qVarApply.addListener(new a(qVarApply), H.a.a());
                            }
                        } catch (Exception e10) {
                            c(e10);
                            aVar = r02;
                        }
                    } catch (Error e11) {
                        c(e11);
                        aVar = r02;
                    }
                } finally {
                    this.f13393c = (I.a<? super I, ? extends O>) r02;
                    this.f13396f = (q<? extends I>) r02;
                    this.f13395e.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e12) {
                c(e12.getCause());
            }
        } catch (UndeclaredThrowableException e13) {
            c(e13.getCause());
            aVar = r02;
        }
    }

    private void f(Future<?> future, boolean z10) {
        if (future != null) {
            future.cancel(z10);
        }
    }

    b(I.a<? super I, ? extends O> aVar, q<? extends I> qVar) {
        this.f13393c = (I.a) o2.i.g(aVar);
        this.f13396f = (q) o2.i.g(qVar);
    }

    @Override // I.d, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        if (super.cancel(z10)) {
            g(this.f13394d, Boolean.valueOf(z10));
            f(this.f13396f, z10);
            f(this.f13397g, z10);
            return true;
        }
        return false;
    }

    @Override // I.d, java.util.concurrent.Future
    public O get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j10 = timeUnit2.convert(j10, timeUnit);
                timeUnit = timeUnit2;
            }
            q<? extends I> qVar = this.f13396f;
            if (qVar != null) {
                long jNanoTime = System.nanoTime();
                qVar.get(j10, timeUnit);
                j10 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f13395e.await(j10, timeUnit)) {
                j10 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                q<? extends O> qVar2 = this.f13397g;
                if (qVar2 != null) {
                    qVar2.get(j10, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j10, timeUnit);
    }
}
