package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes6.dex */
abstract class o<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final Runnable f88101a;

    /* renamed from: b, reason: collision with root package name */
    private static final Runnable f88102b;

    static final class b extends AbstractOwnableSynchronizer implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final o<?> f88103a;

        @Override // java.lang.Runnable
        public void run() {
        }

        private b(o<?> oVar) {
            this.f88103a = oVar;
        }

        public String toString() {
            return this.f88103a.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }
    }

    private static final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    abstract void a(Throwable th2);

    abstract void b(T t10);

    abstract boolean f();

    abstract T g() throws Exception;

    abstract String h();

    static {
        f88101a = new c();
        f88102b = new c();
    }

    o() {
    }

    private void i(Thread thread) {
        Runnable runnable = get();
        b bVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof b;
            if (!z11 && runnable != f88102b) {
                break;
            }
            if (z11) {
                bVar = (b) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f88102b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    if (!Thread.interrupted() && !z10) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    LockSupport.park(bVar);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    final void e() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            b bVar = new b();
            bVar.b(Thread.currentThread());
            if (compareAndSet(runnable, bVar)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(f88101a) == f88102b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objG = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zF = f();
            if (!zF) {
                try {
                    objG = g();
                } catch (Throwable th2) {
                    try {
                        x.a(th2);
                        if (!compareAndSet(threadCurrentThread, f88101a)) {
                            i(threadCurrentThread);
                        }
                        if (!zF) {
                            a(th2);
                            return;
                        }
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, f88101a)) {
                            i(threadCurrentThread);
                        }
                        if (!zF) {
                            b(v.a(null));
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f88101a) {
            str = "running=[DONE]";
        } else if (runnable instanceof b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + h();
    }
}
