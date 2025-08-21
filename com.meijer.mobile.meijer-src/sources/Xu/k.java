package Xu;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes10.dex */
public final class k extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, Ju.b {

    /* renamed from: b, reason: collision with root package name */
    static final Object f42720b = new Object();

    /* renamed from: c, reason: collision with root package name */
    static final Object f42721c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final Object f42722d = new Object();

    /* renamed from: e, reason: collision with root package name */
    static final Object f42723e = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Runnable f42724a;

    public k(Runnable runnable, Mu.c cVar) {
        super(3);
        this.f42724a = runnable;
        lazySet(0, cVar);
    }

    public void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f42723e) {
                return;
            }
            if (obj == f42721c) {
                future.cancel(false);
                return;
            } else if (obj == f42722d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // Ju.b
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f42723e || obj5 == (obj3 = f42721c) || obj5 == (obj4 = f42722d)) {
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
            if (obj == f42723e || obj == (obj2 = f42720b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((Mu.c) obj).a(this);
    }

    @Override // Ju.b
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == f42720b || obj == f42723e;
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
            this.f42724a.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != f42720b) {
                    ((Mu.c) obj4).a(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != f42721c) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj5, f42723e));
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
        if (obj4 != f42720b && compareAndSet(0, obj4, f42723e) && obj4 != null) {
            ((Mu.c) obj4).a(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != f42721c || obj5 == f42722d) {
                return;
            }
        } while (!compareAndSet(1, obj5, f42723e));
    }
}
