package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes6.dex */
final class S2 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final Object f86047a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f86048b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f86049c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ T2 f86050d;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f86050d.A().acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                c(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f86048b;
                R2 r22 = (R2) blockingQueue.poll();
                if (r22 != null) {
                    Process.setThreadPriority(true != r22.f86028b ? 10 : threadPriority);
                    r22.run();
                } else {
                    Object obj = this.f86047a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f86050d.B();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e11) {
                                c(e11);
                            }
                        }
                    }
                    synchronized (this.f86050d.z()) {
                        if (this.f86048b.peek() == null) {
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
        T2 t22 = this.f86050d;
        synchronized (t22.z()) {
            try {
                if (!this.f86049c) {
                    t22.A().release();
                    t22.z().notifyAll();
                    if (this == t22.v()) {
                        t22.w(null);
                    } else if (this == t22.x()) {
                        t22.y(null);
                    } else {
                        t22.f85708a.a().m().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f86049c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void c(InterruptedException interruptedException) {
        this.f86050d.f85708a.a().p().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void a() {
        Object obj = this.f86047a;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public S2(T2 t22, String str, BlockingQueue blockingQueue) {
        Objects.requireNonNull(t22);
        this.f86050d = t22;
        this.f86049c = false;
        com.google.android.gms.common.internal.r.l(str);
        com.google.android.gms.common.internal.r.l(blockingQueue);
        this.f86047a = new Object();
        this.f86048b = blockingQueue;
        setName(str);
    }
}
