package bv;

import gv.C14313a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
final class c implements Callable<Void>, Nu.b {

    /* renamed from: f, reason: collision with root package name */
    static final FutureTask<Void> f60789f = new FutureTask<>(Ru.a.f33001b, null);

    /* renamed from: a, reason: collision with root package name */
    final Runnable f60790a;

    /* renamed from: d, reason: collision with root package name */
    final ExecutorService f60793d;

    /* renamed from: e, reason: collision with root package name */
    Thread f60794e;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<Future<?>> f60792c = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<Future<?>> f60791b = new AtomicReference<>();

    void b(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f60792c.get();
            if (future2 == f60789f) {
                future.cancel(this.f60794e != Thread.currentThread());
                return;
            }
        } while (!U.d.a(this.f60792c, future2, future));
    }

    void c(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f60791b.get();
            if (future2 == f60789f) {
                future.cancel(this.f60794e != Thread.currentThread());
                return;
            }
        } while (!U.d.a(this.f60791b, future2, future));
    }

    @Override // Nu.b
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f60792c;
        FutureTask<Void> futureTask = f60789f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f60794e != Thread.currentThread());
        }
        Future<?> andSet2 = this.f60791b.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f60794e != Thread.currentThread());
    }

    @Override // Nu.b
    public boolean isDisposed() {
        return this.f60792c.get() == f60789f;
    }

    c(Runnable runnable, ExecutorService executorService) {
        this.f60790a = runnable;
        this.f60793d = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        this.f60794e = Thread.currentThread();
        try {
            this.f60790a.run();
            c(this.f60793d.submit(this));
            this.f60794e = null;
        } catch (Throwable th2) {
            this.f60794e = null;
            C14313a.s(th2);
        }
        return null;
    }
}
