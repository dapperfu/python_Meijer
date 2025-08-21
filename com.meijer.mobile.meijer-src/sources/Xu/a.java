package Xu;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
abstract class a extends AtomicReference<Future<?>> implements Ju.b {

    /* renamed from: c, reason: collision with root package name */
    protected static final FutureTask<Void> f42669c;

    /* renamed from: d, reason: collision with root package name */
    protected static final FutureTask<Void> f42670d;

    /* renamed from: a, reason: collision with root package name */
    protected final Runnable f42671a;

    /* renamed from: b, reason: collision with root package name */
    protected Thread f42672b;

    static {
        Runnable runnable = Nu.a.f22735b;
        f42669c = new FutureTask<>(runnable, null);
        f42670d = new FutureTask<>(runnable, null);
    }

    a(Runnable runnable) {
        this.f42671a = runnable;
    }

    public final void a(Future<?> future) {
        Future<?> future2;
        boolean z10;
        do {
            future2 = get();
            if (future2 != f42669c) {
                if (future2 == f42670d) {
                    if (this.f42672b != Thread.currentThread()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    future.cancel(z10);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // Ju.b
    public final void dispose() {
        FutureTask<Void> futureTask;
        boolean z10;
        Future<?> future = get();
        if (future != f42669c && future != (futureTask = f42670d) && compareAndSet(future, futureTask) && future != null) {
            if (this.f42672b != Thread.currentThread()) {
                z10 = true;
            } else {
                z10 = false;
            }
            future.cancel(z10);
        }
    }

    @Override // Ju.b
    public final boolean isDisposed() {
        Future<?> future = get();
        if (future != f42669c && future != f42670d) {
            return false;
        }
        return true;
    }
}
