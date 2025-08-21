package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import cg.o;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class l {

    /* renamed from: f, reason: collision with root package name */
    private static final Wf.a f89977f = Wf.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f89978a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue<dg.b> f89979b;

    /* renamed from: c, reason: collision with root package name */
    private final Runtime f89980c;

    /* renamed from: d, reason: collision with root package name */
    private ScheduledFuture f89981d;

    /* renamed from: e, reason: collision with root package name */
    private long f89982e;

    @SuppressLint({"ThreadPoolCreation"})
    l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    public static boolean e(long j10) {
        return j10 <= 0;
    }

    private synchronized void f(final cg.l lVar) {
        try {
            this.f89978a.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.b(this.f89975a, lVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f89977f.j("Unable to collect Memory Metric: " + e10.getMessage());
        }
    }

    private synchronized void g(long j10, final cg.l lVar) {
        this.f89982e = j10;
        try {
            this.f89981d = this.f89978a.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.a(this.f89973a, lVar);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f89977f.j("Unable to start collecting Memory Metrics: " + e10.getMessage());
        }
    }

    l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f89981d = null;
        this.f89982e = -1L;
        this.f89978a = scheduledExecutorService;
        this.f89979b = new ConcurrentLinkedQueue<>();
        this.f89980c = runtime;
    }

    private int d() {
        return o.c(cg.k.f62476f.b(this.f89980c.totalMemory() - this.f89980c.freeMemory()));
    }

    private dg.b j(cg.l lVar) {
        if (lVar == null) {
            return null;
        }
        return dg.b.c0().G(lVar.b()).H(d()).build();
    }

    public void i() {
        ScheduledFuture scheduledFuture = this.f89981d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f89981d = null;
        this.f89982e = -1L;
    }

    public static /* synthetic */ void a(l lVar, cg.l lVar2) {
        dg.b bVarJ = lVar.j(lVar2);
        if (bVarJ != null) {
            lVar.f89979b.add(bVarJ);
        }
    }

    public static /* synthetic */ void b(l lVar, cg.l lVar2) {
        dg.b bVarJ = lVar.j(lVar2);
        if (bVarJ != null) {
            lVar.f89979b.add(bVarJ);
        }
    }

    public void c(cg.l lVar) {
        f(lVar);
    }

    public void h(long j10, cg.l lVar) {
        if (!e(j10)) {
            if (this.f89981d != null) {
                if (this.f89982e != j10) {
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
