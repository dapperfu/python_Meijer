package bg;

import android.content.Context;
import cg.C6505a;
import cg.EnumC6507c;
import cg.l;
import cg.o;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: bg.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6382d {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f60321a;

    /* renamed from: b, reason: collision with root package name */
    private final double f60322b;

    /* renamed from: c, reason: collision with root package name */
    private final double f60323c;

    /* renamed from: d, reason: collision with root package name */
    private a f60324d;

    /* renamed from: e, reason: collision with root package name */
    private a f60325e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f60326f;

    /* renamed from: bg.d$a */
    static class a {

        /* renamed from: k, reason: collision with root package name */
        private static final Wf.a f60327k = Wf.a.e();

        /* renamed from: l, reason: collision with root package name */
        private static final long f60328l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a, reason: collision with root package name */
        private final C6505a f60329a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f60330b;

        /* renamed from: c, reason: collision with root package name */
        private l f60331c;

        /* renamed from: d, reason: collision with root package name */
        private cg.i f60332d;

        /* renamed from: e, reason: collision with root package name */
        private long f60333e;

        /* renamed from: f, reason: collision with root package name */
        private double f60334f;

        /* renamed from: g, reason: collision with root package name */
        private cg.i f60335g;

        /* renamed from: h, reason: collision with root package name */
        private cg.i f60336h;

        /* renamed from: i, reason: collision with root package name */
        private long f60337i;

        /* renamed from: j, reason: collision with root package name */
        private long f60338j;

        synchronized void a(boolean z10) {
            try {
                this.f60332d = z10 ? this.f60335g : this.f60336h;
                this.f60333e = z10 ? this.f60337i : this.f60338j;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        synchronized boolean b(dg.i iVar) {
            try {
                l lVarA = this.f60329a.a();
                double d10 = (this.f60331c.d(lVarA) * this.f60332d.a()) / f60328l;
                if (d10 > 0.0d) {
                    this.f60334f = Math.min(this.f60334f + d10, this.f60333e);
                    this.f60331c = lVarA;
                }
                double d11 = this.f60334f;
                if (d11 >= 1.0d) {
                    this.f60334f = d11 - 1.0d;
                    return true;
                }
                if (this.f60330b) {
                    f60327k.j("Exceeded log rate limit, dropping the log.");
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        private static long c(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.E() : aVar.q();
        }

        private static long d(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.t() : aVar.t();
        }

        private static long e(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.F() : aVar.r();
        }

        private static long f(com.google.firebase.perf.config.a aVar, String str) {
            return str == "Trace" ? aVar.t() : aVar.t();
        }

        a(cg.i iVar, long j10, C6505a c6505a, com.google.firebase.perf.config.a aVar, String str, boolean z10) {
            this.f60329a = c6505a;
            this.f60333e = j10;
            this.f60332d = iVar;
            this.f60334f = j10;
            this.f60331c = c6505a.a();
            g(aVar, str, z10);
            this.f60330b = z10;
        }

        private void g(com.google.firebase.perf.config.a aVar, String str, boolean z10) {
            long jF = f(aVar, str);
            long jE = e(aVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cg.i iVar = new cg.i(jE, jF, timeUnit);
            this.f60335g = iVar;
            this.f60337i = jE;
            if (z10) {
                f60327k.b("Foreground %s logging rate:%f, burst capacity:%d", str, iVar, Long.valueOf(jE));
            }
            long jD = d(aVar, str);
            long jC = c(aVar, str);
            cg.i iVar2 = new cg.i(jC, jD, timeUnit);
            this.f60336h = iVar2;
            this.f60338j = jC;
            if (z10) {
                f60327k.b("Background %s logging rate:%f, capacity:%d", str, iVar2, Long.valueOf(jC));
            }
        }
    }

    public C6382d(Context context, cg.i iVar, long j10) {
        this(iVar, j10, new C6505a(), b(), b(), com.google.firebase.perf.config.a.g());
        this.f60326f = o.b(context);
    }

    static double b() {
        return new Random().nextDouble();
    }

    private boolean d() {
        return this.f60323c < this.f60321a.f();
    }

    private boolean e() {
        return this.f60322b < this.f60321a.s();
    }

    private boolean f() {
        return this.f60322b < this.f60321a.G();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z10) {
        this.f60324d.a(z10);
        this.f60325e.a(z10);
    }

    private boolean c(List<dg.k> list) {
        if (list.size() <= 0 || list.get(0).f0() <= 0 || list.get(0).e0(0) != dg.l.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }

    boolean g(dg.i iVar) {
        boolean zB;
        if (!j(iVar)) {
            return false;
        }
        if (iVar.j()) {
            zB = this.f60325e.b(iVar);
        } else {
            if (!iVar.m()) {
                return true;
            }
            zB = this.f60324d.b(iVar);
        }
        return !zB;
    }

    boolean h(dg.i iVar) {
        if (iVar.m() && !f() && !c(iVar.n().y0())) {
            return false;
        }
        if (i(iVar) && !d() && !c(iVar.n().y0())) {
            return false;
        }
        if (iVar.j() && !e() && !c(iVar.k().u0())) {
            return false;
        }
        return true;
    }

    protected boolean i(dg.i iVar) {
        if (iVar.m() && iVar.n().x0().startsWith("_st_") && iVar.n().n0("Hosting_activity")) {
            return true;
        }
        return false;
    }

    boolean j(dg.i iVar) {
        if ((iVar.m() && ((iVar.n().x0().equals(EnumC6507c.FOREGROUND_TRACE_NAME.toString()) || iVar.n().x0().equals(EnumC6507c.BACKGROUND_TRACE_NAME.toString())) && iVar.n().q0() > 0)) || iVar.i()) {
            return false;
        }
        return true;
    }

    C6382d(cg.i iVar, long j10, C6505a c6505a, double d10, double d11, com.google.firebase.perf.config.a aVar) {
        this.f60324d = null;
        this.f60325e = null;
        boolean z10 = false;
        this.f60326f = false;
        o.a(0.0d <= d10 && d10 < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d11 && d11 < 1.0d) {
            z10 = true;
        }
        o.a(z10, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.f60322b = d10;
        this.f60323c = d11;
        this.f60321a = aVar;
        this.f60324d = new a(iVar, j10, c6505a, aVar, "Trace", this.f60326f);
        this.f60325e = new a(iVar, j10, c6505a, aVar, "Network", this.f60326f);
    }
}
