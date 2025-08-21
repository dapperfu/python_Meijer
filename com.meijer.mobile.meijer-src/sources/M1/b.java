package M1;

import M1.d;
import M1.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: e, reason: collision with root package name */
    public a f19559e;

    /* renamed from: a, reason: collision with root package name */
    i f19555a = null;

    /* renamed from: b, reason: collision with root package name */
    float f19556b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f19557c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<i> f19558d = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    boolean f19560f = false;

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
        this.f19556b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f19559e.j(iVar, 1.0f);
            this.f19559e.j(iVar2, -1.0f);
            this.f19559e.j(iVar4, 1.0f);
            this.f19559e.j(iVar3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f19559e.j(iVar, 1.0f);
            this.f19559e.j(iVar2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f19559e.j(iVar3, 1.0f);
            this.f19559e.j(iVar4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f19559e.j(iVar, 1.0f);
        this.f19559e.j(iVar2, -1.0f);
        this.f19559e.j(iVar4, f13);
        this.f19559e.j(iVar3, -f13);
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f19556b = i10;
        }
        if (z10) {
            this.f19559e.j(iVar, 1.0f);
            this.f19559e.j(iVar2, -1.0f);
            return this;
        }
        this.f19559e.j(iVar, -1.0f);
        this.f19559e.j(iVar2, 1.0f);
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f19556b = i10;
        }
        if (z10) {
            this.f19559e.j(iVar, 1.0f);
            this.f19559e.j(iVar2, -1.0f);
            this.f19559e.j(iVar3, -1.0f);
            return this;
        }
        this.f19559e.j(iVar, -1.0f);
        this.f19559e.j(iVar2, 1.0f);
        this.f19559e.j(iVar3, 1.0f);
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f19556b = i10;
        }
        if (z10) {
            this.f19559e.j(iVar, 1.0f);
            this.f19559e.j(iVar2, -1.0f);
            this.f19559e.j(iVar3, 1.0f);
            return this;
        }
        this.f19559e.j(iVar, -1.0f);
        this.f19559e.j(iVar2, 1.0f);
        this.f19559e.j(iVar3, -1.0f);
        return this;
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    public void y() {
        this.f19555a = null;
        this.f19559e.clear();
        this.f19556b = 0.0f;
        this.f19560f = false;
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f19616m <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int iC = this.f19559e.c();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iC; i10++) {
            float fD = this.f19559e.d(i10);
            if (fD < 0.0f) {
                i iVarA = this.f19559e.a(i10);
                if ((zArr == null || !zArr[iVarA.f19606c]) && iVarA != iVar && (((aVar = iVarA.f19613j) == i.a.SLACK || aVar == i.a.ERROR) && fD < f10)) {
                    f10 = fD;
                    iVar2 = iVarA;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f19610g) {
            return;
        }
        this.f19556b += iVar.f19609f * this.f19559e.f(iVar);
        this.f19559e.g(iVar, z10);
        if (z10) {
            iVar.l(this);
        }
        if (d.f19567t && this.f19559e.c() == 0) {
            this.f19560f = true;
            dVar.f19573a = true;
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        this.f19556b += bVar.f19556b * this.f19559e.k(bVar, z10);
        if (z10) {
            bVar.f19555a.l(this);
        }
        if (d.f19567t && this.f19555a != null && this.f19559e.c() == 0) {
            this.f19560f = true;
            dVar.f19573a = true;
        }
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f19617n) {
            return;
        }
        float f10 = this.f19559e.f(iVar);
        this.f19556b += iVar.f19619p * f10;
        this.f19559e.g(iVar, z10);
        if (z10) {
            iVar.l(this);
        }
        this.f19559e.h(dVar.f19586n.f19564d[iVar.f19618o], f10, z10);
        if (d.f19567t && this.f19559e.c() == 0) {
            this.f19560f = true;
            dVar.f19573a = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f19579g.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iC = this.f19559e.c();
            for (int i10 = 0; i10 < iC; i10++) {
                i iVarA = this.f19559e.a(i10);
                if (iVarA.f19607d != -1 || iVarA.f19610g || iVarA.f19617n) {
                    this.f19558d.add(iVarA);
                }
            }
            int size = this.f19558d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = this.f19558d.get(i11);
                    if (iVar.f19610g) {
                        A(dVar, iVar, true);
                    } else if (iVar.f19617n) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f19579g[iVar.f19607d], true);
                    }
                }
                this.f19558d.clear();
            } else {
                z10 = true;
            }
        }
        if (d.f19567t && this.f19555a != null && this.f19559e.c() == 0) {
            this.f19560f = true;
            dVar.f19573a = true;
        }
    }

    @Override // M1.d.a
    public void a(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f19555a = null;
            this.f19559e.clear();
            for (int i10 = 0; i10 < bVar.f19559e.c(); i10++) {
                this.f19559e.h(bVar.f19559e.a(i10), bVar.f19559e.d(i10), true);
            }
        }
    }

    @Override // M1.d.a
    public void c(i iVar) {
        int i10 = iVar.f19608e;
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
        this.f19559e.j(iVar, f10);
    }

    @Override // M1.d.a
    public void clear() {
        this.f19559e.clear();
        this.f19555a = null;
        this.f19556b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f19559e.j(dVar.o(i10, "ep"), 1.0f);
        this.f19559e.j(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i10) {
        this.f19559e.j(iVar, i10);
        return this;
    }

    i g(d dVar) {
        int iC = this.f19559e.c();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < iC; i10++) {
            float fD = this.f19559e.d(i10);
            i iVarA = this.f19559e.a(i10);
            if (iVarA.f19613j == i.a.UNRESTRICTED) {
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
        return this.f19555a;
    }

    b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f19559e.j(iVar, 1.0f);
            this.f19559e.j(iVar4, 1.0f);
            this.f19559e.j(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f19559e.j(iVar, 1.0f);
            this.f19559e.j(iVar2, -1.0f);
            this.f19559e.j(iVar3, -1.0f);
            this.f19559e.j(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f19556b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.f19559e.j(iVar, -1.0f);
                this.f19559e.j(iVar2, 1.0f);
                this.f19556b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f19559e.j(iVar4, -1.0f);
                this.f19559e.j(iVar3, 1.0f);
                this.f19556b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f19559e.j(iVar, f11 * 1.0f);
            this.f19559e.j(iVar2, f11 * (-1.0f));
            this.f19559e.j(iVar3, (-1.0f) * f10);
            this.f19559e.j(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f19556b = ((-i10) * f11) + (i11 * f10);
                return this;
            }
        }
        return this;
    }

    b i(i iVar, int i10) {
        this.f19555a = iVar;
        float f10 = i10;
        iVar.f19609f = f10;
        this.f19556b = f10;
        this.f19560f = true;
        return this;
    }

    @Override // M1.d.a
    public boolean isEmpty() {
        return this.f19555a == null && this.f19556b == 0.0f && this.f19559e.c() == 0;
    }

    b j(i iVar, i iVar2, float f10) {
        this.f19559e.j(iVar, -1.0f);
        this.f19559e.j(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f19559e.j(iVar, -1.0f);
        this.f19559e.j(iVar2, 1.0f);
        this.f19559e.j(iVar3, f10);
        this.f19559e.j(iVar4, -f10);
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f19556b = i10 * (-1);
            this.f19559e.j(iVar, 1.0f);
            return this;
        }
        this.f19556b = i10;
        this.f19559e.j(iVar, -1.0f);
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f19559e.j(iVar3, 0.5f);
        this.f19559e.j(iVar4, 0.5f);
        this.f19559e.j(iVar, -0.5f);
        this.f19559e.j(iVar2, -0.5f);
        this.f19556b = -f10;
        return this;
    }

    void r() {
        float f10 = this.f19556b;
        if (f10 < 0.0f) {
            this.f19556b = f10 * (-1.0f);
            this.f19559e.b();
        }
    }

    boolean s() {
        i iVar = this.f19555a;
        if (iVar != null) {
            return iVar.f19613j == i.a.UNRESTRICTED || this.f19556b >= 0.0f;
        }
        return false;
    }

    boolean t(i iVar) {
        return this.f19559e.i(iVar);
    }

    void x(i iVar) {
        i iVar2 = this.f19555a;
        if (iVar2 != null) {
            this.f19559e.j(iVar2, -1.0f);
            this.f19555a.f19607d = -1;
            this.f19555a = null;
        }
        float fG = this.f19559e.g(iVar, true) * (-1.0f);
        this.f19555a = iVar;
        if (fG == 1.0f) {
            return;
        }
        this.f19556b /= fG;
        this.f19559e.e(fG);
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
        if (this.f19559e.c() == 0) {
            this.f19560f = true;
        }
        return z10;
    }

    public String toString() {
        return z();
    }

    public b(c cVar) {
        this.f19559e = new M1.a(this, cVar);
    }
}
