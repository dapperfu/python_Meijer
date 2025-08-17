package Zf;

import ag.C5599a;
import ag.EnumC5601c;
import ag.l;
import ag.o;
import android.content.Context;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f42654a;

    /* renamed from: b, reason: collision with root package name */
    private final double f42655b;

    /* renamed from: c, reason: collision with root package name */
    private final double f42656c;

    /* renamed from: d, reason: collision with root package name */
    private a f42657d;

    /* renamed from: e, reason: collision with root package name */
    private a f42658e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f42659f;

    static class a {

        /* renamed from: k, reason: collision with root package name */
        private static final Uf.a f42660k = Uf.a.e();

        /* renamed from: l, reason: collision with root package name */
        private static final long f42661l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a, reason: collision with root package name */
        private final C5599a f42662a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f42663b;

        /* renamed from: c, reason: collision with root package name */
        private l f42664c;

        /* renamed from: d, reason: collision with root package name */
        private ag.i f42665d;

        /* renamed from: e, reason: collision with root package name */
        private long f42666e;

        /* renamed from: f, reason: collision with root package name */
        private double f42667f;

        /* renamed from: g, reason: collision with root package name */
        private ag.i f42668g;

        /* renamed from: h, reason: collision with root package name */
        private ag.i f42669h;

        /* renamed from: i, reason: collision with root package name */
        private long f42670i;

        /* renamed from: j, reason: collision with root package name */
        private long f42671j;

        synchronized void a(boolean z10) {
            try {
                this.f42665d = z10 ? this.f42668g : this.f42669h;
                this.f42666e = z10 ? this.f42670i : this.f42671j;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        synchronized boolean b(bg.i iVar) {
            try {
                l lVarA = this.f42662a.a();
                double d10 = (this.f42664c.d(lVarA) * this.f42665d.a()) / f42661l;
                if (d10 > 0.0d) {
                    this.f42667f = Math.min(this.f42667f + d10, this.f42666e);
                    this.f42664c = lVarA;
                }
                double d11 = this.f42667f;
                if (d11 >= 1.0d) {
                    this.f42667f = d11 - 1.0d;
                    return true;
                }
                if (this.f42663b) {
                    f42660k.j("Exceeded log rate limit, dropping the log.");
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

        a(ag.i iVar, long j10, C5599a c5599a, com.google.firebase.perf.config.a aVar, String str, boolean z10) {
            this.f42662a = c5599a;
            this.f42666e = j10;
            this.f42665d = iVar;
            this.f42667f = j10;
            this.f42664c = c5599a.a();
            g(aVar, str, z10);
            this.f42663b = z10;
        }

        private void g(com.google.firebase.perf.config.a aVar, String str, boolean z10) {
            long jF = f(aVar, str);
            long jE = e(aVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ag.i iVar = new ag.i(jE, jF, timeUnit);
            this.f42668g = iVar;
            this.f42670i = jE;
            if (z10) {
                f42660k.b("Foreground %s logging rate:%f, burst capacity:%d", str, iVar, Long.valueOf(jE));
            }
            long jD = d(aVar, str);
            long jC = c(aVar, str);
            ag.i iVar2 = new ag.i(jC, jD, timeUnit);
            this.f42669h = iVar2;
            this.f42671j = jC;
            if (z10) {
                f42660k.b("Background %s logging rate:%f, capacity:%d", str, iVar2, Long.valueOf(jC));
            }
        }
    }

    public d(Context context, ag.i iVar, long j10) {
        this(iVar, j10, new C5599a(), b(), b(), com.google.firebase.perf.config.a.g());
        this.f42659f = o.b(context);
    }

    static double b() {
        return new Random().nextDouble();
    }

    private boolean d() {
        return this.f42656c < this.f42654a.f();
    }

    private boolean e() {
        return this.f42655b < this.f42654a.s();
    }

    private boolean f() {
        return this.f42655b < this.f42654a.G();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z10) {
        this.f42657d.a(z10);
        this.f42658e.a(z10);
    }

    private boolean c(List<bg.k> list) {
        if (list.size() <= 0 || list.get(0).f0() <= 0 || list.get(0).e0(0) != bg.l.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }

    boolean g(bg.i iVar) {
        boolean zB;
        if (!j(iVar)) {
            return false;
        }
        if (iVar.j()) {
            zB = this.f42658e.b(iVar);
        } else {
            if (!iVar.m()) {
                return true;
            }
            zB = this.f42657d.b(iVar);
        }
        return !zB;
    }

    boolean h(bg.i iVar) {
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

    protected boolean i(bg.i iVar) {
        if (iVar.m() && iVar.n().x0().startsWith("_st_") && iVar.n().n0("Hosting_activity")) {
            return true;
        }
        return false;
    }

    boolean j(bg.i iVar) {
        if ((iVar.m() && ((iVar.n().x0().equals(EnumC5601c.FOREGROUND_TRACE_NAME.toString()) || iVar.n().x0().equals(EnumC5601c.BACKGROUND_TRACE_NAME.toString())) && iVar.n().q0() > 0)) || iVar.i()) {
            return false;
        }
        return true;
    }

    d(ag.i iVar, long j10, C5599a c5599a, double d10, double d11, com.google.firebase.perf.config.a aVar) {
        this.f42657d = null;
        this.f42658e = null;
        boolean z10 = false;
        this.f42659f = false;
        o.a(0.0d <= d10 && d10 < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d11 && d11 < 1.0d) {
            z10 = true;
        }
        o.a(z10, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.f42655b = d10;
        this.f42656c = d11;
        this.f42654a = aVar;
        this.f42657d = new a(iVar, j10, c5599a, aVar, "Trace", this.f42659f);
        this.f42658e = new a(iVar, j10, c5599a, aVar, "Network", this.f42659f);
    }
}
