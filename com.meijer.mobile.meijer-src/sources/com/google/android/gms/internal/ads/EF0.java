package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
final class EF0 implements YE0, InterfaceC9575t0, InterfaceC8755lH0, InterfaceC9183pH0, PF0 {

    /* renamed from: N, reason: collision with root package name */
    private static final Map f67214N;

    /* renamed from: O, reason: collision with root package name */
    private static final C f67215O;

    /* renamed from: B, reason: collision with root package name */
    private boolean f67217B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f67218C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f67219D;

    /* renamed from: E, reason: collision with root package name */
    private int f67220E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f67221F;

    /* renamed from: G, reason: collision with root package name */
    private long f67222G;

    /* renamed from: I, reason: collision with root package name */
    private boolean f67224I;

    /* renamed from: J, reason: collision with root package name */
    private int f67225J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f67226K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f67227L;

    /* renamed from: M, reason: collision with root package name */
    private final C8115fH0 f67228M;

    /* renamed from: a, reason: collision with root package name */
    private final Uri f67229a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9430rh0 f67230b;

    /* renamed from: c, reason: collision with root package name */
    private final BD0 f67231c;

    /* renamed from: d, reason: collision with root package name */
    private final C8644kF0 f67232d;

    /* renamed from: e, reason: collision with root package name */
    private final C9923wD0 f67233e;

    /* renamed from: f, reason: collision with root package name */
    private final AF0 f67234f;

    /* renamed from: g, reason: collision with root package name */
    private final long f67235g;

    /* renamed from: h, reason: collision with root package name */
    private final long f67236h;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC9499sF0 f67238j;

    /* renamed from: o, reason: collision with root package name */
    private XE0 f67243o;

    /* renamed from: p, reason: collision with root package name */
    private W1 f67244p;

    /* renamed from: s, reason: collision with root package name */
    private boolean f67247s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f67248t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f67249u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f67250v;

    /* renamed from: w, reason: collision with root package name */
    private DF0 f67251w;

    /* renamed from: x, reason: collision with root package name */
    private Q0 f67252x;

    /* renamed from: y, reason: collision with root package name */
    private long f67253y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f67254z;

    /* renamed from: i, reason: collision with root package name */
    private final C9503sH0 f67237i = new C9503sH0("ProgressiveMediaPeriod");

    /* renamed from: k, reason: collision with root package name */
    private final C8748lE f67239k = new C8748lE(HC.f68248a);

    /* renamed from: l, reason: collision with root package name */
    private final Runnable f67240l = new Runnable() { // from class: com.google.android.gms.internal.ads.vF0
        @Override // java.lang.Runnable
        public final void run() {
            this.f79872a.D();
        }
    };

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f67241m = new Runnable() { // from class: com.google.android.gms.internal.ads.wF0
        @Override // java.lang.Runnable
        public final void run() {
            this.f80301a.s();
        }
    };

    /* renamed from: n, reason: collision with root package name */
    private final Handler f67242n = OV.Q(null);

    /* renamed from: r, reason: collision with root package name */
    private CF0[] f67246r = new CF0[0];

    /* renamed from: q, reason: collision with root package name */
    private RF0[] f67245q = new RF0[0];

    /* renamed from: H, reason: collision with root package name */
    private long f67223H = -9223372036854775807L;

    /* renamed from: A, reason: collision with root package name */
    private int f67216A = 1;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long A(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.RF0[] r3 = r5.f67245q
            int r4 = r3.length
            if (r0 >= r4) goto L22
            if (r6 != 0) goto L15
            com.google.android.gms.internal.ads.DF0 r4 = r5.f67251w
            r4.getClass()
            boolean[] r4 = r4.f67041c
            boolean r4 = r4[r0]
            if (r4 == 0) goto L1f
        L15:
            r3 = r3[r0]
            long r3 = r3.A()
            long r1 = java.lang.Math.max(r1, r3)
        L1f:
            int r0 = r0 + 1
            goto L3
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.EF0.A(boolean):long");
    }

