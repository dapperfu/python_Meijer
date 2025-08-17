package bv;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bv.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
abstract class AbstractC6285a extends AtomicReference<Future<?>> implements Nu.b {

    /* renamed from: c, reason: collision with root package name */
    protected static final FutureTask<Void> f60771c;

    /* renamed from: d, reason: collision with root package name */
    protected static final FutureTask<Void> f60772d;

    /* renamed from: a, reason: collision with root package name */
    protected final Runnable f60773a;

    /* renamed from: b, reason: collision with root package name */
    protected Thread f60774b;

    static {
        Runnable runnable = Ru.a.f33001b;
        f60771c = new FutureTask<>(runnable, null);
        f60772d = new FutureTask<>(runnable, null);
    }

    AbstractC6285a(Runnable runnable) {
        this.f60773a = runnable;
    }

    public final void a(Future<?> future) {
        Future<?> future2;
        boolean z10;
        do {
            future2 = get();
            if (future2 != f60771c) {
                if (future2 == f60772d) {
                    if (this.f60774b != Thread.currentThread()) {
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

    @Override // Nu.b
    public final void dispose() {
        FutureTask<Void> futureTask;
        boolean z10;
        Future<?> future = get();
        if (future != f60771c && future != (futureTask = f60772d) && compareAndSet(future, futureTask) && future != null) {
            if (this.f60774b != Thread.currentThread()) {
                z10 = true;
            } else {
                z10 = false;
            }
            future.cancel(z10);
        }
    }

    @Override // Nu.b
    public final boolean isDisposed() {
        Future<?> future = get();
        if (future != f60771c && future != f60772d) {
            return false;
        }
        return true;
    }
}
