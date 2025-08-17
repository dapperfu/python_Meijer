package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class T2 extends B3 {

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicLong f85225k = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    private S2 f85226c;

    /* renamed from: d, reason: collision with root package name */
    private S2 f85227d;

    /* renamed from: e, reason: collision with root package name */
    private final PriorityBlockingQueue f85228e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f85229f;

    /* renamed from: g, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f85230g;

    /* renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f85231h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f85232i;

    /* renamed from: j, reason: collision with root package name */
    private final Semaphore f85233j;

    final /* synthetic */ Semaphore A() {
        return this.f85233j;
    }

    final /* synthetic */ boolean B() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final boolean g() {
        return false;
    }

    final /* synthetic */ S2 v() {
        return this.f85226c;
    }

    final /* synthetic */ void w(S2 s22) {
        this.f85226c = null;
    }

    final /* synthetic */ S2 x() {
        return this.f85227d;
    }

    final /* synthetic */ void y(S2 s22) {
        this.f85227d = null;
    }

    final /* synthetic */ Object z() {
        return this.f85232i;
    }

    private final void D(R2 r22) {
        synchronized (this.f85232i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f85228e;
                priorityBlockingQueue.add(r22);
                S2 s22 = this.f85226c;
                if (s22 == null) {
                    S2 s23 = new S2(this, "Measurement Worker", priorityBlockingQueue);
                    this.f85226c = s23;
                    s23.setUncaughtExceptionHandler(this.f85230g);
                    this.f85226c.start();
                } else {
                    s22.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final Object s(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f84868a.b().r(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                C11204o2 c11204o2P = this.f84868a.a().p();
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                c11204o2P.a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f84868a.a().p().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    T2(X2 x22) {
        super(x22);
        this.f85232i = new Object();
        this.f85233j = new Semaphore(2);
        this.f85228e = new PriorityBlockingQueue();
        this.f85229f = new LinkedBlockingQueue();
        this.f85230g = new Q2(this, "Thread death: Uncaught exception on worker thread");
        this.f85231h = new Q2(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // com.google.android.gms.measurement.internal.A3
    public final void e() {
        if (Thread.currentThread() == this.f85227d) {
        } else {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.A3
    public final void f() {
        if (Thread.currentThread() == this.f85226c) {
        } else {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final void m() {
        if (Thread.currentThread() != this.f85226c) {
        } else {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean n() {
        if (Thread.currentThread() == this.f85226c) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (Thread.currentThread() == this.f85227d) {
            return true;
        }
        return false;
    }

    public final Future p(Callable callable) throws IllegalStateException {
        j();
        com.google.android.gms.common.internal.r.l(callable);
        R2 r22 = new R2(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f85226c) {
            if (!this.f85228e.isEmpty()) {
                this.f84868a.a().p().a("Callable skipped the worker queue.");
            }
            r22.run();
            return r22;
        }
        D(r22);
        return r22;
    }

    public final Future q(Callable callable) throws IllegalStateException {
        j();
        com.google.android.gms.common.internal.r.l(callable);
        R2 r22 = new R2(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f85226c) {
            r22.run();
            return r22;
        }
        D(r22);
        return r22;
    }

    public final void r(Runnable runnable) throws IllegalStateException {
        j();
        com.google.android.gms.common.internal.r.l(runnable);
        D(new R2(this, runnable, false, "Task exception on worker thread"));
    }

    public final void t(Runnable runnable) throws IllegalStateException {
        j();
        com.google.android.gms.common.internal.r.l(runnable);
        D(new R2(this, runnable, true, "Task exception on worker thread"));
    }

    public final void u(Runnable runnable) throws IllegalStateException {
        j();
        com.google.android.gms.common.internal.r.l(runnable);
        R2 r22 = new R2(this, runnable, false, "Task exception on network thread");
        synchronized (this.f85232i) {
            try {
                BlockingQueue blockingQueue = this.f85229f;
                blockingQueue.add(r22);
                S2 s22 = this.f85227d;
                if (s22 == null) {
                    S2 s23 = new S2(this, "Measurement Network", blockingQueue);
                    this.f85227d = s23;
                    s23.setUncaughtExceptionHandler(this.f85231h);
                    this.f85227d.start();
                } else {
                    s22.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
