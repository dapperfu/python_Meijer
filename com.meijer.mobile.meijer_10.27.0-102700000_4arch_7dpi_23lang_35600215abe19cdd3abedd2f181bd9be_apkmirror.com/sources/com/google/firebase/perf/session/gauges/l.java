package com.google.firebase.perf.session.gauges;

import ag.o;
import android.annotation.SuppressLint;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class l {

    /* renamed from: f, reason: collision with root package name */
    private static final Uf.a f89135f = Uf.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f89136a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue<bg.b> f89137b;

    /* renamed from: c, reason: collision with root package name */
    private final Runtime f89138c;

    /* renamed from: d, reason: collision with root package name */
    private ScheduledFuture f89139d;

    /* renamed from: e, reason: collision with root package name */
    private long f89140e;

    @SuppressLint({"ThreadPoolCreation"})
    l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    public static boolean e(long j10) {
        return j10 <= 0;
    }

    private synchronized void f(final ag.l lVar) {
        try {
            this.f89136a.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.b(this.f89133a, lVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f89135f.j("Unable to collect Memory Metric: " + e10.getMessage());
        }
    }

    private synchronized void g(long j10, final ag.l lVar) {
        this.f89140e = j10;
        try {
            this.f89139d = this.f89136a.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.a(this.f89131a, lVar);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f89135f.j("Unable to start collecting Memory Metrics: " + e10.getMessage());
        }
    }

    l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f89139d = null;
        this.f89140e = -1L;
        this.f89136a = scheduledExecutorService;
        this.f89137b = new ConcurrentLinkedQueue<>();
        this.f89138c = runtime;
    }

    private int d() {
        return o.c(ag.k.f45461f.b(this.f89138c.totalMemory() - this.f89138c.freeMemory()));
    }

    private bg.b j(ag.l lVar) {
        if (lVar == null) {
            return null;
        }
        return bg.b.c0().G(lVar.b()).H(d()).build();
    }

    public void i() {
        ScheduledFuture scheduledFuture = this.f89139d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f89139d = null;
        this.f89140e = -1L;
    }

    public static /* synthetic */ void a(l lVar, ag.l lVar2) {
        bg.b bVarJ = lVar.j(lVar2);
        if (bVarJ != null) {
            lVar.f89137b.add(bVarJ);
        }
    }

    public static /* synthetic */ void b(l lVar, ag.l lVar2) {
        bg.b bVarJ = lVar.j(lVar2);
        if (bVarJ != null) {
            lVar.f89137b.add(bVarJ);
        }
    }

    public void c(ag.l lVar) {
        f(lVar);
    }

    public void h(long j10, ag.l lVar) {
        if (!e(j10)) {
            if (this.f89139d != null) {
                if (this.f89140e != j10) {
                    i();
                    g(j10, lVar);
                    return;
                }
                return;
            }
            g(j10, lVar);
        }
    }
}
