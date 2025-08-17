package androidx.media3.exoplayer;

import Ce.L;
import a3.F;
import android.util.Pair;
import androidx.media3.exoplayer.C6063m0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.r;
import d3.C13466a;
import d3.InterfaceC13479n;
import i3.InterfaceC14596a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6069p0 {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14596a f56531c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC13479n f56532d;

    /* renamed from: e, reason: collision with root package name */
    private final C6063m0.a f56533e;

    /* renamed from: f, reason: collision with root package name */
    private long f56534f;

    /* renamed from: g, reason: collision with root package name */
    private int f56535g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f56536h;

    /* renamed from: i, reason: collision with root package name */
    private ExoPlayer.c f56537i;

    /* renamed from: j, reason: collision with root package name */
    private C6063m0 f56538j;

    /* renamed from: k, reason: collision with root package name */
    private C6063m0 f56539k;

    /* renamed from: l, reason: collision with root package name */
    private C6063m0 f56540l;

    /* renamed from: m, reason: collision with root package name */
    private C6063m0 f56541m;

    /* renamed from: n, reason: collision with root package name */
    private C6063m0 f56542n;

    /* renamed from: o, reason: collision with root package name */
    private int f56543o;

    /* renamed from: p, reason: collision with root package name */
    private Object f56544p;

    /* renamed from: q, reason: collision with root package name */
    private long f56545q;

    /* renamed from: a, reason: collision with root package name */
    private final F.b f56529a = new F.b();

    /* renamed from: b, reason: collision with root package name */
    private final F.c f56530b = new F.c();

    /* renamed from: r, reason: collision with root package name */
    private List<C6063m0> f56546r = new ArrayList();

    private void L(List<C6063m0> list) {
        for (int i10 = 0; i10 < this.f56546r.size(); i10++) {
            this.f56546r.get(i10).x();
        }
        this.f56546r = list;
        this.f56542n = null;
        I();
    }

    private C6063m0 O(C6065n0 c6065n0) {
        for (int i10 = 0; i10 < this.f56546r.size(); i10++) {
            if (this.f56546r.get(i10).d(c6065n0)) {
                return this.f56546r.remove(i10);
            }
        }
        return null;
    }

    private long S(Object obj) {
        for (int i10 = 0; i10 < this.f56546r.size(); i10++) {
            C6063m0 c6063m0 = this.f56546r.get(i10);
            if (c6063m0.f56332b.equals(obj)) {
                return c6063m0.f56338h.f56513a.f56936d;
            }
        }
        return -1L;
    }

    static boolean e(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    public C6063m0 v(androidx.media3.exoplayer.source.q qVar) {
        for (int i10 = 0; i10 < this.f56546r.size(); i10++) {
            C6063m0 c6063m0 = this.f56546r.get(i10);
            if (c6063m0.f56331a == qVar) {
                return c6063m0;
            }
        }
        return null;
    }

    private boolean A(Object obj, a3.F f10) {
        int iC = f10.h(obj, this.f56529a).c();
        int iP = this.f56529a.p();
        if (iC <= 0 || !this.f56529a.s(iP)) {
            return false;
        }
        return iC > 1 || this.f56529a.f(iP) != Long.MIN_VALUE;
    }

    private boolean D(a3.F f10, r.b bVar, boolean z10) {
        int iB = f10.b(bVar.f56933a);
        return !f10.n(f10.f(iB, this.f56529a).f43594c, this.f56530b).f43623i && f10.r(iB, this.f56529a, this.f56530b, this.f56535g, this.f56536h) && z10;
    }

    private long R(a3.F f10, Object obj) {
        int iB;
        int i10 = f10.h(obj, this.f56529a).f43594c;
        Object obj2 = this.f56544p;
        if (obj2 != null && (iB = f10.b(obj2)) != -1 && f10.f(iB, this.f56529a).f43594c == i10) {
            return this.f56545q;
        }
        for (C6063m0 c6063m0K = this.f56538j; c6063m0K != null; c6063m0K = c6063m0K.k()) {
            if (c6063m0K.f56332b.equals(obj)) {
                return c6063m0K.f56338h.f56513a.f56936d;
            }
        }
        for (C6063m0 c6063m0K2 = this.f56538j; c6063m0K2 != null; c6063m0K2 = c6063m0K2.k()) {
            int iB2 = f10.b(c6063m0K2.f56332b);
            if (iB2 != -1 && f10.f(iB2, this.f56529a).f43594c == i10) {
                return c6063m0K2.f56338h.f56513a.f56936d;
            }
        }
        long jS = S(obj);
        if (jS != -1) {
            return jS;
        }
        long j10 = this.f56534f;
        this.f56534f = 1 + j10;
        if (this.f56538j == null) {
            this.f56544p = obj;
            this.f56545q = j10;
        }
        return j10;
    }

    private int U(a3.F f10) {
        a3.F f11;
        C6063m0 c6063m0K = this.f56538j;
        if (c6063m0K == null) {
            return 0;
        }
        int iB = f10.b(c6063m0K.f56332b);
        while (true) {
            f11 = f10;
            iB = f11.d(iB, this.f56529a, this.f56530b, this.f56535g, this.f56536h);
            while (((C6063m0) C13466a.e(c6063m0K)).k() != null && !c6063m0K.f56338h.f56520h) {
                c6063m0K = c6063m0K.k();
            }
            C6063m0 c6063m0K2 = c6063m0K.k();
            if (iB == -1 || c6063m0K2 == null || f11.b(c6063m0K2.f56332b) != iB) {
                break;
            }
            c6063m0K = c6063m0K2;
            f10 = f11;
        }
        int iN = N(c6063m0K);
        c6063m0K.f56338h = z(f11, c6063m0K.f56338h);
        return iN;
    }

    private boolean f(C6065n0 c6065n0, C6065n0 c6065n02) {
        return c6065n0.f56514b == c6065n02.f56514b && c6065n0.f56513a.equals(c6065n02.f56513a);
    }

    private Pair<Object, Long> i(a3.F f10, Object obj, long j10) {
        int iE = f10.e(f10.h(obj, this.f56529a).f43594c, this.f56535g, this.f56536h);
        if (iE != -1) {
            return f10.k(this.f56530b, this.f56529a, iE, -9223372036854775807L, j10);
        }
        return null;
    }

    private C6065n0 j(E0 e02) {
        return o(e02.f55511a, e02.f55512b, e02.f55513c, e02.f55529s);
    }

    private C6065n0 k(a3.F f10, C6063m0 c6063m0, long j10) {
        Object obj;
        long j11;
        C6065n0 c6065n0 = c6063m0.f56338h;
        int iD = f10.d(f10.b(c6065n0.f56513a.f56933a), this.f56529a, this.f56530b, this.f56535g, this.f56536h);
        if (iD == -1) {
            return null;
        }
        int i10 = f10.g(iD, this.f56529a, true).f43594c;
        Object objE = C13466a.e(this.f56529a.f43593b);
        long j12 = c6065n0.f56513a.f56936d;
        long j13 = 0;
        if (f10.n(i10, this.f56530b).f43628n == iD) {
            Pair<Object, Long> pairK = f10.k(this.f56530b, this.f56529a, i10, -9223372036854775807L, Math.max(0L, j10));
            if (pairK == null) {
                return null;
            }
            Object obj2 = pairK.first;
            long jLongValue = ((Long) pairK.second).longValue();
            C6063m0 c6063m0K = c6063m0.k();
            if (c6063m0K == null || !c6063m0K.f56332b.equals(obj2)) {
                long jS = S(obj2);
                if (jS == -1) {
                    jS = this.f56534f;
                    this.f56534f = 1 + jS;
                }
                j12 = jS;
            } else {
                j12 = c6063m0K.f56338h.f56513a.f56936d;
            }
            obj = obj2;
            j11 = jLongValue;
            j13 = -9223372036854775807L;
        } else {
            obj = objE;
            j11 = 0;
        }
        r.b bVarP = P(f10, obj, j11, j12, this.f56530b, this.f56529a);
        if (j13 != -9223372036854775807L && c6065n0.f56515c != -9223372036854775807L) {
            boolean zA = A(c6065n0.f56513a.f56933a, f10);
            if (bVarP.b() && zA) {
                j13 = c6065n0.f56515c;
            } else if (zA) {
                j11 = c6065n0.f56515c;
            }
        }
        return o(f10, bVarP, j13, j11);
    }

    private C6065n0 l(a3.F f10, C6063m0 c6063m0, long j10) {
        C6065n0 c6065n0 = c6063m0.f56338h;
        long jM = (c6063m0.m() + c6065n0.f56517e) - j10;
        return c6065n0.f56520h ? k(f10, c6063m0, jM) : m(f10, c6063m0, jM);
    }

    private C6065n0 m(a3.F f10, C6063m0 c6063m0, long j10) {
        C6065n0 c6065n0 = c6063m0.f56338h;
        r.b bVar = c6065n0.f56513a;
        f10.h(bVar.f56933a, this.f56529a);
        boolean z10 = c6065n0.f56519g;
        if (!bVar.b()) {
            int i10 = bVar.f56937e;
            if (i10 != -1 && this.f56529a.r(i10)) {
                return k(f10, c6063m0, j10);
            }
            int iL = this.f56529a.l(bVar.f56937e);
            boolean z11 = this.f56529a.s(bVar.f56937e) && this.f56529a.h(bVar.f56937e, iL) == 3;
            if (iL == this.f56529a.a(bVar.f56937e) || z11) {
                return q(f10, bVar.f56933a, s(f10, bVar.f56933a, bVar.f56937e), c6065n0.f56517e, bVar.f56936d, false);
            }
            return p(f10, bVar.f56933a, bVar.f56937e, iL, c6065n0.f56517e, bVar.f56936d, z10);
        }
        int i11 = bVar.f56934b;
        int iA = this.f56529a.a(i11);
        if (iA == -1) {
            return null;
        }
        int iM = this.f56529a.m(i11, bVar.f56935c);
        if (iM < iA) {
            return p(f10, bVar.f56933a, i11, iM, c6065n0.f56515c, bVar.f56936d, z10);
        }
        long jLongValue = c6065n0.f56515c;
        if (jLongValue == -9223372036854775807L) {
            F.c cVar = this.f56530b;
            F.b bVar2 = this.f56529a;
            Pair<Object, Long> pairK = f10.k(cVar, bVar2, bVar2.f43594c, -9223372036854775807L, Math.max(0L, j10));
            if (pairK == null) {
                return null;
            }
            jLongValue = ((Long) pairK.second).longValue();
        }
        return q(f10, bVar.f56933a, Math.max(s(f10, bVar.f56933a, bVar.f56934b), jLongValue), c6065n0.f56515c, bVar.f56936d, z10);
    }

    private C6065n0 o(a3.F f10, r.b bVar, long j10, long j11) {
        f10.h(bVar.f56933a, this.f56529a);
        return bVar.b() ? p(f10, bVar.f56933a, bVar.f56934b, bVar.f56935c, j10, bVar.f56936d, false) : q(f10, bVar.f56933a, j11, j10, bVar.f56936d, false);
    }

    private C6065n0 p(a3.F f10, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        r.b bVar = new r.b(obj, i10, i11, j11);
        long jB = f10.h(bVar.f56933a, this.f56529a).b(bVar.f56934b, bVar.f56935c);
        long jG = i11 == this.f56529a.l(i10) ? this.f56529a.g() : 0L;
        boolean zS = this.f56529a.s(bVar.f56934b);
        if (jB != -9223372036854775807L && jG >= jB) {
            jG = Math.max(0L, jB - 1);
        }
        return new C6065n0(bVar, jG, j10, -9223372036854775807L, jB, z10, zS, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.media3.exoplayer.C6065n0 q(a3.F r27, java.lang.Object r28, long r29, long r31, long r33, boolean r35) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            a3.F$b r5 = r0.f56529a
            r1.h(r2, r5)
            a3.F$b r5 = r0.f56529a
            int r5 = r5.d(r3)
            r6 = 0
            r7 = 1
            r8 = -1
            if (r5 == r8) goto L22
            a3.F$b r9 = r0.f56529a
            boolean r9 = r9.r(r5)
            if (r9 == 0) goto L22
            r9 = r7
            goto L23
        L22:
            r9 = r6
        L23:
            if (r5 != r8) goto L3b
            a3.F$b r10 = r0.f56529a
            int r10 = r10.c()
            if (r10 <= 0) goto L5a
            a3.F$b r10 = r0.f56529a
            int r11 = r10.p()
            boolean r10 = r10.s(r11)
            if (r10 == 0) goto L5a
            r10 = r7
            goto L5b
        L3b:
            a3.F$b r10 = r0.f56529a
            boolean r10 = r10.s(r5)
            if (r10 == 0) goto L5a
            a3.F$b r10 = r0.f56529a
            long r10 = r10.f(r5)
            a3.F$b r12 = r0.f56529a
            long r13 = r12.f43595d
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
            a3.F$b r1 = r0.f56529a
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
            a3.F$b r1 = r0.f56529a
            long r8 = r1.f(r5)
        L8e:
            r17 = r8
            goto L9a
        L91:
            if (r10 == 0) goto L98
            a3.F$b r1 = r0.f56529a
            long r8 = r1.f43595d
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
            a3.F$b r1 = r0.f56529a
            long r8 = r1.f43595d
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6069p0.q(a3.F, java.lang.Object, long, long, long, boolean):androidx.media3.exoplayer.n0");
    }

    private C6065n0 r(a3.F f10, Object obj, long j10, long j11) {
        r.b bVarP = P(f10, obj, j10, j11, this.f56530b, this.f56529a);
        return bVarP.b() ? p(f10, bVarP.f56933a, bVarP.f56934b, bVarP.f56935c, j10, bVarP.f56936d, false) : q(f10, bVarP.f56933a, j10, -9223372036854775807L, bVarP.f56936d, false);
    }

    private long s(a3.F f10, Object obj, int i10) {
        f10.h(obj, this.f56529a);
        long jF = this.f56529a.f(i10);
        return jF == Long.MIN_VALUE ? this.f56529a.f43595d : jF + this.f56529a.j(i10);
    }

    public void B(a3.F f10) {
        C6063m0 c6063m0;
        if (this.f56537i.f55575a == -9223372036854775807L || (c6063m0 = this.f56541m) == null) {
            M();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair<Object, Long> pairI = i(f10, c6063m0.f56338h.f56513a.f56933a, 0L);
        if (pairI != null && !f10.n(f10.h(pairI.first, this.f56529a).f43594c, this.f56530b).f()) {
            long jS = S(pairI.first);
            if (jS == -1) {
                jS = this.f56534f;
                this.f56534f = 1 + jS;
            }
            C6065n0 c6065n0R = r(f10, pairI.first, ((Long) pairI.second).longValue(), jS);
            C6063m0 c6063m0O = O(c6065n0R);
            if (c6063m0O == null) {
                c6063m0O = this.f56533e.a(c6065n0R, (c6063m0.m() + c6063m0.f56338h.f56517e) - c6065n0R.f56514b);
            }
            arrayList.add(c6063m0O);
        }
        L(arrayList);
    }

    public boolean F(androidx.media3.exoplayer.source.q qVar) {
        C6063m0 c6063m0 = this.f56541m;
        return c6063m0 != null && c6063m0.f56331a == qVar;
    }

    public boolean G(androidx.media3.exoplayer.source.q qVar) {
        C6063m0 c6063m0 = this.f56542n;
        return c6063m0 != null && c6063m0.f56331a == qVar;
    }

    public void I() {
        C6063m0 c6063m0 = this.f56542n;
        if (c6063m0 == null || c6063m0.t()) {
            this.f56542n = null;
            for (int i10 = 0; i10 < this.f56546r.size(); i10++) {
                C6063m0 c6063m02 = this.f56546r.get(i10);
                if (!c6063m02.t()) {
                    this.f56542n = c6063m02;
                    return;
                }
            }
        }
    }

    public void K(long j10) {
        C6063m0 c6063m0 = this.f56541m;
        if (c6063m0 != null) {
            c6063m0.w(j10);
        }
    }

    public void M() {
        if (this.f56546r.isEmpty()) {
            return;
        }
        L(new ArrayList());
    }

    public boolean T() {
        C6063m0 c6063m0 = this.f56541m;
        if (c6063m0 != null) {
            return !c6063m0.f56338h.f56522j && c6063m0.s() && this.f56541m.f56338h.f56517e != -9223372036854775807L && this.f56543o < 100;
        }
        return true;
    }

    public void V(a3.F f10, ExoPlayer.c cVar) {
        this.f56537i = cVar;
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
            androidx.media3.exoplayer.m0 r0 = r8.f56538j
            r1 = 0
        L3:
            r2 = 0
            if (r0 == 0) goto L87
            androidx.media3.exoplayer.n0 r3 = r0.f56338h
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
            long r4 = r3.f56515c
            androidx.media3.exoplayer.n0 r4 = r1.a(r4)
            r0.f56338h = r4
            long r3 = r3.f56517e
            long r5 = r1.f56517e
            boolean r3 = e(r3, r5)
            if (r3 != 0) goto L7a
            r0.E()
            long r9 = r1.f56517e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 != 0) goto L44
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L48
        L44:
            long r9 = r0.D(r9)
        L48:
            androidx.media3.exoplayer.m0 r11 = r8.f56539k
            r1 = 1
            r3 = -9223372036854775808
            if (r0 != r11) goto L5f
            androidx.media3.exoplayer.n0 r11 = r0.f56338h
            boolean r11 = r11.f56519g
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
            androidx.media3.exoplayer.m0 r12 = r8.f56540l
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6069p0.W(a3.F, long, long, long):int");
    }

    public int X(a3.F f10, int i10) {
        this.f56535g = i10;
        return U(f10);
    }

    public int Y(a3.F f10, boolean z10) {
        this.f56536h = z10;
        return U(f10);
    }

    public C6063m0 b() {
        C6063m0 c6063m0 = this.f56538j;
        if (c6063m0 == null) {
            return null;
        }
        if (c6063m0 == this.f56539k) {
            this.f56539k = c6063m0.k();
        }
        C6063m0 c6063m02 = this.f56538j;
        if (c6063m02 == this.f56540l) {
            this.f56540l = c6063m02.k();
        }
        this.f56538j.x();
        int i10 = this.f56543o - 1;
        this.f56543o = i10;
        if (i10 == 0) {
            this.f56541m = null;
            C6063m0 c6063m03 = this.f56538j;
            this.f56544p = c6063m03.f56332b;
            this.f56545q = c6063m03.f56338h.f56513a.f56936d;
        }
        this.f56538j = this.f56538j.k();
        J();
        return this.f56538j;
    }

    public C6063m0 c() {
        this.f56540l = ((C6063m0) C13466a.i(this.f56540l)).k();
        J();
        return (C6063m0) C13466a.i(this.f56540l);
    }

    public C6063m0 d() {
        C6063m0 c6063m0 = this.f56540l;
        C6063m0 c6063m02 = this.f56539k;
        if (c6063m0 == c6063m02) {
            this.f56540l = ((C6063m0) C13466a.i(c6063m02)).k();
        }
        this.f56539k = ((C6063m0) C13466a.i(this.f56539k)).k();
        J();
        return (C6063m0) C13466a.i(this.f56539k);
    }

    public void g() {
        if (this.f56543o == 0) {
            return;
        }
        C6063m0 c6063m0K = (C6063m0) C13466a.i(this.f56538j);
        this.f56544p = c6063m0K.f56332b;
        this.f56545q = c6063m0K.f56338h.f56513a.f56936d;
        while (c6063m0K != null) {
            c6063m0K.x();
            c6063m0K = c6063m0K.k();
        }
        this.f56538j = null;
        this.f56541m = null;
        this.f56539k = null;
        this.f56540l = null;
        this.f56543o = 0;
        J();
    }

    public C6063m0 h(C6065n0 c6065n0) {
        C6063m0 c6063m0 = this.f56541m;
        long jM = c6063m0 == null ? 1000000000000L : (c6063m0.m() + this.f56541m.f56338h.f56517e) - c6065n0.f56514b;
        C6063m0 c6063m0O = O(c6065n0);
        if (c6063m0O == null) {
            c6063m0O = this.f56533e.a(c6065n0, jM);
        } else {
            c6063m0O.f56338h = c6065n0;
            c6063m0O.B(jM);
        }
        C6063m0 c6063m02 = this.f56541m;
        if (c6063m02 != null) {
            c6063m02.A(c6063m0O);
        } else {
            this.f56538j = c6063m0O;
            this.f56539k = c6063m0O;
            this.f56540l = c6063m0O;
        }
        this.f56544p = null;
        this.f56541m = c6063m0O;
        this.f56543o++;
        J();
        return c6063m0O;
    }

    public C6063m0 n() {
        return this.f56541m;
    }

    public C6065n0 t(long j10, E0 e02) {
        C6063m0 c6063m0 = this.f56541m;
        return c6063m0 == null ? j(e02) : l(e02.f55511a, c6063m0, j10);
    }

    public C6063m0 u() {
        return this.f56538j;
    }

    public C6063m0 w() {
        return this.f56542n;
    }

    public C6063m0 x() {
        return this.f56540l;
    }

    public C6063m0 y() {
        return this.f56539k;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.media3.exoplayer.C6065n0 z(a3.F r18, androidx.media3.exoplayer.C6065n0 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            androidx.media3.exoplayer.source.r$b r3 = r2.f56513a
            boolean r13 = r0.C(r3)
            boolean r14 = r0.E(r1, r3)
            boolean r15 = r0.D(r1, r3, r13)
            androidx.media3.exoplayer.source.r$b r4 = r2.f56513a
            java.lang.Object r4 = r4.f56933a
            a3.F$b r5 = r0.f56529a
            r1.h(r4, r5)
            boolean r1 = r3.b()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L35
            int r1 = r3.f56937e
            if (r1 != r6) goto L2e
            goto L35
        L2e:
            a3.F$b r7 = r0.f56529a
            long r7 = r7.f(r1)
            goto L36
        L35:
            r7 = r4
        L36:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            a3.F$b r1 = r0.f56529a
            int r4 = r3.f56934b
            int r5 = r3.f56935c
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
            a3.F$b r1 = r0.f56529a
            long r4 = r1.k()
            goto L46
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6c
            a3.F$b r1 = r0.f56529a
            int r4 = r3.f56934b
            boolean r1 = r1.s(r4)
        L6a:
            r12 = r1
            goto L7c
        L6c:
            int r1 = r3.f56937e
            if (r1 == r6) goto L7a
            a3.F$b r4 = r0.f56529a
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
            long r3 = r2.f56514b
            r11 = r5
            long r5 = r2.f56515c
            boolean r2 = r2.f56518f
            r16 = r11
            r11 = r2
            r2 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6069p0.z(a3.F, androidx.media3.exoplayer.n0):androidx.media3.exoplayer.n0");
    }

    public C6069p0(InterfaceC14596a interfaceC14596a, InterfaceC13479n interfaceC13479n, C6063m0.a aVar, ExoPlayer.c cVar) {
        this.f56531c = interfaceC14596a;
        this.f56532d = interfaceC13479n;
        this.f56533e = aVar;
        this.f56537i = cVar;
    }

    private boolean C(r.b bVar) {
        if (!bVar.b() && bVar.f56937e == -1) {
            return true;
        }
        return false;
    }

    private boolean E(a3.F f10, r.b bVar) {
        if (!C(bVar)) {
            return false;
        }
        int i10 = f10.h(bVar.f56933a, this.f56529a).f43594c;
        if (f10.n(i10, this.f56530b).f43629o != f10.b(bVar.f56933a)) {
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
                if (bVar.f43595d == 0) {
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
                if (bVar.f43595d <= j10) {
                    return true;
                }
            }
        }
        return false;
    }

    private void J() {
        final r.b bVar;
        final L.a aVarP = Ce.L.p();
        for (C6063m0 c6063m0K = this.f56538j; c6063m0K != null; c6063m0K = c6063m0K.k()) {
            aVarP.a(c6063m0K.f56338h.f56513a);
        }
        C6063m0 c6063m0 = this.f56539k;
        if (c6063m0 == null) {
            bVar = null;
        } else {
            bVar = c6063m0.f56338h.f56513a;
        }
        this.f56532d.post(new Runnable() { // from class: androidx.media3.exoplayer.o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f56525a.f56531c.C(aVarP.k(), bVar);
            }
        });
    }

    private static r.b P(a3.F f10, Object obj, long j10, long j11, F.c cVar, F.b bVar) {
        f10.h(obj, bVar);
        f10.n(bVar.f43594c, cVar);
        for (int iB = f10.b(obj); H(bVar) && iB <= cVar.f43629o; iB++) {
            f10.g(iB, bVar, true);
            obj = C13466a.e(bVar.f43593b);
        }
        f10.h(obj, bVar);
        int iE = bVar.e(j10);
        if (iE == -1) {
            return new r.b(obj, j11, bVar.d(j10));
        }
        return new r.b(obj, iE, bVar.l(iE), j11);
    }

    public int N(C6063m0 c6063m0) {
        C13466a.i(c6063m0);
        int i10 = 0;
        if (c6063m0.equals(this.f56541m)) {
            return 0;
        }
        this.f56541m = c6063m0;
        while (c6063m0.k() != null) {
            c6063m0 = (C6063m0) C13466a.e(c6063m0.k());
            if (c6063m0 == this.f56539k) {
                C6063m0 c6063m02 = this.f56538j;
                this.f56539k = c6063m02;
                this.f56540l = c6063m02;
                i10 = 3;
            }
            if (c6063m0 == this.f56540l) {
                this.f56540l = this.f56539k;
                i10 |= 2;
            }
            c6063m0.x();
            this.f56543o--;
        }
        ((C6063m0) C13466a.e(this.f56541m)).A(null);
        J();
        return i10;
    }

    public r.b Q(a3.F f10, Object obj, long j10) {
        long jR = R(f10, obj);
        f10.h(obj, this.f56529a);
        f10.n(this.f56529a.f43594c, this.f56530b);
        boolean z10 = false;
        for (int iB = f10.b(obj); iB >= this.f56530b.f43628n; iB--) {
            boolean z11 = true;
            f10.g(iB, this.f56529a, true);
            if (this.f56529a.c() <= 0) {
                z11 = false;
            }
            z10 |= z11;
            F.b bVar = this.f56529a;
            if (bVar.e(bVar.f43595d) != -1) {
                obj = C13466a.e(this.f56529a.f43593b);
            }
            if (z10 && (!z11 || this.f56529a.f43595d != 0)) {
                break;
            }
        }
        return P(f10, obj, j10, jR, this.f56530b, this.f56529a);
    }
}
