package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes6.dex */
public final class R6 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue f70623a;

    /* renamed from: b, reason: collision with root package name */
    private final Q6 f70624b;

    /* renamed from: c, reason: collision with root package name */
    private final H6 f70625c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f70626d = false;

    /* renamed from: e, reason: collision with root package name */
    private final O6 f70627e;

    public final void a() {
        this.f70626d = true;
        interrupt();
    }

    private void b() throws InterruptedException {
        V6 v62 = (V6) this.f70623a.take();
        SystemClock.elapsedRealtime();
        v62.H(3);
        try {
            try {
                v62.z("network-queue-take");
                v62.K();
                TrafficStats.setThreadStatsTag(v62.zzc());
                S6 s6A = this.f70624b.a(v62);
                v62.z("network-http-complete");
                if (s6A.f70875e && v62.J()) {
                    v62.D("not-modified");
                    v62.F();
                } else {
                    C7668b7 c7668b7O = v62.o(s6A);
                    v62.z("network-parse-complete");
                    if (c7668b7O.f73557b != null) {
                        this.f70625c.b(v62.t(), c7668b7O.f73557b);
                        v62.z("network-cache-written");
                    }
                    v62.E();
                    this.f70627e.b(v62, c7668b7O, null);
                    v62.G(c7668b7O);
                }
            } catch (zzapv e10) {
                SystemClock.elapsedRealtime();
                this.f70627e.a(v62, e10);
                v62.F();
            } catch (Exception e11) {
                C7987e7.c(e11, "Unhandled exception %s", e11.toString());
                zzapv zzapvVar = new zzapv(e11);
                SystemClock.elapsedRealtime();
                this.f70627e.a(v62, zzapvVar);
                v62.F();
            }
            v62.H(4);
        } catch (Throwable th2) {
            v62.H(4);
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f70626d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C7987e7.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public R6(BlockingQueue blockingQueue, Q6 q62, H6 h62, O6 o62) {
        this.f70623a = blockingQueue;
        this.f70624b = q62;
        this.f70625c = h62;
        this.f70627e = o62;
    }
}
