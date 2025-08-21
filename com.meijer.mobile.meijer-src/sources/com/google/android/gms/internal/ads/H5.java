package com.google.android.gms.internal.ads;

import com.fullstory.Reason;

/* loaded from: classes6.dex */
public final class H5 implements InterfaceC9692u5 {

    /* renamed from: e, reason: collision with root package name */
    private String f68197e;

    /* renamed from: f, reason: collision with root package name */
    private X0 f68198f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f68201i;

    /* renamed from: k, reason: collision with root package name */
    private int f68203k;

    /* renamed from: l, reason: collision with root package name */
    private int f68204l;

    /* renamed from: n, reason: collision with root package name */
    private int f68206n;

    /* renamed from: o, reason: collision with root package name */
    private int f68207o;

    /* renamed from: s, reason: collision with root package name */
    private int f68211s;

    /* renamed from: u, reason: collision with root package name */
    private boolean f68213u;

    /* renamed from: d, reason: collision with root package name */
    private int f68196d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final GQ f68193a = new GQ(new byte[15], 2);

    /* renamed from: b, reason: collision with root package name */
    private final C8124fQ f68194b = new C8124fQ();

    /* renamed from: c, reason: collision with root package name */
    private final GQ f68195c = new GQ();

    /* renamed from: p, reason: collision with root package name */
    private final I5 f68208p = new I5();

    /* renamed from: q, reason: collision with root package name */
    private int f68209q = Reason.OS_VERSION_TOO_LOW;

    /* renamed from: r, reason: collision with root package name */
    private int f68210r = -1;

    /* renamed from: t, reason: collision with root package name */
    private long f68212t = -1;

    /* renamed from: j, reason: collision with root package name */
    private boolean f68202j = true;

    /* renamed from: m, reason: collision with root package name */
    private boolean f68205m = true;

