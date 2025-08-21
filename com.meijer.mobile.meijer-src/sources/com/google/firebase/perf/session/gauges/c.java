package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class c {

    /* renamed from: g, reason: collision with root package name */
    private static final Wf.a f89954g = Wf.a.e();

    /* renamed from: h, reason: collision with root package name */
    private static final long f89955h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: e, reason: collision with root package name */
    private ScheduledFuture f89960e = null;

    /* renamed from: f, reason: collision with root package name */
    private long f89961f = -1;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue<dg.e> f89956a = new ConcurrentLinkedQueue<>();

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f89957b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c, reason: collision with root package name */
    private final String f89958c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* renamed from: d, reason: collision with root package name */
    private final long f89959d = e();

    private long d(long j10) {
        return Math.round((j10 / this.f89959d) * f89955h);
    }

    public static boolean f(long j10) {
        return j10 <= 0;
    }

    private synchronized void g(final cg.l lVar) {
        try {
            this.f89957b.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.b
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    c.b(this.f89952a, lVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f89954g.j("Unable to collect Cpu Metric: " + e10.getMessage());
        }
    }

    private synchronized void h(long j10, final cg.l lVar) {
        this.f89961f = j10;
        try {
            this.f89960e = this.f89957b.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.a
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    c.a(this.f89950a, lVar);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f89954g.j("Unable to start collecting Cpu Metrics: " + e10.getMessage());
        }
    }

    private dg.e k(cg.l lVar) throws IOException {
        if (lVar == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f89958c));
            try {
                long jB = lVar.b();
                String[] strArrSplit = bufferedReader.readLine().split(" ");
                dg.e eVarBuild = dg.e.d0().G(jB).H(d(Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[16]))).I(d(Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[15]))).build();
                bufferedReader.close();
                return eVarBuild;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            f89954g.j("Unable to read 'proc/[pid]/stat' file: " + e10.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            f89954g.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            f89954g.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e13) {
            e = e13;
            f89954g.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }

    private long e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public void i(long j10, cg.l lVar) {
        long j11 = this.f89959d;
        if (j11 == -1 || j11 == 0 || f(j10)) {
            return;
        }
        if (this.f89960e == null) {
            h(j10, lVar);
        } else if (this.f89961f != j10) {
            j();
            h(j10, lVar);
        }
    }

    public void j() {
        ScheduledFuture scheduledFuture = this.f89960e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f89960e = null;
        this.f89961f = -1L;
    }

    @SuppressLint({"ThreadPoolCreation"})
    c() {
    }

    public static /* synthetic */ void a(c cVar, cg.l lVar) throws IOException {
        dg.e eVarK = cVar.k(lVar);
        if (eVarK != null) {
            cVar.f89956a.add(eVarK);
        }
    }

    public static /* synthetic */ void b(c cVar, cg.l lVar) throws IOException {
        dg.e eVarK = cVar.k(lVar);
        if (eVarK != null) {
            cVar.f89956a.add(eVarK);
        }
    }

    public void c(cg.l lVar) {
        g(lVar);
    }
}
