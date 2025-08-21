package e4;

import a3.t;
import d3.C13599a;
import e4.L;
import x3.C18064c;
import x3.O;

/* renamed from: e4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13763f implements InterfaceC13770m {

    /* renamed from: a, reason: collision with root package name */
    private final d3.C f129640a;

    /* renamed from: b, reason: collision with root package name */
    private final d3.D f129641b;

    /* renamed from: c, reason: collision with root package name */
    private final String f129642c;

    /* renamed from: d, reason: collision with root package name */
    private final int f129643d;

    /* renamed from: e, reason: collision with root package name */
    private final String f129644e;

    /* renamed from: f, reason: collision with root package name */
    private String f129645f;

    /* renamed from: g, reason: collision with root package name */
    private O f129646g;

    /* renamed from: h, reason: collision with root package name */
    private int f129647h;

    /* renamed from: i, reason: collision with root package name */
    private int f129648i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f129649j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f129650k;

    /* renamed from: l, reason: collision with root package name */
    private long f129651l;

    /* renamed from: m, reason: collision with root package name */
    private a3.t f129652m;

    /* renamed from: n, reason: collision with root package name */
    private int f129653n;

    /* renamed from: o, reason: collision with root package name */
    private long f129654o;

    public C13763f(String str) {
        this(null, 0, str);
    }

    @Override // e4.InterfaceC13770m
    public void c() {
        this.f129647h = 0;
        this.f129648i = 0;
        this.f129649j = false;
        this.f129650k = false;
        this.f129654o = -9223372036854775807L;
    }

    @Override // e4.InterfaceC13770m
    public void d(boolean z10) {
    }

    public C13763f(String str, int i10, String str2) {
        d3.C c10 = new d3.C(new byte[16]);
        this.f129640a = c10;
        this.f129641b = new d3.D(c10.f127860a);
        this.f129647h = 0;
        this.f129648i = 0;
        this.f129649j = false;
        this.f129650k = false;
        this.f129654o = -9223372036854775807L;
        this.f129642c = str;
        this.f129643d = i10;
        this.f129644e = str2;
    }

    private void g() {
        this.f129640a.p(0);
        C18064c.C2732c c2732cF = C18064c.f(this.f129640a);
        a3.t tVar = this.f129652m;
        if (tVar == null || c2732cF.f170241c != tVar.f44742E || c2732cF.f170240b != tVar.f44743F || !"audio/ac4".equals(tVar.f44767o)) {
            a3.t tVarN = new t.b().f0(this.f129645f).U(this.f129644e).u0("audio/ac4").R(c2732cF.f170241c).v0(c2732cF.f170240b).j0(this.f129642c).s0(this.f129643d).N();
            this.f129652m = tVarN;
            this.f129646g.b(tVarN);
        }
        this.f129653n = c2732cF.f170242d;
        this.f129651l = (c2732cF.f170243e * 1000000) / this.f129652m.f44743F;
    }

    @Override // e4.InterfaceC13770m
    public void a(d3.D d10) {
        C13599a.i(this.f129646g);
        while (d10.a() > 0) {
            int i10 = this.f129647h;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(d10.a(), this.f129653n - this.f129648i);
                        this.f129646g.d(d10, iMin);
                        int i11 = this.f129648i + iMin;
                        this.f129648i = i11;
                        if (i11 == this.f129653n) {
                            C13599a.g(this.f129654o != -9223372036854775807L);
                            this.f129646g.c(this.f129654o, 1, this.f129653n, 0, null);
                            this.f129654o += this.f129651l;
                            this.f129647h = 0;
                        }
                    }
                } else if (b(d10, this.f129641b.e(), 16)) {
                    g();
                    this.f129641b.W(0);
                    this.f129646g.d(this.f129641b, 16);
                    this.f129647h = 2;
                }
            } else if (h(d10)) {
                this.f129647h = 1;
                this.f129641b.e()[0] = -84;
                this.f129641b.e()[1] = (byte) (this.f129650k ? 65 : 64);
                this.f129648i = 2;
            }
        }
    }

    @Override // e4.InterfaceC13770m
    public void e(long j10, int i10) {
        this.f129654o = j10;
    }

    private boolean b(d3.D d10, byte[] bArr, int i10) {
        int iMin = Math.min(d10.a(), i10 - this.f129648i);
        d10.l(bArr, this.f129648i, iMin);
        int i11 = this.f129648i + iMin;
        this.f129648i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private boolean h(d3.D d10) {
        boolean z10;
        int iH;
        boolean z11;
        while (true) {
            z10 = false;
            if (d10.a() <= 0) {
                return false;
            }
            if (!this.f129649j) {
                if (d10.H() == 172) {
                    z10 = true;
                }
                this.f129649j = z10;
            } else {
                iH = d10.H();
                if (iH == 172) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f129649j = z11;
                if (iH == 64 || iH == 65) {
                    break;
                }
            }
        }
        if (iH == 65) {
            z10 = true;
        }
        this.f129650k = z10;
        return true;
    }

    @Override // e4.InterfaceC13770m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f129645f = dVar.b();
        this.f129646g = rVar.t(dVar.c(), 1);
    }
}
