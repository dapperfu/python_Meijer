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
    private static final AtomicLong f86065k = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    private S2 f86066c;

    /* renamed from: d, reason: collision with root package name */
    private S2 f86067d;

    /* renamed from: e, reason: collision with root package name */
    private final PriorityBlockingQueue f86068e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f86069f;

    /* renamed from: g, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f86070g;

    /* renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f86071h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f86072i;

    /* renamed from: j, reason: collision with root package name */
    private final Semaphore f86073j;

    final /* synthetic */ Semaphore A() {
        return this.f86073j;
    }

    final /* synthetic */ boolean B() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final boolean g() {
        return false;
    }

    final /* synthetic */ S2 v() {
        return this.f86066c;
    }

    final /* synthetic */ void w(S2 s22) {
        this.f86066c = null;
    }

    final /* synthetic */ S2 x() {
        return this.f86067d;
    }

    final /* synthetic */ void y(S2 s22) {
        this.f86067d = null;
    }

    final /* synthetic */ Object z() {
        return this.f86072i;
    }

    private final void D(R2 r22) {
        synchronized (this.f86072i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f86068e;
                priorityBlockingQueue.add(r22);
                S2 s22 = this.f86066c;
                if (s22 == null) {
                    S2 s23 = new S2(this, "Measurement Worker", priorityBlockingQueue);
                    this.f86066c = s23;
                    s23.setUncaughtExceptionHandler(this.f86070g);
                    this.f86066c.start();
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
            this.f85708a.b().r(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                C11329o2 c11329o2P = this.f85708a.a().p();
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                c11329o2P.a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f85708a.a().p().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    T2(X2 x22) {
        super(x22);
        this.f86072i = new Object();
        this.f86073j = new Semaphore(2);
        this.f86068e = new PriorityBlockingQueue();
        this.f86069f = new LinkedBlockingQueue();
        this.f86070g = new Q2(this, "Thread death: Uncaught exception on worker thread");
        this.f86071h = new Q2(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // com.google.android.gms.measurement.internal.A3
    public final void e() {
        if (Thread.currentThread() == this.f86067d) {
        } else {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.A3
    public final void f() {
        if (Thread.currentThread() == this.f86066c) {
        } else {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final void m() {
        if (Thread.currentThread() != this.f86066c) {
        } else {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean n() {
        if (Thread.currentThread() == this.f86066c) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (Thread.currentThread() == this.f86067d) {
            return true;
        }
        return false;
    }

    public final Future p(Callable callable) throws IllegalStateException {
        j();
        com.google.android.gms.common.internal.r.l(callable);
        R2 r22 = new R2(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f86066c) {
            if (!this.f86068e.isEmpty()) {
                this.f85708a.a().p().a("Callable skipped the worker queue.");
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
        if (Thread.currentThread() == this.f86066c) {
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
        synchronized (this.f86072i) {
            try {
                BlockingQueue blockingQueue = this.f86069f;
                blockingQueue.add(r22);
                S2 s22 = this.f86067d;
                if (s22 == null) {
                    S2 s23 = new S2(this, "Measurement Network", blockingQueue);
                    this.f86067d = s23;
                    s23.setUncaughtExceptionHandler(this.f86071h);
                    this.f86067d.start();
                } else {
                    s22.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
