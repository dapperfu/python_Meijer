package e4;

import a3.t;
import androidx.media3.common.ParserException;
import com.fullstory.Reason;
import d3.C13466a;
import d3.P;
import e4.L;
import e4.v;
import x3.O;

/* loaded from: classes4.dex */
public final class u implements InterfaceC13621m {

    /* renamed from: a, reason: collision with root package name */
    private final String f128555a;

    /* renamed from: f, reason: collision with root package name */
    private String f128560f;

    /* renamed from: g, reason: collision with root package name */
    private O f128561g;

    /* renamed from: j, reason: collision with root package name */
    private boolean f128564j;

    /* renamed from: l, reason: collision with root package name */
    private int f128566l;

    /* renamed from: m, reason: collision with root package name */
    private int f128567m;

    /* renamed from: o, reason: collision with root package name */
    private int f128569o;

    /* renamed from: p, reason: collision with root package name */
    private int f128570p;

    /* renamed from: t, reason: collision with root package name */
    private int f128574t;

    /* renamed from: v, reason: collision with root package name */
    private boolean f128576v;

    /* renamed from: e, reason: collision with root package name */
    private int f128559e = 0;

    /* renamed from: b, reason: collision with root package name */
    private final d3.D f128556b = new d3.D(new byte[15], 2);

    /* renamed from: c, reason: collision with root package name */
    private final d3.C f128557c = new d3.C();

    /* renamed from: d, reason: collision with root package name */
    private final d3.D f128558d = new d3.D();

    /* renamed from: q, reason: collision with root package name */
    private v.b f128571q = new v.b();

    /* renamed from: r, reason: collision with root package name */
    private int f128572r = Reason.OS_VERSION_TOO_LOW;

    /* renamed from: s, reason: collision with root package name */
    private int f128573s = -1;

    /* renamed from: u, reason: collision with root package name */
    private long f128575u = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f128565k = true;

    /* renamed from: n, reason: collision with root package name */
    private boolean f128568n = true;

    /* renamed from: h, reason: collision with root package name */
    private double f128562h = -9.223372036854776E18d;

    /* renamed from: i, reason: collision with root package name */
    private double f128563i = -9.223372036854776E18d;

    private boolean j(int i10) {
        return i10 == 1 || i10 == 17;
    }

    @Override // e4.InterfaceC13621m
    public void c() {
        this.f128559e = 0;
        this.f128567m = 0;
        this.f128556b.S(2);
        this.f128569o = 0;
        this.f128570p = 0;
        this.f128572r = Reason.OS_VERSION_TOO_LOW;
        this.f128573s = -1;
        this.f128574t = 0;
        this.f128575u = -1L;
        this.f128576v = false;
        this.f128564j = false;
        this.f128568n = true;
        this.f128565k = true;
        this.f128562h = -9.223372036854776E18d;
        this.f128563i = -9.223372036854776E18d;
    }

    @Override // e4.InterfaceC13621m
    public void d(boolean z10) {
    }

    private void g() {
        int i10;
        if (this.f128576v) {
            this.f128565k = false;
            i10 = 1;
        } else {
            i10 = 0;
        }
        double d10 = ((this.f128573s - this.f128574t) * 1000000.0d) / this.f128572r;
        long jRound = Math.round(this.f128562h);
        if (this.f128564j) {
            this.f128564j = false;
            this.f128562h = this.f128563i;
        } else {
            this.f128562h += d10;
        }
        this.f128561g.c(jRound, i10, this.f128570p, 0, null);
        this.f128576v = false;
        this.f128574t = 0;
        this.f128570p = 0;
    }

    private boolean i() throws ParserException {
        int iG = this.f128556b.g();
        this.f128557c.o(this.f128556b.e(), iG);
        boolean zG = v.g(this.f128557c, this.f128571q);
        if (zG) {
            this.f128569o = 0;
            this.f128570p += this.f128571q.f128579c + iG;
        }
        return zG;
    }

