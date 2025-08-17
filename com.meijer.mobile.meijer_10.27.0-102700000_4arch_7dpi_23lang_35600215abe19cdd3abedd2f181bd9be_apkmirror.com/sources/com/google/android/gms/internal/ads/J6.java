package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes6.dex */
public final class J6 extends Thread {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f67771g = C7862e7.f73772b;

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue f67772a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f67773b;

    /* renamed from: c, reason: collision with root package name */
    private final H6 f67774c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f67775d = false;

    /* renamed from: e, reason: collision with root package name */
    private final C7969f7 f67776e;

    /* renamed from: f, reason: collision with root package name */
    private final O6 f67777f;

    public final void b() {
        this.f67775d = true;
        interrupt();
    }

    private void e() throws InterruptedException {
        V6 v62 = (V6) this.f67772a.take();
        v62.z("cache-queue-take");
        v62.H(1);
        try {
            v62.K();
            G6 g6Zza = this.f67774c.zza(v62.t());
            if (g6Zza == null) {
                v62.z("cache-miss");
                if (!this.f67776e.c(v62)) {
                    this.f67773b.put(v62);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (g6Zza.a(jCurrentTimeMillis)) {
                    v62.z("cache-hit-expired");
                    v62.e(g6Zza);
                    if (!this.f67776e.c(v62)) {
                        this.f67773b.put(v62);
                    }
                } else {
                    v62.z("cache-hit");
                    C7543b7 c7543b7O = v62.o(new S6(g6Zza.f67094a, g6Zza.f67100g));
                    v62.z("cache-hit-parsed");
                    if (!c7543b7O.c()) {
                        v62.z("cache-parsing-failed");
                        this.f67774c.a(v62.t(), true);
                        v62.e(null);
                        if (!this.f67776e.c(v62)) {
                            this.f67773b.put(v62);
                        }
                    } else if (g6Zza.f67099f < jCurrentTimeMillis) {
                        v62.z("cache-hit-refresh-needed");
                        v62.e(g6Zza);
                        c7543b7O.f72719d = true;
                        if (this.f67776e.c(v62)) {
                            this.f67777f.b(v62, c7543b7O, null);
                        } else {
                            this.f67777f.b(v62, c7543b7O, new I6(this, v62));
                        }
                    } else {
                        this.f67777f.b(v62, c7543b7O, null);
                    }
                }
            }
            v62.H(2);
        } catch (Throwable th2) {
            v62.H(2);
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (f67771g) {
            C7862e7.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f67774c.zzb();
        while (true) {
            try {
                e();
            } catch (InterruptedException unused) {
                if (this.f67775d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C7862e7.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public J6(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, H6 h62, O6 o62) {
        this.f67772a = blockingQueue;
        this.f67773b = blockingQueue2;
        this.f67774c = h62;
        this.f67777f = o62;
        this.f67776e = new C7969f7(this, blockingQueue2, o62);
    }
}
