package e4;

import a3.t;
import androidx.media3.common.ParserException;
import d3.C13466a;
import d3.P;
import e4.L;
import java.util.Arrays;
import java.util.Collections;
import x3.C17996a;
import x3.C18008m;
import x3.O;

/* renamed from: e4.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13617i implements InterfaceC13621m {

    /* renamed from: x, reason: collision with root package name */
    private static final byte[] f128332x = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f128333a;

    /* renamed from: b, reason: collision with root package name */
    private final d3.C f128334b;

    /* renamed from: c, reason: collision with root package name */
    private final d3.D f128335c;

    /* renamed from: d, reason: collision with root package name */
    private final String f128336d;

    /* renamed from: e, reason: collision with root package name */
    private final int f128337e;

    /* renamed from: f, reason: collision with root package name */
    private final String f128338f;

    /* renamed from: g, reason: collision with root package name */
    private String f128339g;

    /* renamed from: h, reason: collision with root package name */
    private O f128340h;

    /* renamed from: i, reason: collision with root package name */
    private O f128341i;

    /* renamed from: j, reason: collision with root package name */
    private int f128342j;

    /* renamed from: k, reason: collision with root package name */
    private int f128343k;

    /* renamed from: l, reason: collision with root package name */
    private int f128344l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f128345m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f128346n;

    /* renamed from: o, reason: collision with root package name */
    private int f128347o;

    /* renamed from: p, reason: collision with root package name */
    private int f128348p;

    /* renamed from: q, reason: collision with root package name */
    private int f128349q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f128350r;

    /* renamed from: s, reason: collision with root package name */
    private long f128351s;

    /* renamed from: t, reason: collision with root package name */
    private int f128352t;

    /* renamed from: u, reason: collision with root package name */
    private long f128353u;

    /* renamed from: v, reason: collision with root package name */
    private O f128354v;

    /* renamed from: w, reason: collision with root package name */
    private long f128355w;

    public C13617i(boolean z10, String str) {
        this(z10, null, 0, str);
    }

    private void q() {
        this.f128346n = false;
        s();
    }

    private void r() {
        this.f128342j = 1;
        this.f128343k = 0;
    }

    private void s() {
        this.f128342j = 0;
        this.f128343k = 0;
        this.f128344l = 256;
    }

    private void t() {
        this.f128342j = 3;
        this.f128343k = 0;
    }

    private void u() {
        this.f128342j = 2;
        this.f128343k = f128332x.length;
        this.f128352t = 0;
        this.f128335c.W(0);
    }

    private void v(O o10, long j10, int i10, int i11) {
        this.f128342j = 4;
        this.f128343k = i10;
        this.f128354v = o10;
        this.f128355w = j10;
        this.f128352t = i11;
    }

    @Override // e4.InterfaceC13621m
    public void d(boolean z10) {
    }

    public C13617i(boolean z10, String str, int i10, String str2) {
        this.f128334b = new d3.C(new byte[7]);
        this.f128335c = new d3.D(Arrays.copyOf(f128332x, 10));
        this.f128347o = -1;
        this.f128348p = -1;
        this.f128351s = -9223372036854775807L;
        this.f128353u = -9223372036854775807L;
        this.f128333a = z10;
        this.f128336d = str;
        this.f128337e = i10;
        this.f128338f = str2;
        s();
    }

    private void b() {
        C13466a.e(this.f128340h);
        P.h(this.f128354v);
        P.h(this.f128341i);
    }

    private boolean h(d3.D d10, int i10) {
        d10.W(i10 + 1);
        if (!w(d10, this.f128334b.f127058a, 1)) {
            return false;
        }
        this.f128334b.p(4);
        int iH = this.f128334b.h(1);
        int i11 = this.f128347o;
        if (i11 != -1 && iH != i11) {
            return false;
        }
        if (this.f128348p != -1) {
            if (!w(d10, this.f128334b.f127058a, 1)) {
                return true;
            }
            this.f128334b.p(2);
            if (this.f128334b.h(4) != this.f128348p) {
                return false;
            }
            d10.W(i10 + 2);
        }
        if (!w(d10, this.f128334b.f127058a, 4)) {
            return true;
        }
        this.f128334b.p(14);
        int iH2 = this.f128334b.h(13);
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
        this.f128334b.p(0);
        if (this.f128350r) {
            this.f128334b.r(10);
        } else {
            int i10 = 2;
            int iH = this.f128334b.h(2) + 1;
            if (iH != 2) {
                d3.r.i("AdtsReader", "Detected audio object type: " + iH + ", but assuming AAC LC.");
            } else {
                i10 = iH;
            }
            this.f128334b.r(5);
            byte[] bArrA = C17996a.a(i10, this.f128348p, this.f128334b.h(3));
            C17996a.b bVarE = C17996a.e(bArrA);
            a3.t tVarN = new t.b().f0(this.f128339g).U(this.f128338f).u0("audio/mp4a-latm").S(bVarE.f169130c).R(bVarE.f169129b).v0(bVarE.f169128a).g0(Collections.singletonList(bArrA)).j0(this.f128336d).s0(this.f128337e).N();
            this.f128351s = 1024000000 / tVarN.f43925F;
            this.f128340h.b(tVarN);
            this.f128350r = true;
        }
        this.f128334b.r(4);
        int iH2 = this.f128334b.h(13);
        int i11 = iH2 - 7;
        if (this.f128345m) {
            i11 = iH2 - 9;
        }
        v(this.f128340h, this.f128351s, 0, i11);
    }

    private void o() {
        this.f128341i.d(this.f128335c, 10);
        this.f128335c.W(6);
        v(this.f128341i, 0L, 10, this.f128335c.G() + 10);
    }

    @Override // e4.InterfaceC13621m
    public void e(long j10, int i10) {
        this.f128353u = j10;
    }

    public long k() {
        return this.f128351s;
    }

    private void g(d3.D d10) {
        if (d10.a() == 0) {
            return;
        }
        this.f128334b.f127058a[0] = d10.e()[d10.f()];
        this.f128334b.p(2);
        int iH = this.f128334b.h(4);
        int i10 = this.f128348p;
        if (i10 != -1 && iH != i10) {
            q();
            return;
        }
        if (!this.f128346n) {
            this.f128346n = true;
            this.f128347o = this.f128349q;
            this.f128348p = iH;
        }
        t();
    }

    private boolean i(d3.D d10, byte[] bArr, int i10) {
        int iMin = Math.min(d10.a(), i10 - this.f128343k);
        d10.l(bArr, this.f128343k, iMin);
        int i11 = this.f128343k + iMin;
        this.f128343k = i11;
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
            if (this.f128344l == 512 && l((byte) -1, (byte) i11) && (this.f128346n || h(d10, iF - 1))) {
                this.f128349q = (b10 & 8) >> 3;
                boolean z10 = true;
                if ((b10 & 1) != 0) {
                    z10 = false;
                }
                this.f128345m = z10;
                if (!this.f128346n) {
                    r();
                } else {
                    t();
                }
                d10.W(i10);
                return;
            }
            int i12 = this.f128344l;
            int i13 = i11 | i12;
            if (i13 != 329) {
                if (i13 != 511) {
                    if (i13 != 836) {
                        if (i13 != 1075) {
                            if (i12 != 256) {
                                this.f128344l = 256;
                            }
                        } else {
                            u();
                            d10.W(i10);
                            return;
                        }
                    } else {
                        this.f128344l = 1024;
                    }
                } else {
                    this.f128344l = 512;
                }
            } else {
                this.f128344l = 768;
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
        int iMin = Math.min(d10.a(), this.f128352t - this.f128343k);
        this.f128354v.d(d10, iMin);
        int i10 = this.f128343k + iMin;
        this.f128343k = i10;
        if (i10 == this.f128352t) {
            if (this.f128353u != -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            C13466a.g(z10);
            this.f128354v.c(this.f128353u, 1, this.f128352t, 0, null);
            this.f128353u += this.f128355w;
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

    @Override // e4.InterfaceC13621m
    public void a(d3.D d10) throws ParserException {
        int i10;
        b();
        while (d10.a() > 0) {
            int i11 = this.f128342j;
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
                            if (this.f128345m) {
                                i10 = 7;
                            } else {
                                i10 = 5;
                            }
                            if (i(d10, this.f128334b.f127058a, i10)) {
                                n();
                            }
                        }
                    } else if (i(d10, this.f128335c.e(), 10)) {
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

    @Override // e4.InterfaceC13621m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f128339g = dVar.b();
        O oT = rVar.t(dVar.c(), 1);
        this.f128340h = oT;
        this.f128354v = oT;
        if (this.f128333a) {
            dVar.a();
            O oT2 = rVar.t(dVar.c(), 5);
            this.f128341i = oT2;
            oT2.b(new t.b().f0(dVar.b()).U(this.f128338f).u0("application/id3").N());
            return;
        }
        this.f128341i = new C18008m();
    }

    @Override // e4.InterfaceC13621m
    public void c() {
        this.f128353u = -9223372036854775807L;
        q();
    }
}
