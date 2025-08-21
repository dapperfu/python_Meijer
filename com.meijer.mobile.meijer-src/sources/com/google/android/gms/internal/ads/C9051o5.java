package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9051o5 implements InterfaceC9692u5 {

    /* renamed from: a, reason: collision with root package name */
    private final C8124fQ f78140a;

    /* renamed from: b, reason: collision with root package name */
    private final GQ f78141b;

    /* renamed from: c, reason: collision with root package name */
    private final String f78142c;

    /* renamed from: d, reason: collision with root package name */
    private final int f78143d;

    /* renamed from: e, reason: collision with root package name */
    private String f78144e;

    /* renamed from: f, reason: collision with root package name */
    private X0 f78145f;

    /* renamed from: g, reason: collision with root package name */
    private int f78146g;

    /* renamed from: h, reason: collision with root package name */
    private int f78147h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f78148i;

    /* renamed from: j, reason: collision with root package name */
    private long f78149j;

    /* renamed from: k, reason: collision with root package name */
    private C f78150k;

    /* renamed from: l, reason: collision with root package name */
    private int f78151l;

    /* renamed from: m, reason: collision with root package name */
    private long f78152m;

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void b(long j10, int i10) {
        this.f78152m = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zze() {
        this.f78146g = 0;
        this.f78147h = 0;
        this.f78148i = false;
        this.f78152m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void a(GQ gq2) {
        C8211gC.b(this.f78145f);
        while (gq2.r() > 0) {
            int i10 = this.f78146g;
            if (i10 == 0) {
                while (gq2.r() > 0) {
                    if (this.f78148i) {
                        int iC = gq2.C();
                        this.f78148i = iC == 172;
                        if (iC != 64) {
                            if (iC == 65) {
                                iC = 65;
                            }
                        }
                        this.f78146g = 1;
                        GQ gq3 = this.f78141b;
                        gq3.n()[0] = -84;
                        gq3.n()[1] = iC == 65 ? (byte) 65 : (byte) 64;
                        this.f78147h = 2;
                    } else {
                        this.f78148i = gq2.C() == 172;
                    }
                }
            } else if (i10 != 1) {
                int iMin = Math.min(gq2.r(), this.f78151l - this.f78147h);
                this.f78145f.c(gq2, iMin);
                int i11 = this.f78147h + iMin;
                this.f78147h = i11;
                if (i11 == this.f78151l) {
                    C8211gC.f(this.f78152m != -9223372036854775807L);
                    this.f78145f.a(this.f78152m, 1, this.f78151l, 0, null);
                    this.f78152m += this.f78149j;
                    this.f78146g = 0;
                }
            } else {
                byte[] bArrN = this.f78141b.n();
                int iMin2 = Math.min(gq2.r(), 16 - this.f78147h);
                gq2.h(bArrN, this.f78147h, iMin2);
                int i12 = this.f78147h + iMin2;
                this.f78147h = i12;
                if (i12 == 16) {
                    this.f78140a.l(0);
                    Q qA = T.a(this.f78140a);
                    C c10 = this.f78150k;
                    if (c10 == null || c10.f66481D != 2 || qA.f70315a != c10.f66482E || !"audio/ac4".equals(c10.f66504o)) {
                        C9717uH0 c9717uH0 = new C9717uH0();
                        c9717uH0.m(this.f78144e);
                        c9717uH0.B("audio/ac4");
                        c9717uH0.r0(2);
                        c9717uH0.C(qA.f70315a);
                        c9717uH0.q(this.f78142c);
                        c9717uH0.y(this.f78143d);
                        C cH = c9717uH0.H();
                        this.f78150k = cH;
                        this.f78145f.d(cH);
                    }
                    this.f78151l = qA.f70316b;
                    this.f78149j = (qA.f70317c * 1000000) / this.f78150k.f66482E;
                    this.f78141b.l(0);
                    this.f78145f.c(this.f78141b, 16);
                    this.f78146g = 2;
                }
            }
        }
    }

    public C9051o5(String str, int i10) {
        C8124fQ c8124fQ = new C8124fQ(new byte[16], 16);
        this.f78140a = c8124fQ;
        this.f78141b = new GQ(c8124fQ.f74940a);
        this.f78146g = 0;
        this.f78147h = 0;
        this.f78148i = false;
        this.f78152m = -9223372036854775807L;
        this.f78142c = str;
        this.f78143d = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void c(InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
        c8518j6.c();
        this.f78144e = c8518j6.b();
        this.f78145f = interfaceC9575t0.a(c8518j6.a(), 1);
    }
}
