package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes6.dex */
final class S2 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final Object f85207a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f85208b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f85209c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ T2 f85210d;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f85210d.A().acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                c(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f85208b;
                R2 r22 = (R2) blockingQueue.poll();
                if (r22 != null) {
                    Process.setThreadPriority(true != r22.f85188b ? 10 : threadPriority);
                    r22.run();
                } else {
                    Object obj = this.f85207a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f85210d.B();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e11) {
                                c(e11);
                            }
                        }
                    }
                    synchronized (this.f85210d.z()) {
                        if (this.f85208b.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            b();
            throw th2;
        }
    }

    private final void b() {
        T2 t22 = this.f85210d;
        synchronized (t22.z()) {
            try {
                if (!this.f85209c) {
                    t22.A().release();
                    t22.z().notifyAll();
                    if (this == t22.v()) {
                        t22.w(null);
                    } else if (this == t22.x()) {
                        t22.y(null);
                    } else {
                        t22.f84868a.a().m().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f85209c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void c(InterruptedException interruptedException) {
        this.f85210d.f84868a.a().p().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        Object obj = this.f85207a;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public S2(T2 t22, String str, BlockingQueue blockingQueue) {
        Objects.requireNonNull(t22);
        this.f85210d = t22;
        this.f85209c = false;
        com.google.android.gms.common.internal.r.l(str);
        com.google.android.gms.common.internal.r.l(blockingQueue);
        this.f85207a = new Object();
        this.f85208b = blockingQueue;
        setName(str);
    }
}
