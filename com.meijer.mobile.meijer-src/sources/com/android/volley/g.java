package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes4.dex */
public class g extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<i<?>> f63747a;

    /* renamed from: b, reason: collision with root package name */
    private final f f63748b;

    /* renamed from: c, reason: collision with root package name */
    private final a f63749c;

    /* renamed from: d, reason: collision with root package name */
    private final l f63750d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f63751e = false;

    public void g() {
        this.f63751e = true;
        interrupt();
    }

    private void e() throws InterruptedException {
        f(this.f63747a.take());
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                e();
            } catch (InterruptedException unused) {
                if (this.f63751e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                n.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public g(BlockingQueue<i<?>> blockingQueue, f fVar, a aVar, l lVar) {
        this.f63747a = blockingQueue;
        this.f63748b = fVar;
        this.f63749c = aVar;
        this.f63750d = lVar;
    }

    @TargetApi(14)
    private void a(i<?> iVar) {
        TrafficStats.setThreadStatsTag(iVar.getTrafficStatsTag());
    }

    private void b(i<?> iVar, VolleyError volleyError) {
        this.f63750d.c(iVar, iVar.parseNetworkError(volleyError));
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
                    h hVarA = this.f63748b.a(iVar);
                    iVar.addMarker("network-http-complete");
                    if (hVarA.f63756e && iVar.hasHadResponseDelivered()) {
                        iVar.finish("not-modified");
                        iVar.notifyListenerResponseNotUsable();
                        return;
                    }
                    k<?> networkResponse = iVar.parseNetworkResponse(hVarA);
                    iVar.addMarker("network-parse-complete");
                    if (iVar.shouldCache() && networkResponse.f63778b != null) {
                        this.f63749c.d(iVar.getCacheKey(), networkResponse.f63778b);
                        iVar.addMarker("network-cache-written");
                    }
                    iVar.markDelivered();
                    this.f63750d.a(iVar, networkResponse);
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
                this.f63750d.c(iVar, volleyError);
                iVar.notifyListenerResponseNotUsable();
            }
        } finally {
            iVar.sendEvent(4);
        }
    }
}
