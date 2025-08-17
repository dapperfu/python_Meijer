package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.jA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8402jA0 {

    /* renamed from: c, reason: collision with root package name */
    private final PA0 f75346c;

    /* renamed from: d, reason: collision with root package name */
    private final QH f75347d;

    /* renamed from: e, reason: collision with root package name */
    private long f75348e;

    /* renamed from: f, reason: collision with root package name */
    private int f75349f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f75350g;

    /* renamed from: h, reason: collision with root package name */
    private C8060fz0 f75351h;

    /* renamed from: i, reason: collision with root package name */
    private C8083gA0 f75352i;

    /* renamed from: j, reason: collision with root package name */
    private C8083gA0 f75353j;

    /* renamed from: k, reason: collision with root package name */
    private C8083gA0 f75354k;

    /* renamed from: l, reason: collision with root package name */
    private C8083gA0 f75355l;

    /* renamed from: m, reason: collision with root package name */
    private int f75356m;

    /* renamed from: n, reason: collision with root package name */
    private Object f75357n;

    /* renamed from: o, reason: collision with root package name */
    private long f75358o;

    /* renamed from: q, reason: collision with root package name */
    private final Nz0 f75360q;

    /* renamed from: a, reason: collision with root package name */
    private final C7306Wk f75344a = new C7306Wk();

    /* renamed from: b, reason: collision with root package name */
    private final C9954xl f75345b = new C9954xl();

    /* renamed from: p, reason: collision with root package name */
    private List f75359p = new ArrayList();

    static boolean C(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private final long a(Object obj) {
        for (int i10 = 0; i10 < this.f75359p.size(); i10++) {
            C8083gA0 c8083gA0 = (C8083gA0) this.f75359p.get(i10);
            if (c8083gA0.f74263b.equals(obj)) {
                return c8083gA0.f74268g.f74617a.f72385d;
            }
        }
        return -1L;
    }

    private static final boolean k(C7453aF0 c7453aF0) {
        return !c7453aF0.b() && c7453aF0.f72386e == -1;
    }

    public final boolean D(YE0 ye0) {
        C8083gA0 c8083gA0 = this.f75354k;
        return c8083gA0 != null && c8083gA0.f74262a == ye0;
    }

    public final boolean E(YE0 ye0) {
        C8083gA0 c8083gA0 = this.f75355l;
        return c8083gA0 != null && c8083gA0.f74262a == ye0;
    }

    public final C8083gA0 o() {
        return this.f75354k;
    }

    public final C8083gA0 p() {
        return this.f75352i;
    }

    public final C8083gA0 q(YE0 ye0) {
        for (int i10 = 0; i10 < this.f75359p.size(); i10++) {
            C8083gA0 c8083gA0 = (C8083gA0) this.f75359p.get(i10);
            if (c8083gA0.f74262a == ye0) {
                return c8083gA0;
            }
        }
        return null;
    }

    public final C8083gA0 r() {
        return this.f75355l;
    }

    public final C8083gA0 s() {
        return this.f75353j;
    }

    private final long K(AbstractC7307Wl abstractC7307Wl, Object obj, int i10) {
        abstractC7307Wl.n(obj, this.f75344a);
        this.f75344a.g(i10);
        long j10 = this.f75344a.f71154g.a(i10).f72327g;
        return 0L;
    }

    private final C8190hA0 b(AbstractC7307Wl abstractC7307Wl, C8083gA0 c8083gA0, long j10) {
        AbstractC7307Wl abstractC7307Wl2;
        Object obj;
        long j11;
        C8190hA0 c8190hA0 = c8083gA0.f74268g;
        long jE = (c8083gA0.e() + c8190hA0.f74621e) - j10;
        if (!c8190hA0.f74623g) {
            C7453aF0 c7453aF0 = c8190hA0.f74617a;
            abstractC7307Wl.n(c7453aF0.f72382a, this.f75344a);
            if (!c7453aF0.b()) {
                int i10 = c7453aF0.f72386e;
                if (i10 != -1) {
                    this.f75344a.j(i10);
                }
                C7306Wk c7306Wk = this.f75344a;
                int i11 = c7453aF0.f72386e;
                int iE = c7306Wk.e(i11);
                c7306Wk.k(i11);
                if (iE != this.f75344a.a(c7453aF0.f72386e)) {
                    return d(abstractC7307Wl, c7453aF0.f72382a, c7453aF0.f72386e, iE, c8190hA0.f74621e, c7453aF0.f72385d);
                }
                K(abstractC7307Wl, c7453aF0.f72382a, c7453aF0.f72386e);
                return e(abstractC7307Wl, c7453aF0.f72382a, 0L, c8190hA0.f74621e, c7453aF0.f72385d);
            }
            int i12 = c7453aF0.f72383b;
            if (this.f75344a.a(i12) == -1) {
                return null;
            }
            int iA = this.f75344a.f71154g.a(i12).a(c7453aF0.f72384c);
            if (iA < 0) {
                return d(abstractC7307Wl, c7453aF0.f72382a, i12, iA, c8190hA0.f74619c, c7453aF0.f72385d);
            }
            long jLongValue = c8190hA0.f74619c;
            if (jLongValue == -9223372036854775807L) {
                C9954xl c9954xl = this.f75345b;
                C7306Wk c7306Wk2 = this.f75344a;
                Pair pairM = abstractC7307Wl.m(c9954xl, c7306Wk2, c7306Wk2.f71150c, -9223372036854775807L, Math.max(0L, jE));
                abstractC7307Wl2 = abstractC7307Wl;
                if (pairM == null) {
                    return null;
                }
                jLongValue = ((Long) pairM.second).longValue();
            } else {
                abstractC7307Wl2 = abstractC7307Wl;
            }
            K(abstractC7307Wl2, c7453aF0.f72382a, c7453aF0.f72383b);
            return e(abstractC7307Wl, c7453aF0.f72382a, Math.max(0L, jLongValue), c8190hA0.f74619c, c7453aF0.f72385d);
        }
        long j12 = 0;
        int i13 = abstractC7307Wl.i(abstractC7307Wl.a(c8190hA0.f74617a.f72382a), this.f75344a, this.f75345b, this.f75349f, this.f75350g);
        if (i13 == -1) {
            return null;
        }
        int i14 = abstractC7307Wl.d(i13, this.f75344a, true).f71150c;
        Object obj2 = this.f75344a.f71149b;
        obj2.getClass();
        long j13 = c8190hA0.f74617a.f72385d;
        if (abstractC7307Wl.e(i14, this.f75345b, 0L).f79858m == i13) {
            Pair pairM2 = abstractC7307Wl.m(this.f75345b, this.f75344a, i14, -9223372036854775807L, Math.max(0L, jE));
            if (pairM2 == null) {
                return null;
            }
            Object obj3 = pairM2.first;
            long jLongValue2 = ((Long) pairM2.second).longValue();
            C8083gA0 c8083gA0G = c8083gA0.g();
            if (c8083gA0G == null || !c8083gA0G.f74263b.equals(obj3)) {
                long jA = a(obj3);
                if (jA == -1) {
                    jA = this.f75348e;
                    this.f75348e = 1 + jA;
                }
                j13 = jA;
            } else {
                j13 = c8083gA0G.f74268g.f74617a.f72385d;
            }
            obj = obj3;
            j11 = jLongValue2;
            j12 = -9223372036854775807L;
        } else {
            obj = obj2;
            j11 = 0;
        }
        C7453aF0 c7453aF0F = f(abstractC7307Wl, obj, j11, j13, this.f75345b, this.f75344a);
        if (j12 != -9223372036854775807L && c8190hA0.f74619c != -9223372036854775807L) {
            abstractC7307Wl.n(c8190hA0.f74617a.f72382a, this.f75344a).b();
            int i15 = this.f75344a.f71154g.f77102c;
        }
        return c(abstractC7307Wl, c7453aF0F, j12, j11);
    }

    private final C8190hA0 c(AbstractC7307Wl abstractC7307Wl, C7453aF0 c7453aF0, long j10, long j11) {
        abstractC7307Wl.n(c7453aF0.f72382a, this.f75344a);
        return c7453aF0.b() ? d(abstractC7307Wl, c7453aF0.f72382a, c7453aF0.f72383b, c7453aF0.f72384c, j10, c7453aF0.f72385d) : e(abstractC7307Wl, c7453aF0.f72382a, j11, j10, c7453aF0.f72385d);
    }

    private final C8190hA0 d(AbstractC7307Wl abstractC7307Wl, Object obj, int i10, int i11, long j10, long j11) {
        C7453aF0 c7453aF0 = new C7453aF0(obj, i10, i11, j11);
        Object obj2 = c7453aF0.f72382a;
        long jF = abstractC7307Wl.n(obj2, this.f75344a).f(c7453aF0.f72383b, c7453aF0.f72384c);
        if (i11 == this.f75344a.e(i10)) {
            this.f75344a.h();
        }
        this.f75344a.k(c7453aF0.f72383b);
        long jMax = 0;
        if (jF != -9223372036854775807L && jF <= 0) {
            jMax = Math.max(0L, (-1) + jF);
        }
        return new C8190hA0(c7453aF0, jMax, j10, -9223372036854775807L, jF, false, false, false, false);
    }

    private final C8190hA0 e(AbstractC7307Wl abstractC7307Wl, Object obj, long j10, long j11, long j12) {
        long j13;
        long j14;
        long j15;
        long jMax = j10;
        abstractC7307Wl.n(obj, this.f75344a);
        int iC = this.f75344a.c(jMax);
        if (iC != -1) {
            this.f75344a.j(iC);
        }
        if (iC == -1) {
            this.f75344a.b();
        } else {
            this.f75344a.k(iC);
        }
        C7453aF0 c7453aF0 = new C7453aF0(obj, j12, iC);
        boolean zK = k(c7453aF0);
        boolean zI = i(abstractC7307Wl, c7453aF0);
        boolean zH = h(abstractC7307Wl, c7453aF0, zK);
        if (iC != -1) {
            this.f75344a.k(iC);
        }
        if (iC != -1) {
            this.f75344a.g(iC);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L) {
            j14 = 0;
            j15 = 0;
        } else {
            j14 = j13;
            j15 = this.f75344a.f71151d;
        }
        if (j15 != -9223372036854775807L && jMax >= j15) {
            jMax = Math.max(0L, j15 - 1);
        }
        return new C8190hA0(c7453aF0, jMax, j11, j14, j15, false, zK, zI, zH);
    }

    private final void g() {
        final C7598bh0 c7598bh0 = new C7598bh0();
        for (C8083gA0 c8083gA0G = this.f75352i; c8083gA0G != null; c8083gA0G = c8083gA0G.g()) {
            c7598bh0.g(c8083gA0G.f74268g.f74617a);
        }
        C8083gA0 c8083gA0 = this.f75353j;
        final C7453aF0 c7453aF0 = c8083gA0 == null ? null : c8083gA0.f74268g.f74617a;
        this.f75347d.b(new Runnable() { // from class: com.google.android.gms.internal.ads.iA0
            @Override // java.lang.Runnable
            public final void run() {
                this.f74898a.x(c7598bh0, c7453aF0);
            }
        });
    }

    private final boolean h(AbstractC7307Wl abstractC7307Wl, C7453aF0 c7453aF0, boolean z10) {
        int iA = abstractC7307Wl.a(c7453aF0.f72382a);
        return !abstractC7307Wl.e(abstractC7307Wl.d(iA, this.f75344a, false).f71150c, this.f75345b, 0L).f79853h && abstractC7307Wl.i(iA, this.f75344a, this.f75345b, this.f75349f, this.f75350g) == -1 && z10;
    }

    private final boolean j(AbstractC7307Wl abstractC7307Wl) {
        AbstractC7307Wl abstractC7307Wl2;
        C8083gA0 c8083gA0G = this.f75352i;
        if (c8083gA0G == null) {
            return true;
        }
        int iA = abstractC7307Wl.a(c8083gA0G.f74263b);
        while (true) {
            abstractC7307Wl2 = abstractC7307Wl;
            iA = abstractC7307Wl2.i(iA, this.f75344a, this.f75345b, this.f75349f, this.f75350g);
            while (true) {
                c8083gA0G.getClass();
                if (c8083gA0G.g() == null || c8083gA0G.f74268g.f74623g) {
                    break;
                }
                c8083gA0G = c8083gA0G.g();
            }
            C8083gA0 c8083gA0G2 = c8083gA0G.g();
            if (iA == -1 || c8083gA0G2 == null || abstractC7307Wl2.a(c8083gA0G2.f74263b) != iA) {
                break;
            }
            c8083gA0G = c8083gA0G2;
            abstractC7307Wl = abstractC7307Wl2;
        }
        boolean zF = F(c8083gA0G);
        c8083gA0G.f74268g = u(abstractC7307Wl2, c8083gA0G.f74268g);
        return !zF;
    }

    public final void A() {
        if (this.f75359p.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f75359p.size(); i10++) {
            ((C8083gA0) this.f75359p.get(i10)).o();
        }
        this.f75359p = arrayList;
        this.f75355l = null;
        y();
    }

    public final void B(AbstractC7307Wl abstractC7307Wl, C8060fz0 c8060fz0) {
        this.f75351h = c8060fz0;
        long j10 = c8060fz0.f74209a;
        A();
    }

    public final boolean G() {
        C8083gA0 c8083gA0 = this.f75354k;
        if (c8083gA0 != null) {
            return !c8083gA0.f74268g.f74625i && c8083gA0.s() && this.f75354k.f74268g.f74621e != -9223372036854775807L && this.f75356m < 100;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H(com.google.android.gms.internal.ads.AbstractC7307Wl r14, long r15, long r17) {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.gA0 r0 = r13.f75352i
            r1 = 0
        L3:
            r2 = 1
            if (r0 == 0) goto L8e
            com.google.android.gms.internal.ads.hA0 r3 = r0.f74268g
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
            long r8 = r3.f74618b
            long r10 = r7.f74618b
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L86
            com.google.android.gms.internal.ads.aF0 r8 = r3.f74617a
            com.google.android.gms.internal.ads.aF0 r9 = r7.f74617a
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L86
            r1 = r7
        L33:
            long r7 = r3.f74619c
            com.google.android.gms.internal.ads.hA0 r7 = r1.a(r7)
            r0.f74268g = r7
            long r7 = r3.f74621e
            long r9 = r1.f74621e
            boolean r3 = C(r7, r9)
            if (r3 != 0) goto L7d
            r0.r()
            long r5 = r1.f74621e
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 != 0) goto L59
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L5e
        L59:
            long r7 = r0.e()
            long r5 = r5 + r7
        L5e:
            com.google.android.gms.internal.ads.gA0 r14 = r13.f75353j
            if (r0 != r14) goto L72
            com.google.android.gms.internal.ads.hA0 r14 = r0.f74268g
            boolean r14 = r14.f74622f
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8402jA0.H(com.google.android.gms.internal.ads.Wl, long, long):boolean");
    }

    public final boolean I(AbstractC7307Wl abstractC7307Wl, int i10) {
        this.f75349f = i10;
        return j(abstractC7307Wl);
    }

    public final boolean J(AbstractC7307Wl abstractC7307Wl, boolean z10) {
        this.f75350g = z10;
        return j(abstractC7307Wl);
    }

    public final C8083gA0 l() {
        C8083gA0 c8083gA0 = this.f75352i;
        if (c8083gA0 == null) {
            return null;
        }
        if (c8083gA0 == this.f75353j) {
            this.f75353j = c8083gA0.g();
        }
        c8083gA0.o();
        int i10 = this.f75356m - 1;
        this.f75356m = i10;
        if (i10 == 0) {
            this.f75354k = null;
            C8083gA0 c8083gA02 = this.f75352i;
            this.f75357n = c8083gA02.f74263b;
            this.f75358o = c8083gA02.f74268g.f74617a.f72385d;
        }
        this.f75352i = this.f75352i.g();
        g();
        return this.f75352i;
    }

    public final C8083gA0 m() {
        C8083gA0 c8083gA0 = this.f75353j;
        C8086gC.b(c8083gA0);
        this.f75353j = c8083gA0.g();
        g();
        C8083gA0 c8083gA02 = this.f75353j;
        C8086gC.b(c8083gA02);
        return c8083gA02;
    }

    public final C8083gA0 n(C8190hA0 c8190hA0) {
        C8083gA0 c8083gA0W;
        C8083gA0 c8083gA0 = this.f75354k;
        long jE = c8083gA0 == null ? 1000000000000L : (c8083gA0.e() + c8083gA0.f74268g.f74621e) - c8190hA0.f74618b;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f75359p.size()) {
                c8083gA0W = null;
                break;
            }
            C8190hA0 c8190hA02 = ((C8083gA0) this.f75359p.get(i10)).f74268g;
            if (C(c8190hA02.f74621e, c8190hA0.f74621e) && c8190hA02.f74618b == c8190hA0.f74618b && c8190hA02.f74617a.equals(c8190hA0.f74617a)) {
                c8083gA0W = (C8083gA0) this.f75359p.remove(i10);
                break;
            }
            i10++;
        }
        if (c8083gA0W == null) {
            c8083gA0W = Yz0.W(this.f75360q.f68985a, c8190hA0, jE);
        } else {
            c8083gA0W.f74268g = c8190hA0;
            c8083gA0W.q(jE);
        }
        C8083gA0 c8083gA02 = this.f75354k;
        if (c8083gA02 != null) {
            c8083gA02.p(c8083gA0W);
        } else {
            this.f75352i = c8083gA0W;
            this.f75353j = c8083gA0W;
        }
        this.f75357n = null;
        this.f75354k = c8083gA0W;
        this.f75356m++;
        g();
        return c8083gA0W;
    }

    public final C8190hA0 t(long j10, C9899xA0 c9899xA0) {
        C8083gA0 c8083gA0 = this.f75354k;
        return c8083gA0 == null ? c(c9899xA0.f79687a, c9899xA0.f79688b, c9899xA0.f79689c, c9899xA0.f79705s) : b(c9899xA0.f79687a, c8083gA0, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.C8190hA0 u(com.google.android.gms.internal.ads.AbstractC7307Wl r16, com.google.android.gms.internal.ads.C8190hA0 r17) {
        /*
            r15 = this;
            r1 = r16
            r2 = r17
            com.google.android.gms.internal.ads.aF0 r3 = r2.f74617a
            boolean r12 = k(r3)
            boolean r13 = r15.i(r1, r3)
            boolean r14 = r15.h(r1, r3, r12)
            com.google.android.gms.internal.ads.aF0 r4 = r2.f74617a
            java.lang.Object r4 = r4.f72382a
            com.google.android.gms.internal.ads.Wk r5 = r15.f75344a
            r1.n(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L2d
            int r1 = r3.f72386e
            if (r1 != r4) goto L2f
        L2d:
            r9 = r7
            goto L35
        L2f:
            com.google.android.gms.internal.ads.Wk r9 = r15.f75344a
            r9.g(r1)
            r9 = r5
        L35:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            com.google.android.gms.internal.ads.Wk r1 = r15.f75344a
            int r5 = r3.f72383b
            int r6 = r3.f72384c
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
            com.google.android.gms.internal.ads.Wk r1 = r15.f75344a
            long r5 = r1.f71151d
            goto L45
        L54:
            boolean r1 = r3.b()
            if (r1 == 0) goto L62
            com.google.android.gms.internal.ads.Wk r1 = r15.f75344a
            int r4 = r3.f72383b
            r1.k(r4)
            goto L6b
        L62:
            int r1 = r3.f72386e
            if (r1 == r4) goto L6b
            com.google.android.gms.internal.ads.Wk r4 = r15.f75344a
            r4.k(r1)
        L6b:
            com.google.android.gms.internal.ads.hA0 r1 = new com.google.android.gms.internal.ads.hA0
            r5 = r3
            long r3 = r2.f74618b
            r16 = r1
            long r0 = r2.f74619c
            r11 = 0
            r2 = r5
            r5 = r0
            r1 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8402jA0.u(com.google.android.gms.internal.ads.Wl, com.google.android.gms.internal.ads.hA0):com.google.android.gms.internal.ads.hA0");
    }

    public final C7453aF0 v(AbstractC7307Wl abstractC7307Wl, Object obj, long j10) {
        long jA;
        int iA;
        int i10 = abstractC7307Wl.n(obj, this.f75344a).f71150c;
        Object obj2 = this.f75357n;
        if (obj2 == null || (iA = abstractC7307Wl.a(obj2)) == -1 || abstractC7307Wl.d(iA, this.f75344a, false).f71150c != i10) {
            C8083gA0 c8083gA0G = this.f75352i;
            while (true) {
                if (c8083gA0G == null) {
                    C8083gA0 c8083gA0G2 = this.f75352i;
                    while (true) {
                        if (c8083gA0G2 != null) {
                            int iA2 = abstractC7307Wl.a(c8083gA0G2.f74263b);
                            if (iA2 != -1 && abstractC7307Wl.d(iA2, this.f75344a, false).f71150c == i10) {
                                jA = c8083gA0G2.f74268g.f74617a.f72385d;
                                break;
                            }
                            c8083gA0G2 = c8083gA0G2.g();
                        } else {
                            jA = a(obj);
                            if (jA == -1) {
                                jA = this.f75348e;
                                this.f75348e = 1 + jA;
                                if (this.f75352i == null) {
                                    this.f75357n = obj;
                                    this.f75358o = jA;
                                }
                            }
                        }
                    }
                } else {
                    if (c8083gA0G.f74263b.equals(obj)) {
                        jA = c8083gA0G.f74268g.f74617a.f72385d;
                        break;
                    }
                    c8083gA0G = c8083gA0G.g();
                }
            }
        } else {
            jA = this.f75358o;
        }
        abstractC7307Wl.n(obj, this.f75344a);
        abstractC7307Wl.e(this.f75344a.f71150c, this.f75345b, 0L);
        int iA3 = abstractC7307Wl.a(obj);
        Object obj3 = obj;
        while (true) {
            C9954xl c9954xl = this.f75345b;
            if (iA3 < c9954xl.f79858m) {
                return f(abstractC7307Wl, obj3, j10, jA, c9954xl, this.f75344a);
            }
            abstractC7307Wl.d(iA3, this.f75344a, true);
            this.f75344a.b();
            C7306Wk c7306Wk = this.f75344a;
            if (c7306Wk.d(c7306Wk.f71151d) != -1) {
                obj3 = this.f75344a.f71149b;
                obj3.getClass();
            }
            iA3--;
        }
    }

    public final void w() {
        if (this.f75356m == 0) {
            return;
        }
        C8083gA0 c8083gA0G = this.f75352i;
        C8086gC.b(c8083gA0G);
        this.f75357n = c8083gA0G.f74263b;
        this.f75358o = c8083gA0G.f74268g.f74617a.f72385d;
        while (c8083gA0G != null) {
            c8083gA0G.o();
            c8083gA0G = c8083gA0G.g();
        }
        this.f75352i = null;
        this.f75354k = null;
        this.f75353j = null;
        this.f75356m = 0;
        g();
    }

    final /* synthetic */ void x(C7598bh0 c7598bh0, C7453aF0 c7453aF0) {
        this.f75346c.I(c7598bh0.j(), c7453aF0);
    }

    public final void y() {
        C8083gA0 c8083gA0 = this.f75355l;
        if (c8083gA0 == null || c8083gA0.t()) {
            this.f75355l = null;
            for (int i10 = 0; i10 < this.f75359p.size(); i10++) {
                C8083gA0 c8083gA02 = (C8083gA0) this.f75359p.get(i10);
                if (!c8083gA02.t()) {
                    this.f75355l = c8083gA02;
                    return;
                }
            }
        }
    }

    public final void z(long j10) {
        C8083gA0 c8083gA0 = this.f75354k;
        if (c8083gA0 != null) {
            c8083gA0.n(j10);
        }
    }

    public C8402jA0(PA0 pa0, QH qh2, Nz0 nz0, C8060fz0 c8060fz0) {
        this.f75346c = pa0;
        this.f75347d = qh2;
        this.f75360q = nz0;
        this.f75351h = c8060fz0;
    }

    private static C7453aF0 f(AbstractC7307Wl abstractC7307Wl, Object obj, long j10, long j11, C9954xl c9954xl, C7306Wk c7306Wk) {
        abstractC7307Wl.n(obj, c7306Wk);
        abstractC7307Wl.e(c7306Wk.f71150c, c9954xl, 0L);
        abstractC7307Wl.a(obj);
        c7306Wk.b();
        abstractC7307Wl.n(obj, c7306Wk);
        int iD = c7306Wk.d(j10);
        if (iD == -1) {
            return new C7453aF0(obj, j11, c7306Wk.c(j10));
        }
        return new C7453aF0(obj, iD, c7306Wk.e(iD), j11);
    }

    private final boolean i(AbstractC7307Wl abstractC7307Wl, C7453aF0 c7453aF0) {
        if (!k(c7453aF0)) {
            return false;
        }
        int i10 = abstractC7307Wl.n(c7453aF0.f72382a, this.f75344a).f71150c;
        if (abstractC7307Wl.e(i10, this.f75345b, 0L).f79859n != abstractC7307Wl.a(c7453aF0.f72382a)) {
            return false;
        }
        return true;
    }

    public final boolean F(C8083gA0 c8083gA0) {
        C8086gC.b(c8083gA0);
        boolean z10 = false;
        if (c8083gA0.equals(this.f75354k)) {
            return false;
        }
        this.f75354k = c8083gA0;
        while (c8083gA0.g() != null) {
            c8083gA0 = c8083gA0.g();
            c8083gA0.getClass();
            if (c8083gA0 == this.f75353j) {
                this.f75353j = this.f75352i;
                z10 = true;
            }
            c8083gA0.o();
            this.f75356m--;
        }
        C8083gA0 c8083gA02 = this.f75354k;
        c8083gA02.getClass();
        c8083gA02.p(null);
        g();
        return z10;
    }
}
