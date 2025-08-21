package M1;

import M1.i;
import Q1.d;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: r, reason: collision with root package name */
    public static boolean f19565r = false;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f19566s = true;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f19567t = true;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f19568u = true;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f19569v = false;

    /* renamed from: w, reason: collision with root package name */
    private static int f19570w = 1000;

    /* renamed from: x, reason: collision with root package name */
    public static long f19571x;

    /* renamed from: y, reason: collision with root package name */
    public static long f19572y;

    /* renamed from: d, reason: collision with root package name */
    private a f19576d;

    /* renamed from: g, reason: collision with root package name */
    M1.b[] f19579g;

    /* renamed from: n, reason: collision with root package name */
    final c f19586n;

    /* renamed from: q, reason: collision with root package name */
    private a f19589q;

    /* renamed from: a, reason: collision with root package name */
    public boolean f19573a = false;

    /* renamed from: b, reason: collision with root package name */
    int f19574b = 0;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, i> f19575c = null;

    /* renamed from: e, reason: collision with root package name */
    private int f19577e = 32;

    /* renamed from: f, reason: collision with root package name */
    private int f19578f = 32;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19580h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19581i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean[] f19582j = new boolean[32];

    /* renamed from: k, reason: collision with root package name */
    int f19583k = 1;

    /* renamed from: l, reason: collision with root package name */
    int f19584l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f19585m = 32;

    /* renamed from: o, reason: collision with root package name */
    private i[] f19587o = new i[f19570w];

    /* renamed from: p, reason: collision with root package name */
    private int f19588p = 0;

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
            this.f19559e = new j(this, cVar);
        }
    }

    private final int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f19583k; i10++) {
            this.f19582j[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 < this.f19583k * 2) {
                if (aVar.getKey() != null) {
                    this.f19582j[aVar.getKey().f19606c] = true;
                }
                i iVarB = aVar.b(this, this.f19582j);
                if (iVarB != null) {
                    boolean[] zArr = this.f19582j;
                    int i12 = iVarB.f19606c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (iVarB != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f19584l; i14++) {
                        M1.b bVar = this.f19579g[i14];
                        if (bVar.f19555a.f19613j != i.a.UNRESTRICTED && !bVar.f19560f && bVar.t(iVarB)) {
                            float f11 = bVar.f19559e.f(iVarB);
                            if (f11 < 0.0f) {
                                float f12 = (-bVar.f19556b) / f11;
                                if (f12 < f10) {
                                    i13 = i14;
                                    f10 = f12;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        M1.b bVar2 = this.f19579g[i13];
                        bVar2.f19555a.f19607d = -1;
                        bVar2.x(iVarB);
                        i iVar = bVar2.f19555a;
                        iVar.f19607d = i13;
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
        for (int i10 = 0; i10 < this.f19584l; i10++) {
            M1.b bVar = this.f19579g[i10];
            bVar.f19555a.f19609f = bVar.f19556b;
        }
    }

    public static e w() {
        return null;
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f19586n;
            i[] iVarArr = cVar.f19564d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.m();
            }
            i10++;
        }
        cVar.f19563c.c(this.f19587o, this.f19588p);
        this.f19588p = 0;
        Arrays.fill(this.f19586n.f19564d, (Object) null);
        HashMap<String, i> map = this.f19575c;
        if (map != null) {
            map.clear();
        }
        this.f19574b = 0;
        this.f19576d.clear();
        this.f19583k = 1;
        for (int i11 = 0; i11 < this.f19584l; i11++) {
            M1.b bVar = this.f19579g[i11];
            if (bVar != null) {
                bVar.f19557c = false;
            }
        }
        C();
        this.f19584l = 0;
        if (f19569v) {
            this.f19589q = new b(this.f19586n);
        } else {
            this.f19589q = new M1.b(this.f19586n);
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
        if (this.f19583k + 1 >= this.f19578f) {
            y();
        }
        if (obj instanceof Q1.d) {
            Q1.d dVar = (Q1.d) obj;
            iVarH = dVar.h();
            if (iVarH == null) {
                dVar.r(this.f19586n);
                iVarH = dVar.h();
            }
            int i10 = iVarH.f19606c;
            if (i10 != -1 && i10 <= this.f19574b && this.f19586n.f19564d[i10] != null) {
                return iVarH;
            }
            if (i10 != -1) {
                iVarH.m();
            }
            int i11 = this.f19574b + 1;
            this.f19574b = i11;
            this.f19583k++;
            iVarH.f19606c = i11;
            iVarH.f19613j = i.a.UNRESTRICTED;
            this.f19586n.f19564d[i11] = iVarH;
        }
        return iVarH;
    }

    private void C() {
        int i10 = 0;
        if (f19569v) {
            while (i10 < this.f19584l) {
                M1.b bVar = this.f19579g[i10];
                if (bVar != null) {
                    this.f19586n.f19561a.a(bVar);
                }
                this.f19579g[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f19584l) {
            M1.b bVar2 = this.f19579g[i10];
            if (bVar2 != null) {
                this.f19586n.f19562b.a(bVar2);
            }
            this.f19579g[i10] = null;
            i10++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVarB = this.f19586n.f19563c.b();
        if (iVarB == null) {
            iVarB = new i(aVar, str);
            iVarB.p(aVar, str);
        } else {
            iVarB.m();
            iVarB.p(aVar, str);
        }
        int i10 = this.f19588p;
        int i11 = f19570w;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f19570w = i12;
            this.f19587o = (i[]) Arrays.copyOf(this.f19587o, i12);
        }
        i[] iVarArr = this.f19587o;
        int i13 = this.f19588p;
        this.f19588p = i13 + 1;
        iVarArr[i13] = iVarB;
        return iVarB;
    }

    private final void l(M1.b bVar) {
        int i10;
        if (f19567t && bVar.f19560f) {
            bVar.f19555a.o(this, bVar.f19556b);
        } else {
            M1.b[] bVarArr = this.f19579g;
            int i11 = this.f19584l;
            bVarArr[i11] = bVar;
            i iVar = bVar.f19555a;
            iVar.f19607d = i11;
            this.f19584l = i11 + 1;
            iVar.t(this, bVar);
        }
        if (f19567t && this.f19573a) {
            int i12 = 0;
            while (i12 < this.f19584l) {
                if (this.f19579g[i12] == null) {
                    System.out.println("WTF");
                }
                M1.b bVar2 = this.f19579g[i12];
                if (bVar2 != null && bVar2.f19560f) {
                    bVar2.f19555a.o(this, bVar2.f19556b);
                    if (f19569v) {
                        this.f19586n.f19561a.a(bVar2);
                    } else {
                        this.f19586n.f19562b.a(bVar2);
                    }
                    this.f19579g[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f19584l;
                        if (i13 >= i10) {
                            break;
                        }
                        M1.b[] bVarArr2 = this.f19579g;
                        int i15 = i13 - 1;
                        M1.b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        i iVar2 = bVar3.f19555a;
                        if (iVar2.f19607d == i13) {
                            iVar2.f19607d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f19579g[i14] = null;
                    }
                    this.f19584l = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f19573a = false;
        }
    }

    private int u(a aVar) throws Exception {
        float f10;
        float f11;
        for (int i10 = 0; i10 < this.f19584l; i10++) {
            M1.b bVar = this.f19579g[i10];
            if (bVar.f19555a.f19613j != i.a.UNRESTRICTED) {
                float f12 = 0.0f;
                if (bVar.f19556b < 0.0f) {
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
                            if (i12 >= this.f19584l) {
                                break;
                            }
                            M1.b bVar2 = this.f19579g[i12];
                            if (bVar2.f19555a.f19613j == i.a.UNRESTRICTED || bVar2.f19560f || bVar2.f19556b >= f12) {
                                f10 = f12;
                            } else if (f19568u) {
                                int iC = bVar2.f19559e.c();
                                int i16 = 0;
                                while (i16 < iC) {
                                    i iVarA = bVar2.f19559e.a(i16);
                                    float f14 = bVar2.f19559e.f(iVarA);
                                    if (f14 <= f12) {
                                        f11 = f12;
                                    } else {
                                        f11 = f12;
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f15 = iVarA.f19611h[i17] / f14;
                                            if ((f15 < f13 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i14 = iVarA.f19606c;
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
                                for (int i18 = 1; i18 < this.f19583k; i18++) {
                                    i iVar = this.f19586n.f19564d[i18];
                                    float f16 = bVar2.f19559e.f(iVar);
                                    if (f16 > f10) {
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            float f17 = iVar.f19611h[i19] / f16;
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
                            M1.b bVar3 = this.f19579g[i13];
                            bVar3.f19555a.f19607d = -1;
                            bVar3.x(this.f19586n.f19564d[i14]);
                            i iVar2 = bVar3.f19555a;
                            iVar2.f19607d = i13;
                            iVar2.t(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f19583k / 2) {
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
        int i10 = this.f19577e * 2;
        this.f19577e = i10;
        this.f19579g = (M1.b[]) Arrays.copyOf(this.f19579g, i10);
        c cVar = this.f19586n;
        cVar.f19564d = (i[]) Arrays.copyOf(cVar.f19564d, this.f19577e);
        int i11 = this.f19577e;
        this.f19582j = new boolean[i11];
        this.f19578f = i11;
        this.f19585m = i11;
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
            int r0 = r5.f19584l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f19585m
            if (r0 >= r2) goto L13
            int r0 = r5.f19583k
            int r0 = r0 + r1
            int r2 = r5.f19578f
            if (r0 < r2) goto L16
        L13:
            r5.y()
        L16:
            boolean r0 = r6.f19560f
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
            r6.f19555a = r0
            int r3 = r5.f19584l
            r5.l(r6)
            int r4 = r5.f19584l
            int r3 = r3 + r1
            if (r4 != r3) goto L7c
            M1.d$a r2 = r5.f19589q
            r2.a(r6)
            M1.d$a r2 = r5.f19589q
            r5.B(r2, r1)
            int r2 = r0.f19607d
            r3 = -1
            if (r2 != r3) goto L7d
            M1.i r2 = r6.f19555a
            if (r2 != r0) goto L5a
            M1.i r0 = r6.v(r0)
            if (r0 == 0) goto L5a
            r6.x(r0)
        L5a:
            boolean r0 = r6.f19560f
            if (r0 != 0) goto L63
            M1.i r0 = r6.f19555a
            r0.t(r5, r6)
        L63:
            boolean r0 = M1.d.f19569v
            if (r0 == 0) goto L6f
            M1.c r0 = r5.f19586n
            M1.f<M1.b> r0 = r0.f19561a
            r0.a(r6)
            goto L76
        L6f:
            M1.c r0 = r5.f19586n
            M1.f<M1.b> r0 = r0.f19562b
            r0.a(r6)
        L76:
            int r0 = r5.f19584l
            int r0 = r0 - r1
            r5.f19584l = r0
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
        if (f19566s && i11 == 8 && iVar2.f19610g && iVar.f19607d == -1) {
            iVar.o(this, iVar2.f19609f + i10);
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
        if (f19566s && iVar.f19607d == -1) {
            float f10 = i10;
            iVar.o(this, f10);
            for (int i11 = 0; i11 < this.f19574b + 1; i11++) {
                i iVar2 = this.f19586n.f19564d[i11];
                if (iVar2 != null && iVar2.f19617n && iVar2.f19618o == iVar.f19606c) {
                    iVar2.o(this, iVar2.f19619p + f10);
                }
            }
            return;
        }
        int i12 = iVar.f19607d;
        if (i12 == -1) {
            M1.b bVarR = r();
            bVarR.i(iVar, i10);
            d(bVarR);
            return;
        }
        M1.b bVar = this.f19579g[i12];
        if (bVar.f19560f) {
            bVar.f19556b = i10;
            return;
        }
        if (bVar.f19559e.c() == 0) {
            bVar.f19560f = true;
            bVar.f19556b = i10;
        } else {
            M1.b bVarR2 = r();
            bVarR2.m(iVar, i10);
            d(bVarR2);
        }
    }

    public i o(int i10, String str) {
        if (this.f19583k + 1 >= this.f19578f) {
            y();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f19574b + 1;
        this.f19574b = i11;
        this.f19583k++;
        iVarA.f19606c = i11;
        iVarA.f19608e = i10;
        this.f19586n.f19564d[i11] = iVarA;
        this.f19576d.c(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f19583k + 1 >= this.f19578f) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f19574b + 1;
        this.f19574b = i10;
        this.f19583k++;
        iVarA.f19606c = i10;
        this.f19586n.f19564d[i10] = iVarA;
        return iVarA;
    }

    public M1.b r() {
        M1.b bVarB;
        if (f19569v) {
            bVarB = this.f19586n.f19561a.b();
            if (bVarB == null) {
                bVarB = new b(this.f19586n);
                f19572y++;
            } else {
                bVarB.y();
            }
        } else {
            bVarB = this.f19586n.f19562b.b();
            if (bVarB == null) {
                bVarB = new M1.b(this.f19586n);
                f19571x++;
            } else {
                bVarB.y();
            }
        }
        i.e();
        return bVarB;
    }

    public i t() {
        if (this.f19583k + 1 >= this.f19578f) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f19574b + 1;
        this.f19574b = i10;
        this.f19583k++;
        iVarA.f19606c = i10;
        this.f19586n.f19564d[i10] = iVarA;
        return iVarA;
    }

    public c v() {
        return this.f19586n;
    }

    public int x(Object obj) {
        i iVarH = ((Q1.d) obj).h();
        if (iVarH != null) {
            return (int) (iVarH.f19609f + 0.5f);
        }
        return 0;
    }

    public void z() throws Exception {
        if (this.f19576d.isEmpty()) {
            n();
            return;
        }
        if (!this.f19580h && !this.f19581i) {
            A(this.f19576d);
            return;
        }
        for (int i10 = 0; i10 < this.f19584l; i10++) {
            if (!this.f19579g[i10].f19560f) {
                A(this.f19576d);
                return;
            }
        }
        n();
    }

    public d() {
        this.f19579g = null;
        this.f19579g = new M1.b[32];
        C();
        c cVar = new c();
        this.f19586n = cVar;
        this.f19576d = new h(cVar);
        if (f19569v) {
            this.f19589q = new b(cVar);
        } else {
            this.f19589q = new M1.b(cVar);
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
        iVarT.f19608e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        M1.b bVarR = r();
        i iVarT = t();
        iVarT.f19608e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f19559e.f(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        M1.b bVarR = r();
        i iVarT = t();
        iVarT.f19608e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        M1.b bVarR = r();
        i iVarT = t();
        iVarT.f19608e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f19559e.f(iVarT) * (-1.0f)), i11);
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
