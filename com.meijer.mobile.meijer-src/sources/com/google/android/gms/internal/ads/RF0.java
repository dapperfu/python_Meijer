package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class RF0 implements X0 {

    /* renamed from: A, reason: collision with root package name */
    private boolean f70653A;

    /* renamed from: B, reason: collision with root package name */
    private CD0 f70654B;

    /* renamed from: a, reason: collision with root package name */
    private final LF0 f70655a;

    /* renamed from: d, reason: collision with root package name */
    private final BD0 f70658d;

    /* renamed from: e, reason: collision with root package name */
    private final C9923wD0 f70659e;

    /* renamed from: f, reason: collision with root package name */
    private PF0 f70660f;

    /* renamed from: g, reason: collision with root package name */
    private C f70661g;

    /* renamed from: o, reason: collision with root package name */
    private int f70669o;

    /* renamed from: p, reason: collision with root package name */
    private int f70670p;

    /* renamed from: q, reason: collision with root package name */
    private int f70671q;

    /* renamed from: r, reason: collision with root package name */
    private int f70672r;

    /* renamed from: v, reason: collision with root package name */
    private boolean f70676v;

    /* renamed from: y, reason: collision with root package name */
    private C f70679y;

    /* renamed from: b, reason: collision with root package name */
    private final NF0 f70656b = new NF0();

    /* renamed from: h, reason: collision with root package name */
    private int f70662h = 1000;

    /* renamed from: i, reason: collision with root package name */
    private long[] f70663i = new long[1000];

    /* renamed from: j, reason: collision with root package name */
    private long[] f70664j = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    private long[] f70667m = new long[1000];

    /* renamed from: l, reason: collision with root package name */
    private int[] f70666l = new int[1000];

    /* renamed from: k, reason: collision with root package name */
    private int[] f70665k = new int[1000];

    /* renamed from: n, reason: collision with root package name */
    private W0[] f70668n = new W0[1000];

    /* renamed from: c, reason: collision with root package name */
    private final YF0 f70657c = new YF0(new ME() { // from class: com.google.android.gms.internal.ads.MF0
        @Override // com.google.android.gms.internal.ads.ME
        public final void zza(Object obj) {
            AD0 ad0 = ((OF0) obj).f69895b;
        }
    });

    /* renamed from: s, reason: collision with root package name */
    private long f70673s = Long.MIN_VALUE;

    /* renamed from: t, reason: collision with root package name */
    private long f70674t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    private long f70675u = Long.MIN_VALUE;

    /* renamed from: x, reason: collision with root package name */
    private boolean f70678x = true;

    /* renamed from: w, reason: collision with root package name */
    private boolean f70677w = true;

    /* renamed from: z, reason: collision with root package name */
    private boolean f70680z = true;

    private final int i(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f70667m[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f70666l[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f70662h) {
                i10 = 0;
            }
        }
        return i12;
    }

    private final int j(int i10) {
        int i11 = this.f70671q + i10;
        int i12 = this.f70662h;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private final synchronized int k(Zz0 zz0, By0 by0, boolean z10, boolean z11, NF0 nf0) {
        try {
            by0.f66472e = false;
            if (!s()) {
                if (!z11 && !this.f70676v) {
                    C c10 = this.f70679y;
                    if (c10 == null || (!z10 && c10 == this.f70661g)) {
                        return -3;
                    }
                    p(c10, zz0);
                    return -5;
                }
                by0.c(4);
                by0.f66473f = Long.MIN_VALUE;
                return -4;
            }
            C c11 = ((OF0) this.f70657c.a(this.f70670p + this.f70672r)).f69894a;
            if (!z10 && c11 == this.f70661g) {
                int iJ = j(this.f70672r);
                if (!t(iJ)) {
                    by0.f66472e = true;
                    return -3;
                }
                by0.c(this.f70666l[iJ]);
                if (this.f70672r == this.f70669o - 1 && (z11 || this.f70676v)) {
                    by0.a(536870912);
                }
                by0.f66473f = this.f70667m[iJ];
                nf0.f69688a = this.f70665k[iJ];
                nf0.f69689b = this.f70664j[iJ];
                nf0.f69690c = this.f70668n[iJ];
                return -4;
            }
            p(c11, zz0);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized long l(long r8, boolean r10, boolean r11) throws java.lang.Throwable {
        /*
            r7 = this;
            monitor-enter(r7)
            int r10 = r7.f70669o     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto Lf
            long[] r0 = r7.f70667m     // Catch: java.lang.Throwable -> L32
            int r2 = r7.f70671q     // Catch: java.lang.Throwable -> L32
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L32
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L11
        Lf:
            r1 = r7
            goto L35
        L11:
            if (r11 == 0) goto L19
            int r11 = r7.f70672r     // Catch: java.lang.Throwable -> L1b
            if (r11 == r10) goto L19
            int r10 = r11 + 1
        L19:
            r3 = r10
            goto L1f
        L1b:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L39
        L1f:
            r6 = 0
            r1 = r7
            r4 = r8
            int r8 = r1.i(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L2f
            r9 = -1
            if (r8 == r9) goto L35
            long r8 = r7.n(r8)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r7)
            return r8
        L2f:
            r0 = move-exception
        L30:
            r8 = r0
            goto L39
        L32:
            r0 = move-exception
            r1 = r7
            goto L30
        L35:
            monitor-exit(r7)
            r8 = -1
            return r8
        L39:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.RF0.l(long, boolean, boolean):long");
    }

    private final synchronized long m() {
        int i10 = this.f70669o;
        if (i10 == 0) {
            return -1L;
        }
        return n(i10);
    }

    private final synchronized void o(long j10, int i10, long j11, int i11, W0 w02) {
        try {
            int i12 = this.f70669o;
            if (i12 > 0) {
                int iJ = j(i12 - 1);
                C8211gC.d(this.f70664j[iJ] + ((long) this.f70665k[iJ]) <= j11);
            }
            this.f70676v = (536870912 & i10) != 0;
            this.f70675u = Math.max(this.f70675u, j10);
            int iJ2 = j(this.f70669o);
            this.f70667m[iJ2] = j10;
            this.f70664j[iJ2] = j11;
            this.f70665k[iJ2] = i11;
            this.f70666l[iJ2] = i10;
            this.f70668n[iJ2] = w02;
            this.f70663i[iJ2] = 0;
            if (this.f70657c.f() || !((OF0) this.f70657c.b()).f69894a.equals(this.f70679y)) {
                C c10 = this.f70679y;
                if (c10 == null) {
                    throw null;
                }
                this.f70657c.c(this.f70670p + this.f70669o, new OF0(c10, this.f70658d.b(this.f70659e, c10), null));
            }
            int i13 = this.f70669o + 1;
            this.f70669o = i13;
            int i14 = this.f70662h;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                W0[] w0Arr = new W0[i15];
                int i16 = this.f70671q;
                int i17 = i14 - i16;
                System.arraycopy(this.f70664j, i16, jArr2, 0, i17);
                System.arraycopy(this.f70667m, this.f70671q, jArr3, 0, i17);
                System.arraycopy(this.f70666l, this.f70671q, iArr, 0, i17);
                System.arraycopy(this.f70665k, this.f70671q, iArr2, 0, i17);
                System.arraycopy(this.f70668n, this.f70671q, w0Arr, 0, i17);
                System.arraycopy(this.f70663i, this.f70671q, jArr, 0, i17);
                int i18 = this.f70671q;
                System.arraycopy(this.f70664j, 0, jArr2, i17, i18);
                System.arraycopy(this.f70667m, 0, jArr3, i17, i18);
                System.arraycopy(this.f70666l, 0, iArr, i17, i18);
                System.arraycopy(this.f70665k, 0, iArr2, i17, i18);
                System.arraycopy(this.f70668n, 0, w0Arr, i17, i18);
                System.arraycopy(this.f70663i, 0, jArr, i17, i18);
                this.f70664j = jArr2;
                this.f70667m = jArr3;
                this.f70666l = iArr;
                this.f70665k = iArr2;
                this.f70668n = w0Arr;
                this.f70663i = jArr;
                this.f70671q = 0;
                this.f70662h = i15;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void q() {
        if (this.f70654B != null) {
            this.f70654B = null;
            this.f70661g = null;
        }
    }

    private final synchronized void r() {
        this.f70672r = 0;
        this.f70655a.g();
    }

    private final boolean s() {
        return this.f70672r != this.f70669o;
    }

    private final synchronized boolean u(C c10) {
        try {
            this.f70678x = false;
            if (Objects.equals(c10, this.f70679y)) {
                return false;
            }
            if (this.f70657c.f() || !((OF0) this.f70657c.b()).f69894a.equals(c10)) {
                this.f70679y = c10;
            } else {
                this.f70679y = ((OF0) this.f70657c.b()).f69894a;
            }
            boolean z10 = this.f70680z;
            C c11 = this.f70679y;
            this.f70680z = z10 & C7182Pc.f(c11.f66504o, c11.f66500k);
            this.f70653A = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long A() {
        return this.f70675u;
    }

    public final synchronized C B() {
        if (this.f70678x) {
            return null;
        }
        return this.f70679y;
    }

    public final void G() {
        H(true);
        q();
    }

    public final void I(long j10) {
        this.f70673s = j10;
    }

    public final void J(PF0 pf0) {
        this.f70660f = pf0;
    }

    public final synchronized void K(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            try {
                if (this.f70672r + i10 <= this.f70669o) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C8211gC.d(z10);
        this.f70672r += i10;
    }

    public final synchronized boolean L() {
        return this.f70676v;
    }

    public final synchronized boolean M(boolean z10) {
        boolean z11 = true;
        if (s()) {
            if (((OF0) this.f70657c.a(this.f70670p + this.f70672r)).f69894a != this.f70661g) {
                return true;
            }
            return t(j(this.f70672r));
        }
        if (!z10 && !this.f70676v) {
            C c10 = this.f70679y;
            if (c10 == null) {
                z11 = false;
            } else if (c10 == this.f70661g) {
                return false;
            }
        }
        return z11;
    }

    public final synchronized boolean N(int i10) {
        r();
        int i11 = this.f70670p;
        if (i10 >= i11 && i10 <= this.f70669o + i11) {
            this.f70673s = Long.MIN_VALUE;
            this.f70672r = i10 - i11;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final /* synthetic */ int b(InterfaceC9810vA0 interfaceC9810vA0, int i10, boolean z10) {
        return V0.a(this, interfaceC9810vA0, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final /* synthetic */ void c(GQ gq2, int i10) {
        V0.b(this, gq2, i10);
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final /* synthetic */ void e(long j10) {
    }

    public final synchronized boolean h(long j10, boolean z10) {
        Throwable th2;
        RF0 rf0;
        long j11;
        int i10;
        try {
            try {
                r();
                int i11 = this.f70672r;
                int iJ = j(i11);
                if (s() && j10 >= this.f70667m[iJ]) {
                    if (j10 > this.f70675u) {
                        if (z10) {
                            z10 = true;
                        }
                    }
                    if (this.f70680z) {
                        try {
                            int i12 = this.f70669o - i11;
                            int i13 = 0;
                            while (true) {
                                if (i13 < i12) {
                                    if (this.f70667m[iJ] >= j10) {
                                        rf0 = this;
                                        j11 = j10;
                                        i10 = i13;
                                        break;
                                    }
                                    iJ++;
                                    if (iJ == this.f70662h) {
                                        iJ = 0;
                                    }
                                    i13++;
                                } else if (z10) {
                                    j11 = j10;
                                    i10 = i12;
                                    rf0 = this;
                                } else {
                                    rf0 = this;
                                    j11 = j10;
                                    i10 = -1;
                                }
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    } else {
                        rf0 = this;
                        j11 = j10;
                        i10 = rf0.i(iJ, this.f70669o - i11, j11, true);
                    }
                    if (i10 != -1) {
                        rf0.f70673s = j11;
                        rf0.f70672r += i10;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final int v() {
        return this.f70670p;
    }

    public final int w() {
        return this.f70670p + this.f70672r;
    }

    public final synchronized int x(long j10, boolean z10) {
        Throwable th2;
        try {
            try {
                int i10 = this.f70672r;
                int iJ = j(i10);
                if (!s() || j10 < this.f70667m[iJ]) {
                    return 0;
                }
                if (j10 <= this.f70675u || !z10) {
                    int i11 = i(iJ, this.f70669o - i10, j10, true);
                    if (i11 == -1) {
                        return 0;
                    }
                    return i11;
                }
                try {
                    return this.f70669o - i10;
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public final int y() {
        return this.f70670p + this.f70669o;
    }

    private final long n(int i10) {
        long j10 = this.f70674t;
        long jMax = Long.MIN_VALUE;
        if (i10 != 0) {
            int iJ = j(i10 - 1);
            for (int i11 = 0; i11 < i10; i11++) {
                jMax = Math.max(jMax, this.f70667m[iJ]);
                if ((this.f70666l[iJ] & 1) != 0) {
                    break;
                }
                iJ--;
                if (iJ == -1) {
                    iJ = this.f70662h - 1;
                }
            }
        }
        this.f70674t = Math.max(j10, jMax);
        this.f70669o -= i10;
        int i12 = this.f70670p + i10;
        this.f70670p = i12;
        int i13 = this.f70671q + i10;
        this.f70671q = i13;
        int i14 = this.f70662h;
        if (i13 >= i14) {
            this.f70671q = i13 - i14;
        }
        int i15 = this.f70672r - i10;
        this.f70672r = i15;
        if (i15 < 0) {
            this.f70672r = 0;
        }
        this.f70657c.e(i12);
        if (this.f70669o != 0) {
            return this.f70664j[this.f70671q];
        }
        int i16 = this.f70671q;
        if (i16 == 0) {
            i16 = this.f70662h;
        }
        return this.f70664j[i16 - 1] + this.f70665k[r12];
    }

    private final void p(C c10, Zz0 zz0) {
        C c11 = this.f70661g;
        TE0 te0 = c11 == null ? null : c11.f66508s;
        this.f70661g = c10;
        TE0 te02 = c10.f66508s;
        zz0.f73158a = c10.c(this.f70658d.a(c10));
        zz0.f73159b = this.f70654B;
        if (c11 == null || !Objects.equals(te0, te02)) {
            CD0 cd0C = this.f70658d.c(this.f70659e, c10);
            this.f70654B = cd0C;
            zz0.f73159b = cd0C;
        }
    }

    private final boolean t(int i10) {
        if (this.f70654B == null) {
            return true;
        }
        int i11 = this.f70666l[i10];
        return false;
    }

    public final void C(long j10, boolean z10, boolean z11) {
        this.f70655a.c(l(j10, false, z11));
    }

    public final void D() {
        this.f70655a.c(m());
    }

    public final void E() throws IOException {
        CD0 cd0 = this.f70654B;
        if (cd0 != null) {
            throw cd0.a();
        }
    }

    public final void H(boolean z10) {
        this.f70655a.f();
        this.f70669o = 0;
        this.f70670p = 0;
        this.f70671q = 0;
        this.f70672r = 0;
        this.f70677w = true;
        this.f70673s = Long.MIN_VALUE;
        this.f70674t = Long.MIN_VALUE;
        this.f70675u = Long.MIN_VALUE;
        this.f70676v = false;
        this.f70657c.d();
        if (z10) {
            this.f70679y = null;
            this.f70678x = true;
            this.f70680z = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final void a(long j10, int i10, int i11, int i12, W0 w02) {
        if (this.f70677w) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.f70677w = false;
            }
        }
        if (this.f70680z) {
            if (j10 < this.f70673s) {
                return;
            }
            if ((i10 & 1) == 0) {
                if (!this.f70653A) {
                    C10042xL.f("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f70679y)));
                    this.f70653A = true;
                }
                i10 |= 1;
            }
        }
        o(j10, i10, (this.f70655a.b() - i11) - i12, i11, w02);
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final int f(InterfaceC9810vA0 interfaceC9810vA0, int i10, boolean z10, int i11) throws IOException {
        return this.f70655a.a(interfaceC9810vA0, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final void g(GQ gq2, int i10, int i11) {
        this.f70655a.h(gq2, i10);
    }

    public final int z(Zz0 zz0, By0 by0, int i10, boolean z10) {
        int iK = k(zz0, by0, (i10 & 2) != 0, z10, this.f70656b);
        if (iK != -4) {
            return iK;
        }
        if (!by0.f()) {
            int i11 = i10 & 1;
            if ((i10 & 4) == 0) {
                if (i11 != 0) {
                    this.f70655a.d(by0, this.f70656b);
                    return -4;
                }
                this.f70655a.e(by0, this.f70656b);
            } else if (i11 != 0) {
                return -4;
            }
            this.f70672r++;
        }
        return -4;
    }

    protected RF0(C8115fH0 c8115fH0, BD0 bd0, C9923wD0 c9923wD0) {
        this.f70658d = bd0;
        this.f70659e = c9923wD0;
        this.f70655a = new LF0(c8115fH0);
    }

    public final void F() {
        D();
        q();
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final void d(C c10) {
        boolean zU = u(c10);
        PF0 pf0 = this.f70660f;
        if (pf0 != null && zU) {
            pf0.j(c10);
        }
    }
}