    private final boolean H() {
        return this.f67223H != -9223372036854775807L;
    }

    private final boolean I() {
        return this.f67218C || H();
    }

    static /* bridge */ /* synthetic */ long N(EF0 ef0, boolean z10) {
        return ef0.A(true);
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final void b(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9575t0
    public final void e() {
        this.f67247s = true;
        this.f67242n.post(this.f67240l);
    }

    final /* synthetic */ void t() {
        this.f67221F = true;
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final boolean zzp() {
        return this.f67237i.l() && this.f67239k.d();
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f67214N = Collections.unmodifiableMap(map);
        C9717uH0 c9717uH0 = new C9717uH0();
        c9717uH0.m("icy");
        c9717uH0.B("application/x-icy");
        f67215O = c9717uH0.H();
    }

    private final X0 B(CF0 cf0) {
        int length = this.f67245q.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (cf0.equals(this.f67246r[i10])) {
                return this.f67245q[i10];
            }
        }
        if (this.f67247s) {
            C10042xL.f("ProgressiveMediaPeriod", "Extractor added new track (id=" + cf0.f66588a + ") after finishing tracks.");
            return new C8720l0();
        }
        RF0 rf0 = new RF0(this.f67228M, this.f67231c, this.f67233e);
        rf0.J(this);
        int i11 = length + 1;
        CF0[] cf0Arr = (CF0[]) Arrays.copyOf(this.f67246r, i11);
        cf0Arr[length] = cf0;
        int i12 = OV.f69931a;
        this.f67246r = cf0Arr;
        RF0[] rf0Arr = (RF0[]) Arrays.copyOf(this.f67245q, i11);
        rf0Arr[length] = rf0;
        this.f67245q = rf0Arr;
        return rf0;
    }

    private final void C() {
        C8211gC.f(this.f67248t);
        this.f67251w.getClass();
        this.f67252x.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        int i10;
        if (this.f67227L || this.f67248t || !this.f67247s || this.f67252x == null) {
            return;
        }
        for (RF0 rf0 : this.f67245q) {
            if (rf0.B() == null) {
                return;
            }
        }
        this.f67239k.c();
        int length = this.f67245q.length;
        C9867vm[] c9867vmArr = new C9867vm[length];
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            C cB = this.f67245q[i11].B();
            cB.getClass();
            String str = cB.f66504o;
            boolean zG = C7182Pc.g(str);
            boolean z10 = zG || C7182Pc.i(str);
            zArr[i11] = z10;
            this.f67249u = z10 | this.f67249u;
            this.f67250v = this.f67236h != -9223372036854775807L && length == 1 && C7182Pc.h(str);
            W1 w12 = this.f67244p;
            if (w12 != null) {
                if (zG || this.f67246r[i11].f66589b) {
                    C8776lb c8776lb = cB.f66501l;
                    C8776lb c8776lb2 = c8776lb == null ? new C8776lb(-9223372036854775807L, w12) : c8776lb.c(w12);
                    C9717uH0 c9717uH0B = cB.b();
                    c9717uH0B.t(c8776lb2);
                    cB = c9717uH0B.H();
                }
                if (zG && cB.f66497h == -1 && cB.f66498i == -1 && (i10 = w12.f71814a) != -1) {
                    C9717uH0 c9717uH0B2 = cB.b();
                    c9717uH0B2.q0(i10);
                    cB = c9717uH0B2.H();
                }
            }
            C c10 = cB.c(this.f67231c.a(cB));
            c9867vmArr[i11] = new C9867vm(Integer.toString(i11), c10);
            this.f67219D = c10.f66510u | this.f67219D;
        }
        this.f67251w = new DF0(new C7900dG0(c9867vmArr), zArr);
        if (this.f67250v && this.f67253y == -9223372036854775807L) {
            this.f67253y = this.f67236h;
            this.f67252x = new C10141yF0(this, this.f67252x);
        }
        this.f67234f.c(this.f67253y, this.f67252x.zzh(), this.f67254z);
        this.f67248t = true;
        XE0 xe0 = this.f67243o;
        xe0.getClass();
        xe0.a(this);
    }

    private final void G() {
        C10248zF0 c10248zF0 = new C10248zF0(this, this.f67229a, this.f67230b, this.f67238j, this, this.f67239k);
        if (this.f67248t) {
            C8211gC.f(H());
            long j10 = this.f67253y;
            if (j10 != -9223372036854775807L && this.f67223H > j10) {
                this.f67226K = true;
                this.f67223H = -9223372036854775807L;
                return;
            }
            Q0 q02 = this.f67252x;
            q02.getClass();
            C10248zF0.f(c10248zF0, q02.zzg(this.f67223H).f69826a.f70548b, this.f67223H);
            for (RF0 rf0 : this.f67245q) {
                rf0.I(this.f67223H);
            }
            this.f67223H = -9223372036854775807L;
        }
        this.f67225J = z();
        long jA = this.f67237i.a(c10248zF0, this, C8541jH0.a(this.f67216A));
        this.f67232d.h(new QE0(c10248zF0.f81228a, c10248zF0.f81238k, jA), new WE0(1, -1, null, 0, null, OV.N(c10248zF0.f81237j), OV.N(this.f67253y)));
    }

    static /* bridge */ /* synthetic */ void r(final EF0 ef0) {
        ef0.f67242n.post(new Runnable() { // from class: com.google.android.gms.internal.ads.uF0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79619a.t();
            }
        });
    }

