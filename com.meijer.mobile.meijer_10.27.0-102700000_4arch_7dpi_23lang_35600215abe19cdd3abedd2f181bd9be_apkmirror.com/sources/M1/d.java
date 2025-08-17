package M1;

import M1.i;
import Q1.d;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: r, reason: collision with root package name */
    public static boolean f18824r = false;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f18825s = true;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f18826t = true;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f18827u = true;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f18828v = false;

    /* renamed from: w, reason: collision with root package name */
    private static int f18829w = 1000;

    /* renamed from: x, reason: collision with root package name */
    public static long f18830x;

    /* renamed from: y, reason: collision with root package name */
    public static long f18831y;

    /* renamed from: d, reason: collision with root package name */
    private a f18835d;

    /* renamed from: g, reason: collision with root package name */
    M1.b[] f18838g;

    /* renamed from: n, reason: collision with root package name */
    final c f18845n;

    /* renamed from: q, reason: collision with root package name */
    private a f18848q;

    /* renamed from: a, reason: collision with root package name */
    public boolean f18832a = false;

    /* renamed from: b, reason: collision with root package name */
    int f18833b = 0;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, i> f18834c = null;

    /* renamed from: e, reason: collision with root package name */
    private int f18836e = 32;

    /* renamed from: f, reason: collision with root package name */
    private int f18837f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18839h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18840i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean[] f18841j = new boolean[32];

    /* renamed from: k, reason: collision with root package name */
    int f18842k = 1;

    /* renamed from: l, reason: collision with root package name */
    int f18843l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f18844m = 32;

    /* renamed from: o, reason: collision with root package name */
    private i[] f18846o = new i[f18829w];

    /* renamed from: p, reason: collision with root package name */
    private int f18847p = 0;

    interface a {
        void a(a aVar);

        i b(d dVar, boolean[] zArr);

        void c(i iVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    class b extends M1.b {
        public b(c cVar) {
            this.f18818e = new j(this, cVar);
        }
    }

    private final int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f18842k; i10++) {
            this.f18841j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 < this.f18842k * 2) {
                if (aVar.getKey() != null) {
                    this.f18841j[aVar.getKey().f18865c] = true;
                }
                i iVarB = aVar.b(this, this.f18841j);
                if (iVarB != null) {
                    boolean[] zArr = this.f18841j;
                    int i12 = iVarB.f18865c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (iVarB != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f18843l; i14++) {
                        M1.b bVar = this.f18838g[i14];
                        if (bVar.f18814a.f18872j != i.a.UNRESTRICTED && !bVar.f18819f && bVar.t(iVarB)) {
                            float f11 = bVar.f18818e.f(iVarB);
                            if (f11 < 0.0f) {
                                float f12 = (-bVar.f18815b) / f11;
                                if (f12 < f10) {
                                    i13 = i14;
                                    f10 = f12;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        M1.b bVar2 = this.f18838g[i13];
                        bVar2.f18814a.f18866d = -1;
                        bVar2.x(iVarB);
                        i iVar = bVar2.f18814a;
                        iVar.f18866d = i13;
                        iVar.t(this, bVar2);
                    }
                } else {
                    z11 = true;
                }
            }
            return i11;
        }
        return i11;
    }

    private void n() {
        for (int i10 = 0; i10 < this.f18843l; i10++) {
            M1.b bVar = this.f18838g[i10];
            bVar.f18814a.f18868f = bVar.f18815b;
        }
    }

    public static e w() {
        return null;
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f18845n;
            i[] iVarArr = cVar.f18823d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.m();
            }
            i10++;
        }
        cVar.f18822c.c(this.f18846o, this.f18847p);
        this.f18847p = 0;
        Arrays.fill(this.f18845n.f18823d, (Object) null);
        HashMap<String, i> map = this.f18834c;
        if (map != null) {
            map.clear();
        }
        this.f18833b = 0;
        this.f18835d.clear();
        this.f18842k = 1;
        for (int i11 = 0; i11 < this.f18843l; i11++) {
            M1.b bVar = this.f18838g[i11];
            if (bVar != null) {
                bVar.f18816c = false;
            }
        }
        C();
        this.f18843l = 0;
        if (f18828v) {
            this.f18848q = new b(this.f18845n);
        } else {
            this.f18848q = new M1.b(this.f18845n);
        }
    }

    void m(M1.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public i q(Object obj) {
        i iVarH = null;
        if (obj == null) {
            return null;
        }
        if (this.f18842k + 1 >= this.f18837f) {
            y();
        }
        if (obj instanceof Q1.d) {
            Q1.d dVar = (Q1.d) obj;
            iVarH = dVar.h();
            if (iVarH == null) {
                dVar.r(this.f18845n);
                iVarH = dVar.h();
            }
            int i10 = iVarH.f18865c;
            if (i10 != -1 && i10 <= this.f18833b && this.f18845n.f18823d[i10] != null) {
                return iVarH;
            }
            if (i10 != -1) {
                iVarH.m();
            }
            int i11 = this.f18833b + 1;
            this.f18833b = i11;
            this.f18842k++;
            iVarH.f18865c = i11;
            iVarH.f18872j = i.a.UNRESTRICTED;
            this.f18845n.f18823d[i11] = iVarH;
        }
        return iVarH;
    }

    private void C() {
        int i10 = 0;
        if (f18828v) {
            while (i10 < this.f18843l) {
                M1.b bVar = this.f18838g[i10];
                if (bVar != null) {
                    this.f18845n.f18820a.a(bVar);
                }
                this.f18838g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f18843l) {
            M1.b bVar2 = this.f18838g[i10];
            if (bVar2 != null) {
                this.f18845n.f18821b.a(bVar2);
            }
            this.f18838g[i10] = null;
            i10++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVarB = this.f18845n.f18822c.b();
        if (iVarB == null) {
            iVarB = new i(aVar, str);
            iVarB.p(aVar, str);
        } else {
            iVarB.m();
            iVarB.p(aVar, str);
        }
        int i10 = this.f18847p;
        int i11 = f18829w;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f18829w = i12;
            this.f18846o = (i[]) Arrays.copyOf(this.f18846o, i12);
        }
        i[] iVarArr = this.f18846o;
        int i13 = this.f18847p;
        this.f18847p = i13 + 1;
        iVarArr[i13] = iVarB;
        return iVarB;
    }

    private final void l(M1.b bVar) {
        int i10;
        if (f18826t && bVar.f18819f) {
            bVar.f18814a.o(this, bVar.f18815b);
        } else {
            M1.b[] bVarArr = this.f18838g;
            int i11 = this.f18843l;
            bVarArr[i11] = bVar;
            i iVar = bVar.f18814a;
            iVar.f18866d = i11;
            this.f18843l = i11 + 1;
            iVar.t(this, bVar);
        }
        if (f18826t && this.f18832a) {
            int i12 = 0;
            while (i12 < this.f18843l) {
                if (this.f18838g[i12] == null) {
                    System.out.println("WTF");
                }
                M1.b bVar2 = this.f18838g[i12];
                if (bVar2 != null && bVar2.f18819f) {
                    bVar2.f18814a.o(this, bVar2.f18815b);
                    if (f18828v) {
                        this.f18845n.f18820a.a(bVar2);
                    } else {
                        this.f18845n.f18821b.a(bVar2);
                    }
                    this.f18838g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f18843l;
                        if (i13 >= i10) {
                            break;
                        }
                        M1.b[] bVarArr2 = this.f18838g;
                        int i15 = i13 - 1;
                        M1.b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        i iVar2 = bVar3.f18814a;
                        if (iVar2.f18866d == i13) {
                            iVar2.f18866d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f18838g[i14] = null;
                    }
                    this.f18843l = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f18832a = false;
        }
    }

    private int u(a aVar) throws Exception {
        float f10;
        float f11;
        for (int i10 = 0; i10 < this.f18843l; i10++) {
            M1.b bVar = this.f18838g[i10];
            if (bVar.f18814a.f18872j != i.a.UNRESTRICTED) {
                float f12 = 0.0f;
                if (bVar.f18815b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        i11++;
                        float f13 = Float.MAX_VALUE;
                        int i12 = 0;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i12 >= this.f18843l) {
                                break;
                            }
                            M1.b bVar2 = this.f18838g[i12];
                            if (bVar2.f18814a.f18872j == i.a.UNRESTRICTED || bVar2.f18819f || bVar2.f18815b >= f12) {
                                f10 = f12;
                            } else if (f18827u) {
                                int iC = bVar2.f18818e.c();
                                int i16 = 0;
                                while (i16 < iC) {
                                    i iVarA = bVar2.f18818e.a(i16);
                                    float f14 = bVar2.f18818e.f(iVarA);
                                    if (f14 <= f12) {
                                        f11 = f12;
                                    } else {
                                        f11 = f12;
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f15 = iVarA.f18870h[i17] / f14;
                                            if ((f15 < f13 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i14 = iVarA.f18865c;
                                                i13 = i12;
                                                f13 = f15;
                                            }
                                        }
                                    }
                                    i16++;
                                    f12 = f11;
                                }
                                f10 = f12;
                            } else {
                                f10 = f12;
                                for (int i18 = 1; i18 < this.f18842k; i18++) {
                                    i iVar = this.f18845n.f18823d[i18];
                                    float f16 = bVar2.f18818e.f(iVar);
                                    if (f16 > f10) {
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            float f17 = iVar.f18870h[i19] / f16;
                                            if ((f17 < f13 && i19 == i15) || i19 > i15) {
                                                i15 = i19;
                                                i13 = i12;
                                                i14 = i18;
                                                f13 = f17;
                                            }
                                        }
                                    }
                                }
                            }
                            i12++;
                            f12 = f10;
                        }
                        float f18 = f12;
                        if (i13 != -1) {
                            M1.b bVar3 = this.f18838g[i13];
                            bVar3.f18814a.f18866d = -1;
                            bVar3.x(this.f18845n.f18823d[i14]);
                            i iVar2 = bVar3.f18814a;
                            iVar2.f18866d = i13;
                            iVar2.t(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f18842k / 2) {
                            z10 = true;
                        }
                        f12 = f18;
                    }
                    return i11;
                }
            }
        }
        return 0;
    }

    private void y() {
        int i10 = this.f18836e * 2;
        this.f18836e = i10;
        this.f18838g = (M1.b[]) Arrays.copyOf(this.f18838g, i10);
        c cVar = this.f18845n;
        cVar.f18823d = (i[]) Arrays.copyOf(cVar.f18823d, this.f18836e);
        int i11 = this.f18836e;
        this.f18841j = new boolean[i11];
        this.f18837f = i11;
        this.f18844m = i11;
    }

    public void b(Q1.e eVar, Q1.e eVar2, float f10, int i10) {
        d.b bVar = d.b.LEFT;
        i iVarQ = q(eVar.j(bVar));
        d.b bVar2 = d.b.TOP;
        i iVarQ2 = q(eVar.j(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i iVarQ3 = q(eVar.j(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i iVarQ4 = q(eVar.j(bVar4));
        i iVarQ5 = q(eVar2.j(bVar));
        i iVarQ6 = q(eVar2.j(bVar2));
        i iVarQ7 = q(eVar2.j(bVar3));
        i iVarQ8 = q(eVar2.j(bVar4));
        M1.b bVarR = r();
        double d10 = f10;
        double d11 = i10;
        bVarR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d10) * d11));
        d(bVarR);
        M1.b bVarR2 = r();
        bVarR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d10) * d11));
        d(bVarR2);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        M1.b bVarR = r();
        bVarR.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            bVarR.d(this, i12);
        }
        d(bVarR);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(M1.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L4
            goto L8a
        L4:
            int r0 = r5.f18843l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f18844m
            if (r0 >= r2) goto L13
            int r0 = r5.f18842k
            int r0 = r0 + r1
            int r2 = r5.f18837f
            if (r0 < r2) goto L16
        L13:
            r5.y()
        L16:
            boolean r0 = r6.f18819f
            r2 = 0
            if (r0 != 0) goto L85
            r6.D(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L25
            goto L8a
        L25:
            r6.r()
            boolean r0 = r6.f(r5)
            if (r0 == 0) goto L7c
            M1.i r0 = r5.p()
            r6.f18814a = r0
            int r3 = r5.f18843l
            r5.l(r6)
            int r4 = r5.f18843l
            int r3 = r3 + r1
            if (r4 != r3) goto L7c
            M1.d$a r2 = r5.f18848q
            r2.a(r6)
            M1.d$a r2 = r5.f18848q
            r5.B(r2, r1)
            int r2 = r0.f18866d
            r3 = -1
            if (r2 != r3) goto L7d
            M1.i r2 = r6.f18814a
            if (r2 != r0) goto L5a
            M1.i r0 = r6.v(r0)
            if (r0 == 0) goto L5a
            r6.x(r0)
        L5a:
            boolean r0 = r6.f18819f
            if (r0 != 0) goto L63
            M1.i r0 = r6.f18814a
            r0.t(r5, r6)
        L63:
            boolean r0 = M1.d.f18828v
            if (r0 == 0) goto L6f
            M1.c r0 = r5.f18845n
            M1.f<M1.b> r0 = r0.f18820a
            r0.a(r6)
            goto L76
        L6f:
            M1.c r0 = r5.f18845n
            M1.f<M1.b> r0 = r0.f18821b
            r0.a(r6)
        L76:
            int r0 = r5.f18843l
            int r0 = r0 - r1
            r5.f18843l = r0
            goto L7d
        L7c:
            r1 = r2
        L7d:
            boolean r0 = r6.s()
            if (r0 != 0) goto L84
            goto L8a
        L84:
            r2 = r1
        L85:
            if (r2 != 0) goto L8a
            r5.l(r6)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.d.d(M1.b):void");
    }

    public M1.b e(i iVar, i iVar2, int i10, int i11) {
        if (f18825s && i11 == 8 && iVar2.f18869g && iVar.f18866d == -1) {
            iVar.o(this, iVar2.f18868f + i10);
            return null;
        }
        M1.b bVarR = r();
        bVarR.n(iVar, iVar2, i10);
        if (i11 != 8) {
            bVarR.d(this, i11);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(i iVar, int i10) {
        if (f18825s && iVar.f18866d == -1) {
            float f10 = i10;
            iVar.o(this, f10);
            for (int i11 = 0; i11 < this.f18833b + 1; i11++) {
                i iVar2 = this.f18845n.f18823d[i11];
                if (iVar2 != null && iVar2.f18876n && iVar2.f18877o == iVar.f18865c) {
                    iVar2.o(this, iVar2.f18878p + f10);
                }
            }
            return;
        }
        int i12 = iVar.f18866d;
        if (i12 == -1) {
            M1.b bVarR = r();
            bVarR.i(iVar, i10);
            d(bVarR);
            return;
        }
        M1.b bVar = this.f18838g[i12];
        if (bVar.f18819f) {
            bVar.f18815b = i10;
            return;
        }
        if (bVar.f18818e.c() == 0) {
            bVar.f18819f = true;
            bVar.f18815b = i10;
        } else {
            M1.b bVarR2 = r();
            bVarR2.m(iVar, i10);
            d(bVarR2);
        }
    }

    public i o(int i10, String str) {
        if (this.f18842k + 1 >= this.f18837f) {
            y();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f18833b + 1;
        this.f18833b = i11;
        this.f18842k++;
        iVarA.f18865c = i11;
        iVarA.f18867e = i10;
        this.f18845n.f18823d[i11] = iVarA;
        this.f18835d.c(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f18842k + 1 >= this.f18837f) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f18833b + 1;
        this.f18833b = i10;
        this.f18842k++;
        iVarA.f18865c = i10;
        this.f18845n.f18823d[i10] = iVarA;
        return iVarA;
    }

    public M1.b r() {
        M1.b bVarB;
        if (f18828v) {
            bVarB = this.f18845n.f18820a.b();
            if (bVarB == null) {
                bVarB = new b(this.f18845n);
                f18831y++;
            } else {
                bVarB.y();
            }
        } else {
            bVarB = this.f18845n.f18821b.b();
            if (bVarB == null) {
                bVarB = new M1.b(this.f18845n);
                f18830x++;
            } else {
                bVarB.y();
            }
        }
        i.e();
        return bVarB;
    }

    public i t() {
        if (this.f18842k + 1 >= this.f18837f) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f18833b + 1;
        this.f18833b = i10;
        this.f18842k++;
        iVarA.f18865c = i10;
        this.f18845n.f18823d[i10] = iVarA;
        return iVarA;
    }

    public c v() {
        return this.f18845n;
    }

    public int x(Object obj) {
        i iVarH = ((Q1.d) obj).h();
        if (iVarH != null) {
            return (int) (iVarH.f18868f + 0.5f);
        }
        return 0;
    }

    public void z() throws Exception {
        if (this.f18835d.isEmpty()) {
            n();
            return;
        }
        if (!this.f18839h && !this.f18840i) {
            A(this.f18835d);
            return;
        }
        for (int i10 = 0; i10 < this.f18843l; i10++) {
            if (!this.f18838g[i10].f18819f) {
                A(this.f18835d);
                return;
            }
        }
        n();
    }

    public d() {
        this.f18838g = null;
        this.f18838g = new M1.b[32];
        C();
        c cVar = new c();
        this.f18845n = cVar;
        this.f18835d = new h(cVar);
        if (f18828v) {
            this.f18848q = new b(cVar);
        } else {
            this.f18848q = new M1.b(cVar);
        }
    }

    public static M1.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    void A(a aVar) throws Exception {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        M1.b bVarR = r();
        i iVarT = t();
        iVarT.f18867e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        M1.b bVarR = r();
        i iVarT = t();
        iVarT.f18867e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f18818e.f(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        M1.b bVarR = r();
        i iVarT = t();
        iVarT.f18867e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        M1.b bVarR = r();
        i iVarT = t();
        iVarT.f18867e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f18818e.f(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        M1.b bVarR = r();
        bVarR.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            bVarR.d(this, i10);
        }
        d(bVarR);
    }
}
