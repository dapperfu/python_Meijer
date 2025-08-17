package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes6.dex */
abstract class Uj0 extends AtomicReference implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final Runnable f70689a = new Sj0(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Runnable f70690b = new Sj0(null);

    abstract Object a() throws Exception;

    abstract String b();

    abstract void d(Throwable th2);

    abstract void e(Object obj);

    abstract boolean f();

    Uj0() {
    }

    private final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        Rj0 rj0 = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!(runnable instanceof Rj0)) {
                if (runnable != f70690b) {
                    break;
                }
            } else {
                rj0 = (Rj0) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f70690b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    if (Thread.interrupted() || z10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    LockSupport.park(rj0);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    final void g() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            Rj0 rj0 = new Rj0(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, rj0)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f70689a)) == f70690b) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th2) {
                    if (((Runnable) getAndSet(f70689a)) == f70690b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zF = f();
            if (!zF) {
                try {
                    objA = a();
                } catch (Throwable th2) {
                    try {
                        C8137gk0.a(th2);
                        if (!compareAndSet(threadCurrentThread, f70689a)) {
                            c(threadCurrentThread);
                        }
                        d(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, f70689a)) {
                            c(threadCurrentThread);
                        }
                        e(null);
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f70689a)) {
                c(threadCurrentThread);
            }
            if (!zF) {
                e(objA);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f70689a) {
            str = "running=[DONE]";
        } else if (runnable instanceof Rj0) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
