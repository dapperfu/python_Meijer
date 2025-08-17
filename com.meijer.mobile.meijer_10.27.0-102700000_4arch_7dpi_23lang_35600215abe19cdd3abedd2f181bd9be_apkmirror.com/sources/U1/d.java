package U1;

import U1.i;
import V1.d;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: q, reason: collision with root package name */
    private static int f35632q = 1000;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f35633r = true;

    /* renamed from: s, reason: collision with root package name */
    public static long f35634s;

    /* renamed from: t, reason: collision with root package name */
    public static long f35635t;

    /* renamed from: c, reason: collision with root package name */
    private a f35638c;

    /* renamed from: f, reason: collision with root package name */
    U1.b[] f35641f;

    /* renamed from: m, reason: collision with root package name */
    final c f35648m;

    /* renamed from: p, reason: collision with root package name */
    private a f35651p;

    /* renamed from: a, reason: collision with root package name */
    int f35636a = 0;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, i> f35637b = null;

    /* renamed from: d, reason: collision with root package name */
    private int f35639d = 32;

    /* renamed from: e, reason: collision with root package name */
    private int f35640e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f35642g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f35643h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean[] f35644i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    int f35645j = 1;

    /* renamed from: k, reason: collision with root package name */
    int f35646k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f35647l = 32;

    /* renamed from: n, reason: collision with root package name */
    private i[] f35649n = new i[f35632q];

    /* renamed from: o, reason: collision with root package name */
    private int f35650o = 0;

    interface a {
        i a(d dVar, boolean[] zArr);

        void b(a aVar);

        void c(i iVar);

        void clear();

        i getKey();
    }

    class b extends U1.b {
        public b(c cVar) {
            this.f35626e = new j(this, cVar);
        }
    }

    private final int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f35645j; i10++) {
            this.f35644i[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 < this.f35645j * 2) {
                if (aVar.getKey() != null) {
                    this.f35644i[aVar.getKey().f35668c] = true;
                }
                i iVarA = aVar.a(this, this.f35644i);
                if (iVarA != null) {
                    boolean[] zArr = this.f35644i;
                    int i12 = iVarA.f35668c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (iVarA != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f35646k; i14++) {
                        U1.b bVar = this.f35641f[i14];
                        if (bVar.f35622a.f35675j != i.a.UNRESTRICTED && !bVar.f35627f && bVar.t(iVarA)) {
                            float fI = bVar.f35626e.i(iVarA);
                            if (fI < 0.0f) {
                                float f11 = (-bVar.f35623b) / fI;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        U1.b bVar2 = this.f35641f[i13];
                        bVar2.f35622a.f35669d = -1;
                        bVar2.y(iVarA);
                        i iVar = bVar2.f35622a;
                        iVar.f35669d = i13;
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
        for (int i10 = 0; i10 < this.f35646k; i10++) {
            U1.b bVar = this.f35641f[i10];
            bVar.f35622a.f35671f = bVar.f35623b;
        }
    }

    public static e w() {
        return null;
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f35648m;
            i[] iVarArr = cVar.f35631d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.d();
            }
            i10++;
        }
        cVar.f35630c.c(this.f35649n, this.f35650o);
        this.f35650o = 0;
        Arrays.fill(this.f35648m.f35631d, (Object) null);
        HashMap<String, i> map = this.f35637b;
        if (map != null) {
            map.clear();
        }
        this.f35636a = 0;
        this.f35638c.clear();
        this.f35645j = 1;
        for (int i11 = 0; i11 < this.f35646k; i11++) {
            this.f35641f[i11].f35624c = false;
        }
        C();
        this.f35646k = 0;
        if (f35633r) {
            this.f35651p = new b(this.f35648m);
        } else {
            this.f35651p = new U1.b(this.f35648m);
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
        if (this.f35645j + 1 >= this.f35640e) {
            y();
        }
        if (obj instanceof V1.d) {
            V1.d dVar = (V1.d) obj;
            iVarF = dVar.f();
            if (iVarF == null) {
                dVar.m(this.f35648m);
                iVarF = dVar.f();
            }
            int i10 = iVarF.f35668c;
            if (i10 != -1 && i10 <= this.f35636a && this.f35648m.f35631d[i10] != null) {
                return iVarF;
            }
            if (i10 != -1) {
                iVarF.d();
            }
            int i11 = this.f35636a + 1;
            this.f35636a = i11;
            this.f35645j++;
            iVarF.f35668c = i11;
            iVarF.f35675j = i.a.UNRESTRICTED;
            this.f35648m.f35631d[i11] = iVarF;
        }
        return iVarF;
    }

    private void C() {
        int i10 = 0;
        if (f35633r) {
            while (true) {
                U1.b[] bVarArr = this.f35641f;
                if (i10 >= bVarArr.length) {
                    return;
                }
                U1.b bVar = bVarArr[i10];
                if (bVar != null) {
                    this.f35648m.f35628a.a(bVar);
                }
                this.f35641f[i10] = null;
                i10++;
            }
        } else {
            while (true) {
                U1.b[] bVarArr2 = this.f35641f;
                if (i10 >= bVarArr2.length) {
                    return;
                }
                U1.b bVar2 = bVarArr2[i10];
                if (bVar2 != null) {
                    this.f35648m.f35629b.a(bVar2);
                }
                this.f35641f[i10] = null;
                i10++;
            }
        }
    }

    private i a(i.a aVar, String str) {
        i iVarB = this.f35648m.f35630c.b();
        if (iVarB == null) {
            iVarB = new i(aVar, str);
            iVarB.f(aVar, str);
        } else {
            iVarB.d();
            iVarB.f(aVar, str);
        }
        int i10 = this.f35650o;
        int i11 = f35632q;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f35632q = i12;
            this.f35649n = (i[]) Arrays.copyOf(this.f35649n, i12);
        }
        i[] iVarArr = this.f35649n;
        int i13 = this.f35650o;
        this.f35650o = i13 + 1;
        iVarArr[i13] = iVarB;
        return iVarB;
    }

    private final void l(U1.b bVar) {
        if (f35633r) {
            U1.b bVar2 = this.f35641f[this.f35646k];
            if (bVar2 != null) {
                this.f35648m.f35628a.a(bVar2);
            }
        } else {
            U1.b bVar3 = this.f35641f[this.f35646k];
            if (bVar3 != null) {
                this.f35648m.f35629b.a(bVar3);
            }
        }
        U1.b[] bVarArr = this.f35641f;
        int i10 = this.f35646k;
        bVarArr[i10] = bVar;
        i iVar = bVar.f35622a;
        iVar.f35669d = i10;
        this.f35646k = i10 + 1;
        iVar.g(bVar);
    }

    private int u(a aVar) throws Exception {
        for (int i10 = 0; i10 < this.f35646k; i10++) {
            U1.b bVar = this.f35641f[i10];
            if (bVar.f35622a.f35675j != i.a.UNRESTRICTED && bVar.f35623b < 0.0f) {
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
                        if (i14 >= this.f35646k) {
                            break;
                        }
                        U1.b bVar2 = this.f35641f[i14];
                        if (bVar2.f35622a.f35675j != i.a.UNRESTRICTED && !bVar2.f35627f && bVar2.f35623b < 0.0f) {
                            for (int i16 = 1; i16 < this.f35645j; i16++) {
                                i iVar = this.f35648m.f35631d[i16];
                                float fI = bVar2.f35626e.i(iVar);
                                if (fI > 0.0f) {
                                    for (int i17 = 0; i17 < 9; i17++) {
                                        float f11 = iVar.f35673h[i17] / fI;
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
                        U1.b bVar3 = this.f35641f[i12];
                        bVar3.f35622a.f35669d = -1;
                        bVar3.y(this.f35648m.f35631d[i13]);
                        i iVar2 = bVar3.f35622a;
                        iVar2.f35669d = i12;
                        iVar2.g(bVar3);
                    } else {
                        z10 = true;
                    }
                    if (i11 > this.f35645j / 2) {
                        z10 = true;
                    }
                }
                return i11;
            }
        }
        return 0;
    }

    private void y() {
        int i10 = this.f35639d * 2;
        this.f35639d = i10;
        this.f35641f = (U1.b[]) Arrays.copyOf(this.f35641f, i10);
        c cVar = this.f35648m;
        cVar.f35631d = (i[]) Arrays.copyOf(cVar.f35631d, this.f35639d);
        int i11 = this.f35639d;
        this.f35644i = new boolean[i11];
        this.f35640e = i11;
        this.f35647l = i11;
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
        if (this.f35646k + 1 >= this.f35647l || this.f35645j + 1 >= this.f35640e) {
            y();
        }
        boolean z11 = false;
        if (!bVar.f35627f) {
            bVar.D(this);
            if (bVar.u()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i iVarP = p();
                bVar.f35622a = iVarP;
                l(bVar);
                this.f35651p.b(bVar);
                B(this.f35651p, true);
                if (iVarP.f35669d == -1) {
                    if (bVar.f35622a == iVarP && (iVarW = bVar.w(iVarP)) != null) {
                        bVar.y(iVarW);
                    }
                    if (!bVar.f35627f) {
                        bVar.f35622a.g(bVar);
                    }
                    this.f35646k--;
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
        if (i11 == 8 && iVar2.f35672g && iVar.f35669d == -1) {
            iVar.e(this, iVar2.f35671f + i10);
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
        int i11 = iVar.f35669d;
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
        U1.b bVar = this.f35641f[i11];
        if (bVar.f35627f) {
            bVar.f35623b = i10;
            return;
        }
        if (bVar.f35626e.c() == 0) {
            bVar.f35627f = true;
            bVar.f35623b = i10;
        } else {
            U1.b bVarR2 = r();
            bVarR2.m(iVar, i10);
            d(bVarR2);
        }
    }

    public i o(int i10, String str) {
        if (this.f35645j + 1 >= this.f35640e) {
            y();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f35636a + 1;
        this.f35636a = i11;
        this.f35645j++;
        iVarA.f35668c = i11;
        iVarA.f35670e = i10;
        this.f35648m.f35631d[i11] = iVarA;
        this.f35638c.c(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f35645j + 1 >= this.f35640e) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f35636a + 1;
        this.f35636a = i10;
        this.f35645j++;
        iVarA.f35668c = i10;
        this.f35648m.f35631d[i10] = iVarA;
        return iVarA;
    }

    public U1.b r() {
        U1.b bVarB;
        if (f35633r) {
            bVarB = this.f35648m.f35628a.b();
            if (bVarB == null) {
                bVarB = new b(this.f35648m);
                f35635t++;
            } else {
                bVarB.z();
            }
        } else {
            bVarB = this.f35648m.f35629b.b();
            if (bVarB == null) {
                bVarB = new U1.b(this.f35648m);
                f35634s++;
            } else {
                bVarB.z();
            }
        }
        i.b();
        return bVarB;
    }

    public i t() {
        if (this.f35645j + 1 >= this.f35640e) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f35636a + 1;
        this.f35636a = i10;
        this.f35645j++;
        iVarA.f35668c = i10;
        this.f35648m.f35631d[i10] = iVarA;
        return iVarA;
    }

    public c v() {
        return this.f35648m;
    }

    public int x(Object obj) {
        i iVarF = ((V1.d) obj).f();
        if (iVarF != null) {
            return (int) (iVarF.f35671f + 0.5f);
        }
        return 0;
    }

    public void z() throws Exception {
        if (!this.f35642g && !this.f35643h) {
            A(this.f35638c);
            return;
        }
        for (int i10 = 0; i10 < this.f35646k; i10++) {
            if (!this.f35641f[i10].f35627f) {
                A(this.f35638c);
                return;
            }
        }
        n();
    }

    public d() {
        this.f35641f = null;
        this.f35641f = new U1.b[32];
        C();
        c cVar = new c();
        this.f35648m = cVar;
        this.f35638c = new h(cVar);
        if (f35633r) {
            this.f35651p = new b(cVar);
        } else {
            this.f35651p = new U1.b(cVar);
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
        iVarT.f35670e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        U1.b bVarR = r();
        i iVarT = t();
        iVarT.f35670e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f35626e.i(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        U1.b bVarR = r();
        i iVarT = t();
        iVarT.f35670e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        U1.b bVarR = r();
        i iVarT = t();
        iVarT.f35670e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f35626e.i(iVarT) * (-1.0f)), i11);
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
