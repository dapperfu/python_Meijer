package U1;

import U1.d;
import U1.i;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: e, reason: collision with root package name */
    public a f36962e;

    /* renamed from: a, reason: collision with root package name */
    i f36958a = null;

    /* renamed from: b, reason: collision with root package name */
    float f36959b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f36960c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<i> f36961d = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    boolean f36963f = false;

    public interface a {
        i a(int i10);

        void b();

        int c();

        void clear();

        float d(int i10);

        void e(float f10);

        boolean f(i iVar);

        void g(i iVar, float f10, boolean z10);

        float h(b bVar, boolean z10);

        float i(i iVar);

        void j(i iVar, float f10);

        float k(i iVar, boolean z10);
    }

    public b() {
    }

    @Override // U1.d.a
    public i a(d dVar, boolean[] zArr) {
        return x(zArr, null);
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f36959b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f36962e.j(iVar, 1.0f);
            this.f36962e.j(iVar2, -1.0f);
            this.f36962e.j(iVar4, 1.0f);
            this.f36962e.j(iVar3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f36962e.j(iVar, 1.0f);
            this.f36962e.j(iVar2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f36962e.j(iVar3, 1.0f);
            this.f36962e.j(iVar4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f36962e.j(iVar, 1.0f);
        this.f36962e.j(iVar2, -1.0f);
        this.f36962e.j(iVar4, f13);
        this.f36962e.j(iVar3, -f13);
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f36959b = i10;
        }
        if (z10) {
            this.f36962e.j(iVar, 1.0f);
            this.f36962e.j(iVar2, -1.0f);
            return this;
        }
        this.f36962e.j(iVar, -1.0f);
        this.f36962e.j(iVar2, 1.0f);
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f36959b = i10;
        }
        if (z10) {
            this.f36962e.j(iVar, 1.0f);
            this.f36962e.j(iVar2, -1.0f);
            this.f36962e.j(iVar3, -1.0f);
            return this;
        }
        this.f36962e.j(iVar, -1.0f);
        this.f36962e.j(iVar2, 1.0f);
        this.f36962e.j(iVar3, 1.0f);
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f36959b = i10;
        }
        if (z10) {
            this.f36962e.j(iVar, 1.0f);
            this.f36962e.j(iVar2, -1.0f);
            this.f36962e.j(iVar3, 1.0f);
            return this;
        }
        this.f36962e.j(iVar, -1.0f);
        this.f36962e.j(iVar2, 1.0f);
        this.f36962e.j(iVar3, -1.0f);
        return this;
    }

    public i w(i iVar) {
        return x(null, iVar);
    }

    public void z() {
        this.f36958a = null;
        this.f36962e.clear();
        this.f36959b = 0.0f;
        this.f36963f = false;
    }

    private boolean v(i iVar, d dVar) {
        return iVar.f37014m <= 1;
    }

    private i x(boolean[] zArr, i iVar) {
        i.a aVar;
        int iC = this.f36962e.c();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iC; i10++) {
            float fD = this.f36962e.d(i10);
            if (fD < 0.0f) {
                i iVarA = this.f36962e.a(i10);
                if ((zArr == null || !zArr[iVarA.f37004c]) && iVarA != iVar && (((aVar = iVarA.f37011j) == i.a.SLACK || aVar == i.a.ERROR) && fD < f10)) {
                    f10 = fD;
                    iVar2 = iVarA;
                }
            }
        }
        return iVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String A() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.b.A():java.lang.String");
    }

    public void B(d dVar, i iVar, boolean z10) {
        if (iVar.f37008g) {
            this.f36959b += iVar.f37007f * this.f36962e.i(iVar);
            this.f36962e.k(iVar, z10);
            if (z10) {
                iVar.c(this);
            }
        }
    }

    public void C(b bVar, boolean z10) {
        this.f36959b += bVar.f36959b * this.f36962e.h(bVar, z10);
        if (z10) {
            bVar.f36958a.c(this);
        }
    }

    public void D(d dVar) {
        if (dVar.f36977f.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iC = this.f36962e.c();
            for (int i10 = 0; i10 < iC; i10++) {
                i iVarA = this.f36962e.a(i10);
                if (iVarA.f37005d != -1 || iVarA.f37008g) {
                    this.f36961d.add(iVarA);
                }
            }
            if (this.f36961d.size() > 0) {
                Iterator<i> it = this.f36961d.iterator();
                while (it.hasNext()) {
                    i next = it.next();
                    if (next.f37008g) {
                        B(dVar, next, true);
                    } else {
                        C(dVar.f36977f[next.f37005d], true);
                    }
                }
                this.f36961d.clear();
            } else {
                z10 = true;
            }
        }
    }

    @Override // U1.d.a
    public void b(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f36958a = null;
            this.f36962e.clear();
            for (int i10 = 0; i10 < bVar.f36962e.c(); i10++) {
                this.f36962e.g(bVar.f36962e.a(i10), bVar.f36962e.d(i10), true);
            }
        }
    }

    @Override // U1.d.a
    public void c(i iVar) {
        int i10 = iVar.f37006e;
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
        this.f36962e.j(iVar, f10);
    }

    @Override // U1.d.a
    public void clear() {
        this.f36962e.clear();
        this.f36958a = null;
        this.f36959b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f36962e.j(dVar.o(i10, "ep"), 1.0f);
        this.f36962e.j(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i10) {
        this.f36962e.j(iVar, i10);
        return this;
    }

    i g(d dVar) {
        int iC = this.f36962e.c();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < iC; i10++) {
            float fD = this.f36962e.d(i10);
            i iVarA = this.f36962e.a(i10);
            if (iVarA.f37011j == i.a.UNRESTRICTED) {
                if (iVar == null || f10 > fD) {
                    boolean zV = v(iVarA, dVar);
                    z10 = zV;
                    f10 = fD;
                    iVar = iVarA;
                } else if (!z10 && v(iVarA, dVar)) {
                    f10 = fD;
                    iVar = iVarA;
                    z10 = true;
                }
            } else if (iVar == null && fD < 0.0f) {
                if (iVar2 == null || f11 > fD) {
                    boolean zV2 = v(iVarA, dVar);
                    z11 = zV2;
                    f11 = fD;
                    iVar2 = iVarA;
                } else if (!z11 && v(iVarA, dVar)) {
                    f11 = fD;
                    iVar2 = iVarA;
                    z11 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // U1.d.a
    public i getKey() {
        return this.f36958a;
    }

    b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f36962e.j(iVar, 1.0f);
            this.f36962e.j(iVar4, 1.0f);
            this.f36962e.j(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f36962e.j(iVar, 1.0f);
            this.f36962e.j(iVar2, -1.0f);
            this.f36962e.j(iVar3, -1.0f);
            this.f36962e.j(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f36959b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.f36962e.j(iVar, -1.0f);
                this.f36962e.j(iVar2, 1.0f);
                this.f36959b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f36962e.j(iVar4, -1.0f);
                this.f36962e.j(iVar3, 1.0f);
                this.f36959b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f36962e.j(iVar, f11 * 1.0f);
            this.f36962e.j(iVar2, f11 * (-1.0f));
            this.f36962e.j(iVar3, (-1.0f) * f10);
            this.f36962e.j(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f36959b = ((-i10) * f11) + (i11 * f10);
                return this;
            }
        }
        return this;
    }

    b i(i iVar, int i10) {
        this.f36958a = iVar;
        float f10 = i10;
        iVar.f37007f = f10;
        this.f36959b = f10;
        this.f36963f = true;
        return this;
    }

    b j(i iVar, i iVar2, float f10) {
        this.f36962e.j(iVar, -1.0f);
        this.f36962e.j(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f36962e.j(iVar, -1.0f);
        this.f36962e.j(iVar2, 1.0f);
        this.f36962e.j(iVar3, f10);
        this.f36962e.j(iVar4, -f10);
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f36959b = i10 * (-1);
            this.f36962e.j(iVar, 1.0f);
            return this;
        }
        this.f36959b = i10;
        this.f36962e.j(iVar, -1.0f);
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f36962e.j(iVar3, 0.5f);
        this.f36962e.j(iVar4, 0.5f);
        this.f36962e.j(iVar, -0.5f);
        this.f36962e.j(iVar2, -0.5f);
        this.f36959b = -f10;
        return this;
    }

    void r() {
        float f10 = this.f36959b;
        if (f10 < 0.0f) {
            this.f36959b = f10 * (-1.0f);
            this.f36962e.b();
        }
    }

    boolean s() {
        i iVar = this.f36958a;
        if (iVar != null) {
            return iVar.f37011j == i.a.UNRESTRICTED || this.f36959b >= 0.0f;
        }
        return false;
    }

    boolean t(i iVar) {
        return this.f36962e.f(iVar);
    }

    public boolean u() {
        return this.f36958a == null && this.f36959b == 0.0f && this.f36962e.c() == 0;
    }

    void y(i iVar) {
        i iVar2 = this.f36958a;
        if (iVar2 != null) {
            this.f36962e.j(iVar2, -1.0f);
            this.f36958a = null;
        }
        float fK = this.f36962e.k(iVar, true) * (-1.0f);
        this.f36958a = iVar;
        if (fK == 1.0f) {
            return;
        }
        this.f36959b /= fK;
        this.f36962e.e(fK);
    }

    boolean f(d dVar) {
        boolean z10;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z10 = true;
        } else {
            y(iVarG);
            z10 = false;
        }
        if (this.f36962e.c() == 0) {
            this.f36963f = true;
        }
        return z10;
    }

    public String toString() {
        return A();
    }

    public b(c cVar) {
        this.f36962e = new U1.a(this, cVar);
    }
}
