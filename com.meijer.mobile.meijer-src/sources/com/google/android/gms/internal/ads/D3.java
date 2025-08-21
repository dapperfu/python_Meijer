package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class D3 implements InterfaceC9255q0, Q0 {

    /* renamed from: A, reason: collision with root package name */
    private int f66947A;

    /* renamed from: B, reason: collision with root package name */
    private B2 f66948B;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8835m4 f66949a;

    /* renamed from: b, reason: collision with root package name */
    private final int f66950b;

    /* renamed from: c, reason: collision with root package name */
    private final GQ f66951c;

    /* renamed from: d, reason: collision with root package name */
    private final GQ f66952d;

    /* renamed from: e, reason: collision with root package name */
    private final GQ f66953e;

    /* renamed from: f, reason: collision with root package name */
    private final GQ f66954f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f66955g;

    /* renamed from: h, reason: collision with root package name */
    private final H3 f66956h;

    /* renamed from: i, reason: collision with root package name */
    private final List f66957i;

    /* renamed from: j, reason: collision with root package name */
    private AbstractC8042eh0 f66958j;

    /* renamed from: k, reason: collision with root package name */
    private int f66959k;

    /* renamed from: l, reason: collision with root package name */
    private int f66960l;

    /* renamed from: m, reason: collision with root package name */
    private long f66961m;

    /* renamed from: n, reason: collision with root package name */
    private int f66962n;

    /* renamed from: o, reason: collision with root package name */
    private GQ f66963o;

    /* renamed from: p, reason: collision with root package name */
    private int f66964p;

    /* renamed from: q, reason: collision with root package name */
    private int f66965q;

    /* renamed from: r, reason: collision with root package name */
    private int f66966r;

    /* renamed from: s, reason: collision with root package name */
    private int f66967s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f66968t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f66969u;

    /* renamed from: v, reason: collision with root package name */
    private InterfaceC9575t0 f66970v;

    /* renamed from: w, reason: collision with root package name */
    private C3[] f66971w;

    /* renamed from: x, reason: collision with root package name */
    private long[][] f66972x;

    /* renamed from: y, reason: collision with root package name */
    private int f66973y;

    /* renamed from: z, reason: collision with root package name */
    private long f66974z;

    @Deprecated
    public D3() {
        this(InterfaceC8835m4.f77550a, 16);
    }

    private static int e(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private final void i() {
        this.f66959k = 0;
        this.f66962n = 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f66974z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ InterfaceC9255q0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ List zzd() {
        return this.f66958j;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return true;
    }

    public D3(InterfaceC8835m4 interfaceC8835m4, int i10) {
        this.f66949a = interfaceC8835m4;
        this.f66950b = i10;
        this.f66958j = AbstractC8042eh0.t();
        this.f66959k = (i10 & 4) != 0 ? 3 : 0;
        this.f66956h = new H3();
        this.f66957i = new ArrayList();
        this.f66954f = new GQ(16);
        this.f66955g = new ArrayDeque();
        this.f66951c = new GQ(C9310qa0.f78636a);
        this.f66952d = new GQ(5);
        this.f66953e = new GQ();
        this.f66964p = -1;
        this.f66970v = InterfaceC9575t0.f79304h3;
        this.f66971w = new C3[0];
        this.f66968t = true;
    }

    private final void j(long j10) throws zzbc {
        C8776lb c8776lb;
        long j11;
        List list;
        int i10;
        F0 f02;
        ArrayList arrayList;
        int i11;
        while (!this.f66955g.isEmpty() && ((C9734uY) this.f66955g.peek()).f79699b == j10) {
            C9734uY c9734uY = (C9734uY) this.f66955g.pop();
            if (c9734uY.f72186a == 1836019574) {
                C9734uY c9734uYB = c9734uY.b(1835365473);
                new ArrayList();
                C8776lb c8776lbB = c9734uYB != null ? C9474s3.b(c9734uYB) : null;
                ArrayList arrayList2 = new ArrayList();
                boolean z10 = this.f66947A == 1;
                F0 f03 = new F0();
                VY vyC = c9734uY.c(1969517665);
                if (vyC != null) {
                    C8776lb c8776lbC = C9474s3.c(vyC);
                    f03.b(c8776lbC);
                    c8776lb = c8776lbC;
                } else {
                    c8776lb = null;
                }
                VY vyC2 = c9734uY.c(1836476516);
                vyC2.getClass();
                ArrayList arrayList3 = arrayList2;
                C8776lb c8776lb2 = new C8776lb(-9223372036854775807L, C9474s3.d(vyC2.f71726b));
                long j12 = -9223372036854775807L;
                List listF = C9474s3.f(c9734uY, f03, -9223372036854775807L, null, 1 == (this.f66950b & 1), z10, new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.B3
                    @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
                    public final Object apply(Object obj) {
                        return (K3) obj;
                    }
                });
                int i12 = 0;
                int i13 = 0;
                long jMax = -9223372036854775807L;
                int size = -1;
                while (true) {
                    j11 = 0;
                    if (i12 >= listF.size()) {
                        break;
                    }
                    N3 n32 = (N3) listF.get(i12);
                    if (n32.f69635b == 0) {
                        list = listF;
                        f02 = f03;
                        i10 = i12;
                        arrayList = arrayList3;
                    } else {
                        K3 k32 = n32.f69634a;
                        int i14 = i13 + 1;
                        C3 c32 = new C3(k32, n32, this.f66970v.a(i13, k32.f68859b));
                        List list2 = listF;
                        long j13 = k32.f68862e;
                        if (j13 == j12) {
                            j13 = n32.f69641h;
                        }
                        c32.f66530c.e(j13);
                        jMax = Math.max(jMax, j13);
                        list = list2;
                        int i15 = "audio/true-hd".equals(k32.f68864g.f66504o) ? n32.f69638e * 16 : n32.f69638e + 30;
                        C9717uH0 c9717uH0B = k32.f68864g.b();
                        c9717uH0B.r(i15);
                        i10 = i12;
                        if (k32.f68859b == 2) {
                            C c10 = k32.f68864g;
                            int i16 = this.f66950b;
                            int i17 = c10.f66495f;
                            if ((i16 & 8) != 0) {
                                i17 |= size == -1 ? 1 : 2;
                            }
                            if (c10.f66513x == -1.0f && j13 > 0 && (i11 = n32.f69635b) > 0) {
                                c9717uH0B.i(i11 / (j13 / 1000000.0f));
                            }
                            c9717uH0B.y(i17);
                        }
                        if (k32.f68859b == 1 && f03.a()) {
                            c9717uH0B.g(f03.f67529a);
                            c9717uH0B.h(f03.f67530b);
                        }
                        int i18 = k32.f68859b;
                        C8776lb[] c8776lbArr = {this.f66957i.isEmpty() ? null : new C8776lb(this.f66957i), c8776lb, c8776lb2};
                        f02 = f03;
                        C8776lb c8776lb3 = new C8776lb(j12, new InterfaceC7009Ka[0]);
                        if (c8776lbB != null) {
                            for (int i19 = 0; i19 < c8776lbB.a(); i19++) {
                                InterfaceC7009Ka interfaceC7009KaB = c8776lbB.b(i19);
                                if (interfaceC7009KaB instanceof TX) {
                                    TX tx = (TX) interfaceC7009KaB;
                                    if (!tx.f71240a.equals("com.android.capture.fps")) {
                                        c8776lb3 = c8776lb3.c(tx);
                                    } else if (i18 == 2) {
                                        c8776lb3 = c8776lb3.c(tx);
                                    }
                                }
                            }
                        }
                        for (int i20 = 0; i20 < 3; i20++) {
                            c8776lb3 = c8776lb3.d(c8776lbArr[i20]);
                        }
                        if (c8776lb3.a() > 0) {
                            c9717uH0B.t(c8776lb3);
                        }
                        c32.f66530c.d(c9717uH0B.H());
                        if (k32.f68859b == 2 && size == -1) {
                            size = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(c32);
                        i13 = i14;
                    }
                    arrayList3 = arrayList;
                    i12 = i10 + 1;
                    listF = list;
                    f03 = f02;
                    j12 = -9223372036854775807L;
                }
                this.f66973y = size;
                this.f66974z = jMax;
                C3[] c3Arr = (C3[]) arrayList3.toArray(new C3[0]);
                this.f66971w = c3Arr;
                int length = c3Arr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i21 = 0; i21 < c3Arr.length; i21++) {
                    jArr[i21] = new long[c3Arr[i21].f66529b.f69635b];
                    jArr2[i21] = c3Arr[i21].f66529b.f69639f[0];
                }
                int i22 = 0;
                while (i22 < c3Arr.length) {
                    long j14 = Long.MAX_VALUE;
                    int i23 = -1;
                    for (int i24 = 0; i24 < c3Arr.length; i24++) {
                        if (!zArr[i24]) {
                            long j15 = jArr2[i24];
                            if (j15 <= j14) {
                                i23 = i24;
                                j14 = j15;
                            }
                        }
                    }
                    int i25 = iArr[i23];
                    long[] jArr3 = jArr[i23];
                    jArr3[i25] = j11;
                    N3 n33 = c3Arr[i23].f66529b;
                    j11 += n33.f69637d[i25];
                    int i26 = i25 + 1;
                    iArr[i23] = i26;
                    if (i26 < jArr3.length) {
                        jArr2[i23] = n33.f69639f[i26];
                    } else {
                        zArr[i23] = true;
                        i22++;
                    }
                }
                this.f66972x = jArr;
                this.f66970v.e();
                this.f66970v.m(this);
                this.f66955g.clear();
                this.f66959k = 2;
            } else if (!this.f66955g.isEmpty()) {
                ((C9734uY) this.f66955g.peek()).d(c9734uY);
            }
        }
        if (this.f66959k != 2) {
            i();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void a(long j10, long j11) {
        this.f66955g.clear();
        this.f66962n = 0;
        this.f66964p = -1;
        this.f66965q = 0;
        this.f66966r = 0;
        this.f66967s = 0;
        this.f66968t = true;
        if (j10 == 0) {
            if (this.f66959k != 3) {
                i();
                return;
            } else {
                this.f66956h.b();
                this.f66957i.clear();
                return;
            }
        }
        for (C3 c32 : this.f66971w) {
            N3 n32 = c32.f66529b;
            int iA = n32.a(j11);
            if (iA == -1) {
                iA = n32.b(j11);
            }
            c32.f66532e = iA;
            Y0 y02 = c32.f66531d;
            if (y02 != null) {
                y02.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:293:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.google.android.gms.internal.ads.InterfaceC9361r0 r36, com.google.android.gms.internal.ads.N0 r37) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.D3.b(com.google.android.gms.internal.ads.r0, com.google.android.gms.internal.ads.N0):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final boolean c(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        U0 u0B = J3.b(interfaceC9361r0, (this.f66950b & 2) != 0);
        this.f66958j = u0B != null ? AbstractC8042eh0.u(u0B) : AbstractC8042eh0.t();
        return u0B == null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void d(InterfaceC9575t0 interfaceC9575t0) {
        if ((this.f66950b & 16) == 0) {
            interfaceC9575t0 = new C9156p4(interfaceC9575t0, this.f66949a);
        }
        this.f66970v = interfaceC9575t0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        long j11;
        long j12;
        int iB;
        C3[] c3Arr = this.f66971w;
        if (c3Arr.length == 0) {
            R0 r02 = R0.f70546c;
            return new O0(r02, r02);
        }
        int i10 = this.f66973y;
        long jH = -1;
        if (i10 != -1) {
            N3 n32 = c3Arr[i10].f66529b;
            int iG = g(n32, j10);
            if (iG == -1) {
                R0 r03 = R0.f70546c;
                return new O0(r03, r03);
            }
            long j13 = n32.f69639f[iG];
            j11 = n32.f69636c[iG];
            if (j13 >= j10 || iG >= n32.f69635b - 1 || (iB = n32.b(j10)) == -1 || iB == iG) {
                j12 = -9223372036854775807L;
            } else {
                j12 = n32.f69639f[iB];
                jH = n32.f69636c[iB];
            }
            j10 = j13;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            C3[] c3Arr2 = this.f66971w;
            if (i11 >= c3Arr2.length) {
                break;
            }
            if (i11 != this.f66973y) {
                N3 n33 = c3Arr2[i11].f66529b;
                long jH2 = h(n33, j10, j11);
                if (j12 != -9223372036854775807L) {
                    jH = h(n33, j12, jH);
                }
                j11 = jH2;
            }
            i11++;
        }
        R0 r04 = new R0(j10, j11);
        return j12 == -9223372036854775807L ? new O0(r04, r04) : new O0(r04, new R0(j12, jH));
    }

    private static int g(N3 n32, long j10) {
        int iA = n32.a(j10);
        if (iA == -1) {
            return n32.b(j10);
        }
        return iA;
    }

    private static long h(N3 n32, long j10, long j11) {
        int iG = g(n32, j10);
        if (iG == -1) {
            return j11;
        }
        return Math.min(n32.f69636c[iG], j11);
    }
}