    private final int z() {
        int iY = 0;
        for (RF0 rf0 : this.f67245q) {
            iY += rf0.y();
        }
        return iY;
    }

    final X0 Q() {
        return B(new CF0(0, true));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9575t0
    public final X0 a(int i10, int i11) {
        return B(new CF0(i10, false));
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final boolean c(C7994eA0 c7994eA0) {
        if (this.f67226K) {
            return false;
        }
        C9503sH0 c9503sH0 = this.f67237i;
        if (c9503sH0.k() || this.f67224I) {
            return false;
        }
        if (this.f67248t && this.f67220E == 0) {
            return false;
        }
        boolean zE = this.f67239k.e();
        if (c9503sH0.l()) {
            return zE;
        }
        G();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8755lH0
    public final /* bridge */ /* synthetic */ void d(InterfaceC9076oH0 interfaceC9076oH0, long j10, long j11, boolean z10) {
        C10248zF0 c10248zF0 = (C10248zF0) interfaceC9076oH0;
        C9136ou0 c9136ou0 = c10248zF0.f81230c;
        QE0 qe0 = new QE0(c10248zF0.f81228a, c10248zF0.f81238k, c9136ou0.i(), c9136ou0.j(), j10, j11, c9136ou0.h());
        long unused = c10248zF0.f81228a;
        this.f67232d.e(qe0, new WE0(1, -1, null, 0, null, OV.N(c10248zF0.f81237j), OV.N(this.f67253y)));
        if (z10) {
            return;
        }
        for (RF0 rf0 : this.f67245q) {
            rf0.H(false);
        }
        if (this.f67220E > 0) {
            XE0 xe0 = this.f67243o;
            xe0.getClass();
            xe0.d(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.YE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g(long r23, com.google.android.gms.internal.ads.LA0 r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r3 = r25
            r0.C()
            com.google.android.gms.internal.ads.Q0 r4 = r0.f67252x
            boolean r4 = r4.zzh()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            com.google.android.gms.internal.ads.Q0 r4 = r0.f67252x
            com.google.android.gms.internal.ads.O0 r4 = r4.zzg(r1)
            com.google.android.gms.internal.ads.R0 r7 = r4.f69826a
            com.google.android.gms.internal.ads.R0 r4 = r4.f69827b
            long r8 = r3.f69145a
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 != 0) goto L2c
            long r8 = r3.f69146b
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L2b
            return r1
        L2b:
            r8 = r5
        L2c:
            long r10 = r7.f70547a
            int r7 = com.google.android.gms.internal.ads.OV.f69931a
            long r12 = r1 - r8
            long r7 = r1 ^ r8
            long r14 = r1 ^ r12
            r16 = r5
            long r5 = r3.f69146b
            long r18 = r1 + r5
            long r20 = r1 ^ r18
            long r5 = r5 ^ r18
            long r7 = r7 & r14
            int r3 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r3 >= 0) goto L47
            r12 = -9223372036854775808
        L47:
            long r5 = r20 & r5
            int r3 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r3 >= 0) goto L52
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L52:
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r3 > 0) goto L5e
            int r3 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r3 > 0) goto L5e
            r3 = r5
            goto L5f
        L5e:
            r3 = r6
        L5f:
            long r7 = r4.f70547a
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 > 0) goto L6a
            int r4 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r4 > 0) goto L6a
            goto L6b
        L6a:
            r5 = r6
        L6b:
            if (r3 == 0) goto L80
            if (r5 == 0) goto L80
            long r3 = r10 - r1
            long r1 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L85
            goto L82
        L80:
            if (r3 == 0) goto L83
        L82:
            return r10
        L83:
            if (r5 == 0) goto L86
        L85:
            return r7
        L86:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.EF0.g(long, com.google.android.gms.internal.ads.LA0):long");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8755lH0
    public final /* bridge */ /* synthetic */ C8862mH0 h(InterfaceC9076oH0 interfaceC9076oH0, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        C8862mH0 c8862mH0B;
        Q0 q02;
        C10248zF0 c10248zF0 = (C10248zF0) interfaceC9076oH0;
        C9136ou0 c9136ou0 = c10248zF0.f81230c;
        QE0 qe0 = new QE0(c10248zF0.f81228a, c10248zF0.f81238k, c9136ou0.i(), c9136ou0.j(), j10, j11, c9136ou0.h());
        long unused = c10248zF0.f81237j;
        int i11 = OV.f69931a;
        if ((iOException instanceof zzbc) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzgo) || (iOException instanceof zzyw)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof zzfz) && ((zzfz) cause).f81543a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i10 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            c8862mH0B = C9503sH0.f79031e;
        } else {
            int iZ = z();
            boolean z10 = iZ > this.f67225J;
            if (this.f67221F || !((q02 = this.f67252x) == null || q02.zza() == -9223372036854775807L)) {
                this.f67225J = iZ;
            } else {
                boolean z11 = this.f67248t;
                if (!z11 || I()) {
                    this.f67218C = z11;
                    this.f67222G = 0L;
                    this.f67225J = 0;
                    for (RF0 rf0 : this.f67245q) {
                        rf0.H(false);
                    }
                    C10248zF0.f(c10248zF0, 0L, 0L);
                } else {
                    this.f67224I = true;
                    c8862mH0B = C9503sH0.f79030d;
                }
            }
            c8862mH0B = C9503sH0.b(z10, jMin);
        }
        boolean zC = c8862mH0B.c();
        this.f67232d.g(qe0, new WE0(1, -1, null, 0, null, OV.N(c10248zF0.f81237j), OV.N(this.f67253y)), iOException, !zC);
        if (!zC) {
            long unused2 = c10248zF0.f81228a;
        }
        return c8862mH0B;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8755lH0
    public final /* bridge */ /* synthetic */ void i(InterfaceC9076oH0 interfaceC9076oH0, long j10, long j11) {
        Q0 q02;
        C10248zF0 c10248zF0 = (C10248zF0) interfaceC9076oH0;
        if (this.f67253y == -9223372036854775807L && (q02 = this.f67252x) != null) {
            boolean zZzh = q02.zzh();
            long jA = A(true);
            long j12 = jA == Long.MIN_VALUE ? 0L : jA + 10000;
            this.f67253y = j12;
            this.f67234f.c(j12, zZzh, this.f67254z);
        }
        C9136ou0 c9136ou0 = c10248zF0.f81230c;
        QE0 qe0 = new QE0(c10248zF0.f81228a, c10248zF0.f81238k, c9136ou0.i(), c9136ou0.j(), j10, j11, c9136ou0.h());
        long unused = c10248zF0.f81228a;
        this.f67232d.f(qe0, new WE0(1, -1, null, 0, null, OV.N(c10248zF0.f81237j), OV.N(this.f67253y)));
        this.f67226K = true;
        XE0 xe0 = this.f67243o;
        xe0.getClass();
        xe0.d(this);
    }

    @Override // com.google.android.gms.internal.ads.PF0
    public final void j(C c10) {
        this.f67242n.post(this.f67240l);
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void k(long j10, boolean z10) {
        if (this.f67250v) {
            return;
        }
        C();
        if (H()) {
            return;
        }
        boolean[] zArr = this.f67251w.f67041c;
        int length = this.f67245q.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f67245q[i10].C(j10, false, zArr[i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9183pH0
    public final void l() {
        for (RF0 rf0 : this.f67245q) {
            rf0.G();
        }
        this.f67238j.zze();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9575t0
    public final void m(final Q0 q02) {
        this.f67242n.post(new Runnable() { // from class: com.google.android.gms.internal.ads.xF0
            @Override // java.lang.Runnable
            public final void run() {
                this.f80555a.u(q02);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void o(XE0 xe0, long j10) {
        this.f67243o = xe0;
        this.f67239k.e();
        G();
    }

    final /* synthetic */ void s() {
        if (this.f67227L) {
            return;
        }
        XE0 xe0 = this.f67243o;
        xe0.getClass();
        xe0.d(this);
    }

    final /* synthetic */ void u(Q0 q02) {
        this.f67252x = this.f67244p == null ? q02 : new P0(-9223372036854775807L, 0L);
        this.f67253y = q02.zza();
        boolean z10 = false;
        if (!this.f67221F && q02.zza() == -9223372036854775807L) {
            z10 = true;
        }
        this.f67254z = z10;
        this.f67216A = true == z10 ? 7 : 1;
        if (this.f67248t) {
            this.f67234f.c(this.f67253y, q02.zzh(), this.f67254z);
        } else {
            D();
        }
    }

    final void v() throws IOException {
        this.f67237i.i(C8541jH0.a(this.f67216A));
    }

    final void w(int i10) throws IOException {
        this.f67245q[i10].E();
        v();
    }

    public final void x() {
        if (this.f67248t) {
            for (RF0 rf0 : this.f67245q) {
                rf0.F();
            }
        }
        this.f67237i.j(this);
        this.f67242n.removeCallbacksAndMessages(null);
        this.f67243o = null;
        this.f67227L = true;
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long zzd() {
        if (this.f67219D) {
            this.f67219D = false;
        } else {
            if (!this.f67218C) {
                return -9223372036854775807L;
            }
            if (!this.f67226K && z() <= this.f67225J) {
                return -9223372036854775807L;
            }
            this.f67218C = false;
        }
        return this.f67222G;
    }

    public EF0(Uri uri, InterfaceC9430rh0 interfaceC9430rh0, InterfaceC9499sF0 interfaceC9499sF0, BD0 bd0, C9923wD0 c9923wD0, C8541jH0 c8541jH0, C8644kF0 c8644kF0, AF0 af0, C8115fH0 c8115fH0, String str, int i10, boolean z10, long j10, BH0 bh0) {
        this.f67229a = uri;
        this.f67230b = interfaceC9430rh0;
        this.f67231c = bd0;
        this.f67233e = c9923wD0;
        this.f67232d = c8644kF0;
        this.f67234f = af0;
        this.f67228M = c8115fH0;
        this.f67235g = i10;
        this.f67238j = interfaceC9499sF0;
        this.f67236h = j10;
    }

    private final void E(int i10) {
        C();
        DF0 df0 = this.f67251w;
        boolean[] zArr = df0.f67042d;
        if (!zArr[i10]) {
            C cB = df0.f67039a.b(i10).b(0);
            this.f67232d.d(new WE0(1, C7182Pc.b(cB.f66504o), cB, 0, null, OV.N(this.f67222G), -9223372036854775807L));
            zArr[i10] = true;
        }
    }

    private final void F(int i10) {
        C();
        boolean[] zArr = this.f67251w.f67040b;
        if (this.f67224I && zArr[i10] && !this.f67245q[i10].M(false)) {
            this.f67223H = 0L;
            this.f67224I = false;
            this.f67218C = true;
            this.f67222G = 0L;
            this.f67225J = 0;
            for (RF0 rf0 : this.f67245q) {
                rf0.H(false);
            }
            XE0 xe0 = this.f67243o;
            xe0.getClass();
            xe0.d(this);
        }
    }

    final int J(int i10, Zz0 zz0, By0 by0, int i11) {
        if (I()) {
            return -3;
        }
        E(i10);
        int iZ = this.f67245q[i10].z(zz0, by0, i11, this.f67226K);
        if (iZ == -3) {
            F(i10);
        }
        return iZ;
    }

    final int K(int i10, long j10) {
        if (I()) {
            return 0;
        }
        E(i10);
        RF0 rf0 = this.f67245q[i10];
        int iX = rf0.x(j10, this.f67226K);
        rf0.K(iX);
        if (iX == 0) {
            F(i10);
            return 0;
        }
        return iX;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    @Override // com.google.android.gms.internal.ads.YE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(long r9) {
        /*
            r8 = this;
            r8.C()
            com.google.android.gms.internal.ads.DF0 r0 = r8.f67251w
            boolean[] r0 = r0.f67040b
            com.google.android.gms.internal.ads.Q0 r1 = r8.f67252x
            boolean r1 = r1.zzh()
            r2 = 1
            if (r2 == r1) goto L12
            r9 = 0
        L12:
            r1 = 0
            r8.f67218C = r1
            long r2 = r8.f67222G
            r8.f67222G = r9
            boolean r4 = r8.H()
            if (r4 == 0) goto L22
            r8.f67223H = r9
            return r9
        L22:
            int r4 = r8.f67216A
            r5 = 7
            if (r4 == r5) goto L67
            boolean r4 = r8.f67226K
            if (r4 != 0) goto L33
            com.google.android.gms.internal.ads.sH0 r4 = r8.f67237i
            boolean r4 = r4.l()
            if (r4 == 0) goto L67
        L33:
            com.google.android.gms.internal.ads.RF0[] r4 = r8.f67245q
            int r4 = r4.length
            r5 = r1
        L37:
            if (r5 >= r4) goto L9b
            com.google.android.gms.internal.ads.RF0[] r6 = r8.f67245q
            r6 = r6[r5]
            int r7 = r6.w()
            if (r7 != 0) goto L48
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 != 0) goto L48
            goto L64
        L48:
            boolean r7 = r8.f67250v
            if (r7 == 0) goto L55
            int r7 = r6.v()
            boolean r6 = r6.N(r7)
            goto L59
        L55:
            boolean r6 = r6.h(r9, r1)
        L59:
            if (r6 != 0) goto L64
            boolean r6 = r0[r5]
            if (r6 != 0) goto L67
            boolean r6 = r8.f67249u
            if (r6 != 0) goto L64
            goto L67
        L64:
            int r5 = r5 + 1
            goto L37
        L67:
            r8.f67224I = r1
            r8.f67223H = r9
            r8.f67226K = r1
            r8.f67219D = r1
            com.google.android.gms.internal.ads.sH0 r0 = r8.f67237i
            boolean r2 = r0.l()
            if (r2 == 0) goto L8a
            com.google.android.gms.internal.ads.RF0[] r0 = r8.f67245q
            int r2 = r0.length
        L7a:
            if (r1 >= r2) goto L84
            r3 = r0[r1]
            r3.D()
            int r1 = r1 + 1
            goto L7a
        L84:
            com.google.android.gms.internal.ads.sH0 r0 = r8.f67237i
            r0.g()
            return r9
        L8a:
            r0.h()
            com.google.android.gms.internal.ads.RF0[] r0 = r8.f67245q
            int r2 = r0.length
            r3 = r1
        L91:
            if (r3 >= r2) goto L9b
            r4 = r0[r3]
            r4.H(r1)
            int r3 = r3 + 1
            goto L91
        L9b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.EF0.f(long):long");
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long n(PG0[] pg0Arr, boolean[] zArr, SF0[] sf0Arr, boolean[] zArr2, long j10) {
        boolean z10;
        PG0 pg0;
        boolean z11;
        boolean z12;
        C();
        DF0 df0 = this.f67251w;
        C7900dG0 c7900dG0 = df0.f67039a;
        boolean[] zArr3 = df0.f67041c;
        int i10 = this.f67220E;
        int i11 = 0;
        for (int i12 = 0; i12 < pg0Arr.length; i12++) {
            SF0 sf0 = sf0Arr[i12];
            if (sf0 != null && (pg0Arr[i12] == null || !zArr[i12])) {
                int i13 = ((BF0) sf0).f66332a;
                C8211gC.f(zArr3[i13]);
                this.f67220E--;
                zArr3[i13] = false;
                sf0Arr[i12] = null;
            }
        }
        if (!this.f67217B ? !(j10 == 0 || this.f67250v) : i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i14 = 0; i14 < pg0Arr.length; i14++) {
            if (sf0Arr[i14] == null && (pg0 = pg0Arr[i14]) != null) {
                if (pg0.zzd() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C8211gC.f(z11);
                if (pg0.zza(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C8211gC.f(z12);
                int iA = c7900dG0.a(pg0.zzg());
                C8211gC.f(!zArr3[iA]);
                this.f67220E++;
                zArr3[iA] = true;
                this.f67219D = pg0.zzf().f66510u | this.f67219D;
                sf0Arr[i14] = new BF0(this, iA);
                zArr2[i14] = true;
                if (!z10) {
                    RF0 rf0 = this.f67245q[iA];
                    if (rf0.w() != 0 && !rf0.h(j10, true)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.f67220E == 0) {
            this.f67224I = false;
            this.f67218C = false;
            this.f67219D = false;
            if (this.f67237i.l()) {
                RF0[] rf0Arr = this.f67245q;
                int length = rf0Arr.length;
                while (i11 < length) {
                    rf0Arr[i11].D();
                    i11++;
                }
                this.f67237i.g();
            } else {
                this.f67226K = false;
                for (RF0 rf02 : this.f67245q) {
                    rf02.H(false);
                }
            }
        } else if (z10) {
            j10 = f(j10);
            while (i11 < sf0Arr.length) {
                if (sf0Arr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.f67217B = true;
        return j10;
    }

    final boolean y(int i10) {
        if (!I() && this.f67245q[i10].M(this.f67226K)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final long zzb() {
        long jA;
        C();
        if (this.f67226K || this.f67220E == 0) {
            return Long.MIN_VALUE;
        }
        if (H()) {
            return this.f67223H;
        }
        if (this.f67249u) {
            int length = this.f67245q.length;
            jA = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                DF0 df0 = this.f67251w;
                if (df0.f67040b[i10] && df0.f67041c[i10] && !this.f67245q[i10].L()) {
                    jA = Math.min(jA, this.f67245q[i10].A());
                }
            }
        } else {
            jA = Long.MAX_VALUE;
        }
        if (jA == Long.MAX_VALUE) {
            jA = A(false);
        }
        if (jA == Long.MIN_VALUE) {
            return this.f67222G;
        }
        return jA;
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final C7900dG0 zzh() {
        C();
        return this.f67251w.f67039a;
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void zzk() throws IOException {
        v();
        if (this.f67226K && !this.f67248t) {
            throw zzbc.a("Loading finished before preparation is complete.", null);
        }
    }
}
