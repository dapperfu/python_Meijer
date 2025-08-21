package e4;

import d3.C13599a;
import e4.L;
import java.util.Arrays;
import x3.O;

/* renamed from: e4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13771n implements InterfaceC13770m {

    /* renamed from: r, reason: collision with root package name */
    private static final double[] f129718r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f129719a;

    /* renamed from: b, reason: collision with root package name */
    private O f129720b;

    /* renamed from: c, reason: collision with root package name */
    private final N f129721c;

    /* renamed from: d, reason: collision with root package name */
    private final String f129722d;

    /* renamed from: e, reason: collision with root package name */
    private final d3.D f129723e;

    /* renamed from: f, reason: collision with root package name */
    private final w f129724f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f129725g;

    /* renamed from: h, reason: collision with root package name */
    private final a f129726h;

    /* renamed from: i, reason: collision with root package name */
    private long f129727i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f129728j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f129729k;

    /* renamed from: l, reason: collision with root package name */
    private long f129730l;

    /* renamed from: m, reason: collision with root package name */
    private long f129731m;

    /* renamed from: n, reason: collision with root package name */
    private long f129732n;

    /* renamed from: o, reason: collision with root package name */
    private long f129733o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f129734p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f129735q;

    /* renamed from: e4.n$a */
    private static final class a {

        /* renamed from: e, reason: collision with root package name */
        private static final byte[] f129736e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f129737a;

        /* renamed from: b, reason: collision with root package name */
        public int f129738b;

        /* renamed from: c, reason: collision with root package name */
        public int f129739c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f129740d;

        public void c() {
            this.f129737a = false;
            this.f129738b = 0;
            this.f129739c = 0;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f129737a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f129740d;
                int length = bArr2.length;
                int i13 = this.f129738b;
                if (length < i13 + i12) {
                    this.f129740d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f129740d, this.f129738b, i12);
                this.f129738b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f129737a) {
                int i12 = this.f129738b - i11;
                this.f129738b = i12;
                if (this.f129739c != 0 || i10 != 181) {
                    this.f129737a = false;
                    return true;
                }
                this.f129739c = i12;
            } else if (i10 == 179) {
                this.f129737a = true;
            }
            byte[] bArr = f129736e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public a(int i10) {
            this.f129740d = new byte[i10];
        }
    }

    public C13771n(String str) {
        this(null, str);
    }

    C13771n(N n10, String str) {
        this.f129721c = n10;
        this.f129722d = str;
        this.f129725g = new boolean[4];
        this.f129726h = new a(128);
        if (n10 != null) {
            this.f129724f = new w(178, 128);
            this.f129723e = new d3.D();
        } else {
            this.f129724f = null;
            this.f129723e = null;
        }
        this.f129731m = -9223372036854775807L;
        this.f129733o = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.util.Pair<a3.t, java.lang.Long> b(e4.C13771n.a r8, java.lang.String r9, java.lang.String r10) {
        /*
            byte[] r0 = r8.f129740d
            int r1 = r8.f129738b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3e
            r7 = 3
            if (r6 == r7) goto L38
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
        L35:
            float r6 = (float) r6
            float r1 = r1 / r6
            goto L44
        L38:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L35
        L3e:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
            goto L35
        L44:
            a3.t$b r6 = new a3.t$b
            r6.<init>()
            a3.t$b r9 = r6.f0(r9)
            a3.t$b r9 = r9.U(r10)
            java.lang.String r10 = "video/mpeg2"
            a3.t$b r9 = r9.u0(r10)
            a3.t$b r9 = r9.z0(r2)
            a3.t$b r9 = r9.d0(r4)
            a3.t$b r9 = r9.q0(r1)
            java.util.List r10 = java.util.Collections.singletonList(r0)
            a3.t$b r9 = r9.g0(r10)
            a3.t r9 = r9.N()
            r10 = r0[r5]
            r10 = r10 & 15
            int r10 = r10 + (-1)
            if (r10 < 0) goto L9c
            double[] r1 = e4.C13771n.f129718r
            int r2 = r1.length
            if (r10 >= r2) goto L9c
            r4 = r1[r10]
            int r8 = r8.f129739c
            int r8 = r8 + 9
            r8 = r0[r8]
            r10 = r8 & 96
            int r10 = r10 >> r3
            r8 = r8 & 31
            if (r10 == r8) goto L94
            double r0 = (double) r10
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            int r8 = r8 + 1
            double r2 = (double) r8
            double r0 = r0 / r2
            double r4 = r4 * r0
        L94:
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r4
            long r0 = (long) r0
            goto L9e
        L9c:
            r0 = 0
        L9e:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C13771n.b(e4.n$a, java.lang.String, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0144  */
    @Override // e4.InterfaceC13770m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(d3.D r20) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C13771n.a(d3.D):void");
    }

    @Override // e4.InterfaceC13770m
    public void c() {
        e3.f.c(this.f129725g);
        this.f129726h.c();
        w wVar = this.f129724f;
        if (wVar != null) {
            wVar.d();
        }
        this.f129727i = 0L;
        this.f129728j = false;
        this.f129731m = -9223372036854775807L;
        this.f129733o = -9223372036854775807L;
    }

    @Override // e4.InterfaceC13770m
    public void d(boolean z10) {
        C13599a.i(this.f129720b);
        if (z10) {
            boolean z11 = this.f129734p;
            this.f129720b.c(this.f129733o, z11 ? 1 : 0, (int) (this.f129727i - this.f129732n), 0, null);
        }
    }

    @Override // e4.InterfaceC13770m
    public void e(long j10, int i10) {
        this.f129731m = j10;
    }

    @Override // e4.InterfaceC13770m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f129719a = dVar.b();
        this.f129720b = rVar.t(dVar.c(), 2);
        N n10 = this.f129721c;
        if (n10 != null) {
            n10.b(rVar, dVar);
        }
    }
}
