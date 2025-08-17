package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class RF0 implements X0 {

    /* renamed from: A, reason: collision with root package name */
    private boolean f69813A;

    /* renamed from: B, reason: collision with root package name */
    private CD0 f69814B;

    /* renamed from: a, reason: collision with root package name */
    private final LF0 f69815a;

    /* renamed from: d, reason: collision with root package name */
    private final BD0 f69818d;

    /* renamed from: e, reason: collision with root package name */
    private final C9798wD0 f69819e;

    /* renamed from: f, reason: collision with root package name */
    private PF0 f69820f;

    /* renamed from: g, reason: collision with root package name */
    private C f69821g;

    /* renamed from: o, reason: collision with root package name */
    private int f69829o;

    /* renamed from: p, reason: collision with root package name */
    private int f69830p;

    /* renamed from: q, reason: collision with root package name */
    private int f69831q;

    /* renamed from: r, reason: collision with root package name */
    private int f69832r;

    /* renamed from: v, reason: collision with root package name */
    private boolean f69836v;

    /* renamed from: y, reason: collision with root package name */
    private C f69839y;

    /* renamed from: b, reason: collision with root package name */
    private final NF0 f69816b = new NF0();

    /* renamed from: h, reason: collision with root package name */
    private int f69822h = 1000;

    /* renamed from: i, reason: collision with root package name */
    private long[] f69823i = new long[1000];

    /* renamed from: j, reason: collision with root package name */
    private long[] f69824j = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    private long[] f69827m = new long[1000];

    /* renamed from: l, reason: collision with root package name */
    private int[] f69826l = new int[1000];

    /* renamed from: k, reason: collision with root package name */
    private int[] f69825k = new int[1000];

    /* renamed from: n, reason: collision with root package name */
    private W0[] f69828n = new W0[1000];

    /* renamed from: c, reason: collision with root package name */
    private final YF0 f69817c = new YF0(new ME() { // from class: com.google.android.gms.internal.ads.MF0
        @Override // com.google.android.gms.internal.ads.ME
        public final void zza(Object obj) {
            AD0 ad0 = ((OF0) obj).f69055b;
        }
    });

    /* renamed from: s, reason: collision with root package name */
    private long f69833s = Long.MIN_VALUE;

    /* renamed from: t, reason: collision with root package name */
    private long f69834t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    private long f69835u = Long.MIN_VALUE;

    /* renamed from: x, reason: collision with root package name */
    private boolean f69838x = true;

    /* renamed from: w, reason: collision with root package name */
    private boolean f69837w = true;

    /* renamed from: z, reason: collision with root package name */
    private boolean f69840z = true;

    private final int i(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f69827m[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f69826l[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f69822h) {
                i10 = 0;
            }
        }
        return i12;
    }

    private final int j(int i10) {
        int i11 = this.f69831q + i10;
        int i12 = this.f69822h;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private final synchronized int k(Zz0 zz0, By0 by0, boolean z10, boolean z11, NF0 nf0) {
        try {
            by0.f65632e = false;
            if (!s()) {
                if (!z11 && !this.f69836v) {
                    C c10 = this.f69839y;
                    if (c10 == null || (!z10 && c10 == this.f69821g)) {
                        return -3;
                    }
                    p(c10, zz0);
                    return -5;
                }
                by0.c(4);
                by0.f65633f = Long.MIN_VALUE;
                return -4;
            }
            C c11 = ((OF0) this.f69817c.a(this.f69830p + this.f69832r)).f69054a;
            if (!z10 && c11 == this.f69821g) {
                int iJ = j(this.f69832r);
                if (!t(iJ)) {
                    by0.f65632e = true;
                    return -3;
                }
                by0.c(this.f69826l[iJ]);
                if (this.f69832r == this.f69829o - 1 && (z11 || this.f69836v)) {
                    by0.a(536870912);
                }
                by0.f65633f = this.f69827m[iJ];
                nf0.f68848a = this.f69825k[iJ];
                nf0.f68849b = this.f69824j[iJ];
                nf0.f68850c = this.f69828n[iJ];
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
            int r10 = r7.f69829o     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto Lf
            long[] r0 = r7.f69827m     // Catch: java.lang.Throwable -> L32
            int r2 = r7.f69831q     // Catch: java.lang.Throwable -> L32
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L32
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L11
        Lf:
            r1 = r7
            goto L35
        L11:
            if (r11 == 0) goto L19
            int r11 = r7.f69832r     // Catch: java.lang.Throwable -> L1b
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
        int i10 = this.f69829o;
        if (i10 == 0) {
            return -1L;
        }
        return n(i10);
    }

    private final synchronized void o(long j10, int i10, long j11, int i11, W0 w02) {
        try {
            int i12 = this.f69829o;
            if (i12 > 0) {
                int iJ = j(i12 - 1);
                C8086gC.d(this.f69824j[iJ] + ((long) this.f69825k[iJ]) <= j11);
            }
            this.f69836v = (536870912 & i10) != 0;
            this.f69835u = Math.max(this.f69835u, j10);
            int iJ2 = j(this.f69829o);
            this.f69827m[iJ2] = j10;
            this.f69824j[iJ2] = j11;
            this.f69825k[iJ2] = i11;
            this.f69826l[iJ2] = i10;
            this.f69828n[iJ2] = w02;
            this.f69823i[iJ2] = 0;
            if (this.f69817c.f() || !((OF0) this.f69817c.b()).f69054a.equals(this.f69839y)) {
                C c10 = this.f69839y;
                if (c10 == null) {
                    throw null;
                }
                this.f69817c.c(this.f69830p + this.f69829o, new OF0(c10, this.f69818d.b(this.f69819e, c10), null));
            }
            int i13 = this.f69829o + 1;
            this.f69829o = i13;
            int i14 = this.f69822h;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                W0[] w0Arr = new W0[i15];
                int i16 = this.f69831q;
                int i17 = i14 - i16;
                System.arraycopy(this.f69824j, i16, jArr2, 0, i17);
                System.arraycopy(this.f69827m, this.f69831q, jArr3, 0, i17);
                System.arraycopy(this.f69826l, this.f69831q, iArr, 0, i17);
                System.arraycopy(this.f69825k, this.f69831q, iArr2, 0, i17);
                System.arraycopy(this.f69828n, this.f69831q, w0Arr, 0, i17);
                System.arraycopy(this.f69823i, this.f69831q, jArr, 0, i17);
                int i18 = this.f69831q;
                System.arraycopy(this.f69824j, 0, jArr2, i17, i18);
                System.arraycopy(this.f69827m, 0, jArr3, i17, i18);
                System.arraycopy(this.f69826l, 0, iArr, i17, i18);
                System.arraycopy(this.f69825k, 0, iArr2, i17, i18);
                System.arraycopy(this.f69828n, 0, w0Arr, i17, i18);
                System.arraycopy(this.f69823i, 0, jArr, i17, i18);
                this.f69824j = jArr2;
                this.f69827m = jArr3;
                this.f69826l = iArr;
                this.f69825k = iArr2;
                this.f69828n = w0Arr;
                this.f69823i = jArr;
                this.f69831q = 0;
                this.f69822h = i15;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void q() {
        if (this.f69814B != null) {
            this.f69814B = null;
            this.f69821g = null;
        }
    }

    private final synchronized void r() {
        this.f69832r = 0;
        this.f69815a.g();
    }

    private final boolean s() {
        return this.f69832r != this.f69829o;
    }

    private final synchronized boolean u(C c10) {
        try {
            this.f69838x = false;
            if (Objects.equals(c10, this.f69839y)) {
                return false;
            }
            if (this.f69817c.f() || !((OF0) this.f69817c.b()).f69054a.equals(c10)) {
                this.f69839y = c10;
            } else {
                this.f69839y = ((OF0) this.f69817c.b()).f69054a;
            }
            boolean z10 = this.f69840z;
            C c11 = this.f69839y;
            this.f69840z = z10 & C7057Pc.f(c11.f65664o, c11.f65660k);
            this.f69813A = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long A() {
        return this.f69835u;
    }

    public final synchronized C B() {
        if (this.f69838x) {
            return null;
        }
        return this.f69839y;
    }

    public final void G() {
        H(true);
        q();
    }

    public final void I(long j10) {
        this.f69833s = j10;
    }

    public final void J(PF0 pf0) {
        this.f69820f = pf0;
    }

    public final synchronized void K(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            try {
                if (this.f69832r + i10 <= this.f69829o) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C8086gC.d(z10);
        this.f69832r += i10;
    }

    public final synchronized boolean L() {
        return this.f69836v;
    }

    public final synchronized boolean M(boolean z10) {
        boolean z11 = true;
        if (s()) {
            if (((OF0) this.f69817c.a(this.f69830p + this.f69832r)).f69054a != this.f69821g) {
                return true;
            }
            return t(j(this.f69832r));
        }
        if (!z10 && !this.f69836v) {
            C c10 = this.f69839y;
            if (c10 == null) {
                z11 = false;
            } else if (c10 == this.f69821g) {
                return false;
            }
        }
        return z11;
    }

    public final synchronized boolean N(int i10) {
        r();
        int i11 = this.f69830p;
        if (i10 >= i11 && i10 <= this.f69829o + i11) {
            this.f69833s = Long.MIN_VALUE;
            this.f69832r = i10 - i11;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final /* synthetic */ int b(InterfaceC9685vA0 interfaceC9685vA0, int i10, boolean z10) {
        return V0.a(this, interfaceC9685vA0, i10, z10);
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
                int i11 = this.f69832r;
                int iJ = j(i11);
                if (s() && j10 >= this.f69827m[iJ]) {
                    if (j10 > this.f69835u) {
                        if (z10) {
                            z10 = true;
                        }
                    }
                    if (this.f69840z) {
                        try {
                            int i12 = this.f69829o - i11;
                            int i13 = 0;
                            while (true) {
                                if (i13 < i12) {
                                    if (this.f69827m[iJ] >= j10) {
                                        rf0 = this;
                                        j11 = j10;
                                        i10 = i13;
                                        break;
                                    }
                                    iJ++;
                                    if (iJ == this.f69822h) {
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
                        i10 = rf0.i(iJ, this.f69829o - i11, j11, true);
                    }
                    if (i10 != -1) {
                        rf0.f69833s = j11;
                        rf0.f69832r += i10;
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
        return this.f69830p;
    }

    public final int w() {
        return this.f69830p + this.f69832r;
    }

    public final synchronized int x(long j10, boolean z10) {
        Throwable th2;
        try {
            try {
                int i10 = this.f69832r;
                int iJ = j(i10);
                if (!s() || j10 < this.f69827m[iJ]) {
                    return 0;
                }
                if (j10 <= this.f69835u || !z10) {
                    int i11 = i(iJ, this.f69829o - i10, j10, true);
                    if (i11 == -1) {
                        return 0;
                    }
                    return i11;
                }
                try {
                    return this.f69829o - i10;
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
        return this.f69830p + this.f69829o;
    }

    private final long n(int i10) {
        long j10 = this.f69834t;
        long jMax = Long.MIN_VALUE;
        if (i10 != 0) {
            int iJ = j(i10 - 1);
            for (int i11 = 0; i11 < i10; i11++) {
                jMax = Math.max(jMax, this.f69827m[iJ]);
                if ((this.f69826l[iJ] & 1) != 0) {
                    break;
                }
                iJ--;
                if (iJ == -1) {
                    iJ = this.f69822h - 1;
                }
            }
        }
        this.f69834t = Math.max(j10, jMax);
        this.f69829o -= i10;
        int i12 = this.f69830p + i10;
        this.f69830p = i12;
        int i13 = this.f69831q + i10;
        this.f69831q = i13;
        int i14 = this.f69822h;
        if (i13 >= i14) {
            this.f69831q = i13 - i14;
        }
        int i15 = this.f69832r - i10;
        this.f69832r = i15;
        if (i15 < 0) {
            this.f69832r = 0;
        }
        this.f69817c.e(i12);
        if (this.f69829o != 0) {
            return this.f69824j[this.f69831q];
        }
        int i16 = this.f69831q;
        if (i16 == 0) {
            i16 = this.f69822h;
        }
        return this.f69824j[i16 - 1] + this.f69825k[r12];
    }

    private final void p(C c10, Zz0 zz0) {
        C c11 = this.f69821g;
        TE0 te0 = c11 == null ? null : c11.f65668s;
        this.f69821g = c10;
        TE0 te02 = c10.f65668s;
        zz0.f72318a = c10.c(this.f69818d.a(c10));
        zz0.f72319b = this.f69814B;
        if (c11 == null || !Objects.equals(te0, te02)) {
            CD0 cd0C = this.f69818d.c(this.f69819e, c10);
            this.f69814B = cd0C;
            zz0.f72319b = cd0C;
        }
    }

    private final boolean t(int i10) {
        if (this.f69814B == null) {
            return true;
        }
        int i11 = this.f69826l[i10];
        return false;
    }

    public final void C(long j10, boolean z10, boolean z11) {
        this.f69815a.c(l(j10, false, z11));
    }

    public final void D() {
        this.f69815a.c(m());
    }

    public final void E() throws IOException {
        CD0 cd0 = this.f69814B;
        if (cd0 != null) {
            throw cd0.a();
        }
    }

    public final void H(boolean z10) {
        this.f69815a.f();
        this.f69829o = 0;
        this.f69830p = 0;
        this.f69831q = 0;
        this.f69832r = 0;
        this.f69837w = true;
        this.f69833s = Long.MIN_VALUE;
        this.f69834t = Long.MIN_VALUE;
        this.f69835u = Long.MIN_VALUE;
        this.f69836v = false;
        this.f69817c.d();
        if (z10) {
            this.f69839y = null;
            this.f69838x = true;
            this.f69840z = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final void a(long j10, int i10, int i11, int i12, W0 w02) {
        if (this.f69837w) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.f69837w = false;
            }
        }
        if (this.f69840z) {
            if (j10 < this.f69833s) {
                return;
            }
            if ((i10 & 1) == 0) {
                if (!this.f69813A) {
                    C9917xL.f("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f69839y)));
                    this.f69813A = true;
                }
                i10 |= 1;
            }
        }
        o(j10, i10, (this.f69815a.b() - i11) - i12, i11, w02);
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final int f(InterfaceC9685vA0 interfaceC9685vA0, int i10, boolean z10, int i11) throws IOException {
        return this.f69815a.a(interfaceC9685vA0, i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final void g(GQ gq2, int i10, int i11) {
        this.f69815a.h(gq2, i10);
    }

    public final int z(Zz0 zz0, By0 by0, int i10, boolean z10) {
        int iK = k(zz0, by0, (i10 & 2) != 0, z10, this.f69816b);
        if (iK != -4) {
            return iK;
        }
        if (!by0.f()) {
            int i11 = i10 & 1;
            if ((i10 & 4) == 0) {
                if (i11 != 0) {
                    this.f69815a.d(by0, this.f69816b);
                    return -4;
                }
                this.f69815a.e(by0, this.f69816b);
            } else if (i11 != 0) {
                return -4;
            }
            this.f69832r++;
        }
        return -4;
    }

    protected RF0(C7990fH0 c7990fH0, BD0 bd0, C9798wD0 c9798wD0) {
        this.f69818d = bd0;
        this.f69819e = c9798wD0;
        this.f69815a = new LF0(c7990fH0);
    }

    public final void F() {
        D();
        q();
    }

    @Override // com.google.android.gms.internal.ads.X0
    public final void d(C c10) {
        boolean zU = u(c10);
        PF0 pf0 = this.f69820f;
        if (pf0 != null && zU) {
            pf0.j(c10);
        }
    }
}
