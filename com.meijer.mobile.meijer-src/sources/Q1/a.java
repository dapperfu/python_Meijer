package Q1;

import Q1.d;
import Q1.e;

/* loaded from: classes.dex */
public class a extends i {

    /* renamed from: M0, reason: collision with root package name */
    private int f27510M0 = 0;

    /* renamed from: N0, reason: collision with root package name */
    private boolean f27511N0 = true;

    /* renamed from: O0, reason: collision with root package name */
    private int f27512O0 = 0;

    /* renamed from: P0, reason: collision with root package name */
    boolean f27513P0 = false;

    public boolean a1() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f27691L0;
            if (i13 >= i10) {
                break;
            }
            e eVar = this.f27690K0[i13];
            if ((this.f27511N0 || eVar.e()) && ((((i11 = this.f27510M0) == 0 || i11 == 1) && !eVar.c0()) || (((i12 = this.f27510M0) == 2 || i12 == 3) && !eVar.d0()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.f27691L0; i14++) {
            e eVar2 = this.f27690K0[i14];
            if (this.f27511N0 || eVar2.e()) {
                if (!z11) {
                    int i15 = this.f27510M0;
                    if (i15 == 0) {
                        iMax = eVar2.j(d.b.LEFT).d();
                    } else if (i15 == 1) {
                        iMax = eVar2.j(d.b.RIGHT).d();
                    } else if (i15 == 2) {
                        iMax = eVar2.j(d.b.TOP).d();
                    } else if (i15 == 3) {
                        iMax = eVar2.j(d.b.BOTTOM).d();
                    }
                    z11 = true;
                }
                int i16 = this.f27510M0;
                if (i16 == 0) {
                    iMax = Math.min(iMax, eVar2.j(d.b.LEFT).d());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, eVar2.j(d.b.RIGHT).d());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, eVar2.j(d.b.TOP).d());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, eVar2.j(d.b.BOTTOM).d());
                }
            }
        }
        int i17 = iMax + this.f27512O0;
        int i18 = this.f27510M0;
        if (i18 == 0 || i18 == 1) {
            q0(i17, i17);
        } else {
            t0(i17, i17);
        }
        this.f27513P0 = true;
        return true;
    }

    @Override // Q1.e
    public boolean e() {
        return true;
    }

    protected void f1() {
        for (int i10 = 0; i10 < this.f27691L0; i10++) {
            e eVar = this.f27690K0[i10];
            if (this.f27511N0 || eVar.e()) {
                int i11 = this.f27510M0;
                if (i11 == 0 || i11 == 1) {
                    eVar.D0(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    eVar.D0(1, true);
                }
            }
        }
    }

    public boolean b1() {
        return this.f27511N0;
    }

    @Override // Q1.e
    public boolean c0() {
        return this.f27513P0;
    }

    public int c1() {
        return this.f27510M0;
    }

    @Override // Q1.e
    public void d(M1.d dVar, boolean z10) {
        d[] dVarArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        d[] dVarArr2 = this.f27587V;
        dVarArr2[0] = this.f27579N;
        dVarArr2[2] = this.f27580O;
        dVarArr2[1] = this.f27581P;
        dVarArr2[3] = this.f27582Q;
        int i13 = 0;
        while (true) {
            dVarArr = this.f27587V;
            if (i13 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i13];
            dVar2.f27544i = dVar.q(dVar2);
            i13++;
        }
        int i14 = this.f27510M0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i14];
        if (!this.f27513P0) {
            a1();
        }
        if (this.f27513P0) {
            this.f27513P0 = false;
            int i15 = this.f27510M0;
            if (i15 == 0 || i15 == 1) {
                dVar.f(this.f27579N.f27544i, this.f27601e0);
                dVar.f(this.f27581P.f27544i, this.f27601e0);
                return;
            } else {
                if (i15 == 2 || i15 == 3) {
                    dVar.f(this.f27580O.f27544i, this.f27603f0);
                    dVar.f(this.f27582Q.f27544i, this.f27603f0);
                    return;
                }
                return;
            }
        }
        for (int i16 = 0; i16 < this.f27691L0; i16++) {
            e eVar = this.f27690K0[i16];
            if ((this.f27511N0 || eVar.e()) && ((((i11 = this.f27510M0) == 0 || i11 == 1) && eVar.v() == e.b.MATCH_CONSTRAINT && eVar.f27579N.f27541f != null && eVar.f27581P.f27541f != null) || (((i12 = this.f27510M0) == 2 || i12 == 3) && eVar.K() == e.b.MATCH_CONSTRAINT && eVar.f27580O.f27541f != null && eVar.f27582Q.f27541f != null))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        boolean z12 = this.f27579N.k() || this.f27581P.k();
        boolean z13 = this.f27580O.k() || this.f27582Q.k();
        int i17 = !(!z11 && (((i10 = this.f27510M0) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
        for (int i18 = 0; i18 < this.f27691L0; i18++) {
            e eVar2 = this.f27690K0[i18];
            if (this.f27511N0 || eVar2.e()) {
                M1.i iVarQ = dVar.q(eVar2.f27587V[this.f27510M0]);
                d[] dVarArr3 = eVar2.f27587V;
                int i19 = this.f27510M0;
                d dVar4 = dVarArr3[i19];
                dVar4.f27544i = iVarQ;
                d dVar5 = dVar4.f27541f;
                int i20 = (dVar5 == null || dVar5.f27539d != this) ? 0 : dVar4.f27542g;
                if (i19 == 0 || i19 == 2) {
                    dVar.i(dVar3.f27544i, iVarQ, this.f27512O0 - i20, z11);
                } else {
                    dVar.g(dVar3.f27544i, iVarQ, this.f27512O0 + i20, z11);
                }
                dVar.e(dVar3.f27544i, iVarQ, this.f27512O0 + i20, i17);
            }
        }
        int i21 = this.f27510M0;
        if (i21 == 0) {
            dVar.e(this.f27581P.f27544i, this.f27579N.f27544i, 0, 8);
            dVar.e(this.f27579N.f27544i, this.f27591Z.f27581P.f27544i, 0, 4);
            dVar.e(this.f27579N.f27544i, this.f27591Z.f27579N.f27544i, 0, 0);
            return;
        }
        if (i21 == 1) {
            dVar.e(this.f27579N.f27544i, this.f27581P.f27544i, 0, 8);
            dVar.e(this.f27579N.f27544i, this.f27591Z.f27579N.f27544i, 0, 4);
            dVar.e(this.f27579N.f27544i, this.f27591Z.f27581P.f27544i, 0, 0);
        } else if (i21 == 2) {
            dVar.e(this.f27582Q.f27544i, this.f27580O.f27544i, 0, 8);
            dVar.e(this.f27580O.f27544i, this.f27591Z.f27582Q.f27544i, 0, 4);
            dVar.e(this.f27580O.f27544i, this.f27591Z.f27580O.f27544i, 0, 0);
        } else if (i21 == 3) {
            dVar.e(this.f27580O.f27544i, this.f27582Q.f27544i, 0, 8);
            dVar.e(this.f27580O.f27544i, this.f27591Z.f27580O.f27544i, 0, 4);
            dVar.e(this.f27580O.f27544i, this.f27591Z.f27582Q.f27544i, 0, 0);
        }
    }

    @Override // Q1.e
    public boolean d0() {
        return this.f27513P0;
    }

    public int d1() {
        return this.f27512O0;
    }

    public int e1() {
        int i10 = this.f27510M0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    public void g1(int i10) {
        this.f27510M0 = i10;
    }

    public void h1(int i10) {
        this.f27512O0 = i10;
    }

    @Override // Q1.e
    public String toString() {
        String str = "[Barrier] " + o() + " {";
        for (int i10 = 0; i10 < this.f27691L0; i10++) {
            e eVar = this.f27690K0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.o();
        }
        return str + "}";
    }
}
