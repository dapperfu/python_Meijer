package M1;

import M1.d;
import M1.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: e, reason: collision with root package name */
    public a f18818e;

    /* renamed from: a, reason: collision with root package name */
    i f18814a = null;

    /* renamed from: b, reason: collision with root package name */
    float f18815b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f18816c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<i> f18817d = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    boolean f18819f = false;

    public interface a {
        i a(int i10);

        void b();

        int c();

        void clear();

        float d(int i10);

        void e(float f10);

        float f(i iVar);

        float g(i iVar, boolean z10);

        void h(i iVar, float f10, boolean z10);

        boolean i(i iVar);

        void j(i iVar, float f10);

        float k(b bVar, boolean z10);
    }

    public b() {
    }

    @Override // M1.d.a
    public i b(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f18815b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f18818e.j(iVar, 1.0f);
            this.f18818e.j(iVar2, -1.0f);
            this.f18818e.j(iVar4, 1.0f);
            this.f18818e.j(iVar3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f18818e.j(iVar, 1.0f);
            this.f18818e.j(iVar2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f18818e.j(iVar3, 1.0f);
            this.f18818e.j(iVar4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f18818e.j(iVar, 1.0f);
        this.f18818e.j(iVar2, -1.0f);
        this.f18818e.j(iVar4, f13);
        this.f18818e.j(iVar3, -f13);
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f18815b = i10;
        }
        if (z10) {
            this.f18818e.j(iVar, 1.0f);
            this.f18818e.j(iVar2, -1.0f);
            return this;
        }
        this.f18818e.j(iVar, -1.0f);
        this.f18818e.j(iVar2, 1.0f);
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f18815b = i10;
        }
        if (z10) {
            this.f18818e.j(iVar, 1.0f);
            this.f18818e.j(iVar2, -1.0f);
            this.f18818e.j(iVar3, -1.0f);
            return this;
        }
        this.f18818e.j(iVar, -1.0f);
        this.f18818e.j(iVar2, 1.0f);
        this.f18818e.j(iVar3, 1.0f);
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f18815b = i10;
        }
        if (z10) {
            this.f18818e.j(iVar, 1.0f);
            this.f18818e.j(iVar2, -1.0f);
            this.f18818e.j(iVar3, 1.0f);
            return this;
        }
        this.f18818e.j(iVar, -1.0f);
        this.f18818e.j(iVar2, 1.0f);
        this.f18818e.j(iVar3, -1.0f);
        return this;
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    public void y() {
        this.f18814a = null;
        this.f18818e.clear();
        this.f18815b = 0.0f;
        this.f18819f = false;
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f18875m <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int iC = this.f18818e.c();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iC; i10++) {
            float fD = this.f18818e.d(i10);
            if (fD < 0.0f) {
                i iVarA = this.f18818e.a(i10);
                if ((zArr == null || !zArr[iVarA.f18865c]) && iVarA != iVar && (((aVar = iVarA.f18872j) == i.a.SLACK || aVar == i.a.ERROR) && fD < f10)) {
                    f10 = fD;
                    iVar2 = iVarA;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f18869g) {
            return;
        }
        this.f18815b += iVar.f18868f * this.f18818e.f(iVar);
        this.f18818e.g(iVar, z10);
        if (z10) {
            iVar.l(this);
        }
        if (d.f18826t && this.f18818e.c() == 0) {
            this.f18819f = true;
            dVar.f18832a = true;
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        this.f18815b += bVar.f18815b * this.f18818e.k(bVar, z10);
        if (z10) {
            bVar.f18814a.l(this);
        }
        if (d.f18826t && this.f18814a != null && this.f18818e.c() == 0) {
            this.f18819f = true;
            dVar.f18832a = true;
        }
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f18876n) {
            return;
        }
        float f10 = this.f18818e.f(iVar);
        this.f18815b += iVar.f18878p * f10;
        this.f18818e.g(iVar, z10);
        if (z10) {
            iVar.l(this);
        }
        this.f18818e.h(dVar.f18845n.f18823d[iVar.f18877o], f10, z10);
        if (d.f18826t && this.f18818e.c() == 0) {
            this.f18819f = true;
            dVar.f18832a = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f18838g.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iC = this.f18818e.c();
            for (int i10 = 0; i10 < iC; i10++) {
                i iVarA = this.f18818e.a(i10);
                if (iVarA.f18866d != -1 || iVarA.f18869g || iVarA.f18876n) {
                    this.f18817d.add(iVarA);
                }
            }
            int size = this.f18817d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = this.f18817d.get(i11);
                    if (iVar.f18869g) {
                        A(dVar, iVar, true);
                    } else if (iVar.f18876n) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f18838g[iVar.f18866d], true);
                    }
                }
                this.f18817d.clear();
            } else {
                z10 = true;
            }
        }
        if (d.f18826t && this.f18814a != null && this.f18818e.c() == 0) {
            this.f18819f = true;
            dVar.f18832a = true;
        }
    }

    @Override // M1.d.a
    public void a(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f18814a = null;
            this.f18818e.clear();
            for (int i10 = 0; i10 < bVar.f18818e.c(); i10++) {
                this.f18818e.h(bVar.f18818e.a(i10), bVar.f18818e.d(i10), true);
            }
        }
    }

    @Override // M1.d.a
    public void c(i iVar) {
        int i10 = iVar.f18867e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f18818e.j(iVar, f10);
    }

    @Override // M1.d.a
    public void clear() {
        this.f18818e.clear();
        this.f18814a = null;
        this.f18815b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f18818e.j(dVar.o(i10, "ep"), 1.0f);
        this.f18818e.j(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i10) {
        this.f18818e.j(iVar, i10);
        return this;
    }

    i g(d dVar) {
        int iC = this.f18818e.c();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < iC; i10++) {
            float fD = this.f18818e.d(i10);
            i iVarA = this.f18818e.a(i10);
            if (iVarA.f18872j == i.a.UNRESTRICTED) {
                if (iVar == null || f10 > fD) {
                    boolean zU = u(iVarA, dVar);
                    z10 = zU;
                    f10 = fD;
                    iVar = iVarA;
                } else if (!z10 && u(iVarA, dVar)) {
                    f10 = fD;
                    iVar = iVarA;
                    z10 = true;
                }
            } else if (iVar == null && fD < 0.0f) {
                if (iVar2 == null || f11 > fD) {
                    boolean zU2 = u(iVarA, dVar);
                    z11 = zU2;
                    f11 = fD;
                    iVar2 = iVarA;
                } else if (!z11 && u(iVarA, dVar)) {
                    f11 = fD;
                    iVar2 = iVarA;
                    z11 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // M1.d.a
    public i getKey() {
        return this.f18814a;
    }

    b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f18818e.j(iVar, 1.0f);
            this.f18818e.j(iVar4, 1.0f);
            this.f18818e.j(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f18818e.j(iVar, 1.0f);
            this.f18818e.j(iVar2, -1.0f);
            this.f18818e.j(iVar3, -1.0f);
            this.f18818e.j(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f18815b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.f18818e.j(iVar, -1.0f);
                this.f18818e.j(iVar2, 1.0f);
                this.f18815b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f18818e.j(iVar4, -1.0f);
                this.f18818e.j(iVar3, 1.0f);
                this.f18815b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f18818e.j(iVar, f11 * 1.0f);
            this.f18818e.j(iVar2, f11 * (-1.0f));
            this.f18818e.j(iVar3, (-1.0f) * f10);
            this.f18818e.j(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f18815b = ((-i10) * f11) + (i11 * f10);
                return this;
            }
        }
        return this;
    }

    b i(i iVar, int i10) {
        this.f18814a = iVar;
        float f10 = i10;
        iVar.f18868f = f10;
        this.f18815b = f10;
        this.f18819f = true;
        return this;
    }

    @Override // M1.d.a
    public boolean isEmpty() {
        return this.f18814a == null && this.f18815b == 0.0f && this.f18818e.c() == 0;
    }

    b j(i iVar, i iVar2, float f10) {
        this.f18818e.j(iVar, -1.0f);
        this.f18818e.j(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f18818e.j(iVar, -1.0f);
        this.f18818e.j(iVar2, 1.0f);
        this.f18818e.j(iVar3, f10);
        this.f18818e.j(iVar4, -f10);
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f18815b = i10 * (-1);
            this.f18818e.j(iVar, 1.0f);
            return this;
        }
        this.f18815b = i10;
        this.f18818e.j(iVar, -1.0f);
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f18818e.j(iVar3, 0.5f);
        this.f18818e.j(iVar4, 0.5f);
        this.f18818e.j(iVar, -0.5f);
        this.f18818e.j(iVar2, -0.5f);
        this.f18815b = -f10;
        return this;
    }

    void r() {
        float f10 = this.f18815b;
        if (f10 < 0.0f) {
            this.f18815b = f10 * (-1.0f);
            this.f18818e.b();
        }
    }

    boolean s() {
        i iVar = this.f18814a;
        if (iVar != null) {
            return iVar.f18872j == i.a.UNRESTRICTED || this.f18815b >= 0.0f;
        }
        return false;
    }

    boolean t(i iVar) {
        return this.f18818e.i(iVar);
    }

    void x(i iVar) {
        i iVar2 = this.f18814a;
        if (iVar2 != null) {
            this.f18818e.j(iVar2, -1.0f);
            this.f18814a.f18866d = -1;
            this.f18814a = null;
        }
        float fG = this.f18818e.g(iVar, true) * (-1.0f);
        this.f18814a = iVar;
        if (fG == 1.0f) {
            return;
        }
        this.f18815b /= fG;
        this.f18818e.e(fG);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String z() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.b.z():java.lang.String");
    }

    boolean f(d dVar) {
        boolean z10;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z10 = true;
        } else {
            x(iVarG);
            z10 = false;
        }
        if (this.f18818e.c() == 0) {
            this.f18819f = true;
        }
        return z10;
    }

    public String toString() {
        return z();
    }

    public b(c cVar) {
        this.f18818e = new M1.a(this, cVar);
    }
}
