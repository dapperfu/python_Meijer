package U1;

import U1.i;
import V1.d;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: q, reason: collision with root package name */
    private static int f36968q = 1000;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f36969r = true;

    /* renamed from: s, reason: collision with root package name */
    public static long f36970s;

    /* renamed from: t, reason: collision with root package name */
    public static long f36971t;

    /* renamed from: c, reason: collision with root package name */
    private a f36974c;

    /* renamed from: f, reason: collision with root package name */
    U1.b[] f36977f;

    /* renamed from: m, reason: collision with root package name */
    final c f36984m;

    /* renamed from: p, reason: collision with root package name */
    private a f36987p;

    /* renamed from: a, reason: collision with root package name */
    int f36972a = 0;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, i> f36973b = null;

    /* renamed from: d, reason: collision with root package name */
    private int f36975d = 32;

    /* renamed from: e, reason: collision with root package name */
    private int f36976e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f36978g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f36979h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean[] f36980i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    int f36981j = 1;

    /* renamed from: k, reason: collision with root package name */
    int f36982k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f36983l = 32;

    /* renamed from: n, reason: collision with root package name */
    private i[] f36985n = new i[f36968q];

    /* renamed from: o, reason: collision with root package name */
    private int f36986o = 0;

    interface a {
        i a(d dVar, boolean[] zArr);

        void b(a aVar);

        void c(i iVar);

        void clear();

        i getKey();
    }

    class b extends U1.b {
        public b(c cVar) {
            this.f36962e = new j(this, cVar);
        }
    }

    private final int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f36981j; i10++) {
            this.f36980i[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 < this.f36981j * 2) {
                if (aVar.getKey() != null) {
                    this.f36980i[aVar.getKey().f37004c] = true;
                }
                i iVarA = aVar.a(this, this.f36980i);
                if (iVarA != null) {
                    boolean[] zArr = this.f36980i;
                    int i12 = iVarA.f37004c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (iVarA != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f36982k; i14++) {
                        U1.b bVar = this.f36977f[i14];
                        if (bVar.f36958a.f37011j != i.a.UNRESTRICTED && !bVar.f36963f && bVar.t(iVarA)) {
                            float fI = bVar.f36962e.i(iVarA);
                            if (fI < 0.0f) {
                                float f11 = (-bVar.f36959b) / fI;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        U1.b bVar2 = this.f36977f[i13];
                        bVar2.f36958a.f37005d = -1;
                        bVar2.y(iVarA);
                        i iVar = bVar2.f36958a;
                        iVar.f37005d = i13;
                        iVar.g(bVar2);
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
        for (int i10 = 0; i10 < this.f36982k; i10++) {
            U1.b bVar = this.f36977f[i10];
            bVar.f36958a.f37007f = bVar.f36959b;
        }
    }

    public static e w() {
        return null;
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f36984m;
            i[] iVarArr = cVar.f36967d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.d();
            }
            i10++;
        }
        cVar.f36966c.c(this.f36985n, this.f36986o);
        this.f36986o = 0;
        Arrays.fill(this.f36984m.f36967d, (Object) null);
        HashMap<String, i> map = this.f36973b;
        if (map != null) {
            map.clear();
        }
        this.f36972a = 0;
        this.f36974c.clear();
        this.f36981j = 1;
        for (int i11 = 0; i11 < this.f36982k; i11++) {
            this.f36977f[i11].f36960c = false;
        }
        C();
        this.f36982k = 0;
        if (f36969r) {
            this.f36987p = new b(this.f36984m);
        } else {
            this.f36987p = new U1.b(this.f36984m);
        }
    }

    void m(U1.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public i q(Object obj) {
        i iVarF = null;
        if (obj == null) {
            return null;
        }
        if (this.f36981j + 1 >= this.f36976e) {
            y();
        }
        if (obj instanceof V1.d) {
            V1.d dVar = (V1.d) obj;
            iVarF = dVar.f();
            if (iVarF == null) {
                dVar.m(this.f36984m);
                iVarF = dVar.f();
            }
            int i10 = iVarF.f37004c;
            if (i10 != -1 && i10 <= this.f36972a && this.f36984m.f36967d[i10] != null) {
                return iVarF;
            }
            if (i10 != -1) {
                iVarF.d();
            }
            int i11 = this.f36972a + 1;
            this.f36972a = i11;
            this.f36981j++;
            iVarF.f37004c = i11;
            iVarF.f37011j = i.a.UNRESTRICTED;
            this.f36984m.f36967d[i11] = iVarF;
        }
        return iVarF;
    }

    private void C() {
        int i10 = 0;
        if (f36969r) {
            while (true) {
                U1.b[] bVarArr = this.f36977f;
                if (i10 >= bVarArr.length) {
                    return;
                }
                U1.b bVar = bVarArr[i10];
                if (bVar != null) {
                    this.f36984m.f36964a.a(bVar);
                }
                this.f36977f[i10] = null;
                i10++;
            }
        } else {
            while (true) {
                U1.b[] bVarArr2 = this.f36977f;
                if (i10 >= bVarArr2.length) {
                    return;
                }
                U1.b bVar2 = bVarArr2[i10];
                if (bVar2 != null) {
                    this.f36984m.f36965b.a(bVar2);
                }
                this.f36977f[i10] = null;
                i10++;
            }
        }
    }

    private i a(i.a aVar, String str) {
        i iVarB = this.f36984m.f36966c.b();
        if (iVarB == null) {
            iVarB = new i(aVar, str);
            iVarB.f(aVar, str);
        } else {
            iVarB.d();
            iVarB.f(aVar, str);
        }
        int i10 = this.f36986o;
        int i11 = f36968q;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f36968q = i12;
            this.f36985n = (i[]) Arrays.copyOf(this.f36985n, i12);
        }
        i[] iVarArr = this.f36985n;
        int i13 = this.f36986o;
        this.f36986o = i13 + 1;
        iVarArr[i13] = iVarB;
        return iVarB;
    }

    private final void l(U1.b bVar) {
        if (f36969r) {
            U1.b bVar2 = this.f36977f[this.f36982k];
            if (bVar2 != null) {
                this.f36984m.f36964a.a(bVar2);
            }
        } else {
            U1.b bVar3 = this.f36977f[this.f36982k];
            if (bVar3 != null) {
                this.f36984m.f36965b.a(bVar3);
            }
        }
        U1.b[] bVarArr = this.f36977f;
        int i10 = this.f36982k;
        bVarArr[i10] = bVar;
        i iVar = bVar.f36958a;
        iVar.f37005d = i10;
        this.f36982k = i10 + 1;
        iVar.g(bVar);
    }

    private int u(a aVar) throws Exception {
        for (int i10 = 0; i10 < this.f36982k; i10++) {
            U1.b bVar = this.f36977f[i10];
            if (bVar.f36958a.f37011j != i.a.UNRESTRICTED && bVar.f36959b < 0.0f) {
                boolean z10 = false;
                int i11 = 0;
                while (!z10) {
                    i11++;
                    float f10 = Float.MAX_VALUE;
                    int i12 = -1;
                    int i13 = -1;
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        if (i14 >= this.f36982k) {
                            break;
                        }
                        U1.b bVar2 = this.f36977f[i14];
                        if (bVar2.f36958a.f37011j != i.a.UNRESTRICTED && !bVar2.f36963f && bVar2.f36959b < 0.0f) {
                            for (int i16 = 1; i16 < this.f36981j; i16++) {
                                i iVar = this.f36984m.f36967d[i16];
                                float fI = bVar2.f36962e.i(iVar);
                                if (fI > 0.0f) {
                                    for (int i17 = 0; i17 < 9; i17++) {
                                        float f11 = iVar.f37009h[i17] / fI;
                                        if ((f11 < f10 && i17 == i15) || i17 > i15) {
                                            f10 = f11;
                                            i12 = i14;
                                            i13 = i16;
                                            i15 = i17;
                                        }
                                    }
                                }
                            }
                        }
                        i14++;
                    }
                    if (i12 != -1) {
                        U1.b bVar3 = this.f36977f[i12];
                        bVar3.f36958a.f37005d = -1;
                        bVar3.y(this.f36984m.f36967d[i13]);
                        i iVar2 = bVar3.f36958a;
                        iVar2.f37005d = i12;
                        iVar2.g(bVar3);
                    } else {
                        z10 = true;
                    }
                    if (i11 > this.f36981j / 2) {
                        z10 = true;
                    }
                }
                return i11;
            }
        }
        return 0;
    }

    private void y() {
        int i10 = this.f36975d * 2;
        this.f36975d = i10;
        this.f36977f = (U1.b[]) Arrays.copyOf(this.f36977f, i10);
        c cVar = this.f36984m;
        cVar.f36967d = (i[]) Arrays.copyOf(cVar.f36967d, this.f36975d);
        int i11 = this.f36975d;
        this.f36980i = new boolean[i11];
        this.f36976e = i11;
        this.f36983l = i11;
    }

    public void b(V1.e eVar, V1.e eVar2, float f10, int i10) {
        d.b bVar = d.b.LEFT;
        i iVarQ = q(eVar.m(bVar));
        d.b bVar2 = d.b.TOP;
        i iVarQ2 = q(eVar.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i iVarQ3 = q(eVar.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i iVarQ4 = q(eVar.m(bVar4));
        i iVarQ5 = q(eVar2.m(bVar));
        i iVarQ6 = q(eVar2.m(bVar2));
        i iVarQ7 = q(eVar2.m(bVar3));
        i iVarQ8 = q(eVar2.m(bVar4));
        U1.b bVarR = r();
        double d10 = f10;
        double d11 = i10;
        bVarR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d10) * d11));
        d(bVarR);
        U1.b bVarR2 = r();
        bVarR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d10) * d11));
        d(bVarR2);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        U1.b bVarR = r();
        bVarR.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            bVarR.d(this, i12);
        }
        d(bVarR);
    }

    public void d(U1.b bVar) {
        i iVarW;
        if (bVar == null) {
            return;
        }
        boolean z10 = true;
        if (this.f36982k + 1 >= this.f36983l || this.f36981j + 1 >= this.f36976e) {
            y();
        }
        boolean z11 = false;
        if (!bVar.f36963f) {
            bVar.D(this);
            if (bVar.u()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i iVarP = p();
                bVar.f36958a = iVarP;
                l(bVar);
                this.f36987p.b(bVar);
                B(this.f36987p, true);
                if (iVarP.f37005d == -1) {
                    if (bVar.f36958a == iVarP && (iVarW = bVar.w(iVarP)) != null) {
                        bVar.y(iVarW);
                    }
                    if (!bVar.f36963f) {
                        bVar.f36958a.g(bVar);
                    }
                    this.f36982k--;
                }
            } else {
                z10 = false;
            }
            if (!bVar.s()) {
                return;
            } else {
                z11 = z10;
            }
        }
        if (z11) {
            return;
        }
        l(bVar);
    }

    public U1.b e(i iVar, i iVar2, int i10, int i11) {
        if (i11 == 8 && iVar2.f37008g && iVar.f37005d == -1) {
            iVar.e(this, iVar2.f37007f + i10);
            return null;
        }
        U1.b bVarR = r();
        bVarR.n(iVar, iVar2, i10);
        if (i11 != 8) {
            bVarR.d(this, i11);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(i iVar, int i10) {
        int i11 = iVar.f37005d;
        if (i11 == -1) {
            iVar.e(this, i10);
            return;
        }
        if (i11 == -1) {
            U1.b bVarR = r();
            bVarR.i(iVar, i10);
            d(bVarR);
            return;
        }
        U1.b bVar = this.f36977f[i11];
        if (bVar.f36963f) {
            bVar.f36959b = i10;
            return;
        }
        if (bVar.f36962e.c() == 0) {
            bVar.f36963f = true;
            bVar.f36959b = i10;
        } else {
            U1.b bVarR2 = r();
            bVarR2.m(iVar, i10);
            d(bVarR2);
        }
    }

    public i o(int i10, String str) {
        if (this.f36981j + 1 >= this.f36976e) {
            y();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f36972a + 1;
        this.f36972a = i11;
        this.f36981j++;
        iVarA.f37004c = i11;
        iVarA.f37006e = i10;
        this.f36984m.f36967d[i11] = iVarA;
        this.f36974c.c(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f36981j + 1 >= this.f36976e) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f36972a + 1;
        this.f36972a = i10;
        this.f36981j++;
        iVarA.f37004c = i10;
        this.f36984m.f36967d[i10] = iVarA;
        return iVarA;
    }

    public U1.b r() {
        U1.b bVarB;
        if (f36969r) {
            bVarB = this.f36984m.f36964a.b();
            if (bVarB == null) {
                bVarB = new b(this.f36984m);
                f36971t++;
            } else {
                bVarB.z();
            }
        } else {
            bVarB = this.f36984m.f36965b.b();
            if (bVarB == null) {
                bVarB = new U1.b(this.f36984m);
                f36970s++;
            } else {
                bVarB.z();
            }
        }
        i.b();
        return bVarB;
    }

    public i t() {
        if (this.f36981j + 1 >= this.f36976e) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f36972a + 1;
        this.f36972a = i10;
        this.f36981j++;
        iVarA.f37004c = i10;
        this.f36984m.f36967d[i10] = iVarA;
        return iVarA;
    }

    public c v() {
        return this.f36984m;
    }

    public int x(Object obj) {
        i iVarF = ((V1.d) obj).f();
        if (iVarF != null) {
            return (int) (iVarF.f37007f + 0.5f);
        }
        return 0;
    }

    public void z() throws Exception {
        if (!this.f36978g && !this.f36979h) {
            A(this.f36974c);
            return;
        }
        for (int i10 = 0; i10 < this.f36982k; i10++) {
            if (!this.f36977f[i10].f36963f) {
                A(this.f36974c);
                return;
            }
        }
        n();
    }

    public d() {
        this.f36977f = null;
        this.f36977f = new U1.b[32];
        C();
        c cVar = new c();
        this.f36984m = cVar;
        this.f36974c = new h(cVar);
        if (f36969r) {
            this.f36987p = new b(cVar);
        } else {
            this.f36987p = new U1.b(cVar);
        }
    }

    public static U1.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    void A(a aVar) throws Exception {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        U1.b bVarR = r();
        i iVarT = t();
        iVarT.f37006e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        U1.b bVarR = r();
        i iVarT = t();
        iVarT.f37006e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f36962e.i(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        U1.b bVarR = r();
        i iVarT = t();
        iVarT.f37006e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        U1.b bVarR = r();
        i iVarT = t();
        iVarT.f37006e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f36962e.i(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        U1.b bVarR = r();
        bVarR.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            bVarR.d(this, i10);
        }
        d(bVarR);
    }
}