    /* renamed from: g, reason: collision with root package name */
    private double f68199g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    private double f68200h = -9.223372036854776E18d;

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void b(long j10, int i10) {
        this.f68203k = i10;
        if (!this.f68202j && (this.f68207o != 0 || !this.f68205m)) {
            this.f68201i = true;
        }
        if (j10 != -9223372036854775807L) {
            double d10 = j10;
            if (this.f68201i) {
                this.f68200h = d10;
            } else {
                this.f68199g = d10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zze() {
        this.f68196d = 0;
        this.f68204l = 0;
        this.f68193a.i(2);
        this.f68206n = 0;
        this.f68207o = 0;
        this.f68209q = Reason.OS_VERSION_TOO_LOW;
        this.f68210r = -1;
        this.f68211s = 0;
        this.f68212t = -1L;
        this.f68213u = false;
        this.f68201i = false;
        this.f68205m = true;
        this.f68202j = true;
        this.f68199g = -9.223372036854776E18d;
        this.f68200h = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void a(GQ gq2) throws zzbc {
        int i10;
        C8211gC.b(this.f68198f);
        while (gq2.r() > 0) {
            int i11 = this.f68196d;
            int iD = 0;
            if (i11 == 0) {
                int i12 = this.f68203k;
                if ((i12 & 2) != 0) {
                    if ((i12 & 4) == 0) {
                        while (gq2.r() > 0) {
                            int i13 = this.f68204l << 8;
                            this.f68204l = i13;
                            int iC = i13 | gq2.C();
                            this.f68204l = iC;
                            if ((iC & 16777215) == 12583333) {
                                gq2.l(gq2.t() - 3);
                                this.f68204l = 0;
                            }
                        }
                    }
                    this.f68196d = 1;
                    break;
                }
                gq2.l(gq2.u());
            } else if (i11 != 1) {
                int i14 = this.f68208p.f68386a;
                if (i14 == 1 || i14 == 17) {
                    d(gq2, this.f68195c, true);
                }
                int iMin = Math.min(gq2.r(), this.f68208p.f68388c - this.f68206n);
                this.f68198f.c(gq2, iMin);
                int i15 = this.f68206n + iMin;
                this.f68206n = i15;
                I5 i52 = this.f68208p;
                if (i15 == i52.f68388c) {
                    int i16 = i52.f68386a;
                    if (i16 == 1) {
                        byte[] bArrN = this.f68195c.n();
                        J5 j5A = M5.a(new C8124fQ(bArrN, bArrN.length));
                        this.f68209q = j5A.f68607b;
                        this.f68210r = j5A.f68608c;
                        long j10 = this.f68212t;
                        long j11 = this.f68208p.f68387b;
                        if (j10 != j11) {
                            this.f68212t = j11;
                            int i17 = j5A.f68606a;
                            String strConcat = i17 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i17))) : "mhm1";
                            byte[] bArr = j5A.f68609d;
                            AbstractC8042eh0 abstractC8042eh0V = null;
                            if (bArr != null && bArr.length > 0) {
                                abstractC8042eh0V = AbstractC8042eh0.v(OV.f69936f, bArr);
                            }
                            C9717uH0 c9717uH0 = new C9717uH0();
                            c9717uH0.m(this.f68197e);
                            c9717uH0.B("audio/mhm1");
                            c9717uH0.C(this.f68209q);
                            c9717uH0.a(strConcat);
                            c9717uH0.n(abstractC8042eh0V);
                            this.f68198f.d(c9717uH0.H());
                        }
                        this.f68213u = true;
                    } else if (i16 == 17) {
                        byte[] bArrN2 = this.f68195c.n();
                        C8124fQ c8124fQ = new C8124fQ(bArrN2, bArrN2.length);
                        if (c8124fQ.p()) {
                            c8124fQ.n(2);
                            iD = c8124fQ.d(13);
                        }
                        this.f68211s = iD;
                    } else if (i16 == 2) {
                        if (this.f68213u) {
                            this.f68202j = false;
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        int i18 = this.f68210r - this.f68211s;
                        double d10 = this.f68209q;
                        long jRound = Math.round(this.f68199g);
                        if (this.f68201i) {
                            this.f68201i = false;
                            this.f68199g = this.f68200h;
                        } else {
                            this.f68199g += (i18 * 1000000.0d) / d10;
                        }
                        this.f68198f.a(jRound, i10, this.f68207o, 0, null);
                        this.f68213u = false;
                        this.f68211s = 0;
                        this.f68207o = 0;
                    }
                    this.f68196d = 1;
                }
            } else {
                d(gq2, this.f68193a, false);
                GQ gq3 = this.f68193a;
                if (gq3.r() == 0) {
                    C8124fQ c8124fQ2 = this.f68194b;
                    int iU = gq3.u();
                    c8124fQ2.k(gq3.n(), iU);
                    if (M5.b(this.f68194b, this.f68208p)) {
                        this.f68206n = 0;
                        this.f68207o += this.f68208p.f68388c + iU;
                        this.f68193a.l(0);
                        X0 x02 = this.f68198f;
                        GQ gq4 = this.f68193a;
                        x02.c(gq4, gq4.u());
                        this.f68193a.i(2);
                        this.f68195c.i(this.f68208p.f68388c);
                        this.f68205m = true;
                        this.f68196d = 2;
                    } else {
                        GQ gq5 = this.f68193a;
                        if (gq5.u() < 15) {
                            gq5.k(gq5.u() + 1);
                        }
                    }
                }
                this.f68205m = false;
            }
        }
    }

    private static final void d(GQ gq2, GQ gq3, boolean z10) {
        int iT = gq2.t();
        int iMin = Math.min(gq2.r(), gq3.r());
        gq2.h(gq3.n(), gq3.t(), iMin);
        gq3.m(iMin);
        if (z10) {
            gq2.l(iT);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void c(InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
        c8518j6.c();
        this.f68197e = c8518j6.b();
        this.f68198f = interfaceC9575t0.a(c8518j6.a(), 1);
    }
}
