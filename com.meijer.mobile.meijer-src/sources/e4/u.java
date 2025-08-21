package e4;

import a3.t;
import androidx.media3.common.ParserException;
import com.fullstory.Reason;
import d3.C13599a;
import d3.P;
import e4.L;
import e4.v;
import x3.O;

/* loaded from: classes4.dex */
public final class u implements InterfaceC13770m {

    /* renamed from: a, reason: collision with root package name */
    private final String f129891a;

    /* renamed from: f, reason: collision with root package name */
    private String f129896f;

    /* renamed from: g, reason: collision with root package name */
    private O f129897g;

    /* renamed from: j, reason: collision with root package name */
    private boolean f129900j;

    /* renamed from: l, reason: collision with root package name */
    private int f129902l;

    /* renamed from: m, reason: collision with root package name */
    private int f129903m;

    /* renamed from: o, reason: collision with root package name */
    private int f129905o;

    /* renamed from: p, reason: collision with root package name */
    private int f129906p;

    /* renamed from: t, reason: collision with root package name */
    private int f129910t;

    /* renamed from: v, reason: collision with root package name */
    private boolean f129912v;

    /* renamed from: e, reason: collision with root package name */
    private int f129895e = 0;

    /* renamed from: b, reason: collision with root package name */
    private final d3.D f129892b = new d3.D(new byte[15], 2);

    /* renamed from: c, reason: collision with root package name */
    private final d3.C f129893c = new d3.C();

    /* renamed from: d, reason: collision with root package name */
    private final d3.D f129894d = new d3.D();

    /* renamed from: q, reason: collision with root package name */
    private v.b f129907q = new v.b();

    /* renamed from: r, reason: collision with root package name */
    private int f129908r = Reason.OS_VERSION_TOO_LOW;

    /* renamed from: s, reason: collision with root package name */
    private int f129909s = -1;

    /* renamed from: u, reason: collision with root package name */
    private long f129911u = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f129901k = true;

    /* renamed from: n, reason: collision with root package name */
    private boolean f129904n = true;

    /* renamed from: h, reason: collision with root package name */
    private double f129898h = -9.223372036854776E18d;

    /* renamed from: i, reason: collision with root package name */
    private double f129899i = -9.223372036854776E18d;

    private boolean j(int i10) {
        return i10 == 1 || i10 == 17;
    }

    @Override // e4.InterfaceC13770m
    public void c() {
        this.f129895e = 0;
        this.f129903m = 0;
        this.f129892b.S(2);
        this.f129905o = 0;
        this.f129906p = 0;
        this.f129908r = Reason.OS_VERSION_TOO_LOW;
        this.f129909s = -1;
        this.f129910t = 0;
        this.f129911u = -1L;
        this.f129912v = false;
        this.f129900j = false;
        this.f129904n = true;
        this.f129901k = true;
        this.f129898h = -9.223372036854776E18d;
        this.f129899i = -9.223372036854776E18d;
    }

    @Override // e4.InterfaceC13770m
    public void d(boolean z10) {
    }

    private void g() {
        int i10;
        if (this.f129912v) {
            this.f129901k = false;
            i10 = 1;
        } else {
            i10 = 0;
        }
        double d10 = ((this.f129909s - this.f129910t) * 1000000.0d) / this.f129908r;
        long jRound = Math.round(this.f129898h);
        if (this.f129900j) {
            this.f129900j = false;
            this.f129898h = this.f129899i;
        } else {
            this.f129898h += d10;
        }
        this.f129897g.c(jRound, i10, this.f129906p, 0, null);
        this.f129912v = false;
        this.f129910t = 0;
        this.f129906p = 0;
    }

    private boolean i() throws ParserException {
        int iG = this.f129892b.g();
        this.f129893c.o(this.f129892b.e(), iG);
        boolean zG = v.g(this.f129893c, this.f129907q);
        if (zG) {
            this.f129905o = 0;
            this.f129906p += this.f129907q.f129915c + iG;
        }
        return zG;
    }

    private boolean k(d3.D d10) {
        int i10 = this.f129902l;
        if ((i10 & 2) == 0) {
            d10.W(d10.g());
            return false;
        }
        if ((i10 & 4) != 0) {
            return true;
        }
        while (d10.a() > 0) {
            int i11 = this.f129903m << 8;
            this.f129903m = i11;
            int iH = i11 | d10.H();
            this.f129903m = iH;
            if (v.e(iH)) {
                d10.W(d10.f() - 3);
                this.f129903m = 0;
                return true;
            }
        }
        return false;
    }

    @Override // e4.InterfaceC13770m
    public void a(d3.D d10) throws ParserException {
        C13599a.i(this.f129897g);
        while (d10.a() > 0) {
            int i10 = this.f129895e;
            if (i10 != 0) {
                if (i10 == 1) {
                    b(d10, this.f129892b, false);
                    if (this.f129892b.a() != 0) {
                        this.f129904n = false;
                    } else if (i()) {
                        this.f129892b.W(0);
                        O o10 = this.f129897g;
                        d3.D d11 = this.f129892b;
                        o10.d(d11, d11.g());
                        this.f129892b.S(2);
                        this.f129894d.S(this.f129907q.f129915c);
                        this.f129904n = true;
                        this.f129895e = 2;
                    } else if (this.f129892b.g() < 15) {
                        d3.D d12 = this.f129892b;
                        d12.V(d12.g() + 1);
                        this.f129904n = false;
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    if (j(this.f129907q.f129913a)) {
                        b(d10, this.f129894d, true);
                    }
                    l(d10);
                    int i11 = this.f129905o;
                    v.b bVar = this.f129907q;
                    if (i11 == bVar.f129915c) {
                        int i12 = bVar.f129913a;
                        if (i12 == 1) {
                            h(new d3.C(this.f129894d.e()));
                        } else if (i12 == 17) {
                            this.f129910t = v.f(new d3.C(this.f129894d.e()));
                        } else if (i12 == 2) {
                            g();
                        }
                        this.f129895e = 1;
                    }
                }
            } else if (k(d10)) {
                this.f129895e = 1;
            }
        }
    }

    @Override // e4.InterfaceC13770m
    public void e(long j10, int i10) {
        this.f129902l = i10;
        if (!this.f129901k && (this.f129906p != 0 || !this.f129904n)) {
            this.f129900j = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f129900j) {
                this.f129899i = j10;
            } else {
                this.f129898h = j10;
            }
        }
    }

    public u(String str) {
        this.f129891a = str;
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
        Ee.L lZ;
        v.c cVarH = v.h(c10);
        this.f129908r = cVarH.f129917b;
        this.f129909s = cVarH.f129918c;
        long j10 = this.f129911u;
        long j11 = this.f129907q.f129914b;
        if (j10 != j11) {
            this.f129911u = j11;
            String str = "mhm1";
            if (cVarH.f129916a != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(cVarH.f129916a));
            }
            byte[] bArr = cVarH.f129919d;
            if (bArr != null && bArr.length > 0) {
                lZ = Ee.L.z(P.f127893f, bArr);
            } else {
                lZ = null;
            }
            this.f129897g.b(new t.b().f0(this.f129896f).U(this.f129891a).u0("audio/mhm1").v0(this.f129908r).S(str).g0(lZ).N());
        }
        this.f129912v = true;
    }

    private void l(d3.D d10) {
        int iMin = Math.min(d10.a(), this.f129907q.f129915c - this.f129905o);
        this.f129897g.d(d10, iMin);
        this.f129905o += iMin;
    }

    @Override // e4.InterfaceC13770m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f129896f = dVar.b();
        this.f129897g = rVar.t(dVar.c(), 1);
    }
}
