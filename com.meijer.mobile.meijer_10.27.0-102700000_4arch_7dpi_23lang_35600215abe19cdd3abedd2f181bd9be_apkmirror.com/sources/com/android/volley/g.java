package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes4.dex */
public class g extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<i<?>> f62908a;

    /* renamed from: b, reason: collision with root package name */
    private final f f62909b;

    /* renamed from: c, reason: collision with root package name */
    private final a f62910c;

    /* renamed from: d, reason: collision with root package name */
    private final l f62911d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f62912e = false;

    public void g() {
        this.f62912e = true;
        interrupt();
    }

    private void e() throws InterruptedException {
        f(this.f62908a.take());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                e();
            } catch (InterruptedException unused) {
                if (this.f62912e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                n.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public g(BlockingQueue<i<?>> blockingQueue, f fVar, a aVar, l lVar) {
        this.f62908a = blockingQueue;
        this.f62909b = fVar;
        this.f62910c = aVar;
        this.f62911d = lVar;
    }

    @TargetApi(14)
    private void a(i<?> iVar) {
        TrafficStats.setThreadStatsTag(iVar.getTrafficStatsTag());
    }

    private void b(i<?> iVar, VolleyError volleyError) {
        this.f62911d.c(iVar, iVar.parseNetworkError(volleyError));
    }

    void f(i<?> iVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        iVar.sendEvent(3);
        try {
            try {
                try {
                    iVar.addMarker("network-queue-take");
                    if (iVar.isCanceled()) {
                        iVar.finish("network-discard-cancelled");
                        iVar.notifyListenerResponseNotUsable();
                        return;
                    }
                    a(iVar);
                    h hVarA = this.f62909b.a(iVar);
                    iVar.addMarker("network-http-complete");
                    if (hVarA.f62917e && iVar.hasHadResponseDelivered()) {
                        iVar.finish("not-modified");
                        iVar.notifyListenerResponseNotUsable();
                        return;
                    }
                    k<?> networkResponse = iVar.parseNetworkResponse(hVarA);
                    iVar.addMarker("network-parse-complete");
                    if (iVar.shouldCache() && networkResponse.f62939b != null) {
                        this.f62910c.d(iVar.getCacheKey(), networkResponse.f62939b);
                        iVar.addMarker("network-cache-written");
                    }
                    iVar.markDelivered();
                    this.f62911d.a(iVar, networkResponse);
                    iVar.notifyListenerResponseReceived(networkResponse);
                } catch (VolleyError e10) {
                    e10.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    b(iVar, e10);
                    iVar.notifyListenerResponseNotUsable();
                }
            } catch (Exception e11) {
                n.d(e11, "Unhandled exception %s", e11.toString());
                VolleyError volleyError = new VolleyError(e11);
                volleyError.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                this.f62911d.c(iVar, volleyError);
                iVar.notifyListenerResponseNotUsable();
            }
        } finally {
            iVar.sendEvent(4);
        }
    }
}
