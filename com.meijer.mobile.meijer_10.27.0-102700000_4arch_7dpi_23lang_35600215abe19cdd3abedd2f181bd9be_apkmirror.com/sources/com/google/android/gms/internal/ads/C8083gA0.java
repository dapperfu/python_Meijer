package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8083gA0 {

    /* renamed from: a, reason: collision with root package name */
    public final YE0 f74262a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f74263b;

    /* renamed from: c, reason: collision with root package name */
    public final SF0[] f74264c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f74265d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f74266e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f74267f;

    /* renamed from: g, reason: collision with root package name */
    public C8190hA0 f74268g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f74269h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean[] f74270i;

    /* renamed from: j, reason: collision with root package name */
    private final IA0[] f74271j;

    /* renamed from: k, reason: collision with root package name */
    private final WG0 f74272k;

    /* renamed from: l, reason: collision with root package name */
    private final C9792wA0 f74273l;

    /* renamed from: m, reason: collision with root package name */
    private C8083gA0 f74274m;

    /* renamed from: n, reason: collision with root package name */
    private C7775dG0 f74275n;

    /* renamed from: o, reason: collision with root package name */
    private XG0 f74276o;

    /* renamed from: p, reason: collision with root package name */
    private long f74277p;

    private final boolean w() {
        return this.f74274m == null;
    }

    public final long a(XG0 xg0, long j10, boolean z10) {
        return b(xg0, j10, false, new boolean[2]);
    }

    public final long b(XG0 xg0, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= xg0.f71307a) {
                break;
            }
            boolean[] zArr2 = this.f74270i;
            if (z10 || !xg0.a(this.f74276o, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            IA0[] ia0Arr = this.f74271j;
            if (i11 >= 2) {
                break;
            }
            ia0Arr[i11].zzb();
            i11++;
        }
        u();
        this.f74276o = xg0;
        v();
        long jN = this.f74262a.n(xg0.f71309c, this.f74270i, this.f74264c, zArr, j10);
        int i12 = 0;
        while (true) {
            IA0[] ia0Arr2 = this.f74271j;
            if (i12 >= 2) {
                break;
            }
            ia0Arr2[i12].zzb();
            i12++;
        }
        this.f74267f = false;
        int i13 = 0;
        while (true) {
            SF0[] sf0Arr = this.f74264c;
            if (i13 >= 2) {
                return jN;
            }
            if (sf0Arr[i13] != null) {
                C8086gC.f(xg0.b(i13));
                this.f74271j[i13].zzb();
                this.f74267f = true;
            } else {
                C8086gC.f(xg0.f71309c[i13] == null);
            }
            i13++;
        }
    }

    public final long e() {
        return this.f74277p;
    }

    public final C8083gA0 g() {
        return this.f74274m;
    }

    public final C7775dG0 h() {
        return this.f74275n;
    }

    public final XG0 i() {
        return this.f74276o;
    }

    public final void l(float f10, AbstractC7307Wl abstractC7307Wl, boolean z10) throws zzib {
        this.f74266e = true;
        this.f74275n = this.f74262a.zzh();
        XG0 xg0J = j(f10, abstractC7307Wl, z10);
        C8190hA0 c8190hA0 = this.f74268g;
        long jMax = c8190hA0.f74618b;
        long j10 = c8190hA0.f74621e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(xg0J, jMax, false);
        long j11 = this.f74277p;
        C8190hA0 c8190hA02 = this.f74268g;
        this.f74277p = j11 + (c8190hA02.f74618b - jA);
        this.f74268g = c8190hA02.b(jA);
    }

    public final void m(XE0 xe0, long j10) {
        this.f74265d = true;
        this.f74262a.o(xe0, j10);
    }

    public final void q(long j10) {
        this.f74277p = j10;
    }

    public final long c() {
        if (!this.f74266e) {
            return this.f74268g.f74618b;
        }
        long jZzb = this.f74267f ? this.f74262a.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.f74268g.f74621e : jZzb;
    }

    public final long d() {
        if (this.f74266e) {
            return this.f74262a.zzc();
        }
        return 0L;
    }

    public final long f() {
        return this.f74268g.f74618b + this.f74277p;
    }

    public final XG0 j(float f10, AbstractC7307Wl abstractC7307Wl, boolean z10) throws zzib {
        XG0 xg0F = this.f74272k.f(this.f74271j, this.f74275n, this.f74268g.f74617a, abstractC7307Wl);
        for (int i10 = 0; i10 < xg0F.f71307a; i10++) {
            if (xg0F.b(i10)) {
                if (xg0F.f71309c[i10] == null) {
                    this.f74271j[i10].zzb();
                    z = false;
                }
                C8086gC.f(z);
            } else {
                C8086gC.f(xg0F.f71309c[i10] == null);
            }
        }
        for (PG0 pg0 : xg0F.f71309c) {
        }
        return xg0F;
    }

    public final void p(C8083gA0 c8083gA0) {
        if (c8083gA0 == this.f74274m) {
            return;
        }
        u();
        this.f74274m = c8083gA0;
        v();
    }

    public final void r() {
        YE0 ye0 = this.f74262a;
        if (ye0 instanceof DE0) {
            long j10 = this.f74268g.f74620d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((DE0) ye0).e(0L, j10);
        }
    }

    public final boolean s() {
        if (this.f74266e) {
            return !this.f74267f || this.f74262a.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean t() {
        if (this.f74266e) {
            return s() || c() - this.f74268g.f74618b >= -9223372036854775807L;
        }
        return false;
    }

    public C8083gA0(IA0[] ia0Arr, long j10, WG0 wg0, C7990fH0 c7990fH0, C9792wA0 c9792wA0, C8190hA0 c8190hA0, XG0 xg0, long j11) {
        this.f74271j = ia0Arr;
        this.f74277p = j10;
        this.f74272k = wg0;
        this.f74273l = c9792wA0;
        C7453aF0 c7453aF0 = c8190hA0.f74617a;
        this.f74263b = c7453aF0.f72382a;
        this.f74268g = c8190hA0;
        this.f74275n = C7775dG0.f73384d;
        this.f74276o = xg0;
        this.f74264c = new SF0[2];
        this.f74270i = new boolean[2];
        long j12 = c8190hA0.f74618b;
        long j13 = c8190hA0.f74620d;
        YE0 ye0P = c9792wA0.p(c7453aF0, c7990fH0, j12);
        this.f74262a = j13 != -9223372036854775807L ? new DE0(ye0P, true, 0L, j13) : ye0P;
    }

    private final void u() {
        if (w()) {
            int i10 = 0;
            while (true) {
                XG0 xg0 = this.f74276o;
                if (i10 < xg0.f71307a) {
                    xg0.b(i10);
                    PG0 pg0 = this.f74276o.f71309c[i10];
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private final void v() {
        if (w()) {
            int i10 = 0;
            while (true) {
                XG0 xg0 = this.f74276o;
                if (i10 < xg0.f71307a) {
                    xg0.b(i10);
                    PG0 pg0 = this.f74276o.f71309c[i10];
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void k(C7869eA0 c7869eA0) {
        C8086gC.f(w());
        this.f74262a.c(c7869eA0);
    }

    public final void n(long j10) {
        C8086gC.f(w());
        if (this.f74266e) {
            this.f74262a.b(j10 - this.f74277p);
        }
    }

    public final void o() {
        u();
        YE0 ye0 = this.f74262a;
        try {
            boolean z10 = ye0 instanceof DE0;
            C9792wA0 c9792wA0 = this.f74273l;
            if (z10) {
                c9792wA0.i(((DE0) ye0).f66193a);
            } else {
                c9792wA0.i(ye0);
            }
        } catch (RuntimeException e10) {
            C9917xL.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }
}
