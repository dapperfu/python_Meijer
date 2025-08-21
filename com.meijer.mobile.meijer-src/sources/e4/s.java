package e4;

import a3.t;
import androidx.media3.common.ParserException;
import d3.C13599a;
import e4.L;
import java.util.Collections;
import x3.C18062a;
import x3.O;

/* loaded from: classes4.dex */
public final class s implements InterfaceC13770m {

    /* renamed from: a, reason: collision with root package name */
    private final String f129854a;

    /* renamed from: b, reason: collision with root package name */
    private final int f129855b;

    /* renamed from: c, reason: collision with root package name */
    private final String f129856c;

    /* renamed from: d, reason: collision with root package name */
    private final d3.D f129857d;

    /* renamed from: e, reason: collision with root package name */
    private final d3.C f129858e;

    /* renamed from: f, reason: collision with root package name */
    private O f129859f;

    /* renamed from: g, reason: collision with root package name */
    private String f129860g;

    /* renamed from: h, reason: collision with root package name */
    private a3.t f129861h;

    /* renamed from: i, reason: collision with root package name */
    private int f129862i;

    /* renamed from: j, reason: collision with root package name */
    private int f129863j;

    /* renamed from: k, reason: collision with root package name */
    private int f129864k;

    /* renamed from: l, reason: collision with root package name */
    private int f129865l;

    /* renamed from: m, reason: collision with root package name */
    private long f129866m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f129867n;

    /* renamed from: o, reason: collision with root package name */
    private int f129868o;

    /* renamed from: p, reason: collision with root package name */
    private int f129869p;

    /* renamed from: q, reason: collision with root package name */
    private int f129870q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f129871r;

    /* renamed from: s, reason: collision with root package name */
    private long f129872s;

    /* renamed from: t, reason: collision with root package name */
    private int f129873t;

    /* renamed from: u, reason: collision with root package name */
    private long f129874u;

    /* renamed from: v, reason: collision with root package name */
    private int f129875v;

    /* renamed from: w, reason: collision with root package name */
    private String f129876w;

    private static long b(d3.C c10) {
        return c10.h((c10.h(2) + 1) * 8);
    }

    private void i(d3.C c10) {
        int iH = c10.h(3);
        this.f129870q = iH;
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
        this.f129868o = iH2;
        if (iH2 != 0) {
            throw ParserException.a(null, null);
        }
        if (iH == 1) {
            b(c10);
        }
        if (!c10.g()) {
            throw ParserException.a(null, null);
        }
        this.f129869p = c10.h(6);
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
            a3.t tVarN = new t.b().f0(this.f129860g).U(this.f129856c).u0("audio/mp4a-latm").S(this.f129876w).R(this.f129875v).v0(this.f129873t).g0(Collections.singletonList(bArr)).j0(this.f129854a).s0(this.f129855b).N();
            if (!tVarN.equals(this.f129861h)) {
                this.f129861h = tVarN;
                this.f129874u = 1024000000 / tVarN.f44743F;
                this.f129859f.b(tVarN);
            }
        } else {
            c10.r(((int) b(c10)) - h(c10));
        }
        i(c10);
        boolean zG2 = c10.g();
        this.f129871r = zG2;
        this.f129872s = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f129872s = b(c10);
            } else {
                do {
                    zG = c10.g();
                    this.f129872s = (this.f129872s << 8) + c10.h(8);
                } while (zG);
            }
        }
        if (c10.g()) {
            c10.r(8);
        }
    }

    @Override // e4.InterfaceC13770m
    public void c() {
        this.f129862i = 0;
        this.f129866m = -9223372036854775807L;
        this.f129867n = false;
    }

    @Override // e4.InterfaceC13770m
    public void d(boolean z10) {
    }

    private int j(d3.C c10) throws ParserException {
        int iH;
        if (this.f129870q != 0) {
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
        this.f129857d.S(i10);
        this.f129858e.n(this.f129857d.e());
    }

    @Override // e4.InterfaceC13770m
    public void a(d3.D d10) throws ParserException {
        C13599a.i(this.f129859f);
        while (d10.a() > 0) {
            int i10 = this.f129862i;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iH = d10.H();
                    if ((iH & 224) == 224) {
                        this.f129865l = iH;
                        this.f129862i = 2;
                    } else if (iH != 86) {
                        this.f129862i = 0;
                    }
                } else if (i10 == 2) {
                    int iH2 = ((this.f129865l & (-225)) << 8) | d10.H();
                    this.f129864k = iH2;
                    if (iH2 > this.f129857d.e().length) {
                        m(this.f129864k);
                    }
                    this.f129863j = 0;
                    this.f129862i = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(d10.a(), this.f129864k - this.f129863j);
                    d10.l(this.f129858e.f127860a, this.f129863j, iMin);
                    int i11 = this.f129863j + iMin;
                    this.f129863j = i11;
                    if (i11 == this.f129864k) {
                        this.f129858e.p(0);
                        g(this.f129858e);
                        this.f129862i = 0;
                    }
                }
            } else if (d10.H() == 86) {
                this.f129862i = 1;
            }
        }
    }

    @Override // e4.InterfaceC13770m
    public void e(long j10, int i10) {
        this.f129866m = j10;
    }

    public s(String str, int i10, String str2) {
        this.f129854a = str;
        this.f129855b = i10;
        this.f129856c = str2;
        d3.D d10 = new d3.D(1024);
        this.f129857d = d10;
        this.f129858e = new d3.C(d10.e());
        this.f129866m = -9223372036854775807L;
    }

    private void g(d3.C c10) throws ParserException {
        if (!c10.g()) {
            this.f129867n = true;
            l(c10);
        } else if (!this.f129867n) {
            return;
        }
        if (this.f129868o == 0) {
            if (this.f129869p == 0) {
                k(c10, j(c10));
                if (this.f129871r) {
                    c10.r((int) this.f129872s);
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
        C18062a.b bVarD = C18062a.d(c10, true);
        this.f129876w = bVarD.f170218c;
        this.f129873t = bVarD.f170216a;
        this.f129875v = bVarD.f170217b;
        return iB - c10.b();
    }

    private void k(d3.C c10, int i10) {
        int iE = c10.e();
        boolean z10 = false;
        if ((iE & 7) == 0) {
            this.f129857d.W(iE >> 3);
        } else {
            c10.i(this.f129857d.e(), 0, i10 * 8);
            this.f129857d.W(0);
        }
        this.f129859f.d(this.f129857d, i10);
        if (this.f129866m != -9223372036854775807L) {
            z10 = true;
        }
        C13599a.g(z10);
        this.f129859f.c(this.f129866m, 1, i10, 0, null);
        this.f129866m += this.f129874u;
    }

    @Override // e4.InterfaceC13770m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f129859f = rVar.t(dVar.c(), 1);
        this.f129860g = dVar.b();
    }
}
