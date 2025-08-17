package e4;

import a3.t;
import d3.C13466a;
import e4.L;
import x3.C17998c;
import x3.O;

/* renamed from: e4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13614f implements InterfaceC13621m {

    /* renamed from: a, reason: collision with root package name */
    private final d3.C f128304a;

    /* renamed from: b, reason: collision with root package name */
    private final d3.D f128305b;

    /* renamed from: c, reason: collision with root package name */
    private final String f128306c;

    /* renamed from: d, reason: collision with root package name */
    private final int f128307d;

    /* renamed from: e, reason: collision with root package name */
    private final String f128308e;

    /* renamed from: f, reason: collision with root package name */
    private String f128309f;

    /* renamed from: g, reason: collision with root package name */
    private O f128310g;

    /* renamed from: h, reason: collision with root package name */
    private int f128311h;

    /* renamed from: i, reason: collision with root package name */
    private int f128312i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f128313j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f128314k;

    /* renamed from: l, reason: collision with root package name */
    private long f128315l;

    /* renamed from: m, reason: collision with root package name */
    private a3.t f128316m;

    /* renamed from: n, reason: collision with root package name */
    private int f128317n;

    /* renamed from: o, reason: collision with root package name */
    private long f128318o;

    public C13614f(String str) {
        this(null, 0, str);
    }

    @Override // e4.InterfaceC13621m
    public void c() {
        this.f128311h = 0;
        this.f128312i = 0;
        this.f128313j = false;
        this.f128314k = false;
        this.f128318o = -9223372036854775807L;
    }

    @Override // e4.InterfaceC13621m
    public void d(boolean z10) {
    }

    public C13614f(String str, int i10, String str2) {
        d3.C c10 = new d3.C(new byte[16]);
        this.f128304a = c10;
        this.f128305b = new d3.D(c10.f127058a);
        this.f128311h = 0;
        this.f128312i = 0;
        this.f128313j = false;
        this.f128314k = false;
        this.f128318o = -9223372036854775807L;
        this.f128306c = str;
        this.f128307d = i10;
        this.f128308e = str2;
    }

    private void g() {
        this.f128304a.p(0);
        C17998c.C2708c c2708cF = C17998c.f(this.f128304a);
        a3.t tVar = this.f128316m;
        if (tVar == null || c2708cF.f169153c != tVar.f43924E || c2708cF.f169152b != tVar.f43925F || !"audio/ac4".equals(tVar.f43949o)) {
            a3.t tVarN = new t.b().f0(this.f128309f).U(this.f128308e).u0("audio/ac4").R(c2708cF.f169153c).v0(c2708cF.f169152b).j0(this.f128306c).s0(this.f128307d).N();
            this.f128316m = tVarN;
            this.f128310g.b(tVarN);
        }
        this.f128317n = c2708cF.f169154d;
        this.f128315l = (c2708cF.f169155e * 1000000) / this.f128316m.f43925F;
    }

    @Override // e4.InterfaceC13621m
    public void a(d3.D d10) {
        C13466a.i(this.f128310g);
        while (d10.a() > 0) {
            int i10 = this.f128311h;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(d10.a(), this.f128317n - this.f128312i);
                        this.f128310g.d(d10, iMin);
                        int i11 = this.f128312i + iMin;
                        this.f128312i = i11;
                        if (i11 == this.f128317n) {
                            C13466a.g(this.f128318o != -9223372036854775807L);
                            this.f128310g.c(this.f128318o, 1, this.f128317n, 0, null);
                            this.f128318o += this.f128315l;
                            this.f128311h = 0;
                        }
                    }
                } else if (b(d10, this.f128305b.e(), 16)) {
                    g();
                    this.f128305b.W(0);
                    this.f128310g.d(this.f128305b, 16);
                    this.f128311h = 2;
                }
            } else if (h(d10)) {
                this.f128311h = 1;
                this.f128305b.e()[0] = -84;
                this.f128305b.e()[1] = (byte) (this.f128314k ? 65 : 64);
                this.f128312i = 2;
            }
        }
    }

    @Override // e4.InterfaceC13621m
    public void e(long j10, int i10) {
        this.f128318o = j10;
    }

    private boolean b(d3.D d10, byte[] bArr, int i10) {
        int iMin = Math.min(d10.a(), i10 - this.f128312i);
        d10.l(bArr, this.f128312i, iMin);
        int i11 = this.f128312i + iMin;
        this.f128312i = i11;
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
            if (!this.f128313j) {
                if (d10.H() == 172) {
                    z10 = true;
                }
                this.f128313j = z10;
            } else {
                iH = d10.H();
                if (iH == 172) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f128313j = z11;
                if (iH == 64 || iH == 65) {
                    break;
                }
            }
        }
        if (iH == 65) {
            z10 = true;
        }
        this.f128314k = z10;
        return true;
    }

    @Override // e4.InterfaceC13621m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f128309f = dVar.b();
        this.f128310g = rVar.t(dVar.c(), 1);
    }
}
