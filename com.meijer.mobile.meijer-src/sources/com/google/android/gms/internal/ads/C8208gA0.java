package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8208gA0 {

    /* renamed from: a, reason: collision with root package name */
    public final YE0 f75102a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f75103b;

    /* renamed from: c, reason: collision with root package name */
    public final SF0[] f75104c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f75105d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f75106e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f75107f;

    /* renamed from: g, reason: collision with root package name */
    public C8315hA0 f75108g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f75109h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean[] f75110i;

    /* renamed from: j, reason: collision with root package name */
    private final IA0[] f75111j;

    /* renamed from: k, reason: collision with root package name */
    private final WG0 f75112k;

    /* renamed from: l, reason: collision with root package name */
    private final C9917wA0 f75113l;

    /* renamed from: m, reason: collision with root package name */
    private C8208gA0 f75114m;

    /* renamed from: n, reason: collision with root package name */
    private C7900dG0 f75115n;

    /* renamed from: o, reason: collision with root package name */
    private XG0 f75116o;

    /* renamed from: p, reason: collision with root package name */
    private long f75117p;

    private final boolean w() {
        return this.f75114m == null;
    }

    public final long a(XG0 xg0, long j10, boolean z10) {
        return b(xg0, j10, false, new boolean[2]);
    }

    public final long b(XG0 xg0, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= xg0.f72147a) {
                break;
            }
            boolean[] zArr2 = this.f75110i;
            if (z10 || !xg0.a(this.f75116o, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            IA0[] ia0Arr = this.f75111j;
            if (i11 >= 2) {
                break;
            }
            ia0Arr[i11].zzb();
            i11++;
        }
        u();
        this.f75116o = xg0;
        v();
        long jN = this.f75102a.n(xg0.f72149c, this.f75110i, this.f75104c, zArr, j10);
        int i12 = 0;
        while (true) {
            IA0[] ia0Arr2 = this.f75111j;
            if (i12 >= 2) {
                break;
            }
            ia0Arr2[i12].zzb();
            i12++;
        }
        this.f75107f = false;
        int i13 = 0;
        while (true) {
            SF0[] sf0Arr = this.f75104c;
            if (i13 >= 2) {
                return jN;
            }
            if (sf0Arr[i13] != null) {
                C8211gC.f(xg0.b(i13));
                this.f75111j[i13].zzb();
                this.f75107f = true;
            } else {
                C8211gC.f(xg0.f72149c[i13] == null);
            }
            i13++;
        }
    }

    public final long e() {
        return this.f75117p;
    }

    public final C8208gA0 g() {
        return this.f75114m;
    }

    public final C7900dG0 h() {
        return this.f75115n;
    }

    public final XG0 i() {
        return this.f75116o;
    }

    public final void l(float f10, AbstractC7432Wl abstractC7432Wl, boolean z10) throws zzib {
        this.f75106e = true;
        this.f75115n = this.f75102a.zzh();
        XG0 xg0J = j(f10, abstractC7432Wl, z10);
        C8315hA0 c8315hA0 = this.f75108g;
        long jMax = c8315hA0.f75458b;
        long j10 = c8315hA0.f75461e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(xg0J, jMax, false);
        long j11 = this.f75117p;
        C8315hA0 c8315hA02 = this.f75108g;
        this.f75117p = j11 + (c8315hA02.f75458b - jA);
        this.f75108g = c8315hA02.b(jA);
    }

    public final void m(XE0 xe0, long j10) {
        this.f75105d = true;
        this.f75102a.o(xe0, j10);
    }

    public final void q(long j10) {
        this.f75117p = j10;
    }

    public final long c() {
        if (!this.f75106e) {
            return this.f75108g.f75458b;
        }
        long jZzb = this.f75107f ? this.f75102a.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.f75108g.f75461e : jZzb;
    }

    public final long d() {
        if (this.f75106e) {
            return this.f75102a.zzc();
        }
        return 0L;
    }

    public final long f() {
        return this.f75108g.f75458b + this.f75117p;
    }

    public final XG0 j(float f10, AbstractC7432Wl abstractC7432Wl, boolean z10) throws zzib {
        XG0 xg0F = this.f75112k.f(this.f75111j, this.f75115n, this.f75108g.f75457a, abstractC7432Wl);
        for (int i10 = 0; i10 < xg0F.f72147a; i10++) {
            if (xg0F.b(i10)) {
                if (xg0F.f72149c[i10] == null) {
                    this.f75111j[i10].zzb();
                    z = false;
                }
                C8211gC.f(z);
            } else {
                C8211gC.f(xg0F.f72149c[i10] == null);
            }
        }
        for (PG0 pg0 : xg0F.f72149c) {
        }
        return xg0F;
    }

    public final void p(C8208gA0 c8208gA0) {
        if (c8208gA0 == this.f75114m) {
            return;
        }
        u();
        this.f75114m = c8208gA0;
        v();
    }

    public final void r() {
        YE0 ye0 = this.f75102a;
        if (ye0 instanceof DE0) {
            long j10 = this.f75108g.f75460d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((DE0) ye0).e(0L, j10);
        }
    }

    public final boolean s() {
        if (this.f75106e) {
            return !this.f75107f || this.f75102a.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean t() {
        if (this.f75106e) {
            return s() || c() - this.f75108g.f75458b >= -9223372036854775807L;
        }
        return false;
    }

    public C8208gA0(IA0[] ia0Arr, long j10, WG0 wg0, C8115fH0 c8115fH0, C9917wA0 c9917wA0, C8315hA0 c8315hA0, XG0 xg0, long j11) {
        this.f75111j = ia0Arr;
        this.f75117p = j10;
        this.f75112k = wg0;
        this.f75113l = c9917wA0;
        C7578aF0 c7578aF0 = c8315hA0.f75457a;
        this.f75103b = c7578aF0.f73222a;
        this.f75108g = c8315hA0;
        this.f75115n = C7900dG0.f74224d;
        this.f75116o = xg0;
        this.f75104c = new SF0[2];
        this.f75110i = new boolean[2];
        long j12 = c8315hA0.f75458b;
        long j13 = c8315hA0.f75460d;
        YE0 ye0P = c9917wA0.p(c7578aF0, c8115fH0, j12);
        this.f75102a = j13 != -9223372036854775807L ? new DE0(ye0P, true, 0L, j13) : ye0P;
    }

    private final void u() {
        if (w()) {
            int i10 = 0;
            while (true) {
                XG0 xg0 = this.f75116o;
                if (i10 < xg0.f72147a) {
                    xg0.b(i10);
                    PG0 pg0 = this.f75116o.f72149c[i10];
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
                XG0 xg0 = this.f75116o;
                if (i10 < xg0.f72147a) {
                    xg0.b(i10);
                    PG0 pg0 = this.f75116o.f72149c[i10];
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void k(C7994eA0 c7994eA0) {
        C8211gC.f(w());
        this.f75102a.c(c7994eA0);
    }

    public final void n(long j10) {
        C8211gC.f(w());
        if (this.f75106e) {
            this.f75102a.b(j10 - this.f75117p);
        }
    }

    public final void o() {
        u();
        YE0 ye0 = this.f75102a;
        try {
            boolean z10 = ye0 instanceof DE0;
            C9917wA0 c9917wA0 = this.f75113l;
            if (z10) {
                c9917wA0.i(((DE0) ye0).f67033a);
            } else {
                c9917wA0.i(ye0);
            }
        } catch (RuntimeException e10) {
            C10042xL.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }
}
