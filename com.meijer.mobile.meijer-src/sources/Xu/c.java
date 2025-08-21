package Xu;

import cv.C13558a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
final class c implements Callable<Void>, Ju.b {

    /* renamed from: f, reason: collision with root package name */
    static final FutureTask<Void> f42687f = new FutureTask<>(Nu.a.f22735b, null);

    /* renamed from: a, reason: collision with root package name */
    final Runnable f42688a;

    /* renamed from: d, reason: collision with root package name */
    final ExecutorService f42691d;

    /* renamed from: e, reason: collision with root package name */
    Thread f42692e;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<Future<?>> f42690c = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<Future<?>> f42689b = new AtomicReference<>();

    void b(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f42690c.get();
            if (future2 == f42687f) {
                future.cancel(this.f42692e != Thread.currentThread());
                return;
            }
        } while (!U.d.a(this.f42690c, future2, future));
    }

    void c(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f42689b.get();
            if (future2 == f42687f) {
                future.cancel(this.f42692e != Thread.currentThread());
                return;
            }
        } while (!U.d.a(this.f42689b, future2, future));
    }

    @Override // Ju.b
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f42690c;
        FutureTask<Void> futureTask = f42687f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f42692e != Thread.currentThread());
        }
        Future<?> andSet2 = this.f42689b.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f42692e != Thread.currentThread());
    }

    @Override // Ju.b
    public boolean isDisposed() {
        return this.f42690c.get() == f42687f;
    }

    c(Runnable runnable, ExecutorService executorService) {
        this.f42688a = runnable;
        this.f42691d = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        this.f42692e = Thread.currentThread();
        try {
            this.f42688a.run();
            c(this.f42691d.submit(this));
            this.f42692e = null;
        } catch (Throwable th2) {
            this.f42692e = null;
            C13558a.s(th2);
        }
        return null;
    }
}
