package com.google.android.gms.internal.ads;

import com.fullstory.Reason;

/* loaded from: classes6.dex */
public final class H5 implements InterfaceC9567u5 {

    /* renamed from: e, reason: collision with root package name */
    private String f67357e;

    /* renamed from: f, reason: collision with root package name */
    private X0 f67358f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f67361i;

    /* renamed from: k, reason: collision with root package name */
    private int f67363k;

    /* renamed from: l, reason: collision with root package name */
    private int f67364l;

    /* renamed from: n, reason: collision with root package name */
    private int f67366n;

    /* renamed from: o, reason: collision with root package name */
    private int f67367o;

    /* renamed from: s, reason: collision with root package name */
    private int f67371s;

    /* renamed from: u, reason: collision with root package name */
    private boolean f67373u;

    /* renamed from: d, reason: collision with root package name */
    private int f67356d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final GQ f67353a = new GQ(new byte[15], 2);

    /* renamed from: b, reason: collision with root package name */
    private final C7999fQ f67354b = new C7999fQ();

    /* renamed from: c, reason: collision with root package name */
    private final GQ f67355c = new GQ();

    /* renamed from: p, reason: collision with root package name */
    private final I5 f67368p = new I5();

    /* renamed from: q, reason: collision with root package name */
    private int f67369q = Reason.OS_VERSION_TOO_LOW;

    /* renamed from: r, reason: collision with root package name */
    private int f67370r = -1;

    /* renamed from: t, reason: collision with root package name */
    private long f67372t = -1;

    /* renamed from: j, reason: collision with root package name */
    private boolean f67362j = true;

    /* renamed from: m, reason: collision with root package name */
    private boolean f67365m = true;

    /* renamed from: g, reason: collision with root package name */
    private double f67359g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    private double f67360h = -9.223372036854776E18d;

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void b(long j10, int i10) {
        this.f67363k = i10;
        if (!this.f67362j && (this.f67367o != 0 || !this.f67365m)) {
            this.f67361i = true;
        }
        if (j10 != -9223372036854775807L) {
            double d10 = j10;
            if (this.f67361i) {
                this.f67360h = d10;
            } else {
                this.f67359g = d10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zze() {
        this.f67356d = 0;
        this.f67364l = 0;
        this.f67353a.i(2);
        this.f67366n = 0;
        this.f67367o = 0;
        this.f67369q = Reason.OS_VERSION_TOO_LOW;
        this.f67370r = -1;
        this.f67371s = 0;
        this.f67372t = -1L;
        this.f67373u = false;
        this.f67361i = false;
        this.f67365m = true;
        this.f67362j = true;
        this.f67359g = -9.223372036854776E18d;
        this.f67360h = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void a(GQ gq2) throws zzbc {
        int i10;
        C8086gC.b(this.f67358f);
        while (gq2.r() > 0) {
            int i11 = this.f67356d;
            int iD = 0;
            if (i11 == 0) {
                int i12 = this.f67363k;
                if ((i12 & 2) != 0) {
                    if ((i12 & 4) == 0) {
                        while (gq2.r() > 0) {
                            int i13 = this.f67364l << 8;
                            this.f67364l = i13;
                            int iC = i13 | gq2.C();
                            this.f67364l = iC;
                            if ((iC & 16777215) == 12583333) {
                                gq2.l(gq2.t() - 3);
                                this.f67364l = 0;
                            }
                        }
                    }
                    this.f67356d = 1;
                    break;
                }
                gq2.l(gq2.u());
            } else if (i11 != 1) {
                int i14 = this.f67368p.f67546a;
                if (i14 == 1 || i14 == 17) {
                    d(gq2, this.f67355c, true);
                }
                int iMin = Math.min(gq2.r(), this.f67368p.f67548c - this.f67366n);
                this.f67358f.c(gq2, iMin);
                int i15 = this.f67366n + iMin;
                this.f67366n = i15;
                I5 i52 = this.f67368p;
                if (i15 == i52.f67548c) {
                    int i16 = i52.f67546a;
                    if (i16 == 1) {
                        byte[] bArrN = this.f67355c.n();
                        J5 j5A = M5.a(new C7999fQ(bArrN, bArrN.length));
                        this.f67369q = j5A.f67767b;
                        this.f67370r = j5A.f67768c;
                        long j10 = this.f67372t;
                        long j11 = this.f67368p.f67547b;
                        if (j10 != j11) {
                            this.f67372t = j11;
                            int i17 = j5A.f67766a;
                            String strConcat = i17 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i17))) : "mhm1";
                            byte[] bArr = j5A.f67769d;
                            AbstractC7917eh0 abstractC7917eh0V = null;
                            if (bArr != null && bArr.length > 0) {
                                abstractC7917eh0V = AbstractC7917eh0.v(OV.f69096f, bArr);
                            }
                            C9592uH0 c9592uH0 = new C9592uH0();
                            c9592uH0.m(this.f67357e);
                            c9592uH0.B("audio/mhm1");
                            c9592uH0.C(this.f67369q);
                            c9592uH0.a(strConcat);
                            c9592uH0.n(abstractC7917eh0V);
                            this.f67358f.d(c9592uH0.H());
                        }
                        this.f67373u = true;
                    } else if (i16 == 17) {
                        byte[] bArrN2 = this.f67355c.n();
                        C7999fQ c7999fQ = new C7999fQ(bArrN2, bArrN2.length);
                        if (c7999fQ.p()) {
                            c7999fQ.n(2);
                            iD = c7999fQ.d(13);
                        }
                        this.f67371s = iD;
                    } else if (i16 == 2) {
                        if (this.f67373u) {
                            this.f67362j = false;
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        int i18 = this.f67370r - this.f67371s;
                        double d10 = this.f67369q;
                        long jRound = Math.round(this.f67359g);
                        if (this.f67361i) {
                            this.f67361i = false;
                            this.f67359g = this.f67360h;
                        } else {
                            this.f67359g += (i18 * 1000000.0d) / d10;
                        }
                        this.f67358f.a(jRound, i10, this.f67367o, 0, null);
                        this.f67373u = false;
                        this.f67371s = 0;
                        this.f67367o = 0;
                    }
                    this.f67356d = 1;
                }
            } else {
                d(gq2, this.f67353a, false);
                GQ gq3 = this.f67353a;
                if (gq3.r() == 0) {
                    C7999fQ c7999fQ2 = this.f67354b;
                    int iU = gq3.u();
                    c7999fQ2.k(gq3.n(), iU);
                    if (M5.b(this.f67354b, this.f67368p)) {
                        this.f67366n = 0;
                        this.f67367o += this.f67368p.f67548c + iU;
                        this.f67353a.l(0);
                        X0 x02 = this.f67358f;
                        GQ gq4 = this.f67353a;
                        x02.c(gq4, gq4.u());
                        this.f67353a.i(2);
                        this.f67355c.i(this.f67368p.f67548c);
                        this.f67365m = true;
                        this.f67356d = 2;
                    } else {
                        GQ gq5 = this.f67353a;
                        if (gq5.u() < 15) {
                            gq5.k(gq5.u() + 1);
                        }
                    }
                }
                this.f67365m = false;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void c(InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
        c8393j6.c();
        this.f67357e = c8393j6.b();
        this.f67358f = interfaceC9450t0.a(c8393j6.a(), 1);
    }
}
