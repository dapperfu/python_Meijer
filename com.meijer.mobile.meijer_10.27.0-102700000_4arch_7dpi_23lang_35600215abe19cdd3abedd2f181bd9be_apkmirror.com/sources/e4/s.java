package e4;

import a3.t;
import androidx.media3.common.ParserException;
import d3.C13466a;
import e4.L;
import java.util.Collections;
import x3.C17996a;
import x3.O;

/* loaded from: classes4.dex */
public final class s implements InterfaceC13621m {

    /* renamed from: a, reason: collision with root package name */
    private final String f128518a;

    /* renamed from: b, reason: collision with root package name */
    private final int f128519b;

    /* renamed from: c, reason: collision with root package name */
    private final String f128520c;

    /* renamed from: d, reason: collision with root package name */
    private final d3.D f128521d;

    /* renamed from: e, reason: collision with root package name */
    private final d3.C f128522e;

    /* renamed from: f, reason: collision with root package name */
    private O f128523f;

    /* renamed from: g, reason: collision with root package name */
    private String f128524g;

    /* renamed from: h, reason: collision with root package name */
    private a3.t f128525h;

    /* renamed from: i, reason: collision with root package name */
    private int f128526i;

    /* renamed from: j, reason: collision with root package name */
    private int f128527j;

    /* renamed from: k, reason: collision with root package name */
    private int f128528k;

    /* renamed from: l, reason: collision with root package name */
    private int f128529l;

    /* renamed from: m, reason: collision with root package name */
    private long f128530m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f128531n;

    /* renamed from: o, reason: collision with root package name */
    private int f128532o;

    /* renamed from: p, reason: collision with root package name */
    private int f128533p;

    /* renamed from: q, reason: collision with root package name */
    private int f128534q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f128535r;

    /* renamed from: s, reason: collision with root package name */
    private long f128536s;

    /* renamed from: t, reason: collision with root package name */
    private int f128537t;

    /* renamed from: u, reason: collision with root package name */
    private long f128538u;

    /* renamed from: v, reason: collision with root package name */
    private int f128539v;

    /* renamed from: w, reason: collision with root package name */
    private String f128540w;

    private static long b(d3.C c10) {
        return c10.h((c10.h(2) + 1) * 8);
    }

