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
final class EF0 implements YE0, InterfaceC9450t0, InterfaceC8630lH0, InterfaceC9058pH0, PF0 {

    /* renamed from: N, reason: collision with root package name */
    private static final Map f66374N;

    /* renamed from: O, reason: collision with root package name */
    private static final C f66375O;

    /* renamed from: B, reason: collision with root package name */
    private boolean f66377B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f66378C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f66379D;

    /* renamed from: E, reason: collision with root package name */
    private int f66380E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f66381F;

    /* renamed from: G, reason: collision with root package name */
    private long f66382G;

    /* renamed from: I, reason: collision with root package name */
    private boolean f66384I;

    /* renamed from: J, reason: collision with root package name */
    private int f66385J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f66386K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f66387L;

    /* renamed from: M, reason: collision with root package name */
    private final C7990fH0 f66388M;

    /* renamed from: a, reason: collision with root package name */
    private final Uri f66389a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9305rh0 f66390b;

    /* renamed from: c, reason: collision with root package name */
    private final BD0 f66391c;

    /* renamed from: d, reason: collision with root package name */
    private final C8519kF0 f66392d;

    /* renamed from: e, reason: collision with root package name */
    private final C9798wD0 f66393e;

    /* renamed from: f, reason: collision with root package name */
    private final AF0 f66394f;

    /* renamed from: g, reason: collision with root package name */
    private final long f66395g;

    /* renamed from: h, reason: collision with root package name */
    private final long f66396h;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC9374sF0 f66398j;

    /* renamed from: o, reason: collision with root package name */
    private XE0 f66403o;

    /* renamed from: p, reason: collision with root package name */
    private W1 f66404p;

    /* renamed from: s, reason: collision with root package name */
    private boolean f66407s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f66408t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f66409u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f66410v;

    /* renamed from: w, reason: collision with root package name */
    private DF0 f66411w;

    /* renamed from: x, reason: collision with root package name */
    private Q0 f66412x;

    /* renamed from: y, reason: collision with root package name */
    private long f66413y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f66414z;

    /* renamed from: i, reason: collision with root package name */
    private final C9378sH0 f66397i = new C9378sH0("ProgressiveMediaPeriod");

    /* renamed from: k, reason: collision with root package name */
    private final C8623lE f66399k = new C8623lE(HC.f67408a);

    /* renamed from: l, reason: collision with root package name */
    private final Runnable f66400l = new Runnable() { // from class: com.google.android.gms.internal.ads.vF0
        @Override // java.lang.Runnable
        public final void run() {
            this.f79032a.D();
        }
    };

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f66401m = new Runnable() { // from class: com.google.android.gms.internal.ads.wF0
        @Override // java.lang.Runnable
        public final void run() {
            this.f79461a.s();
        }
    };

    /* renamed from: n, reason: collision with root package name */
    private final Handler f66402n = OV.Q(null);

    /* renamed from: r, reason: collision with root package name */
    private CF0[] f66406r = new CF0[0];

    /* renamed from: q, reason: collision with root package name */
    private RF0[] f66405q = new RF0[0];

    /* renamed from: H, reason: collision with root package name */
    private long f66383H = -9223372036854775807L;

