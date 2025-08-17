package com.android.volley;

import android.os.Process;
import com.android.volley.a;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes4.dex */
public class b extends Thread {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f62887g = n.f62943b;

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<i<?>> f62888a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<i<?>> f62889b;

    /* renamed from: c, reason: collision with root package name */
    private final com.android.volley.a f62890c;

    /* renamed from: d, reason: collision with root package name */
    private final l f62891d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f62892e = false;

    /* renamed from: f, reason: collision with root package name */
    private final o f62893f;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f62894a;

        a(i iVar) {
            this.f62894a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            try {
                b.this.f62889b.put(this.f62894a);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void e() {
        this.f62892e = true;
        interrupt();
    }

    private void b() throws InterruptedException {
        c(this.f62888a.take());
    }

    void c(i<?> iVar) throws InterruptedException {
        iVar.addMarker("cache-queue-take");
        iVar.sendEvent(1);
        try {
            if (iVar.isCanceled()) {
                iVar.finish("cache-discard-canceled");
                return;
            }
            a.C1240a c1240aA = this.f62890c.a(iVar.getCacheKey());
            if (c1240aA == null) {
                iVar.addMarker("cache-miss");
                if (!this.f62893f.c(iVar)) {
                    this.f62889b.put(iVar);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c1240aA.b(jCurrentTimeMillis)) {
                iVar.addMarker("cache-hit-expired");
                iVar.setCacheEntry(c1240aA);
                if (!this.f62893f.c(iVar)) {
                    this.f62889b.put(iVar);
                }
                return;
            }
            iVar.addMarker("cache-hit");
            k<?> networkResponse = iVar.parseNetworkResponse(new h(c1240aA.f62879a, c1240aA.f62885g));
            iVar.addMarker("cache-hit-parsed");
            if (!networkResponse.b()) {
                iVar.addMarker("cache-parsing-failed");
                this.f62890c.c(iVar.getCacheKey(), true);
                iVar.setCacheEntry(null);
                if (!this.f62893f.c(iVar)) {
                    this.f62889b.put(iVar);
                }
                return;
            }
            if (c1240aA.c(jCurrentTimeMillis)) {
                iVar.addMarker("cache-hit-refresh-needed");
                iVar.setCacheEntry(c1240aA);
                networkResponse.f62941d = true;
                if (this.f62893f.c(iVar)) {
                    this.f62891d.a(iVar, networkResponse);
                } else {
                    this.f62891d.b(iVar, networkResponse, new a(iVar));
                }
            } else {
                this.f62891d.a(iVar, networkResponse);
            }
        } finally {
            iVar.sendEvent(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws SecurityException, IllegalArgumentException {
        if (f62887g) {
            n.e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f62890c.b();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f62892e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                n.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public b(BlockingQueue<i<?>> blockingQueue, BlockingQueue<i<?>> blockingQueue2, com.android.volley.a aVar, l lVar) {
        this.f62888a = blockingQueue;
        this.f62889b = blockingQueue2;
        this.f62890c = aVar;
        this.f62891d = lVar;
        this.f62893f = new o(this, blockingQueue2, lVar);
    }
}
