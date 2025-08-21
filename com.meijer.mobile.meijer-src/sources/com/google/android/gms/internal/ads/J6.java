package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes6.dex */
public final class J6 extends Thread {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f68611g = C7987e7.f74612b;

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue f68612a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f68613b;

    /* renamed from: c, reason: collision with root package name */
    private final H6 f68614c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f68615d = false;

    /* renamed from: e, reason: collision with root package name */
    private final C8094f7 f68616e;

    /* renamed from: f, reason: collision with root package name */
    private final O6 f68617f;

    public final void b() {
        this.f68615d = true;
        interrupt();
    }

    private void e() throws InterruptedException {
        V6 v62 = (V6) this.f68612a.take();
        v62.z("cache-queue-take");
        v62.H(1);
        try {
            v62.K();
            G6 g6Zza = this.f68614c.zza(v62.t());
            if (g6Zza == null) {
                v62.z("cache-miss");
                if (!this.f68616e.c(v62)) {
                    this.f68613b.put(v62);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (g6Zza.a(jCurrentTimeMillis)) {
                    v62.z("cache-hit-expired");
                    v62.e(g6Zza);
                    if (!this.f68616e.c(v62)) {
                        this.f68613b.put(v62);
                    }
                } else {
                    v62.z("cache-hit");
                    C7668b7 c7668b7O = v62.o(new S6(g6Zza.f67934a, g6Zza.f67940g));
                    v62.z("cache-hit-parsed");
                    if (!c7668b7O.c()) {
                        v62.z("cache-parsing-failed");
                        this.f68614c.a(v62.t(), true);
                        v62.e(null);
                        if (!this.f68616e.c(v62)) {
                            this.f68613b.put(v62);
                        }
                    } else if (g6Zza.f67939f < jCurrentTimeMillis) {
                        v62.z("cache-hit-refresh-needed");
                        v62.e(g6Zza);
                        c7668b7O.f73559d = true;
                        if (this.f68616e.c(v62)) {
                            this.f68617f.b(v62, c7668b7O, null);
                        } else {
                            this.f68617f.b(v62, c7668b7O, new I6(this, v62));
                        }
                    } else {
                        this.f68617f.b(v62, c7668b7O, null);
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
        if (f68611g) {
            C7987e7.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f68614c.zzb();
        while (true) {
            try {
                e();
            } catch (InterruptedException unused) {
                if (this.f68615d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C7987e7.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public J6(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, H6 h62, O6 o62) {
        this.f68612a = blockingQueue;
        this.f68613b = blockingQueue2;
        this.f68614c = h62;
        this.f68617f = o62;
        this.f68616e = new C8094f7(this, blockingQueue2, o62);
    }
}