    /* renamed from: A, reason: collision with root package name */
    private int f66376A = 1;

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
            com.google.android.gms.internal.ads.RF0[] r3 = r5.f66405q
            int r4 = r3.length
            if (r0 >= r4) goto L22
            if (r6 != 0) goto L15
            com.google.android.gms.internal.ads.DF0 r4 = r5.f66411w
            r4.getClass()
            boolean[] r4 = r4.f66201c
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
        return this.f66383H != -9223372036854775807L;
    }

    private final boolean I() {
        return this.f66378C || H();
    }

    static /* bridge */ /* synthetic */ long N(EF0 ef0, boolean z10) {
        return ef0.A(true);
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final void b(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9450t0
    public final void e() {
        this.f66407s = true;
        this.f66402n.post(this.f66400l);
    }

    final /* synthetic */ void t() {
        this.f66381F = true;
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final boolean zzp() {
        return this.f66397i.l() && this.f66399k.d();
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f66374N = Collections.unmodifiableMap(map);
        C9592uH0 c9592uH0 = new C9592uH0();
        c9592uH0.m("icy");
        c9592uH0.B("application/x-icy");
        f66375O = c9592uH0.H();
    }

    private final X0 B(CF0 cf0) {
        int length = this.f66405q.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (cf0.equals(this.f66406r[i10])) {
                return this.f66405q[i10];
            }
        }
        if (this.f66407s) {
            C9917xL.f("ProgressiveMediaPeriod", "Extractor added new track (id=" + cf0.f65748a + ") after finishing tracks.");
            return new C8595l0();
        }
        RF0 rf0 = new RF0(this.f66388M, this.f66391c, this.f66393e);
        rf0.J(this);
        int i11 = length + 1;
        CF0[] cf0Arr = (CF0[]) Arrays.copyOf(this.f66406r, i11);
        cf0Arr[length] = cf0;
        int i12 = OV.f69091a;
        this.f66406r = cf0Arr;
        RF0[] rf0Arr = (RF0[]) Arrays.copyOf(this.f66405q, i11);
        rf0Arr[length] = rf0;
        this.f66405q = rf0Arr;
        return rf0;
    }

    private final void C() {
        C8086gC.f(this.f66408t);
        this.f66411w.getClass();
        this.f66412x.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        int i10;
        if (this.f66387L || this.f66408t || !this.f66407s || this.f66412x == null) {
            return;
        }
        for (RF0 rf0 : this.f66405q) {
            if (rf0.B() == null) {
                return;
            }
        }
        this.f66399k.c();
        int length = this.f66405q.length;
        C9742vm[] c9742vmArr = new C9742vm[length];
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            C cB = this.f66405q[i11].B();
            cB.getClass();
            String str = cB.f65664o;
            boolean zG = C7057Pc.g(str);
            boolean z10 = zG || C7057Pc.i(str);
            zArr[i11] = z10;
            this.f66409u = z10 | this.f66409u;
            this.f66410v = this.f66396h != -9223372036854775807L && length == 1 && C7057Pc.h(str);
            W1 w12 = this.f66404p;
            if (w12 != null) {
                if (zG || this.f66406r[i11].f65749b) {
                    C8651lb c8651lb = cB.f65661l;
                    C8651lb c8651lb2 = c8651lb == null ? new C8651lb(-9223372036854775807L, w12) : c8651lb.c(w12);
                    C9592uH0 c9592uH0B = cB.b();
                    c9592uH0B.t(c8651lb2);
                    cB = c9592uH0B.H();
                }
                if (zG && cB.f65657h == -1 && cB.f65658i == -1 && (i10 = w12.f70974a) != -1) {
                    C9592uH0 c9592uH0B2 = cB.b();
                    c9592uH0B2.q0(i10);
                    cB = c9592uH0B2.H();
                }
            }
            C c10 = cB.c(this.f66391c.a(cB));
            c9742vmArr[i11] = new C9742vm(Integer.toString(i11), c10);
            this.f66379D = c10.f65670u | this.f66379D;
        }
        this.f66411w = new DF0(new C7775dG0(c9742vmArr), zArr);
        if (this.f66410v && this.f66413y == -9223372036854775807L) {
            this.f66413y = this.f66396h;
            this.f66412x = new C10016yF0(this, this.f66412x);
        }
        this.f66394f.c(this.f66413y, this.f66412x.zzh(), this.f66414z);
        this.f66408t = true;
        XE0 xe0 = this.f66403o;
        xe0.getClass();
        xe0.a(this);
    }

    private final void G() {
        C10123zF0 c10123zF0 = new C10123zF0(this, this.f66389a, this.f66390b, this.f66398j, this, this.f66399k);
        if (this.f66408t) {
            C8086gC.f(H());
            long j10 = this.f66413y;
            if (j10 != -9223372036854775807L && this.f66383H > j10) {
                this.f66386K = true;
                this.f66383H = -9223372036854775807L;
                return;
            }
            Q0 q02 = this.f66412x;
            q02.getClass();
            C10123zF0.f(c10123zF0, q02.zzg(this.f66383H).f68986a.f69708b, this.f66383H);
            for (RF0 rf0 : this.f66405q) {
                rf0.I(this.f66383H);
            }
            this.f66383H = -9223372036854775807L;
        }
        this.f66385J = z();
        long jA = this.f66397i.a(c10123zF0, this, C8416jH0.a(this.f66376A));
        this.f66392d.h(new QE0(c10123zF0.f80388a, c10123zF0.f80398k, jA), new WE0(1, -1, null, 0, null, OV.N(c10123zF0.f80397j), OV.N(this.f66413y)));
    }

    static /* bridge */ /* synthetic */ void r(final EF0 ef0) {
        ef0.f66402n.post(new Runnable() { // from class: com.google.android.gms.internal.ads.uF0
            @Override // java.lang.Runnable
            public final void run() {
                this.f78779a.t();
            }
        });
    }

    private final int z() {
        int iY = 0;
        for (RF0 rf0 : this.f66405q) {
            iY += rf0.y();
        }
        return iY;
    }

    final X0 Q() {
        return B(new CF0(0, true));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9450t0
    public final X0 a(int i10, int i11) {
        return B(new CF0(i10, false));
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final boolean c(C7869eA0 c7869eA0) {
        if (this.f66386K) {
            return false;
        }
        C9378sH0 c9378sH0 = this.f66397i;
        if (c9378sH0.k() || this.f66384I) {
            return false;
        }
        if (this.f66408t && this.f66380E == 0) {
            return false;
        }
        boolean zE = this.f66399k.e();
        if (c9378sH0.l()) {
            return zE;
        }
        G();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8630lH0
    public final /* bridge */ /* synthetic */ void d(InterfaceC8951oH0 interfaceC8951oH0, long j10, long j11, boolean z10) {
        C10123zF0 c10123zF0 = (C10123zF0) interfaceC8951oH0;
        C9011ou0 c9011ou0 = c10123zF0.f80390c;
        QE0 qe0 = new QE0(c10123zF0.f80388a, c10123zF0.f80398k, c9011ou0.i(), c9011ou0.j(), j10, j11, c9011ou0.h());
        long unused = c10123zF0.f80388a;
        this.f66392d.e(qe0, new WE0(1, -1, null, 0, null, OV.N(c10123zF0.f80397j), OV.N(this.f66413y)));
        if (z10) {
            return;
        }
        for (RF0 rf0 : this.f66405q) {
            rf0.H(false);
        }
        if (this.f66380E > 0) {
            XE0 xe0 = this.f66403o;
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
            com.google.android.gms.internal.ads.Q0 r4 = r0.f66412x
            boolean r4 = r4.zzh()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            com.google.android.gms.internal.ads.Q0 r4 = r0.f66412x
            com.google.android.gms.internal.ads.O0 r4 = r4.zzg(r1)
            com.google.android.gms.internal.ads.R0 r7 = r4.f68986a
            com.google.android.gms.internal.ads.R0 r4 = r4.f68987b
            long r8 = r3.f68305a
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 != 0) goto L2c
            long r8 = r3.f68306b
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L2b
            return r1
        L2b:
            r8 = r5
        L2c:
            long r10 = r7.f69707a
            int r7 = com.google.android.gms.internal.ads.OV.f69091a
            long r12 = r1 - r8
            long r7 = r1 ^ r8
            long r14 = r1 ^ r12
            r16 = r5
            long r5 = r3.f68306b
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
            long r7 = r4.f69707a
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

    @Override // com.google.android.gms.internal.ads.InterfaceC8630lH0
    public final /* bridge */ /* synthetic */ C8737mH0 h(InterfaceC8951oH0 interfaceC8951oH0, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        C8737mH0 c8737mH0B;
        Q0 q02;
        C10123zF0 c10123zF0 = (C10123zF0) interfaceC8951oH0;
        C9011ou0 c9011ou0 = c10123zF0.f80390c;
        QE0 qe0 = new QE0(c10123zF0.f80388a, c10123zF0.f80398k, c9011ou0.i(), c9011ou0.j(), j10, j11, c9011ou0.h());
        long unused = c10123zF0.f80397j;
        int i11 = OV.f69091a;
        if ((iOException instanceof zzbc) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzgo) || (iOException instanceof zzyw)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof zzfz) && ((zzfz) cause).f80703a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i10 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            c8737mH0B = C9378sH0.f78191e;
        } else {
            int iZ = z();
            boolean z10 = iZ > this.f66385J;
            if (this.f66381F || !((q02 = this.f66412x) == null || q02.zza() == -9223372036854775807L)) {
                this.f66385J = iZ;
            } else {
                boolean z11 = this.f66408t;
                if (!z11 || I()) {
                    this.f66378C = z11;
                    this.f66382G = 0L;
                    this.f66385J = 0;
                    for (RF0 rf0 : this.f66405q) {
                        rf0.H(false);
                    }
                    C10123zF0.f(c10123zF0, 0L, 0L);
                } else {
                    this.f66384I = true;
                    c8737mH0B = C9378sH0.f78190d;
                }
            }
            c8737mH0B = C9378sH0.b(z10, jMin);
        }
        boolean zC = c8737mH0B.c();
        this.f66392d.g(qe0, new WE0(1, -1, null, 0, null, OV.N(c10123zF0.f80397j), OV.N(this.f66413y)), iOException, !zC);
        if (!zC) {
            long unused2 = c10123zF0.f80388a;
        }
        return c8737mH0B;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8630lH0
    public final /* bridge */ /* synthetic */ void i(InterfaceC8951oH0 interfaceC8951oH0, long j10, long j11) {
        Q0 q02;
        C10123zF0 c10123zF0 = (C10123zF0) interfaceC8951oH0;
        if (this.f66413y == -9223372036854775807L && (q02 = this.f66412x) != null) {
            boolean zZzh = q02.zzh();
            long jA = A(true);
            long j12 = jA == Long.MIN_VALUE ? 0L : jA + 10000;
            this.f66413y = j12;
            this.f66394f.c(j12, zZzh, this.f66414z);
        }
        C9011ou0 c9011ou0 = c10123zF0.f80390c;
        QE0 qe0 = new QE0(c10123zF0.f80388a, c10123zF0.f80398k, c9011ou0.i(), c9011ou0.j(), j10, j11, c9011ou0.h());
        long unused = c10123zF0.f80388a;
        this.f66392d.f(qe0, new WE0(1, -1, null, 0, null, OV.N(c10123zF0.f80397j), OV.N(this.f66413y)));
        this.f66386K = true;
        XE0 xe0 = this.f66403o;
        xe0.getClass();
        xe0.d(this);
    }

    @Override // com.google.android.gms.internal.ads.PF0
    public final void j(C c10) {
        this.f66402n.post(this.f66400l);
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void k(long j10, boolean z10) {
        if (this.f66410v) {
            return;
        }
        C();
        if (H()) {
            return;
        }
        boolean[] zArr = this.f66411w.f66201c;
        int length = this.f66405q.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f66405q[i10].C(j10, false, zArr[i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9058pH0
    public final void l() {
        for (RF0 rf0 : this.f66405q) {
            rf0.G();
        }
        this.f66398j.zze();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9450t0
    public final void m(final Q0 q02) {
        this.f66402n.post(new Runnable() { // from class: com.google.android.gms.internal.ads.xF0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79715a.u(q02);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void o(XE0 xe0, long j10) {
        this.f66403o = xe0;
        this.f66399k.e();
        G();
    }

    final /* synthetic */ void s() {
        if (this.f66387L) {
            return;
        }
        XE0 xe0 = this.f66403o;
        xe0.getClass();
        xe0.d(this);
    }

    final /* synthetic */ void u(Q0 q02) {
        this.f66412x = this.f66404p == null ? q02 : new P0(-9223372036854775807L, 0L);
        this.f66413y = q02.zza();
        boolean z10 = false;
        if (!this.f66381F && q02.zza() == -9223372036854775807L) {
            z10 = true;
        }
        this.f66414z = z10;
        this.f66376A = true == z10 ? 7 : 1;
        if (this.f66408t) {
            this.f66394f.c(this.f66413y, q02.zzh(), this.f66414z);
        } else {
            D();
        }
    }

    final void v() throws IOException {
        this.f66397i.i(C8416jH0.a(this.f66376A));
    }

    final void w(int i10) throws IOException {
        this.f66405q[i10].E();
        v();
    }

    public final void x() {
        if (this.f66408t) {
            for (RF0 rf0 : this.f66405q) {
                rf0.F();
            }
        }
        this.f66397i.j(this);
        this.f66402n.removeCallbacksAndMessages(null);
        this.f66403o = null;
        this.f66387L = true;
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final long zzd() {
        if (this.f66379D) {
            this.f66379D = false;
        } else {
            if (!this.f66378C) {
                return -9223372036854775807L;
            }
            if (!this.f66386K && z() <= this.f66385J) {
                return -9223372036854775807L;
            }
            this.f66378C = false;
        }
        return this.f66382G;
    }

    public EF0(Uri uri, InterfaceC9305rh0 interfaceC9305rh0, InterfaceC9374sF0 interfaceC9374sF0, BD0 bd0, C9798wD0 c9798wD0, C8416jH0 c8416jH0, C8519kF0 c8519kF0, AF0 af0, C7990fH0 c7990fH0, String str, int i10, boolean z10, long j10, BH0 bh0) {
        this.f66389a = uri;
        this.f66390b = interfaceC9305rh0;
        this.f66391c = bd0;
        this.f66393e = c9798wD0;
        this.f66392d = c8519kF0;
        this.f66394f = af0;
        this.f66388M = c7990fH0;
        this.f66395g = i10;
        this.f66398j = interfaceC9374sF0;
        this.f66396h = j10;
    }

    private final void E(int i10) {
        C();
        DF0 df0 = this.f66411w;
        boolean[] zArr = df0.f66202d;
        if (!zArr[i10]) {
            C cB = df0.f66199a.b(i10).b(0);
            this.f66392d.d(new WE0(1, C7057Pc.b(cB.f65664o), cB, 0, null, OV.N(this.f66382G), -9223372036854775807L));
            zArr[i10] = true;
        }
    }

    private final void F(int i10) {
        C();
        boolean[] zArr = this.f66411w.f66200b;
        if (this.f66384I && zArr[i10] && !this.f66405q[i10].M(false)) {
            this.f66383H = 0L;
            this.f66384I = false;
            this.f66378C = true;
            this.f66382G = 0L;
            this.f66385J = 0;
            for (RF0 rf0 : this.f66405q) {
                rf0.H(false);
            }
            XE0 xe0 = this.f66403o;
            xe0.getClass();
            xe0.d(this);
        }
    }

    final int J(int i10, Zz0 zz0, By0 by0, int i11) {
        if (I()) {
            return -3;
        }
        E(i10);
        int iZ = this.f66405q[i10].z(zz0, by0, i11, this.f66386K);
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
        RF0 rf0 = this.f66405q[i10];
        int iX = rf0.x(j10, this.f66386K);
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
            com.google.android.gms.internal.ads.DF0 r0 = r8.f66411w
            boolean[] r0 = r0.f66200b
            com.google.android.gms.internal.ads.Q0 r1 = r8.f66412x
            boolean r1 = r1.zzh()
            r2 = 1
            if (r2 == r1) goto L12
            r9 = 0
        L12:
            r1 = 0
            r8.f66378C = r1
            long r2 = r8.f66382G
            r8.f66382G = r9
            boolean r4 = r8.H()
            if (r4 == 0) goto L22
            r8.f66383H = r9
            return r9
        L22:
            int r4 = r8.f66376A
            r5 = 7
            if (r4 == r5) goto L67
            boolean r4 = r8.f66386K
            if (r4 != 0) goto L33
            com.google.android.gms.internal.ads.sH0 r4 = r8.f66397i
            boolean r4 = r4.l()
            if (r4 == 0) goto L67
        L33:
            com.google.android.gms.internal.ads.RF0[] r4 = r8.f66405q
            int r4 = r4.length
            r5 = r1
        L37:
            if (r5 >= r4) goto L9b
            com.google.android.gms.internal.ads.RF0[] r6 = r8.f66405q
            r6 = r6[r5]
            int r7 = r6.w()
            if (r7 != 0) goto L48
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 != 0) goto L48
            goto L64
        L48:
            boolean r7 = r8.f66410v
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
            boolean r6 = r8.f66409u
            if (r6 != 0) goto L64
            goto L67
        L64:
            int r5 = r5 + 1
            goto L37
        L67:
            r8.f66384I = r1
            r8.f66383H = r9
            r8.f66386K = r1
            r8.f66379D = r1
            com.google.android.gms.internal.ads.sH0 r0 = r8.f66397i
            boolean r2 = r0.l()
            if (r2 == 0) goto L8a
            com.google.android.gms.internal.ads.RF0[] r0 = r8.f66405q
            int r2 = r0.length
        L7a:
            if (r1 >= r2) goto L84
            r3 = r0[r1]
            r3.D()
            int r1 = r1 + 1
            goto L7a
        L84:
            com.google.android.gms.internal.ads.sH0 r0 = r8.f66397i
            r0.g()
            return r9
        L8a:
            r0.h()
            com.google.android.gms.internal.ads.RF0[] r0 = r8.f66405q
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
        DF0 df0 = this.f66411w;
        C7775dG0 c7775dG0 = df0.f66199a;
        boolean[] zArr3 = df0.f66201c;
        int i10 = this.f66380E;
        int i11 = 0;
        for (int i12 = 0; i12 < pg0Arr.length; i12++) {
            SF0 sf0 = sf0Arr[i12];
            if (sf0 != null && (pg0Arr[i12] == null || !zArr[i12])) {
                int i13 = ((BF0) sf0).f65492a;
                C8086gC.f(zArr3[i13]);
                this.f66380E--;
                zArr3[i13] = false;
                sf0Arr[i12] = null;
            }
        }
        if (!this.f66377B ? !(j10 == 0 || this.f66410v) : i10 == 0) {
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
                C8086gC.f(z11);
                if (pg0.zza(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C8086gC.f(z12);
                int iA = c7775dG0.a(pg0.zzg());
                C8086gC.f(!zArr3[iA]);
                this.f66380E++;
                zArr3[iA] = true;
                this.f66379D = pg0.zzf().f65670u | this.f66379D;
                sf0Arr[i14] = new BF0(this, iA);
                zArr2[i14] = true;
                if (!z10) {
                    RF0 rf0 = this.f66405q[iA];
                    if (rf0.w() != 0 && !rf0.h(j10, true)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.f66380E == 0) {
            this.f66384I = false;
            this.f66378C = false;
            this.f66379D = false;
            if (this.f66397i.l()) {
                RF0[] rf0Arr = this.f66405q;
                int length = rf0Arr.length;
                while (i11 < length) {
                    rf0Arr[i11].D();
                    i11++;
                }
                this.f66397i.g();
            } else {
                this.f66386K = false;
                for (RF0 rf02 : this.f66405q) {
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
        this.f66377B = true;
        return j10;
    }

    final boolean y(int i10) {
        if (!I() && this.f66405q[i10].M(this.f66386K)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final long zzb() {
        long jA;
        C();
        if (this.f66386K || this.f66380E == 0) {
            return Long.MIN_VALUE;
        }
        if (H()) {
            return this.f66383H;
        }
        if (this.f66409u) {
            int length = this.f66405q.length;
            jA = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                DF0 df0 = this.f66411w;
                if (df0.f66200b[i10] && df0.f66201c[i10] && !this.f66405q[i10].L()) {
                    jA = Math.min(jA, this.f66405q[i10].A());
                }
            }
        } else {
            jA = Long.MAX_VALUE;
        }
        if (jA == Long.MAX_VALUE) {
            jA = A(false);
        }
        if (jA == Long.MIN_VALUE) {
            return this.f66382G;
        }
        return jA;
    }

    @Override // com.google.android.gms.internal.ads.YE0, com.google.android.gms.internal.ads.VF0
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final C7775dG0 zzh() {
        C();
        return this.f66411w.f66199a;
    }

    @Override // com.google.android.gms.internal.ads.YE0
    public final void zzk() throws IOException {
        v();
        if (this.f66386K && !this.f66408t) {
            throw zzbc.a("Loading finished before preparation is complete.", null);
        }
    }
}
