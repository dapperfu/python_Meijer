package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class D3 implements InterfaceC9130q0, Q0 {

    /* renamed from: A, reason: collision with root package name */
    private int f66107A;

    /* renamed from: B, reason: collision with root package name */
    private B2 f66108B;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8710m4 f66109a;

    /* renamed from: b, reason: collision with root package name */
    private final int f66110b;

    /* renamed from: c, reason: collision with root package name */
    private final GQ f66111c;

    /* renamed from: d, reason: collision with root package name */
    private final GQ f66112d;

    /* renamed from: e, reason: collision with root package name */
    private final GQ f66113e;

    /* renamed from: f, reason: collision with root package name */
    private final GQ f66114f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f66115g;

    /* renamed from: h, reason: collision with root package name */
    private final H3 f66116h;

    /* renamed from: i, reason: collision with root package name */
    private final List f66117i;

    /* renamed from: j, reason: collision with root package name */
    private AbstractC7917eh0 f66118j;

    /* renamed from: k, reason: collision with root package name */
    private int f66119k;

    /* renamed from: l, reason: collision with root package name */
    private int f66120l;

    /* renamed from: m, reason: collision with root package name */
    private long f66121m;

    /* renamed from: n, reason: collision with root package name */
    private int f66122n;

    /* renamed from: o, reason: collision with root package name */
    private GQ f66123o;

    /* renamed from: p, reason: collision with root package name */
    private int f66124p;

    /* renamed from: q, reason: collision with root package name */
    private int f66125q;

    /* renamed from: r, reason: collision with root package name */
    private int f66126r;

    /* renamed from: s, reason: collision with root package name */
    private int f66127s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f66128t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f66129u;

    /* renamed from: v, reason: collision with root package name */
    private InterfaceC9450t0 f66130v;

    /* renamed from: w, reason: collision with root package name */
    private C3[] f66131w;

    /* renamed from: x, reason: collision with root package name */
    private long[][] f66132x;

    /* renamed from: y, reason: collision with root package name */
    private int f66133y;

    /* renamed from: z, reason: collision with root package name */
    private long f66134z;

    @Deprecated
    public D3() {
        this(InterfaceC8710m4.f76710a, 16);
    }

    private static int e(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private final void i() {
        this.f66119k = 0;
        this.f66122n = 0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f66134z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ InterfaceC9130q0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ List zzd() {
        return this.f66118j;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return true;
    }

    public D3(InterfaceC8710m4 interfaceC8710m4, int i10) {
        this.f66109a = interfaceC8710m4;
        this.f66110b = i10;
        this.f66118j = AbstractC7917eh0.t();
        this.f66119k = (i10 & 4) != 0 ? 3 : 0;
        this.f66116h = new H3();
        this.f66117i = new ArrayList();
        this.f66114f = new GQ(16);
        this.f66115g = new ArrayDeque();
        this.f66111c = new GQ(C9185qa0.f77796a);
        this.f66112d = new GQ(5);
        this.f66113e = new GQ();
        this.f66124p = -1;
        this.f66130v = InterfaceC9450t0.f78464h3;
        this.f66131w = new C3[0];
        this.f66128t = true;
    }

    private final void j(long j10) throws zzbc {
        C8651lb c8651lb;
        long j11;
        List list;
        int i10;
        F0 f02;
        ArrayList arrayList;
        int i11;
        while (!this.f66115g.isEmpty() && ((C9609uY) this.f66115g.peek()).f78859b == j10) {
            C9609uY c9609uY = (C9609uY) this.f66115g.pop();
            if (c9609uY.f71346a == 1836019574) {
                C9609uY c9609uYB = c9609uY.b(1835365473);
                new ArrayList();
                C8651lb c8651lbB = c9609uYB != null ? C9349s3.b(c9609uYB) : null;
                ArrayList arrayList2 = new ArrayList();
                boolean z10 = this.f66107A == 1;
                F0 f03 = new F0();
                VY vyC = c9609uY.c(1969517665);
                if (vyC != null) {
                    C8651lb c8651lbC = C9349s3.c(vyC);
                    f03.b(c8651lbC);
                    c8651lb = c8651lbC;
                } else {
                    c8651lb = null;
                }
                VY vyC2 = c9609uY.c(1836476516);
                vyC2.getClass();
                ArrayList arrayList3 = arrayList2;
                C8651lb c8651lb2 = new C8651lb(-9223372036854775807L, C9349s3.d(vyC2.f70886b));
                long j12 = -9223372036854775807L;
                List listF = C9349s3.f(c9609uY, f03, -9223372036854775807L, null, 1 == (this.f66110b & 1), z10, new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.B3
                    @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
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
                    if (n32.f68795b == 0) {
                        list = listF;
                        f02 = f03;
                        i10 = i12;
                        arrayList = arrayList3;
                    } else {
                        K3 k32 = n32.f68794a;
                        int i14 = i13 + 1;
                        C3 c32 = new C3(k32, n32, this.f66130v.a(i13, k32.f68019b));
                        List list2 = listF;
                        long j13 = k32.f68022e;
                        if (j13 == j12) {
                            j13 = n32.f68801h;
                        }
                        c32.f65690c.e(j13);
                        jMax = Math.max(jMax, j13);
                        list = list2;
                        int i15 = "audio/true-hd".equals(k32.f68024g.f65664o) ? n32.f68798e * 16 : n32.f68798e + 30;
                        C9592uH0 c9592uH0B = k32.f68024g.b();
                        c9592uH0B.r(i15);
                        i10 = i12;
                        if (k32.f68019b == 2) {
                            C c10 = k32.f68024g;
                            int i16 = this.f66110b;
                            int i17 = c10.f65655f;
                            if ((i16 & 8) != 0) {
                                i17 |= size == -1 ? 1 : 2;
                            }
                            if (c10.f65673x == -1.0f && j13 > 0 && (i11 = n32.f68795b) > 0) {
                                c9592uH0B.i(i11 / (j13 / 1000000.0f));
                            }
                            c9592uH0B.y(i17);
                        }
                        if (k32.f68019b == 1 && f03.a()) {
                            c9592uH0B.g(f03.f66689a);
                            c9592uH0B.h(f03.f66690b);
                        }
                        int i18 = k32.f68019b;
                        C8651lb[] c8651lbArr = {this.f66117i.isEmpty() ? null : new C8651lb(this.f66117i), c8651lb, c8651lb2};
                        f02 = f03;
                        C8651lb c8651lb3 = new C8651lb(j12, new InterfaceC6884Ka[0]);
                        if (c8651lbB != null) {
                            for (int i19 = 0; i19 < c8651lbB.a(); i19++) {
                                InterfaceC6884Ka interfaceC6884KaB = c8651lbB.b(i19);
                                if (interfaceC6884KaB instanceof TX) {
                                    TX tx = (TX) interfaceC6884KaB;
                                    if (!tx.f70400a.equals("com.android.capture.fps")) {
                                        c8651lb3 = c8651lb3.c(tx);
                                    } else if (i18 == 2) {
                                        c8651lb3 = c8651lb3.c(tx);
                                    }
                                }
                            }
                        }
                        for (int i20 = 0; i20 < 3; i20++) {
                            c8651lb3 = c8651lb3.d(c8651lbArr[i20]);
                        }
                        if (c8651lb3.a() > 0) {
                            c9592uH0B.t(c8651lb3);
                        }
                        c32.f65690c.d(c9592uH0B.H());
                        if (k32.f68019b == 2 && size == -1) {
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
                this.f66133y = size;
                this.f66134z = jMax;
                C3[] c3Arr = (C3[]) arrayList3.toArray(new C3[0]);
                this.f66131w = c3Arr;
                int length = c3Arr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i21 = 0; i21 < c3Arr.length; i21++) {
                    jArr[i21] = new long[c3Arr[i21].f65689b.f68795b];
                    jArr2[i21] = c3Arr[i21].f65689b.f68799f[0];
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
                    N3 n33 = c3Arr[i23].f65689b;
                    j11 += n33.f68797d[i25];
                    int i26 = i25 + 1;
                    iArr[i23] = i26;
                    if (i26 < jArr3.length) {
                        jArr2[i23] = n33.f68799f[i26];
                    } else {
                        zArr[i23] = true;
                        i22++;
                    }
                }
                this.f66132x = jArr;
                this.f66130v.e();
                this.f66130v.m(this);
                this.f66115g.clear();
                this.f66119k = 2;
            } else if (!this.f66115g.isEmpty()) {
                ((C9609uY) this.f66115g.peek()).d(c9609uY);
            }
        }
        if (this.f66119k != 2) {
            i();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void a(long j10, long j11) {
        this.f66115g.clear();
        this.f66122n = 0;
        this.f66124p = -1;
        this.f66125q = 0;
        this.f66126r = 0;
        this.f66127s = 0;
        this.f66128t = true;
        if (j10 == 0) {
            if (this.f66119k != 3) {
                i();
                return;
            } else {
                this.f66116h.b();
                this.f66117i.clear();
                return;
            }
        }
        for (C3 c32 : this.f66131w) {
            N3 n32 = c32.f65689b;
            int iA = n32.a(j11);
            if (iA == -1) {
                iA = n32.b(j11);
            }
            c32.f65692e = iA;
            Y0 y02 = c32.f65691d;
            if (y02 != null) {
                y02.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:293:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.google.android.gms.internal.ads.InterfaceC9236r0 r36, com.google.android.gms.internal.ads.N0 r37) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.D3.b(com.google.android.gms.internal.ads.r0, com.google.android.gms.internal.ads.N0):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final boolean c(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        U0 u0B = J3.b(interfaceC9236r0, (this.f66110b & 2) != 0);
        this.f66118j = u0B != null ? AbstractC7917eh0.u(u0B) : AbstractC7917eh0.t();
        return u0B == null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void d(InterfaceC9450t0 interfaceC9450t0) {
        if ((this.f66110b & 16) == 0) {
            interfaceC9450t0 = new C9031p4(interfaceC9450t0, this.f66109a);
        }
        this.f66130v = interfaceC9450t0;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        long j11;
        long j12;
        int iB;
        C3[] c3Arr = this.f66131w;
        if (c3Arr.length == 0) {
            R0 r02 = R0.f69706c;
            return new O0(r02, r02);
        }
        int i10 = this.f66133y;
        long jH = -1;
        if (i10 != -1) {
            N3 n32 = c3Arr[i10].f65689b;
            int iG = g(n32, j10);
            if (iG == -1) {
                R0 r03 = R0.f69706c;
                return new O0(r03, r03);
            }
            long j13 = n32.f68799f[iG];
            j11 = n32.f68796c[iG];
            if (j13 >= j10 || iG >= n32.f68795b - 1 || (iB = n32.b(j10)) == -1 || iB == iG) {
                j12 = -9223372036854775807L;
            } else {
                j12 = n32.f68799f[iB];
                jH = n32.f68796c[iB];
            }
            j10 = j13;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            C3[] c3Arr2 = this.f66131w;
            if (i11 >= c3Arr2.length) {
                break;
            }
            if (i11 != this.f66133y) {
                N3 n33 = c3Arr2[i11].f65689b;
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
        return Math.min(n32.f68796c[iG], j11);
    }
}
