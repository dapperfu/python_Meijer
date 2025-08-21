package e4;

import a3.t;
import androidx.media3.common.ParserException;
import d3.C13599a;
import d3.P;
import e4.L;
import java.util.Arrays;
import java.util.Collections;
import x3.C18062a;
import x3.C18074m;
import x3.O;

/* renamed from: e4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13766i implements InterfaceC13770m {

    /* renamed from: x, reason: collision with root package name */
    private static final byte[] f129668x = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f129669a;

    /* renamed from: b, reason: collision with root package name */
    private final d3.C f129670b;

    /* renamed from: c, reason: collision with root package name */
    private final d3.D f129671c;

    /* renamed from: d, reason: collision with root package name */
    private final String f129672d;

    /* renamed from: e, reason: collision with root package name */
    private final int f129673e;

    /* renamed from: f, reason: collision with root package name */
    private final String f129674f;

    /* renamed from: g, reason: collision with root package name */
    private String f129675g;

    /* renamed from: h, reason: collision with root package name */
    private O f129676h;

    /* renamed from: i, reason: collision with root package name */
    private O f129677i;

    /* renamed from: j, reason: collision with root package name */
    private int f129678j;

    /* renamed from: k, reason: collision with root package name */
    private int f129679k;

    /* renamed from: l, reason: collision with root package name */
    private int f129680l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f129681m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f129682n;

    /* renamed from: o, reason: collision with root package name */
    private int f129683o;

    /* renamed from: p, reason: collision with root package name */
    private int f129684p;

    /* renamed from: q, reason: collision with root package name */
    private int f129685q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f129686r;

    /* renamed from: s, reason: collision with root package name */
    private long f129687s;

    /* renamed from: t, reason: collision with root package name */
    private int f129688t;

    /* renamed from: u, reason: collision with root package name */
    private long f129689u;

    /* renamed from: v, reason: collision with root package name */
    private O f129690v;

    /* renamed from: w, reason: collision with root package name */
    private long f129691w;

    public C13766i(boolean z10, String str) {
        this(z10, null, 0, str);
    }

    private void q() {
        this.f129682n = false;
        s();
    }

    private void r() {
        this.f129678j = 1;
        this.f129679k = 0;
    }

    private void s() {
        this.f129678j = 0;
        this.f129679k = 0;
        this.f129680l = 256;
    }

    private void t() {
        this.f129678j = 3;
        this.f129679k = 0;
    }

    private void u() {
        this.f129678j = 2;
        this.f129679k = f129668x.length;
        this.f129688t = 0;
        this.f129671c.W(0);
    }

    private void v(O o10, long j10, int i10, int i11) {
        this.f129678j = 4;
        this.f129679k = i10;
        this.f129690v = o10;
        this.f129691w = j10;
        this.f129688t = i11;
    }

    @Override // e4.InterfaceC13770m
    public void d(boolean z10) {
    }

    public C13766i(boolean z10, String str, int i10, String str2) {
        this.f129670b = new d3.C(new byte[7]);
        this.f129671c = new d3.D(Arrays.copyOf(f129668x, 10));
        this.f129683o = -1;
        this.f129684p = -1;
        this.f129687s = -9223372036854775807L;
        this.f129689u = -9223372036854775807L;
        this.f129669a = z10;
        this.f129672d = str;
        this.f129673e = i10;
        this.f129674f = str2;
        s();
    }

    private void b() {
        C13599a.e(this.f129676h);
        P.h(this.f129690v);
        P.h(this.f129677i);
    }

    private boolean h(d3.D d10, int i10) {
        d10.W(i10 + 1);
        if (!w(d10, this.f129670b.f127860a, 1)) {
            return false;
        }
        this.f129670b.p(4);
        int iH = this.f129670b.h(1);
        int i11 = this.f129683o;
        if (i11 != -1 && iH != i11) {
            return false;
        }
        if (this.f129684p != -1) {
            if (!w(d10, this.f129670b.f127860a, 1)) {
                return true;
            }
            this.f129670b.p(2);
            if (this.f129670b.h(4) != this.f129684p) {
                return false;
            }
            d10.W(i10 + 2);
        }
        if (!w(d10, this.f129670b.f127860a, 4)) {
            return true;
        }
        this.f129670b.p(14);
        int iH2 = this.f129670b.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArrE = d10.e();
        int iG = d10.g();
        int i12 = i10 + iH2;
        if (i12 >= iG) {
            return true;
        }
        byte b10 = bArrE[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == iG) {
                return true;
            }
            return l((byte) -1, bArrE[i13]) && ((bArrE[i13] & 8) >> 3) == iH;
        }
        if (b10 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == iG) {
            return true;
        }
        if (bArrE[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == iG || bArrE[i15] == 51;
    }

    private boolean l(byte b10, byte b11) {
        return m(((b10 & 255) << 8) | (b11 & 255));
    }

    private void n() throws ParserException {
        this.f129670b.p(0);
        if (this.f129686r) {
            this.f129670b.r(10);
        } else {
            int i10 = 2;
            int iH = this.f129670b.h(2) + 1;
            if (iH != 2) {
                d3.r.i("AdtsReader", "Detected audio object type: " + iH + ", but assuming AAC LC.");
            } else {
                i10 = iH;
            }
            this.f129670b.r(5);
            byte[] bArrA = C18062a.a(i10, this.f129684p, this.f129670b.h(3));
            C18062a.b bVarE = C18062a.e(bArrA);
            a3.t tVarN = new t.b().f0(this.f129675g).U(this.f129674f).u0("audio/mp4a-latm").S(bVarE.f170218c).R(bVarE.f170217b).v0(bVarE.f170216a).g0(Collections.singletonList(bArrA)).j0(this.f129672d).s0(this.f129673e).N();
            this.f129687s = 1024000000 / tVarN.f44743F;
            this.f129676h.b(tVarN);
            this.f129686r = true;
        }
        this.f129670b.r(4);
        int iH2 = this.f129670b.h(13);
        int i11 = iH2 - 7;
        if (this.f129681m) {
            i11 = iH2 - 9;
        }
        v(this.f129676h, this.f129687s, 0, i11);
    }

    private void o() {
        this.f129677i.d(this.f129671c, 10);
        this.f129671c.W(6);
        v(this.f129677i, 0L, 10, this.f129671c.G() + 10);
    }

    @Override // e4.InterfaceC13770m
    public void e(long j10, int i10) {
        this.f129689u = j10;
    }

    public long k() {
        return this.f129687s;
    }

    private void g(d3.D d10) {
        if (d10.a() == 0) {
            return;
        }
        this.f129670b.f127860a[0] = d10.e()[d10.f()];
        this.f129670b.p(2);
        int iH = this.f129670b.h(4);
        int i10 = this.f129684p;
        if (i10 != -1 && iH != i10) {
            q();
            return;
        }
        if (!this.f129682n) {
            this.f129682n = true;
            this.f129683o = this.f129685q;
            this.f129684p = iH;
        }
        t();
    }

    private boolean i(d3.D d10, byte[] bArr, int i10) {
        int iMin = Math.min(d10.a(), i10 - this.f129679k);
        d10.l(bArr, this.f129679k, iMin);
        int i11 = this.f129679k + iMin;
        this.f129679k = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private void j(d3.D d10) {
        byte[] bArrE = d10.e();
        int iF = d10.f();
        int iG = d10.g();
        while (iF < iG) {
            int i10 = iF + 1;
            byte b10 = bArrE[iF];
            int i11 = b10 & 255;
            if (this.f129680l == 512 && l((byte) -1, (byte) i11) && (this.f129682n || h(d10, iF - 1))) {
                this.f129685q = (b10 & 8) >> 3;
                boolean z10 = true;
                if ((b10 & 1) != 0) {
                    z10 = false;
                }
                this.f129681m = z10;
                if (!this.f129682n) {
                    r();
                } else {
                    t();
                }
                d10.W(i10);
                return;
            }
            int i12 = this.f129680l;
            int i13 = i11 | i12;
            if (i13 != 329) {
                if (i13 != 511) {
                    if (i13 != 836) {
                        if (i13 != 1075) {
                            if (i12 != 256) {
                                this.f129680l = 256;
                            }
                        } else {
                            u();
                            d10.W(i10);
                            return;
                        }
                    } else {
                        this.f129680l = 1024;
                    }
                } else {
                    this.f129680l = 512;
                }
            } else {
                this.f129680l = 768;
            }
            iF = i10;
        }
        d10.W(iF);
    }

    public static boolean m(int i10) {
        if ((i10 & 65526) == 65520) {
            return true;
        }
        return false;
    }

    private void p(d3.D d10) {
        boolean z10;
        int iMin = Math.min(d10.a(), this.f129688t - this.f129679k);
        this.f129690v.d(d10, iMin);
        int i10 = this.f129679k + iMin;
        this.f129679k = i10;
        if (i10 == this.f129688t) {
            if (this.f129689u != -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            C13599a.g(z10);
            this.f129690v.c(this.f129689u, 1, this.f129688t, 0, null);
            this.f129689u += this.f129691w;
            s();
        }
    }

    private boolean w(d3.D d10, byte[] bArr, int i10) {
        if (d10.a() < i10) {
            return false;
        }
        d10.l(bArr, 0, i10);
        return true;
    }

    @Override // e4.InterfaceC13770m
    public void a(d3.D d10) throws ParserException {
        int i10;
        b();
        while (d10.a() > 0) {
            int i11 = this.f129678j;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                p(d10);
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            if (this.f129681m) {
                                i10 = 7;
                            } else {
                                i10 = 5;
                            }
                            if (i(d10, this.f129670b.f127860a, i10)) {
                                n();
                            }
                        }
                    } else if (i(d10, this.f129671c.e(), 10)) {
                        o();
                    }
                } else {
                    g(d10);
                }
            } else {
                j(d10);
            }
        }
    }

    @Override // e4.InterfaceC13770m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f129675g = dVar.b();
        O oT = rVar.t(dVar.c(), 1);
        this.f129676h = oT;
        this.f129690v = oT;
        if (this.f129669a) {
            dVar.a();
            O oT2 = rVar.t(dVar.c(), 5);
            this.f129677i = oT2;
            oT2.b(new t.b().f0(dVar.b()).U(this.f129674f).u0("application/id3").N());
            return;
        }
        this.f129677i = new C18074m();
    }

    @Override // e4.InterfaceC13770m
    public void c() {
        this.f129689u = -9223372036854775807L;
        q();
    }
}
