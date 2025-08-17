package e4;

import d3.C13466a;
import e4.L;
import java.util.Arrays;
import x3.O;

/* renamed from: e4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13622n implements InterfaceC13621m {

    /* renamed from: r, reason: collision with root package name */
    private static final double[] f128382r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f128383a;

    /* renamed from: b, reason: collision with root package name */
    private O f128384b;

    /* renamed from: c, reason: collision with root package name */
    private final N f128385c;

    /* renamed from: d, reason: collision with root package name */
    private final String f128386d;

    /* renamed from: e, reason: collision with root package name */
    private final d3.D f128387e;

    /* renamed from: f, reason: collision with root package name */
    private final w f128388f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f128389g;

    /* renamed from: h, reason: collision with root package name */
    private final a f128390h;

    /* renamed from: i, reason: collision with root package name */
    private long f128391i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f128392j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f128393k;

    /* renamed from: l, reason: collision with root package name */
    private long f128394l;

    /* renamed from: m, reason: collision with root package name */
    private long f128395m;

    /* renamed from: n, reason: collision with root package name */
    private long f128396n;

    /* renamed from: o, reason: collision with root package name */
    private long f128397o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f128398p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f128399q;

    /* renamed from: e4.n$a */
    private static final class a {

        /* renamed from: e, reason: collision with root package name */
        private static final byte[] f128400e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f128401a;

        /* renamed from: b, reason: collision with root package name */
        public int f128402b;

        /* renamed from: c, reason: collision with root package name */
        public int f128403c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f128404d;

        public void c() {
            this.f128401a = false;
            this.f128402b = 0;
            this.f128403c = 0;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f128401a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f128404d;
                int length = bArr2.length;
                int i13 = this.f128402b;
                if (length < i13 + i12) {
                    this.f128404d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f128404d, this.f128402b, i12);
                this.f128402b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f128401a) {
                int i12 = this.f128402b - i11;
                this.f128402b = i12;
                if (this.f128403c != 0 || i10 != 181) {
                    this.f128401a = false;
                    return true;
                }
                this.f128403c = i12;
            } else if (i10 == 179) {
                this.f128401a = true;
            }
            byte[] bArr = f128400e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public a(int i10) {
            this.f128404d = new byte[i10];
        }
    }

    public C13622n(String str) {
        this(null, str);
    }

    C13622n(N n10, String str) {
        this.f128385c = n10;
        this.f128386d = str;
        this.f128389g = new boolean[4];
        this.f128390h = new a(128);
        if (n10 != null) {
            this.f128388f = new w(178, 128);
            this.f128387e = new d3.D();
        } else {
            this.f128388f = null;
            this.f128387e = null;
        }
        this.f128395m = -9223372036854775807L;
        this.f128397o = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.util.Pair<a3.t, java.lang.Long> b(e4.C13622n.a r8, java.lang.String r9, java.lang.String r10) {
        /*
            byte[] r0 = r8.f128404d
            int r1 = r8.f128402b
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
            double[] r1 = e4.C13622n.f128382r
            int r2 = r1.length
            if (r10 >= r2) goto L9c
            r4 = r1[r10]
            int r8 = r8.f128403c
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
        throw new UnsupportedOperationException("Method not decompiled: e4.C13622n.b(e4.n$a, java.lang.String, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0144  */
    @Override // e4.InterfaceC13621m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(d3.D r20) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C13622n.a(d3.D):void");
    }

    @Override // e4.InterfaceC13621m
    public void c() {
        e3.f.c(this.f128389g);
        this.f128390h.c();
        w wVar = this.f128388f;
        if (wVar != null) {
            wVar.d();
        }
        this.f128391i = 0L;
        this.f128392j = false;
        this.f128395m = -9223372036854775807L;
        this.f128397o = -9223372036854775807L;
    }

    @Override // e4.InterfaceC13621m
    public void d(boolean z10) {
        C13466a.i(this.f128384b);
        if (z10) {
            boolean z11 = this.f128398p;
            this.f128384b.c(this.f128397o, z11 ? 1 : 0, (int) (this.f128391i - this.f128396n), 0, null);
        }
    }

    @Override // e4.InterfaceC13621m
    public void e(long j10, int i10) {
        this.f128395m = j10;
    }

    @Override // e4.InterfaceC13621m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f128383a = dVar.b();
        this.f128384b = rVar.t(dVar.c(), 2);
        N n10 = this.f128385c;
        if (n10 != null) {
            n10.b(rVar, dVar);
        }
    }
}
