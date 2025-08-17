package bv;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes9.dex */
public final class k extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, Nu.b {

    /* renamed from: b, reason: collision with root package name */
    static final Object f60822b = new Object();

    /* renamed from: c, reason: collision with root package name */
    static final Object f60823c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final Object f60824d = new Object();

    /* renamed from: e, reason: collision with root package name */
    static final Object f60825e = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Runnable f60826a;

    public k(Runnable runnable, Qu.c cVar) {
        super(3);
        this.f60826a = runnable;
        lazySet(0, cVar);
    }

    public void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f60825e) {
                return;
            }
            if (obj == f60823c) {
                future.cancel(false);
                return;
            } else if (obj == f60824d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // Nu.b
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f60825e || obj5 == (obj3 = f60823c) || obj5 == (obj4 = f60824d)) {
                break;
            }
            boolean z10 = get(2) != Thread.currentThread();
            if (z10) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z10);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f60825e || obj == (obj2 = f60822b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((Qu.c) obj).c(this);
    }

    @Override // Nu.b
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == f60822b || obj == f60825e;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean zCompareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.f60826a.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != f60822b) {
                    ((Qu.c) obj4).c(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != f60823c) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj5, f60825e));
            } catch (Throwable th2) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!zCompareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != f60822b && compareAndSet(0, obj4, f60825e) && obj4 != null) {
            ((Qu.c) obj4).c(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != f60823c || obj5 == f60824d) {
                return;
            }
        } while (!compareAndSet(1, obj5, f60825e));
    }
}
