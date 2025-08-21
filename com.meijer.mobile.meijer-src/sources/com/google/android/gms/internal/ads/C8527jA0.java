package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.jA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8527jA0 {

    /* renamed from: c, reason: collision with root package name */
    private final PA0 f76186c;

    /* renamed from: d, reason: collision with root package name */
    private final QH f76187d;

    /* renamed from: e, reason: collision with root package name */
    private long f76188e;

    /* renamed from: f, reason: collision with root package name */
    private int f76189f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f76190g;

    /* renamed from: h, reason: collision with root package name */
    private C8185fz0 f76191h;

    /* renamed from: i, reason: collision with root package name */
    private C8208gA0 f76192i;

    /* renamed from: j, reason: collision with root package name */
    private C8208gA0 f76193j;

    /* renamed from: k, reason: collision with root package name */
    private C8208gA0 f76194k;

    /* renamed from: l, reason: collision with root package name */
    private C8208gA0 f76195l;

    /* renamed from: m, reason: collision with root package name */
    private int f76196m;

    /* renamed from: n, reason: collision with root package name */
    private Object f76197n;

    /* renamed from: o, reason: collision with root package name */
    private long f76198o;

    /* renamed from: q, reason: collision with root package name */
    private final Nz0 f76200q;

    /* renamed from: a, reason: collision with root package name */
    private final C7431Wk f76184a = new C7431Wk();

    /* renamed from: b, reason: collision with root package name */
    private final C10079xl f76185b = new C10079xl();

    /* renamed from: p, reason: collision with root package name */
    private List f76199p = new ArrayList();

    static boolean C(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private final long a(Object obj) {
        for (int i10 = 0; i10 < this.f76199p.size(); i10++) {
            C8208gA0 c8208gA0 = (C8208gA0) this.f76199p.get(i10);
            if (c8208gA0.f75103b.equals(obj)) {
                return c8208gA0.f75108g.f75457a.f73225d;
            }
        }
        return -1L;
    }

    private static final boolean k(C7578aF0 c7578aF0) {
        return !c7578aF0.b() && c7578aF0.f73226e == -1;
    }

    public final boolean D(YE0 ye0) {
        C8208gA0 c8208gA0 = this.f76194k;
        return c8208gA0 != null && c8208gA0.f75102a == ye0;
    }

    public final boolean E(YE0 ye0) {
        C8208gA0 c8208gA0 = this.f76195l;
        return c8208gA0 != null && c8208gA0.f75102a == ye0;
    }

    public final C8208gA0 o() {
        return this.f76194k;
    }

    public final C8208gA0 p() {
        return this.f76192i;
    }

    public final C8208gA0 q(YE0 ye0) {
        for (int i10 = 0; i10 < this.f76199p.size(); i10++) {
            C8208gA0 c8208gA0 = (C8208gA0) this.f76199p.get(i10);
            if (c8208gA0.f75102a == ye0) {
                return c8208gA0;
            }
        }
        return null;
    }

    public final C8208gA0 r() {
        return this.f76195l;
    }

    public final C8208gA0 s() {
        return this.f76193j;
    }

    private final long K(AbstractC7432Wl abstractC7432Wl, Object obj, int i10) {
        abstractC7432Wl.n(obj, this.f76184a);
        this.f76184a.g(i10);
        long j10 = this.f76184a.f71994g.a(i10).f73167g;
        return 0L;
    }

    private final C8315hA0 b(AbstractC7432Wl abstractC7432Wl, C8208gA0 c8208gA0, long j10) {
        AbstractC7432Wl abstractC7432Wl2;
        Object obj;
        long j11;
        C8315hA0 c8315hA0 = c8208gA0.f75108g;
        long jE = (c8208gA0.e() + c8315hA0.f75461e) - j10;
        if (!c8315hA0.f75463g) {
            C7578aF0 c7578aF0 = c8315hA0.f75457a;
            abstractC7432Wl.n(c7578aF0.f73222a, this.f76184a);
            if (!c7578aF0.b()) {
                int i10 = c7578aF0.f73226e;
                if (i10 != -1) {
                    this.f76184a.j(i10);
                }
                C7431Wk c7431Wk = this.f76184a;
                int i11 = c7578aF0.f73226e;
                int iE = c7431Wk.e(i11);
                c7431Wk.k(i11);
                if (iE != this.f76184a.a(c7578aF0.f73226e)) {
                    return d(abstractC7432Wl, c7578aF0.f73222a, c7578aF0.f73226e, iE, c8315hA0.f75461e, c7578aF0.f73225d);
                }
                K(abstractC7432Wl, c7578aF0.f73222a, c7578aF0.f73226e);
                return e(abstractC7432Wl, c7578aF0.f73222a, 0L, c8315hA0.f75461e, c7578aF0.f73225d);
            }
            int i12 = c7578aF0.f73223b;
            if (this.f76184a.a(i12) == -1) {
                return null;
            }
            int iA = this.f76184a.f71994g.a(i12).a(c7578aF0.f73224c);
            if (iA < 0) {
                return d(abstractC7432Wl, c7578aF0.f73222a, i12, iA, c8315hA0.f75459c, c7578aF0.f73225d);
            }
            long jLongValue = c8315hA0.f75459c;
            if (jLongValue == -9223372036854775807L) {
                C10079xl c10079xl = this.f76185b;
                C7431Wk c7431Wk2 = this.f76184a;
                Pair pairM = abstractC7432Wl.m(c10079xl, c7431Wk2, c7431Wk2.f71990c, -9223372036854775807L, Math.max(0L, jE));
                abstractC7432Wl2 = abstractC7432Wl;
                if (pairM == null) {
                    return null;
                }
                jLongValue = ((Long) pairM.second).longValue();
            } else {
                abstractC7432Wl2 = abstractC7432Wl;
            }
            K(abstractC7432Wl2, c7578aF0.f73222a, c7578aF0.f73223b);
            return e(abstractC7432Wl, c7578aF0.f73222a, Math.max(0L, jLongValue), c8315hA0.f75459c, c7578aF0.f73225d);
        }
        long j12 = 0;
        int i13 = abstractC7432Wl.i(abstractC7432Wl.a(c8315hA0.f75457a.f73222a), this.f76184a, this.f76185b, this.f76189f, this.f76190g);
        if (i13 == -1) {
            return null;
        }
        int i14 = abstractC7432Wl.d(i13, this.f76184a, true).f71990c;
        Object obj2 = this.f76184a.f71989b;
        obj2.getClass();
        long j13 = c8315hA0.f75457a.f73225d;
        if (abstractC7432Wl.e(i14, this.f76185b, 0L).f80698m == i13) {
            Pair pairM2 = abstractC7432Wl.m(this.f76185b, this.f76184a, i14, -9223372036854775807L, Math.max(0L, jE));
            if (pairM2 == null) {
                return null;
            }
            Object obj3 = pairM2.first;
            long jLongValue2 = ((Long) pairM2.second).longValue();
            C8208gA0 c8208gA0G = c8208gA0.g();
            if (c8208gA0G == null || !c8208gA0G.f75103b.equals(obj3)) {
                long jA = a(obj3);
                if (jA == -1) {
                    jA = this.f76188e;
                    this.f76188e = 1 + jA;
                }
                j13 = jA;
            } else {
                j13 = c8208gA0G.f75108g.f75457a.f73225d;
            }
            obj = obj3;
            j11 = jLongValue2;
            j12 = -9223372036854775807L;
        } else {
            obj = obj2;
            j11 = 0;
        }
        C7578aF0 c7578aF0F = f(abstractC7432Wl, obj, j11, j13, this.f76185b, this.f76184a);
        if (j12 != -9223372036854775807L && c8315hA0.f75459c != -9223372036854775807L) {
            abstractC7432Wl.n(c8315hA0.f75457a.f73222a, this.f76184a).b();
            int i15 = this.f76184a.f71994g.f77942c;
        }
        return c(abstractC7432Wl, c7578aF0F, j12, j11);
    }

    private final C8315hA0 c(AbstractC7432Wl abstractC7432Wl, C7578aF0 c7578aF0, long j10, long j11) {
        abstractC7432Wl.n(c7578aF0.f73222a, this.f76184a);
        return c7578aF0.b() ? d(abstractC7432Wl, c7578aF0.f73222a, c7578aF0.f73223b, c7578aF0.f73224c, j10, c7578aF0.f73225d) : e(abstractC7432Wl, c7578aF0.f73222a, j11, j10, c7578aF0.f73225d);
    }

    private final C8315hA0 d(AbstractC7432Wl abstractC7432Wl, Object obj, int i10, int i11, long j10, long j11) {
        C7578aF0 c7578aF0 = new C7578aF0(obj, i10, i11, j11);
        Object obj2 = c7578aF0.f73222a;
        long jF = abstractC7432Wl.n(obj2, this.f76184a).f(c7578aF0.f73223b, c7578aF0.f73224c);
        if (i11 == this.f76184a.e(i10)) {
            this.f76184a.h();
        }
        this.f76184a.k(c7578aF0.f73223b);
        long jMax = 0;
        if (jF != -9223372036854775807L && jF <= 0) {
            jMax = Math.max(0L, (-1) + jF);
        }
        return new C8315hA0(c7578aF0, jMax, j10, -9223372036854775807L, jF, false, false, false, false);
    }

    private final C8315hA0 e(AbstractC7432Wl abstractC7432Wl, Object obj, long j10, long j11, long j12) {
        long j13;
        long j14;
        long j15;
        long jMax = j10;
        abstractC7432Wl.n(obj, this.f76184a);
        int iC = this.f76184a.c(jMax);
        if (iC != -1) {
            this.f76184a.j(iC);
        }
        if (iC == -1) {
            this.f76184a.b();
        } else {
            this.f76184a.k(iC);
        }
        C7578aF0 c7578aF0 = new C7578aF0(obj, j12, iC);
        boolean zK = k(c7578aF0);
        boolean zI = i(abstractC7432Wl, c7578aF0);
        boolean zH = h(abstractC7432Wl, c7578aF0, zK);
        if (iC != -1) {
            this.f76184a.k(iC);
        }
        if (iC != -1) {
            this.f76184a.g(iC);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L) {
            j14 = 0;
            j15 = 0;
        } else {
            j14 = j13;
            j15 = this.f76184a.f71991d;
        }
        if (j15 != -9223372036854775807L && jMax >= j15) {
            jMax = Math.max(0L, j15 - 1);
        }
        return new C8315hA0(c7578aF0, jMax, j11, j14, j15, false, zK, zI, zH);
    }

    private final void g() {
        final C7723bh0 c7723bh0 = new C7723bh0();
        for (C8208gA0 c8208gA0G = this.f76192i; c8208gA0G != null; c8208gA0G = c8208gA0G.g()) {
            c7723bh0.g(c8208gA0G.f75108g.f75457a);
        }
        C8208gA0 c8208gA0 = this.f76193j;
        final C7578aF0 c7578aF0 = c8208gA0 == null ? null : c8208gA0.f75108g.f75457a;
        this.f76187d.b(new Runnable() { // from class: com.google.android.gms.internal.ads.iA0
            @Override // java.lang.Runnable
            public final void run() {
                this.f75738a.x(c7723bh0, c7578aF0);
            }
        });
    }

    private final boolean h(AbstractC7432Wl abstractC7432Wl, C7578aF0 c7578aF0, boolean z10) {
        int iA = abstractC7432Wl.a(c7578aF0.f73222a);
        return !abstractC7432Wl.e(abstractC7432Wl.d(iA, this.f76184a, false).f71990c, this.f76185b, 0L).f80693h && abstractC7432Wl.i(iA, this.f76184a, this.f76185b, this.f76189f, this.f76190g) == -1 && z10;
    }

    private final boolean j(AbstractC7432Wl abstractC7432Wl) {
        AbstractC7432Wl abstractC7432Wl2;
        C8208gA0 c8208gA0G = this.f76192i;
        if (c8208gA0G == null) {
            return true;
        }
        int iA = abstractC7432Wl.a(c8208gA0G.f75103b);
        while (true) {
            abstractC7432Wl2 = abstractC7432Wl;
            iA = abstractC7432Wl2.i(iA, this.f76184a, this.f76185b, this.f76189f, this.f76190g);
            while (true) {
                c8208gA0G.getClass();
                if (c8208gA0G.g() == null || c8208gA0G.f75108g.f75463g) {
                    break;
                }
                c8208gA0G = c8208gA0G.g();
            }
            C8208gA0 c8208gA0G2 = c8208gA0G.g();
            if (iA == -1 || c8208gA0G2 == null || abstractC7432Wl2.a(c8208gA0G2.f75103b) != iA) {
                break;
            }
            c8208gA0G = c8208gA0G2;
            abstractC7432Wl = abstractC7432Wl2;
        }
        boolean zF = F(c8208gA0G);
        c8208gA0G.f75108g = u(abstractC7432Wl2, c8208gA0G.f75108g);
        return !zF;
    }

    public final void A() {
        if (this.f76199p.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f76199p.size(); i10++) {
            ((C8208gA0) this.f76199p.get(i10)).o();
        }
        this.f76199p = arrayList;
        this.f76195l = null;
        y();
    }

    public final void B(AbstractC7432Wl abstractC7432Wl, C8185fz0 c8185fz0) {
        this.f76191h = c8185fz0;
        long j10 = c8185fz0.f75049a;
        A();
    }

    public final boolean G() {
        C8208gA0 c8208gA0 = this.f76194k;
        if (c8208gA0 != null) {
            return !c8208gA0.f75108g.f75465i && c8208gA0.s() && this.f76194k.f75108g.f75461e != -9223372036854775807L && this.f76196m < 100;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H(com.google.android.gms.internal.ads.AbstractC7432Wl r14, long r15, long r17) {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.gA0 r0 = r13.f76192i
            r1 = 0
        L3:
            r2 = 1
            if (r0 == 0) goto L8e
            com.google.android.gms.internal.ads.hA0 r3 = r0.f75108g
            r4 = 0
            if (r1 != 0) goto L11
            com.google.android.gms.internal.ads.hA0 r1 = r13.u(r14, r3)
            r5 = r15
            goto L33
        L11:
            r5 = r15
            com.google.android.gms.internal.ads.hA0 r7 = r13.b(r14, r1, r5)
            if (r7 != 0) goto L20
            boolean r14 = r13.F(r1)
            if (r14 != 0) goto L1f
            return r2
        L1f:
            return r4
        L20:
            long r8 = r3.f75458b
            long r10 = r7.f75458b
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L86
            com.google.android.gms.internal.ads.aF0 r8 = r3.f75457a
            com.google.android.gms.internal.ads.aF0 r9 = r7.f75457a
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L86
            r1 = r7
        L33:
            long r7 = r3.f75459c
            com.google.android.gms.internal.ads.hA0 r7 = r1.a(r7)
            r0.f75108g = r7
            long r7 = r3.f75461e
            long r9 = r1.f75461e
            boolean r3 = C(r7, r9)
            if (r3 != 0) goto L7d
            r0.r()
            long r5 = r1.f75461e
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 != 0) goto L59
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L5e
        L59:
            long r7 = r0.e()
            long r5 = r5 + r7
        L5e:
            com.google.android.gms.internal.ads.gA0 r14 = r13.f76193j
            if (r0 != r14) goto L72
            com.google.android.gms.internal.ads.hA0 r14 = r0.f75108g
            boolean r14 = r14.f75462f
            r7 = -9223372036854775808
            int r14 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r14 == 0) goto L70
            int r14 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r14 < 0) goto L72
        L70:
            r14 = r2
            goto L73
        L72:
            r14 = r4
        L73:
            boolean r0 = r13.F(r0)
            if (r0 != 0) goto L7c
            if (r14 != 0) goto L7c
            return r2
        L7c:
            return r4
        L7d:
            com.google.android.gms.internal.ads.gA0 r1 = r0.g()
            r12 = r1
            r1 = r0
            r0 = r12
            goto L3
        L86:
            boolean r14 = r13.F(r1)
            if (r14 != 0) goto L8d
            return r2
        L8d:
            return r4
        L8e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8527jA0.H(com.google.android.gms.internal.ads.Wl, long, long):boolean");
    }

    public final boolean I(AbstractC7432Wl abstractC7432Wl, int i10) {
        this.f76189f = i10;
        return j(abstractC7432Wl);
    }

    public final boolean J(AbstractC7432Wl abstractC7432Wl, boolean z10) {
        this.f76190g = z10;
        return j(abstractC7432Wl);
    }

    public final C8208gA0 l() {
        C8208gA0 c8208gA0 = this.f76192i;
        if (c8208gA0 == null) {
            return null;
        }
        if (c8208gA0 == this.f76193j) {
            this.f76193j = c8208gA0.g();
        }
        c8208gA0.o();
        int i10 = this.f76196m - 1;
        this.f76196m = i10;
        if (i10 == 0) {
            this.f76194k = null;
            C8208gA0 c8208gA02 = this.f76192i;
            this.f76197n = c8208gA02.f75103b;
            this.f76198o = c8208gA02.f75108g.f75457a.f73225d;
        }
        this.f76192i = this.f76192i.g();
        g();
        return this.f76192i;
    }

    public final C8208gA0 m() {
        C8208gA0 c8208gA0 = this.f76193j;
        C8211gC.b(c8208gA0);
        this.f76193j = c8208gA0.g();
        g();
        C8208gA0 c8208gA02 = this.f76193j;
        C8211gC.b(c8208gA02);
        return c8208gA02;
    }

    public final C8208gA0 n(C8315hA0 c8315hA0) {
        C8208gA0 c8208gA0W;
        C8208gA0 c8208gA0 = this.f76194k;
        long jE = c8208gA0 == null ? 1000000000000L : (c8208gA0.e() + c8208gA0.f75108g.f75461e) - c8315hA0.f75458b;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f76199p.size()) {
                c8208gA0W = null;
                break;
            }
            C8315hA0 c8315hA02 = ((C8208gA0) this.f76199p.get(i10)).f75108g;
            if (C(c8315hA02.f75461e, c8315hA0.f75461e) && c8315hA02.f75458b == c8315hA0.f75458b && c8315hA02.f75457a.equals(c8315hA0.f75457a)) {
                c8208gA0W = (C8208gA0) this.f76199p.remove(i10);
                break;
            }
            i10++;
        }
        if (c8208gA0W == null) {
            c8208gA0W = Yz0.W(this.f76200q.f69825a, c8315hA0, jE);
        } else {
            c8208gA0W.f75108g = c8315hA0;
            c8208gA0W.q(jE);
        }
        C8208gA0 c8208gA02 = this.f76194k;
        if (c8208gA02 != null) {
            c8208gA02.p(c8208gA0W);
        } else {
            this.f76192i = c8208gA0W;
            this.f76193j = c8208gA0W;
        }
        this.f76197n = null;
        this.f76194k = c8208gA0W;
        this.f76196m++;
        g();
        return c8208gA0W;
    }

    public final C8315hA0 t(long j10, C10024xA0 c10024xA0) {
        C8208gA0 c8208gA0 = this.f76194k;
        return c8208gA0 == null ? c(c10024xA0.f80527a, c10024xA0.f80528b, c10024xA0.f80529c, c10024xA0.f80545s) : b(c10024xA0.f80527a, c8208gA0, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.C8315hA0 u(com.google.android.gms.internal.ads.AbstractC7432Wl r16, com.google.android.gms.internal.ads.C8315hA0 r17) {
        /*
            r15 = this;
            r1 = r16
            r2 = r17
            com.google.android.gms.internal.ads.aF0 r3 = r2.f75457a
            boolean r12 = k(r3)
            boolean r13 = r15.i(r1, r3)
            boolean r14 = r15.h(r1, r3, r12)
            com.google.android.gms.internal.ads.aF0 r4 = r2.f75457a
            java.lang.Object r4 = r4.f73222a
            com.google.android.gms.internal.ads.Wk r5 = r15.f76184a
            r1.n(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L2d
            int r1 = r3.f73226e
            if (r1 != r4) goto L2f
        L2d:
            r9 = r7
            goto L35
        L2f:
            com.google.android.gms.internal.ads.Wk r9 = r15.f76184a
            r9.g(r1)
            r9 = r5
        L35:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            com.google.android.gms.internal.ads.Wk r1 = r15.f76184a
            int r5 = r3.f73223b
            int r6 = r3.f73224c
            long r5 = r1.f(r5, r6)
        L45:
            r7 = r9
            r9 = r5
            goto L54
        L48:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L4f
            r7 = r5
            r9 = r7
            goto L54
        L4f:
            com.google.android.gms.internal.ads.Wk r1 = r15.f76184a
            long r5 = r1.f71991d
            goto L45
        L54:
            boolean r1 = r3.b()
            if (r1 == 0) goto L62
            com.google.android.gms.internal.ads.Wk r1 = r15.f76184a
            int r4 = r3.f73223b
            r1.k(r4)
            goto L6b
        L62:
            int r1 = r3.f73226e
            if (r1 == r4) goto L6b
            com.google.android.gms.internal.ads.Wk r4 = r15.f76184a
            r4.k(r1)
        L6b:
            com.google.android.gms.internal.ads.hA0 r1 = new com.google.android.gms.internal.ads.hA0
            r5 = r3
            long r3 = r2.f75458b
            r16 = r1
            long r0 = r2.f75459c
            r11 = 0
            r2 = r5
            r5 = r0
            r1 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8527jA0.u(com.google.android.gms.internal.ads.Wl, com.google.android.gms.internal.ads.hA0):com.google.android.gms.internal.ads.hA0");
    }

    public final C7578aF0 v(AbstractC7432Wl abstractC7432Wl, Object obj, long j10) {
        long jA;
        int iA;
        int i10 = abstractC7432Wl.n(obj, this.f76184a).f71990c;
        Object obj2 = this.f76197n;
        if (obj2 == null || (iA = abstractC7432Wl.a(obj2)) == -1 || abstractC7432Wl.d(iA, this.f76184a, false).f71990c != i10) {
            C8208gA0 c8208gA0G = this.f76192i;
            while (true) {
                if (c8208gA0G == null) {
                    C8208gA0 c8208gA0G2 = this.f76192i;
                    while (true) {
                        if (c8208gA0G2 != null) {
                            int iA2 = abstractC7432Wl.a(c8208gA0G2.f75103b);
                            if (iA2 != -1 && abstractC7432Wl.d(iA2, this.f76184a, false).f71990c == i10) {
                                jA = c8208gA0G2.f75108g.f75457a.f73225d;
                                break;
                            }
                            c8208gA0G2 = c8208gA0G2.g();
                        } else {
                            jA = a(obj);
                            if (jA == -1) {
                                jA = this.f76188e;
                                this.f76188e = 1 + jA;
                                if (this.f76192i == null) {
                                    this.f76197n = obj;
                                    this.f76198o = jA;
                                }
                            }
                        }
                    }
                } else {
                    if (c8208gA0G.f75103b.equals(obj)) {
                        jA = c8208gA0G.f75108g.f75457a.f73225d;
                        break;
                    }
                    c8208gA0G = c8208gA0G.g();
                }
            }
        } else {
            jA = this.f76198o;
        }
        abstractC7432Wl.n(obj, this.f76184a);
        abstractC7432Wl.e(this.f76184a.f71990c, this.f76185b, 0L);
        int iA3 = abstractC7432Wl.a(obj);
        Object obj3 = obj;
        while (true) {
            C10079xl c10079xl = this.f76185b;
            if (iA3 < c10079xl.f80698m) {
                return f(abstractC7432Wl, obj3, j10, jA, c10079xl, this.f76184a);
            }
            abstractC7432Wl.d(iA3, this.f76184a, true);
            this.f76184a.b();
            C7431Wk c7431Wk = this.f76184a;
            if (c7431Wk.d(c7431Wk.f71991d) != -1) {
                obj3 = this.f76184a.f71989b;
                obj3.getClass();
            }
            iA3--;
        }
    }

    public final void w() {
        if (this.f76196m == 0) {
            return;
        }
        C8208gA0 c8208gA0G = this.f76192i;
        C8211gC.b(c8208gA0G);
        this.f76197n = c8208gA0G.f75103b;
        this.f76198o = c8208gA0G.f75108g.f75457a.f73225d;
        while (c8208gA0G != null) {
            c8208gA0G.o();
            c8208gA0G = c8208gA0G.g();
        }
        this.f76192i = null;
        this.f76194k = null;
        this.f76193j = null;
        this.f76196m = 0;
        g();
    }

    final /* synthetic */ void x(C7723bh0 c7723bh0, C7578aF0 c7578aF0) {
        this.f76186c.I(c7723bh0.j(), c7578aF0);
    }

    public final void y() {
        C8208gA0 c8208gA0 = this.f76195l;
        if (c8208gA0 == null || c8208gA0.t()) {
            this.f76195l = null;
            for (int i10 = 0; i10 < this.f76199p.size(); i10++) {
                C8208gA0 c8208gA02 = (C8208gA0) this.f76199p.get(i10);
                if (!c8208gA02.t()) {
                    this.f76195l = c8208gA02;
                    return;
                }
            }
        }
    }

    public final void z(long j10) {
        C8208gA0 c8208gA0 = this.f76194k;
        if (c8208gA0 != null) {
            c8208gA0.n(j10);
        }
    }

    public C8527jA0(PA0 pa0, QH qh2, Nz0 nz0, C8185fz0 c8185fz0) {
        this.f76186c = pa0;
        this.f76187d = qh2;
        this.f76200q = nz0;
        this.f76191h = c8185fz0;
    }

    private static C7578aF0 f(AbstractC7432Wl abstractC7432Wl, Object obj, long j10, long j11, C10079xl c10079xl, C7431Wk c7431Wk) {
        abstractC7432Wl.n(obj, c7431Wk);
        abstractC7432Wl.e(c7431Wk.f71990c, c10079xl, 0L);
        abstractC7432Wl.a(obj);
        c7431Wk.b();
        abstractC7432Wl.n(obj, c7431Wk);
        int iD = c7431Wk.d(j10);
        if (iD == -1) {
            return new C7578aF0(obj, j11, c7431Wk.c(j10));
        }
        return new C7578aF0(obj, iD, c7431Wk.e(iD), j11);
    }

    private final boolean i(AbstractC7432Wl abstractC7432Wl, C7578aF0 c7578aF0) {
        if (!k(c7578aF0)) {
            return false;
        }
        int i10 = abstractC7432Wl.n(c7578aF0.f73222a, this.f76184a).f71990c;
        if (abstractC7432Wl.e(i10, this.f76185b, 0L).f80699n != abstractC7432Wl.a(c7578aF0.f73222a)) {
            return false;
        }
        return true;
    }

    public final boolean F(C8208gA0 c8208gA0) {
        C8211gC.b(c8208gA0);
        boolean z10 = false;
        if (c8208gA0.equals(this.f76194k)) {
            return false;
        }
        this.f76194k = c8208gA0;
        while (c8208gA0.g() != null) {
            c8208gA0 = c8208gA0.g();
            c8208gA0.getClass();
            if (c8208gA0 == this.f76193j) {
                this.f76193j = this.f76192i;
                z10 = true;
            }
            c8208gA0.o();
            this.f76196m--;
        }
        C8208gA0 c8208gA02 = this.f76194k;
        c8208gA02.getClass();
        c8208gA02.p(null);
        g();
        return z10;
    }
}
