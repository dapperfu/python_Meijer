package e4;

import a3.t;
import d3.C13599a;
import e4.L;
import fsimpl.C14170dq;
import java.util.Objects;
import x3.C18063b;
import x3.O;

/* renamed from: e4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13760c implements InterfaceC13770m {

    /* renamed from: a, reason: collision with root package name */
    private final d3.C f129622a;

    /* renamed from: b, reason: collision with root package name */
    private final d3.D f129623b;

    /* renamed from: c, reason: collision with root package name */
    private final String f129624c;

    /* renamed from: d, reason: collision with root package name */
    private final int f129625d;

    /* renamed from: e, reason: collision with root package name */
    private final String f129626e;

    /* renamed from: f, reason: collision with root package name */
    private String f129627f;

    /* renamed from: g, reason: collision with root package name */
    private O f129628g;

    /* renamed from: h, reason: collision with root package name */
    private int f129629h;

    /* renamed from: i, reason: collision with root package name */
    private int f129630i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f129631j;

    /* renamed from: k, reason: collision with root package name */
    private long f129632k;

    /* renamed from: l, reason: collision with root package name */
    private a3.t f129633l;

    /* renamed from: m, reason: collision with root package name */
    private int f129634m;

    /* renamed from: n, reason: collision with root package name */
    private long f129635n;

    public C13760c(String str) {
        this(null, 0, str);
    }

    @Override // e4.InterfaceC13770m
    public void c() {
        this.f129629h = 0;
        this.f129630i = 0;
        this.f129631j = false;
        this.f129635n = -9223372036854775807L;
    }

    @Override // e4.InterfaceC13770m
    public void d(boolean z10) {
    }

    public C13760c(String str, int i10, String str2) {
        d3.C c10 = new d3.C(new byte[128]);
        this.f129622a = c10;
        this.f129623b = new d3.D(c10.f127860a);
        this.f129629h = 0;
        this.f129635n = -9223372036854775807L;
        this.f129624c = str;
        this.f129625d = i10;
        this.f129626e = str2;
    }

    private void g() {
        this.f129622a.p(0);
        C18063b.C2731b c2731bF = C18063b.f(this.f129622a);
        a3.t tVar = this.f129633l;
        if (tVar == null || c2731bF.f170228d != tVar.f44742E || c2731bF.f170227c != tVar.f44743F || !Objects.equals(c2731bF.f170225a, tVar.f44767o)) {
            t.b bVarP0 = new t.b().f0(this.f129627f).U(this.f129626e).u0(c2731bF.f170225a).R(c2731bF.f170228d).v0(c2731bF.f170227c).j0(this.f129624c).s0(this.f129625d).p0(c2731bF.f170231g);
            if ("audio/ac3".equals(c2731bF.f170225a)) {
                bVarP0.Q(c2731bF.f170231g);
            }
            a3.t tVarN = bVarP0.N();
            this.f129633l = tVarN;
            this.f129628g.b(tVarN);
        }
        this.f129634m = c2731bF.f170229e;
        this.f129632k = (c2731bF.f170230f * 1000000) / this.f129633l.f44743F;
    }

    @Override // e4.InterfaceC13770m
    public void a(d3.D d10) {
        C13599a.i(this.f129628g);
        while (d10.a() > 0) {
            int i10 = this.f129629h;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(d10.a(), this.f129634m - this.f129630i);
                        this.f129628g.d(d10, iMin);
                        int i11 = this.f129630i + iMin;
                        this.f129630i = i11;
                        if (i11 == this.f129634m) {
                            C13599a.g(this.f129635n != -9223372036854775807L);
                            this.f129628g.c(this.f129635n, 1, this.f129634m, 0, null);
                            this.f129635n += this.f129632k;
                            this.f129629h = 0;
                        }
                    }
                } else if (b(d10, this.f129623b.e(), 128)) {
                    g();
                    this.f129623b.W(0);
                    this.f129628g.d(this.f129623b, 128);
                    this.f129629h = 2;
                }
            } else if (h(d10)) {
                this.f129629h = 1;
                this.f129623b.e()[0] = C14170dq.DST_ATOP;
                this.f129623b.e()[1] = 119;
                this.f129630i = 2;
            }
        }
    }

    @Override // e4.InterfaceC13770m
    public void e(long j10, int i10) {
        this.f129635n = j10;
    }

    private boolean b(d3.D d10, byte[] bArr, int i10) {
        int iMin = Math.min(d10.a(), i10 - this.f129630i);
        d10.l(bArr, this.f129630i, iMin);
        int i11 = this.f129630i + iMin;
        this.f129630i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private boolean h(d3.D d10) {
        while (true) {
            boolean z10 = false;
            if (d10.a() <= 0) {
                return false;
            }
            if (!this.f129631j) {
                if (d10.H() == 11) {
                    z10 = true;
                }
                this.f129631j = z10;
            } else {
                int iH = d10.H();
                if (iH == 119) {
                    this.f129631j = false;
                    return true;
                }
                if (iH == 11) {
                    z10 = true;
                }
                this.f129631j = z10;
            }
        }
    }

    @Override // e4.InterfaceC13770m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f129627f = dVar.b();
        this.f129628g = rVar.t(dVar.c(), 1);
    }
}
