package com.android.volley;

import android.os.Process;
import com.android.volley.a;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes4.dex */
public class b extends Thread {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f63726g = n.f63782b;

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<i<?>> f63727a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<i<?>> f63728b;

    /* renamed from: c, reason: collision with root package name */
    private final com.android.volley.a f63729c;

    /* renamed from: d, reason: collision with root package name */
    private final l f63730d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f63731e = false;

    /* renamed from: f, reason: collision with root package name */
    private final o f63732f;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f63733a;

        a(i iVar) {
            this.f63733a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            try {
                b.this.f63728b.put(this.f63733a);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void e() {
        this.f63731e = true;
        interrupt();
    }

    private void b() throws InterruptedException {
        c(this.f63727a.take());
    }

    void c(i<?> iVar) throws InterruptedException {
        iVar.addMarker("cache-queue-take");
        iVar.sendEvent(1);
        try {
            if (iVar.isCanceled()) {
                iVar.finish("cache-discard-canceled");
                return;
            }
            a.C1250a c1250aA = this.f63729c.a(iVar.getCacheKey());
            if (c1250aA == null) {
                iVar.addMarker("cache-miss");
                if (!this.f63732f.c(iVar)) {
                    this.f63728b.put(iVar);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c1250aA.b(jCurrentTimeMillis)) {
                iVar.addMarker("cache-hit-expired");
                iVar.setCacheEntry(c1250aA);
                if (!this.f63732f.c(iVar)) {
                    this.f63728b.put(iVar);
                }
                return;
            }
            iVar.addMarker("cache-hit");
            k<?> networkResponse = iVar.parseNetworkResponse(new h(c1250aA.f63718a, c1250aA.f63724g));
            iVar.addMarker("cache-hit-parsed");
            if (!networkResponse.b()) {
                iVar.addMarker("cache-parsing-failed");
                this.f63729c.c(iVar.getCacheKey(), true);
                iVar.setCacheEntry(null);
                if (!this.f63732f.c(iVar)) {
                    this.f63728b.put(iVar);
                }
                return;
            }
            if (c1250aA.c(jCurrentTimeMillis)) {
                iVar.addMarker("cache-hit-refresh-needed");
                iVar.setCacheEntry(c1250aA);
                networkResponse.f63780d = true;
                if (this.f63732f.c(iVar)) {
                    this.f63730d.a(iVar, networkResponse);
                } else {
                    this.f63730d.b(iVar, networkResponse, new a(iVar));
                }
            } else {
                this.f63730d.a(iVar, networkResponse);
            }
        } finally {
            iVar.sendEvent(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws SecurityException, IllegalArgumentException {
        if (f63726g) {
            n.e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f63729c.b();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f63731e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                n.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public b(BlockingQueue<i<?>> blockingQueue, BlockingQueue<i<?>> blockingQueue2, com.android.volley.a aVar, l lVar) {
        this.f63727a = blockingQueue;
        this.f63728b = blockingQueue2;
        this.f63729c = aVar;
        this.f63730d = lVar;
        this.f63732f = new o(this, blockingQueue2, lVar);
    }
}