    private boolean k(d3.D d10) {
        int i10 = this.f128566l;
        if ((i10 & 2) == 0) {
            d10.W(d10.g());
            return false;
        }
        if ((i10 & 4) != 0) {
            return true;
        }
        while (d10.a() > 0) {
            int i11 = this.f128567m << 8;
            this.f128567m = i11;
            int iH = i11 | d10.H();
            this.f128567m = iH;
            if (v.e(iH)) {
                d10.W(d10.f() - 3);
                this.f128567m = 0;
                return true;
            }
        }
        return false;
    }

    @Override // e4.InterfaceC13621m
    public void a(d3.D d10) throws ParserException {
        C13466a.i(this.f128561g);
        while (d10.a() > 0) {
            int i10 = this.f128559e;
            if (i10 != 0) {
                if (i10 == 1) {
                    b(d10, this.f128556b, false);
                    if (this.f128556b.a() != 0) {
                        this.f128568n = false;
                    } else if (i()) {
                        this.f128556b.W(0);
                        O o10 = this.f128561g;
                        d3.D d11 = this.f128556b;
                        o10.d(d11, d11.g());
                        this.f128556b.S(2);
                        this.f128558d.S(this.f128571q.f128579c);
                        this.f128568n = true;
                        this.f128559e = 2;
                    } else if (this.f128556b.g() < 15) {
                        d3.D d12 = this.f128556b;
                        d12.V(d12.g() + 1);
                        this.f128568n = false;
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    if (j(this.f128571q.f128577a)) {
                        b(d10, this.f128558d, true);
                    }
                    l(d10);
                    int i11 = this.f128569o;
                    v.b bVar = this.f128571q;
                    if (i11 == bVar.f128579c) {
                        int i12 = bVar.f128577a;
                        if (i12 == 1) {
                            h(new d3.C(this.f128558d.e()));
                        } else if (i12 == 17) {
                            this.f128574t = v.f(new d3.C(this.f128558d.e()));
                        } else if (i12 == 2) {
                            g();
                        }
                        this.f128559e = 1;
                    }
                }
            } else if (k(d10)) {
                this.f128559e = 1;
            }
        }
    }

    @Override // e4.InterfaceC13621m
    public void e(long j10, int i10) {
        this.f128566l = i10;
        if (!this.f128565k && (this.f128570p != 0 || !this.f128568n)) {
            this.f128564j = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f128564j) {
                this.f128563i = j10;
            } else {
                this.f128562h = j10;
            }
        }
    }

    public u(String str) {
        this.f128555a = str;
    }

    private void b(d3.D d10, d3.D d11, boolean z10) {
        int iF = d10.f();
        int iMin = Math.min(d10.a(), d11.a());
        d10.l(d11.e(), d11.f(), iMin);
        d11.X(iMin);
        if (z10) {
            d10.W(iF);
        }
    }

    private void h(d3.C c10) throws ParserException {
        Ce.L lZ;
        v.c cVarH = v.h(c10);
        this.f128572r = cVarH.f128581b;
        this.f128573s = cVarH.f128582c;
        long j10 = this.f128575u;
        long j11 = this.f128571q.f128578b;
        if (j10 != j11) {
            this.f128575u = j11;
            String str = "mhm1";
            if (cVarH.f128580a != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(cVarH.f128580a));
            }
            byte[] bArr = cVarH.f128583d;
            if (bArr != null && bArr.length > 0) {
                lZ = Ce.L.z(P.f127091f, bArr);
            } else {
                lZ = null;
            }
            this.f128561g.b(new t.b().f0(this.f128560f).U(this.f128555a).u0("audio/mhm1").v0(this.f128572r).S(str).g0(lZ).N());
        }
        this.f128576v = true;
    }

    private void l(d3.D d10) {
        int iMin = Math.min(d10.a(), this.f128571q.f128579c - this.f128569o);
        this.f128561g.d(d10, iMin);
        this.f128569o += iMin;
    }

    @Override // e4.InterfaceC13621m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f128560f = dVar.b();
        this.f128561g = rVar.t(dVar.c(), 1);
    }
}
