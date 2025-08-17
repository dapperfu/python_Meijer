package e4;

import a3.t;
import d3.C13466a;
import e4.L;
import fsimpl.C14045dq;
import java.util.Objects;
import x3.C17997b;
import x3.O;

/* renamed from: e4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13611c implements InterfaceC13621m {

    /* renamed from: a, reason: collision with root package name */
    private final d3.C f128286a;

    /* renamed from: b, reason: collision with root package name */
    private final d3.D f128287b;

    /* renamed from: c, reason: collision with root package name */
    private final String f128288c;

    /* renamed from: d, reason: collision with root package name */
    private final int f128289d;

    /* renamed from: e, reason: collision with root package name */
    private final String f128290e;

    /* renamed from: f, reason: collision with root package name */
    private String f128291f;

    /* renamed from: g, reason: collision with root package name */
    private O f128292g;

    /* renamed from: h, reason: collision with root package name */
    private int f128293h;

    /* renamed from: i, reason: collision with root package name */
    private int f128294i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f128295j;

    /* renamed from: k, reason: collision with root package name */
    private long f128296k;

    /* renamed from: l, reason: collision with root package name */
    private a3.t f128297l;

    /* renamed from: m, reason: collision with root package name */
    private int f128298m;

    /* renamed from: n, reason: collision with root package name */
    private long f128299n;

    public C13611c(String str) {
        this(null, 0, str);
    }

    @Override // e4.InterfaceC13621m
    public void c() {
        this.f128293h = 0;
        this.f128294i = 0;
        this.f128295j = false;
        this.f128299n = -9223372036854775807L;
    }

    @Override // e4.InterfaceC13621m
    public void d(boolean z10) {
    }

    public C13611c(String str, int i10, String str2) {
        d3.C c10 = new d3.C(new byte[128]);
        this.f128286a = c10;
        this.f128287b = new d3.D(c10.f127058a);
        this.f128293h = 0;
        this.f128299n = -9223372036854775807L;
        this.f128288c = str;
        this.f128289d = i10;
        this.f128290e = str2;
    }

    private void g() {
        this.f128286a.p(0);
        C17997b.C2707b c2707bF = C17997b.f(this.f128286a);
        a3.t tVar = this.f128297l;
        if (tVar == null || c2707bF.f169140d != tVar.f43924E || c2707bF.f169139c != tVar.f43925F || !Objects.equals(c2707bF.f169137a, tVar.f43949o)) {
            t.b bVarP0 = new t.b().f0(this.f128291f).U(this.f128290e).u0(c2707bF.f169137a).R(c2707bF.f169140d).v0(c2707bF.f169139c).j0(this.f128288c).s0(this.f128289d).p0(c2707bF.f169143g);
            if ("audio/ac3".equals(c2707bF.f169137a)) {
                bVarP0.Q(c2707bF.f169143g);
            }
            a3.t tVarN = bVarP0.N();
            this.f128297l = tVarN;
            this.f128292g.b(tVarN);
        }
        this.f128298m = c2707bF.f169141e;
        this.f128296k = (c2707bF.f169142f * 1000000) / this.f128297l.f43925F;
    }

    @Override // e4.InterfaceC13621m
    public void a(d3.D d10) {
        C13466a.i(this.f128292g);
        while (d10.a() > 0) {
            int i10 = this.f128293h;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(d10.a(), this.f128298m - this.f128294i);
                        this.f128292g.d(d10, iMin);
                        int i11 = this.f128294i + iMin;
                        this.f128294i = i11;
                        if (i11 == this.f128298m) {
                            C13466a.g(this.f128299n != -9223372036854775807L);
                            this.f128292g.c(this.f128299n, 1, this.f128298m, 0, null);
                            this.f128299n += this.f128296k;
                            this.f128293h = 0;
                        }
                    }
                } else if (b(d10, this.f128287b.e(), 128)) {
                    g();
                    this.f128287b.W(0);
                    this.f128292g.d(this.f128287b, 128);
                    this.f128293h = 2;
                }
            } else if (h(d10)) {
                this.f128293h = 1;
                this.f128287b.e()[0] = C14045dq.DST_ATOP;
                this.f128287b.e()[1] = 119;
                this.f128294i = 2;
            }
        }
    }

    @Override // e4.InterfaceC13621m
    public void e(long j10, int i10) {
        this.f128299n = j10;
    }

    private boolean b(d3.D d10, byte[] bArr, int i10) {
        int iMin = Math.min(d10.a(), i10 - this.f128294i);
        d10.l(bArr, this.f128294i, iMin);
        int i11 = this.f128294i + iMin;
        this.f128294i = i11;
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
            if (!this.f128295j) {
                if (d10.H() == 11) {
                    z10 = true;
                }
                this.f128295j = z10;
            } else {
                int iH = d10.H();
                if (iH == 119) {
                    this.f128295j = false;
                    return true;
                }
                if (iH == 11) {
                    z10 = true;
                }
                this.f128295j = z10;
            }
        }
    }

    @Override // e4.InterfaceC13621m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f128291f = dVar.b();
        this.f128292g = rVar.t(dVar.c(), 1);
    }
}