    private void i(d3.C c10) {
        int iH = c10.h(3);
        this.f128534q = iH;
        if (iH == 0) {
            c10.r(8);
            return;
        }
        if (iH == 1) {
            c10.r(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            c10.r(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            c10.r(1);
        }
    }

    private void l(d3.C c10) throws ParserException {
        boolean zG;
        int iH = c10.h(1);
        int iH2 = iH == 1 ? c10.h(1) : 0;
        this.f128532o = iH2;
        if (iH2 != 0) {
            throw ParserException.a(null, null);
        }
        if (iH == 1) {
            b(c10);
        }
        if (!c10.g()) {
            throw ParserException.a(null, null);
        }
        this.f128533p = c10.h(6);
        int iH3 = c10.h(4);
        int iH4 = c10.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw ParserException.a(null, null);
        }
        if (iH == 0) {
            int iE = c10.e();
            int iH5 = h(c10);
            c10.p(iE);
            byte[] bArr = new byte[(iH5 + 7) / 8];
            c10.i(bArr, 0, iH5);
            a3.t tVarN = new t.b().f0(this.f128524g).U(this.f128520c).u0("audio/mp4a-latm").S(this.f128540w).R(this.f128539v).v0(this.f128537t).g0(Collections.singletonList(bArr)).j0(this.f128518a).s0(this.f128519b).N();
            if (!tVarN.equals(this.f128525h)) {
                this.f128525h = tVarN;
                this.f128538u = 1024000000 / tVarN.f43925F;
                this.f128523f.b(tVarN);
            }
        } else {
            c10.r(((int) b(c10)) - h(c10));
        }
        i(c10);
        boolean zG2 = c10.g();
        this.f128535r = zG2;
        this.f128536s = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f128536s = b(c10);
            } else {
                do {
                    zG = c10.g();
                    this.f128536s = (this.f128536s << 8) + c10.h(8);
                } while (zG);
            }
        }
        if (c10.g()) {
            c10.r(8);
        }
    }

    @Override // e4.InterfaceC13621m
    public void c() {
        this.f128526i = 0;
        this.f128530m = -9223372036854775807L;
        this.f128531n = false;
    }

    @Override // e4.InterfaceC13621m
    public void d(boolean z10) {
    }

    private int j(d3.C c10) throws ParserException {
        int iH;
        if (this.f128534q != 0) {
            throw ParserException.a(null, null);
        }
        int i10 = 0;
        do {
            iH = c10.h(8);
            i10 += iH;
        } while (iH == 255);
        return i10;
    }

    private void m(int i10) {
        this.f128521d.S(i10);
        this.f128522e.n(this.f128521d.e());
    }

    @Override // e4.InterfaceC13621m
    public void a(d3.D d10) throws ParserException {
        C13466a.i(this.f128523f);
        while (d10.a() > 0) {
            int i10 = this.f128526i;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iH = d10.H();
                    if ((iH & 224) == 224) {
                        this.f128529l = iH;
                        this.f128526i = 2;
                    } else if (iH != 86) {
                        this.f128526i = 0;
                    }
                } else if (i10 == 2) {
                    int iH2 = ((this.f128529l & (-225)) << 8) | d10.H();
                    this.f128528k = iH2;
                    if (iH2 > this.f128521d.e().length) {
                        m(this.f128528k);
                    }
                    this.f128527j = 0;
                    this.f128526i = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(d10.a(), this.f128528k - this.f128527j);
                    d10.l(this.f128522e.f127058a, this.f128527j, iMin);
                    int i11 = this.f128527j + iMin;
                    this.f128527j = i11;
                    if (i11 == this.f128528k) {
                        this.f128522e.p(0);
                        g(this.f128522e);
                        this.f128526i = 0;
                    }
                }
            } else if (d10.H() == 86) {
                this.f128526i = 1;
            }
        }
    }

    @Override // e4.InterfaceC13621m
    public void e(long j10, int i10) {
        this.f128530m = j10;
    }

    public s(String str, int i10, String str2) {
        this.f128518a = str;
        this.f128519b = i10;
        this.f128520c = str2;
        d3.D d10 = new d3.D(1024);
        this.f128521d = d10;
        this.f128522e = new d3.C(d10.e());
        this.f128530m = -9223372036854775807L;
    }

    private void g(d3.C c10) throws ParserException {
        if (!c10.g()) {
            this.f128531n = true;
            l(c10);
        } else if (!this.f128531n) {
            return;
        }
        if (this.f128532o == 0) {
            if (this.f128533p == 0) {
                k(c10, j(c10));
                if (this.f128535r) {
                    c10.r((int) this.f128536s);
                    return;
                }
                return;
            }
            throw ParserException.a(null, null);
        }
        throw ParserException.a(null, null);
    }

    private int h(d3.C c10) throws ParserException {
        int iB = c10.b();
        C17996a.b bVarD = C17996a.d(c10, true);
        this.f128540w = bVarD.f169130c;
        this.f128537t = bVarD.f169128a;
        this.f128539v = bVarD.f169129b;
        return iB - c10.b();
    }

    private void k(d3.C c10, int i10) {
        int iE = c10.e();
        boolean z10 = false;
        if ((iE & 7) == 0) {
            this.f128521d.W(iE >> 3);
        } else {
            c10.i(this.f128521d.e(), 0, i10 * 8);
            this.f128521d.W(0);
        }
        this.f128523f.d(this.f128521d, i10);
        if (this.f128530m != -9223372036854775807L) {
            z10 = true;
        }
        C13466a.g(z10);
        this.f128523f.c(this.f128530m, 1, i10, 0, null);
        this.f128530m += this.f128538u;
    }

    @Override // e4.InterfaceC13621m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f128523f = rVar.t(dVar.c(), 1);
        this.f128524g = dVar.b();
    }
}
