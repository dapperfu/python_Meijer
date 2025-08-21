package androidx.media3.exoplayer;

import Ee.L;
import a3.F;
import android.util.Pair;
import androidx.media3.exoplayer.C6205m0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.r;
import d3.C13599a;
import d3.InterfaceC13612n;
import i3.InterfaceC14599a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6211p0 {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14599a f56755c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC13612n f56756d;

    /* renamed from: e, reason: collision with root package name */
    private final C6205m0.a f56757e;

    /* renamed from: f, reason: collision with root package name */
    private long f56758f;

    /* renamed from: g, reason: collision with root package name */
    private int f56759g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f56760h;

    /* renamed from: i, reason: collision with root package name */
    private ExoPlayer.c f56761i;

    /* renamed from: j, reason: collision with root package name */
    private C6205m0 f56762j;

    /* renamed from: k, reason: collision with root package name */
    private C6205m0 f56763k;

    /* renamed from: l, reason: collision with root package name */
    private C6205m0 f56764l;

    /* renamed from: m, reason: collision with root package name */
    private C6205m0 f56765m;

    /* renamed from: n, reason: collision with root package name */
    private C6205m0 f56766n;

    /* renamed from: o, reason: collision with root package name */
    private int f56767o;

    /* renamed from: p, reason: collision with root package name */
    private Object f56768p;

    /* renamed from: q, reason: collision with root package name */
    private long f56769q;

    /* renamed from: a, reason: collision with root package name */
    private final F.b f56753a = new F.b();

    /* renamed from: b, reason: collision with root package name */
    private final F.c f56754b = new F.c();

    /* renamed from: r, reason: collision with root package name */
    private List<C6205m0> f56770r = new ArrayList();

    private void L(List<C6205m0> list) {
        for (int i10 = 0; i10 < this.f56770r.size(); i10++) {
            this.f56770r.get(i10).x();
        }
        this.f56770r = list;
        this.f56766n = null;
        I();
    }

    private C6205m0 O(C6207n0 c6207n0) {
        for (int i10 = 0; i10 < this.f56770r.size(); i10++) {
            if (this.f56770r.get(i10).d(c6207n0)) {
                return this.f56770r.remove(i10);
            }
        }
        return null;
    }

    private long S(Object obj) {
        for (int i10 = 0; i10 < this.f56770r.size(); i10++) {
            C6205m0 c6205m0 = this.f56770r.get(i10);
            if (c6205m0.f56556b.equals(obj)) {
                return c6205m0.f56562h.f56737a.f57160d;
            }
        }
        return -1L;
    }

    static boolean e(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    public C6205m0 v(androidx.media3.exoplayer.source.q qVar) {
        for (int i10 = 0; i10 < this.f56770r.size(); i10++) {
            C6205m0 c6205m0 = this.f56770r.get(i10);
            if (c6205m0.f56555a == qVar) {
                return c6205m0;
            }
        }
        return null;
    }

    private boolean A(Object obj, a3.F f10) {
        int iC = f10.h(obj, this.f56753a).c();
        int iP = this.f56753a.p();
        if (iC <= 0 || !this.f56753a.s(iP)) {
            return false;
        }
        return iC > 1 || this.f56753a.f(iP) != Long.MIN_VALUE;
    }

    private boolean D(a3.F f10, r.b bVar, boolean z10) {
        int iB = f10.b(bVar.f57157a);
        return !f10.n(f10.f(iB, this.f56753a).f44412c, this.f56754b).f44441i && f10.r(iB, this.f56753a, this.f56754b, this.f56759g, this.f56760h) && z10;
    }

    private long R(a3.F f10, Object obj) {
        int iB;
        int i10 = f10.h(obj, this.f56753a).f44412c;
        Object obj2 = this.f56768p;
        if (obj2 != null && (iB = f10.b(obj2)) != -1 && f10.f(iB, this.f56753a).f44412c == i10) {
            return this.f56769q;
        }
        for (C6205m0 c6205m0K = this.f56762j; c6205m0K != null; c6205m0K = c6205m0K.k()) {
            if (c6205m0K.f56556b.equals(obj)) {
                return c6205m0K.f56562h.f56737a.f57160d;
            }
        }
        for (C6205m0 c6205m0K2 = this.f56762j; c6205m0K2 != null; c6205m0K2 = c6205m0K2.k()) {
            int iB2 = f10.b(c6205m0K2.f56556b);
            if (iB2 != -1 && f10.f(iB2, this.f56753a).f44412c == i10) {
                return c6205m0K2.f56562h.f56737a.f57160d;
            }
        }
        long jS = S(obj);
        if (jS != -1) {
            return jS;
        }
        long j10 = this.f56758f;
        this.f56758f = 1 + j10;
        if (this.f56762j == null) {
            this.f56768p = obj;
            this.f56769q = j10;
        }
        return j10;
    }

    private int U(a3.F f10) {
        a3.F f11;
        C6205m0 c6205m0K = this.f56762j;
        if (c6205m0K == null) {
            return 0;
        }
        int iB = f10.b(c6205m0K.f56556b);
        while (true) {
            f11 = f10;
            iB = f11.d(iB, this.f56753a, this.f56754b, this.f56759g, this.f56760h);
            while (((C6205m0) C13599a.e(c6205m0K)).k() != null && !c6205m0K.f56562h.f56744h) {
                c6205m0K = c6205m0K.k();
            }
            C6205m0 c6205m0K2 = c6205m0K.k();
            if (iB == -1 || c6205m0K2 == null || f11.b(c6205m0K2.f56556b) != iB) {
                break;
            }
            c6205m0K = c6205m0K2;
            f10 = f11;
        }
        int iN = N(c6205m0K);
        c6205m0K.f56562h = z(f11, c6205m0K.f56562h);
        return iN;
    }

    private boolean f(C6207n0 c6207n0, C6207n0 c6207n02) {
        return c6207n0.f56738b == c6207n02.f56738b && c6207n0.f56737a.equals(c6207n02.f56737a);
    }

    private Pair<Object, Long> i(a3.F f10, Object obj, long j10) {
        int iE = f10.e(f10.h(obj, this.f56753a).f44412c, this.f56759g, this.f56760h);
        if (iE != -1) {
            return f10.k(this.f56754b, this.f56753a, iE, -9223372036854775807L, j10);
        }
        return null;
    }

    private C6207n0 j(E0 e02) {
        return o(e02.f55735a, e02.f55736b, e02.f55737c, e02.f55753s);
    }

    private C6207n0 k(a3.F f10, C6205m0 c6205m0, long j10) {
        Object obj;
        long j11;
        C6207n0 c6207n0 = c6205m0.f56562h;
        int iD = f10.d(f10.b(c6207n0.f56737a.f57157a), this.f56753a, this.f56754b, this.f56759g, this.f56760h);
        if (iD == -1) {
            return null;
        }
        int i10 = f10.g(iD, this.f56753a, true).f44412c;
        Object objE = C13599a.e(this.f56753a.f44411b);
        long j12 = c6207n0.f56737a.f57160d;
        long j13 = 0;
        if (f10.n(i10, this.f56754b).f44446n == iD) {
            Pair<Object, Long> pairK = f10.k(this.f56754b, this.f56753a, i10, -9223372036854775807L, Math.max(0L, j10));
            if (pairK == null) {
                return null;
            }
            Object obj2 = pairK.first;
            long jLongValue = ((Long) pairK.second).longValue();
            C6205m0 c6205m0K = c6205m0.k();
            if (c6205m0K == null || !c6205m0K.f56556b.equals(obj2)) {
                long jS = S(obj2);
                if (jS == -1) {
                    jS = this.f56758f;
                    this.f56758f = 1 + jS;
                }
                j12 = jS;
            } else {
                j12 = c6205m0K.f56562h.f56737a.f57160d;
            }
            obj = obj2;
            j11 = jLongValue;
            j13 = -9223372036854775807L;
        } else {
            obj = objE;
            j11 = 0;
        }
        r.b bVarP = P(f10, obj, j11, j12, this.f56754b, this.f56753a);
        if (j13 != -9223372036854775807L && c6207n0.f56739c != -9223372036854775807L) {
            boolean zA = A(c6207n0.f56737a.f57157a, f10);
            if (bVarP.b() && zA) {
                j13 = c6207n0.f56739c;
            } else if (zA) {
                j11 = c6207n0.f56739c;
            }
        }
        return o(f10, bVarP, j13, j11);
    }

    private C6207n0 l(a3.F f10, C6205m0 c6205m0, long j10) {
        C6207n0 c6207n0 = c6205m0.f56562h;
        long jM = (c6205m0.m() + c6207n0.f56741e) - j10;
        return c6207n0.f56744h ? k(f10, c6205m0, jM) : m(f10, c6205m0, jM);
    }

    private C6207n0 m(a3.F f10, C6205m0 c6205m0, long j10) {
        C6207n0 c6207n0 = c6205m0.f56562h;
        r.b bVar = c6207n0.f56737a;
        f10.h(bVar.f57157a, this.f56753a);
        boolean z10 = c6207n0.f56743g;
        if (!bVar.b()) {
            int i10 = bVar.f57161e;
            if (i10 != -1 && this.f56753a.r(i10)) {
                return k(f10, c6205m0, j10);
            }
            int iL = this.f56753a.l(bVar.f57161e);
            boolean z11 = this.f56753a.s(bVar.f57161e) && this.f56753a.h(bVar.f57161e, iL) == 3;
            if (iL == this.f56753a.a(bVar.f57161e) || z11) {
                return q(f10, bVar.f57157a, s(f10, bVar.f57157a, bVar.f57161e), c6207n0.f56741e, bVar.f57160d, false);
            }
            return p(f10, bVar.f57157a, bVar.f57161e, iL, c6207n0.f56741e, bVar.f57160d, z10);
        }
        int i11 = bVar.f57158b;
        int iA = this.f56753a.a(i11);
        if (iA == -1) {
            return null;
        }
        int iM = this.f56753a.m(i11, bVar.f57159c);
        if (iM < iA) {
            return p(f10, bVar.f57157a, i11, iM, c6207n0.f56739c, bVar.f57160d, z10);
        }
        long jLongValue = c6207n0.f56739c;
        if (jLongValue == -9223372036854775807L) {
            F.c cVar = this.f56754b;
            F.b bVar2 = this.f56753a;
            Pair<Object, Long> pairK = f10.k(cVar, bVar2, bVar2.f44412c, -9223372036854775807L, Math.max(0L, j10));
            if (pairK == null) {
                return null;
            }
            jLongValue = ((Long) pairK.second).longValue();
        }
        return q(f10, bVar.f57157a, Math.max(s(f10, bVar.f57157a, bVar.f57158b), jLongValue), c6207n0.f56739c, bVar.f57160d, z10);
    }

    private C6207n0 o(a3.F f10, r.b bVar, long j10, long j11) {
        f10.h(bVar.f57157a, this.f56753a);
        return bVar.b() ? p(f10, bVar.f57157a, bVar.f57158b, bVar.f57159c, j10, bVar.f57160d, false) : q(f10, bVar.f57157a, j11, j10, bVar.f57160d, false);
    }

    private C6207n0 p(a3.F f10, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        r.b bVar = new r.b(obj, i10, i11, j11);
        long jB = f10.h(bVar.f57157a, this.f56753a).b(bVar.f57158b, bVar.f57159c);
        long jG = i11 == this.f56753a.l(i10) ? this.f56753a.g() : 0L;
        boolean zS = this.f56753a.s(bVar.f57158b);
        if (jB != -9223372036854775807L && jG >= jB) {
            jG = Math.max(0L, jB - 1);
        }
        return new C6207n0(bVar, jG, j10, -9223372036854775807L, jB, z10, zS, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.media3.exoplayer.C6207n0 q(a3.F r27, java.lang.Object r28, long r29, long r31, long r33, boolean r35) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            a3.F$b r5 = r0.f56753a
            r1.h(r2, r5)
            a3.F$b r5 = r0.f56753a
            int r5 = r5.d(r3)
            r6 = 0
            r7 = 1
            r8 = -1
            if (r5 == r8) goto L22
            a3.F$b r9 = r0.f56753a
            boolean r9 = r9.r(r5)
            if (r9 == 0) goto L22
            r9 = r7
            goto L23
        L22:
            r9 = r6
        L23:
            if (r5 != r8) goto L3b
            a3.F$b r10 = r0.f56753a
            int r10 = r10.c()
            if (r10 <= 0) goto L5a
            a3.F$b r10 = r0.f56753a
            int r11 = r10.p()
            boolean r10 = r10.s(r11)
            if (r10 == 0) goto L5a
            r10 = r7
            goto L5b
        L3b:
            a3.F$b r10 = r0.f56753a
            boolean r10 = r10.s(r5)
            if (r10 == 0) goto L5a
            a3.F$b r10 = r0.f56753a
            long r10 = r10.f(r5)
            a3.F$b r12 = r0.f56753a
            long r13 = r12.f44413d
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 != 0) goto L5a
            boolean r10 = r12.q(r5)
            if (r10 == 0) goto L5a
            r10 = r7
            r5 = r8
            goto L5b
        L5a:
            r10 = r6
        L5b:
            androidx.media3.exoplayer.source.r$b r12 = new androidx.media3.exoplayer.source.r$b
            r13 = r33
            r12.<init>(r2, r13, r5)
            boolean r2 = r0.C(r12)
            boolean r24 = r0.E(r1, r12)
            boolean r25 = r0.D(r1, r12, r2)
            if (r5 == r8) goto L7d
            a3.F$b r1 = r0.f56753a
            boolean r1 = r1.s(r5)
            if (r1 == 0) goto L7d
            if (r9 != 0) goto L7d
            r22 = r7
            goto L7f
        L7d:
            r22 = r6
        L7f:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r8) goto L91
            if (r9 != 0) goto L91
            a3.F$b r1 = r0.f56753a
            long r8 = r1.f(r5)
        L8e:
            r17 = r8
            goto L9a
        L91:
            if (r10 == 0) goto L98
            a3.F$b r1 = r0.f56753a
            long r8 = r1.f44413d
            goto L8e
        L98:
            r17 = r13
        L9a:
            int r1 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r1 == 0) goto La8
            r8 = -9223372036854775808
            int r1 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r1 != 0) goto La5
            goto La8
        La5:
            r19 = r17
            goto Lae
        La8:
            a3.F$b r1 = r0.f56753a
            long r8 = r1.f44413d
            r19 = r8
        Lae:
            int r1 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r1 == 0) goto Lc4
            int r1 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r1 < 0) goto Lc4
            if (r25 != 0) goto Lba
            if (r10 != 0) goto Lbb
        Lba:
            r6 = r7
        Lbb:
            long r3 = (long) r6
            long r3 = r19 - r3
            r5 = 0
            long r3 = java.lang.Math.max(r5, r3)
        Lc4:
            r13 = r3
            androidx.media3.exoplayer.n0 r11 = new androidx.media3.exoplayer.n0
            r15 = r31
            r21 = r35
            r23 = r2
            r11.<init>(r12, r13, r15, r17, r19, r21, r22, r23, r24, r25)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6211p0.q(a3.F, java.lang.Object, long, long, long, boolean):androidx.media3.exoplayer.n0");
    }

    private C6207n0 r(a3.F f10, Object obj, long j10, long j11) {
        r.b bVarP = P(f10, obj, j10, j11, this.f56754b, this.f56753a);
        return bVarP.b() ? p(f10, bVarP.f57157a, bVarP.f57158b, bVarP.f57159c, j10, bVarP.f57160d, false) : q(f10, bVarP.f57157a, j10, -9223372036854775807L, bVarP.f57160d, false);
    }

    private long s(a3.F f10, Object obj, int i10) {
        f10.h(obj, this.f56753a);
        long jF = this.f56753a.f(i10);
        return jF == Long.MIN_VALUE ? this.f56753a.f44413d : jF + this.f56753a.j(i10);
    }

    public void B(a3.F f10) {
        C6205m0 c6205m0;
        if (this.f56761i.f55799a == -9223372036854775807L || (c6205m0 = this.f56765m) == null) {
            M();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair<Object, Long> pairI = i(f10, c6205m0.f56562h.f56737a.f57157a, 0L);
        if (pairI != null && !f10.n(f10.h(pairI.first, this.f56753a).f44412c, this.f56754b).f()) {
            long jS = S(pairI.first);
            if (jS == -1) {
                jS = this.f56758f;
                this.f56758f = 1 + jS;
            }
            C6207n0 c6207n0R = r(f10, pairI.first, ((Long) pairI.second).longValue(), jS);
            C6205m0 c6205m0O = O(c6207n0R);
            if (c6205m0O == null) {
                c6205m0O = this.f56757e.a(c6207n0R, (c6205m0.m() + c6205m0.f56562h.f56741e) - c6207n0R.f56738b);
            }
            arrayList.add(c6205m0O);
        }
        L(arrayList);
    }

    public boolean F(androidx.media3.exoplayer.source.q qVar) {
        C6205m0 c6205m0 = this.f56765m;
        return c6205m0 != null && c6205m0.f56555a == qVar;
    }

    public boolean G(androidx.media3.exoplayer.source.q qVar) {
        C6205m0 c6205m0 = this.f56766n;
        return c6205m0 != null && c6205m0.f56555a == qVar;
    }

    public void I() {
        C6205m0 c6205m0 = this.f56766n;
        if (c6205m0 == null || c6205m0.t()) {
            this.f56766n = null;
            for (int i10 = 0; i10 < this.f56770r.size(); i10++) {
                C6205m0 c6205m02 = this.f56770r.get(i10);
                if (!c6205m02.t()) {
                    this.f56766n = c6205m02;
                    return;
                }
            }
        }
    }

    public void K(long j10) {
        C6205m0 c6205m0 = this.f56765m;
        if (c6205m0 != null) {
            c6205m0.w(j10);
        }
    }

    public void M() {
        if (this.f56770r.isEmpty()) {
            return;
        }
        L(new ArrayList());
    }

    public boolean T() {
        C6205m0 c6205m0 = this.f56765m;
        if (c6205m0 != null) {
            return !c6205m0.f56562h.f56746j && c6205m0.s() && this.f56765m.f56562h.f56741e != -9223372036854775807L && this.f56767o < 100;
        }
        return true;
    }

    public void V(a3.F f10, ExoPlayer.c cVar) {
        this.f56761i = cVar;
        B(f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0086, code lost:
    
        return N(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int W(a3.F r9, long r10, long r12, long r14) {
        /*
            r8 = this;
            androidx.media3.exoplayer.m0 r0 = r8.f56762j
            r1 = 0
        L3:
            r2 = 0
            if (r0 == 0) goto L87
            androidx.media3.exoplayer.n0 r3 = r0.f56562h
            if (r1 != 0) goto Lf
            androidx.media3.exoplayer.n0 r1 = r8.z(r9, r3)
            goto L1e
        Lf:
            androidx.media3.exoplayer.n0 r4 = r8.l(r9, r1, r10)
            if (r4 == 0) goto L82
            boolean r5 = r8.f(r3, r4)
            if (r5 != 0) goto L1d
            goto L82
        L1d:
            r1 = r4
        L1e:
            long r4 = r3.f56739c
            androidx.media3.exoplayer.n0 r4 = r1.a(r4)
            r0.f56562h = r4
            long r3 = r3.f56741e
            long r5 = r1.f56741e
            boolean r3 = e(r3, r5)
            if (r3 != 0) goto L7a
            r0.E()
            long r9 = r1.f56741e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 != 0) goto L44
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L48
        L44:
            long r9 = r0.D(r9)
        L48:
            androidx.media3.exoplayer.m0 r11 = r8.f56763k
            r1 = 1
            r3 = -9223372036854775808
            if (r0 != r11) goto L5f
            androidx.media3.exoplayer.n0 r11 = r0.f56562h
            boolean r11 = r11.f56743g
            if (r11 != 0) goto L5f
            int r11 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r11 == 0) goto L5d
            int r11 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r11 < 0) goto L5f
        L5d:
            r11 = r1
            goto L60
        L5f:
            r11 = r2
        L60:
            androidx.media3.exoplayer.m0 r12 = r8.f56764l
            if (r0 != r12) goto L6d
            int r12 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r12 == 0) goto L6c
            int r9 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r9 < 0) goto L6d
        L6c:
            r2 = r1
        L6d:
            int r9 = r8.N(r0)
            if (r9 == 0) goto L74
            return r9
        L74:
            if (r2 == 0) goto L79
            r9 = r11 | 2
            return r9
        L79:
            return r11
        L7a:
            androidx.media3.exoplayer.m0 r1 = r0.k()
            r7 = r1
            r1 = r0
            r0 = r7
            goto L3
        L82:
            int r9 = r8.N(r1)
            return r9
        L87:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6211p0.W(a3.F, long, long, long):int");
    }

    public int X(a3.F f10, int i10) {
        this.f56759g = i10;
        return U(f10);
    }

    public int Y(a3.F f10, boolean z10) {
        this.f56760h = z10;
        return U(f10);
    }

    public C6205m0 b() {
        C6205m0 c6205m0 = this.f56762j;
        if (c6205m0 == null) {
            return null;
        }
        if (c6205m0 == this.f56763k) {
            this.f56763k = c6205m0.k();
        }
        C6205m0 c6205m02 = this.f56762j;
        if (c6205m02 == this.f56764l) {
            this.f56764l = c6205m02.k();
        }
        this.f56762j.x();
        int i10 = this.f56767o - 1;
        this.f56767o = i10;
        if (i10 == 0) {
            this.f56765m = null;
            C6205m0 c6205m03 = this.f56762j;
            this.f56768p = c6205m03.f56556b;
            this.f56769q = c6205m03.f56562h.f56737a.f57160d;
        }
        this.f56762j = this.f56762j.k();
        J();
        return this.f56762j;
    }

    public C6205m0 c() {
        this.f56764l = ((C6205m0) C13599a.i(this.f56764l)).k();
        J();
        return (C6205m0) C13599a.i(this.f56764l);
    }

    public C6205m0 d() {
        C6205m0 c6205m0 = this.f56764l;
        C6205m0 c6205m02 = this.f56763k;
        if (c6205m0 == c6205m02) {
            this.f56764l = ((C6205m0) C13599a.i(c6205m02)).k();
        }
        this.f56763k = ((C6205m0) C13599a.i(this.f56763k)).k();
        J();
        return (C6205m0) C13599a.i(this.f56763k);
    }

    public void g() {
        if (this.f56767o == 0) {
            return;
        }
        C6205m0 c6205m0K = (C6205m0) C13599a.i(this.f56762j);
        this.f56768p = c6205m0K.f56556b;
        this.f56769q = c6205m0K.f56562h.f56737a.f57160d;
        while (c6205m0K != null) {
            c6205m0K.x();
            c6205m0K = c6205m0K.k();
        }
        this.f56762j = null;
        this.f56765m = null;
        this.f56763k = null;
        this.f56764l = null;
        this.f56767o = 0;
        J();
    }

    public C6205m0 h(C6207n0 c6207n0) {
        C6205m0 c6205m0 = this.f56765m;
        long jM = c6205m0 == null ? 1000000000000L : (c6205m0.m() + this.f56765m.f56562h.f56741e) - c6207n0.f56738b;
        C6205m0 c6205m0O = O(c6207n0);
        if (c6205m0O == null) {
            c6205m0O = this.f56757e.a(c6207n0, jM);
        } else {
            c6205m0O.f56562h = c6207n0;
            c6205m0O.B(jM);
        }
        C6205m0 c6205m02 = this.f56765m;
        if (c6205m02 != null) {
            c6205m02.A(c6205m0O);
        } else {
            this.f56762j = c6205m0O;
            this.f56763k = c6205m0O;
            this.f56764l = c6205m0O;
        }
        this.f56768p = null;
        this.f56765m = c6205m0O;
        this.f56767o++;
        J();
        return c6205m0O;
    }

    public C6205m0 n() {
        return this.f56765m;
    }

    public C6207n0 t(long j10, E0 e02) {
        C6205m0 c6205m0 = this.f56765m;
        return c6205m0 == null ? j(e02) : l(e02.f55735a, c6205m0, j10);
    }

    public C6205m0 u() {
        return this.f56762j;
    }

    public C6205m0 w() {
        return this.f56766n;
    }

    public C6205m0 x() {
        return this.f56764l;
    }

    public C6205m0 y() {
        return this.f56763k;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.media3.exoplayer.C6207n0 z(a3.F r18, androidx.media3.exoplayer.C6207n0 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            androidx.media3.exoplayer.source.r$b r3 = r2.f56737a
            boolean r13 = r0.C(r3)
            boolean r14 = r0.E(r1, r3)
            boolean r15 = r0.D(r1, r3, r13)
            androidx.media3.exoplayer.source.r$b r4 = r2.f56737a
            java.lang.Object r4 = r4.f57157a
            a3.F$b r5 = r0.f56753a
            r1.h(r4, r5)
            boolean r1 = r3.b()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L35
            int r1 = r3.f57161e
            if (r1 != r6) goto L2e
            goto L35
        L2e:
            a3.F$b r7 = r0.f56753a
            long r7 = r7.f(r1)
            goto L36
        L35:
            r7 = r4
        L36:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            a3.F$b r1 = r0.f56753a
            int r4 = r3.f57158b
            int r5 = r3.f57159c
            long r4 = r1.b(r4, r5)
        L46:
            r9 = r4
            goto L5c
        L48:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L55
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            a3.F$b r1 = r0.f56753a
            long r4 = r1.k()
            goto L46
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6c
            a3.F$b r1 = r0.f56753a
            int r4 = r3.f57158b
            boolean r1 = r1.s(r4)
        L6a:
            r12 = r1
            goto L7c
        L6c:
            int r1 = r3.f57161e
            if (r1 == r6) goto L7a
            a3.F$b r4 = r0.f56753a
            boolean r1 = r4.s(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            androidx.media3.exoplayer.n0 r1 = new androidx.media3.exoplayer.n0
            r5 = r3
            long r3 = r2.f56738b
            r11 = r5
            long r5 = r2.f56739c
            boolean r2 = r2.f56742f
            r16 = r11
            r11 = r2
            r2 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6211p0.z(a3.F, androidx.media3.exoplayer.n0):androidx.media3.exoplayer.n0");
    }

    public C6211p0(InterfaceC14599a interfaceC14599a, InterfaceC13612n interfaceC13612n, C6205m0.a aVar, ExoPlayer.c cVar) {
        this.f56755c = interfaceC14599a;
        this.f56756d = interfaceC13612n;
        this.f56757e = aVar;
        this.f56761i = cVar;
    }

    private boolean C(r.b bVar) {
        if (!bVar.b() && bVar.f57161e == -1) {
            return true;
        }
        return false;
    }

    private boolean E(a3.F f10, r.b bVar) {
        if (!C(bVar)) {
            return false;
        }
        int i10 = f10.h(bVar.f57157a, this.f56753a).f44412c;
        if (f10.n(i10, this.f56754b).f44447o != f10.b(bVar.f57157a)) {
            return false;
        }
        return true;
    }

    private static boolean H(F.b bVar) {
        int i10;
        int iC = bVar.c();
        if (iC != 0 && ((iC != 1 || !bVar.r(0)) && bVar.s(bVar.p()))) {
            long j10 = 0;
            if (bVar.e(0L) == -1) {
                if (bVar.f44413d == 0) {
                    return true;
                }
                if (bVar.r(iC - 1)) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                int i11 = iC - i10;
                for (int i12 = 0; i12 <= i11; i12++) {
                    j10 += bVar.j(i12);
                }
                if (bVar.f44413d <= j10) {
                    return true;
                }
            }
        }
        return false;
    }

    private void J() {
        final r.b bVar;
        final L.a aVarP = Ee.L.p();
        for (C6205m0 c6205m0K = this.f56762j; c6205m0K != null; c6205m0K = c6205m0K.k()) {
            aVarP.a(c6205m0K.f56562h.f56737a);
        }
        C6205m0 c6205m0 = this.f56763k;
        if (c6205m0 == null) {
            bVar = null;
        } else {
            bVar = c6205m0.f56562h.f56737a;
        }
        this.f56756d.post(new Runnable() { // from class: androidx.media3.exoplayer.o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f56749a.f56755c.C(aVarP.k(), bVar);
            }
        });
    }

    private static r.b P(a3.F f10, Object obj, long j10, long j11, F.c cVar, F.b bVar) {
        f10.h(obj, bVar);
        f10.n(bVar.f44412c, cVar);
        for (int iB = f10.b(obj); H(bVar) && iB <= cVar.f44447o; iB++) {
            f10.g(iB, bVar, true);
            obj = C13599a.e(bVar.f44411b);
        }
        f10.h(obj, bVar);
        int iE = bVar.e(j10);
        if (iE == -1) {
            return new r.b(obj, j11, bVar.d(j10));
        }
        return new r.b(obj, iE, bVar.l(iE), j11);
    }

    public int N(C6205m0 c6205m0) {
        C13599a.i(c6205m0);
        int i10 = 0;
        if (c6205m0.equals(this.f56765m)) {
            return 0;
        }
        this.f56765m = c6205m0;
        while (c6205m0.k() != null) {
            c6205m0 = (C6205m0) C13599a.e(c6205m0.k());
            if (c6205m0 == this.f56763k) {
                C6205m0 c6205m02 = this.f56762j;
                this.f56763k = c6205m02;
                this.f56764l = c6205m02;
                i10 = 3;
            }
            if (c6205m0 == this.f56764l) {
                this.f56764l = this.f56763k;
                i10 |= 2;
            }
            c6205m0.x();
            this.f56767o--;
        }
        ((C6205m0) C13599a.e(this.f56765m)).A(null);
        J();
        return i10;
    }

    public r.b Q(a3.F f10, Object obj, long j10) {
        long jR = R(f10, obj);
        f10.h(obj, this.f56753a);
        f10.n(this.f56753a.f44412c, this.f56754b);
        boolean z10 = false;
        for (int iB = f10.b(obj); iB >= this.f56754b.f44446n; iB--) {
            boolean z11 = true;
            f10.g(iB, this.f56753a, true);
            if (this.f56753a.c() <= 0) {
                z11 = false;
            }
            z10 |= z11;
            F.b bVar = this.f56753a;
            if (bVar.e(bVar.f44413d) != -1) {
                obj = C13599a.e(this.f56753a.f44411b);
            }
            if (z10 && (!z11 || this.f56753a.f44413d != 0)) {
                break;
            }
        }
        return P(f10, obj, j10, jR, this.f56754b, this.f56753a);
    }
}
