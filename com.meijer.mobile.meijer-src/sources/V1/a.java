package V1;

import V1.e;

/* loaded from: classes.dex */
public class a extends j {

    /* renamed from: y0, reason: collision with root package name */
    private int f39415y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f39416z0 = true;

    /* renamed from: A0, reason: collision with root package name */
    private int f39414A0 = 0;

    protected void N0() {
        for (int i10 = 0; i10 < this.f39612x0; i10++) {
            e eVar = this.f39611w0[i10];
            int i11 = this.f39415y0;
            if (i11 == 0 || i11 == 1) {
                eVar.o0(0, true);
            } else if (i11 == 2 || i11 == 3) {
                eVar.o0(1, true);
            }
        }
    }

    @Override // V1.e
    public boolean g() {
        return true;
    }

    public boolean K0() {
        return this.f39416z0;
    }

    public int L0() {
        return this.f39415y0;
    }

    public int M0() {
        return this.f39414A0;
    }

    public void O0(boolean z10) {
        this.f39416z0 = z10;
    }

    public void P0(int i10) {
        this.f39415y0 = i10;
    }

    public void Q0(int i10) {
        this.f39414A0 = i10;
    }

    @Override // V1.e
    public void f(U1.d dVar) {
        d[] dVarArr;
        boolean z10;
        int i10;
        int i11;
        int i12;
        d[] dVarArr2 = this.f39467J;
        dVarArr2[0] = this.f39459B;
        dVarArr2[2] = this.f39460C;
        dVarArr2[1] = this.f39461D;
        dVarArr2[3] = this.f39462E;
        int i13 = 0;
        while (true) {
            dVarArr = this.f39467J;
            if (i13 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i13];
            dVar2.f39445g = dVar.q(dVar2);
            i13++;
        }
        int i14 = this.f39415y0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i14];
        for (int i15 = 0; i15 < this.f39612x0; i15++) {
            e eVar = this.f39611w0[i15];
            if ((this.f39416z0 || eVar.g()) && ((((i11 = this.f39415y0) == 0 || i11 == 1) && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.f39459B.f39442d != null && eVar.f39461D.f39442d != null) || (((i12 = this.f39415y0) == 2 || i12 == 3) && eVar.M() == e.b.MATCH_CONSTRAINT && eVar.f39460C.f39442d != null && eVar.f39462E.f39442d != null))) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        boolean z11 = this.f39459B.i() || this.f39461D.i();
        boolean z12 = this.f39460C.i() || this.f39462E.i();
        int i16 = !(!z10 && (((i10 = this.f39415y0) == 0 && z11) || ((i10 == 2 && z12) || ((i10 == 1 && z11) || (i10 == 3 && z12))))) ? 4 : 5;
        for (int i17 = 0; i17 < this.f39612x0; i17++) {
            e eVar2 = this.f39611w0[i17];
            if (this.f39416z0 || eVar2.g()) {
                U1.i iVarQ = dVar.q(eVar2.f39467J[this.f39415y0]);
                d[] dVarArr3 = eVar2.f39467J;
                int i18 = this.f39415y0;
                d dVar4 = dVarArr3[i18];
                dVar4.f39445g = iVarQ;
                d dVar5 = dVar4.f39442d;
                int i19 = (dVar5 == null || dVar5.f39440b != this) ? 0 : dVar4.f39443e;
                if (i18 == 0 || i18 == 2) {
                    dVar.i(dVar3.f39445g, iVarQ, this.f39414A0 - i19, z10);
                } else {
                    dVar.g(dVar3.f39445g, iVarQ, this.f39414A0 + i19, z10);
                }
                dVar.e(dVar3.f39445g, iVarQ, this.f39414A0 + i19, i16);
            }
        }
        int i20 = this.f39415y0;
        if (i20 == 0) {
            dVar.e(this.f39461D.f39445g, this.f39459B.f39445g, 0, 8);
            dVar.e(this.f39459B.f39445g, this.f39471N.f39461D.f39445g, 0, 4);
            dVar.e(this.f39459B.f39445g, this.f39471N.f39459B.f39445g, 0, 0);
            return;
        }
        if (i20 == 1) {
            dVar.e(this.f39459B.f39445g, this.f39461D.f39445g, 0, 8);
            dVar.e(this.f39459B.f39445g, this.f39471N.f39459B.f39445g, 0, 4);
            dVar.e(this.f39459B.f39445g, this.f39471N.f39461D.f39445g, 0, 0);
        } else if (i20 == 2) {
            dVar.e(this.f39462E.f39445g, this.f39460C.f39445g, 0, 8);
            dVar.e(this.f39460C.f39445g, this.f39471N.f39462E.f39445g, 0, 4);
            dVar.e(this.f39460C.f39445g, this.f39471N.f39460C.f39445g, 0, 0);
        } else if (i20 == 3) {
            dVar.e(this.f39460C.f39445g, this.f39462E.f39445g, 0, 8);
            dVar.e(this.f39460C.f39445g, this.f39471N.f39460C.f39445g, 0, 4);
            dVar.e(this.f39460C.f39445g, this.f39471N.f39462E.f39445g, 0, 0);
        }
    }

    @Override // V1.e
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i10 = 0; i10 < this.f39612x0; i10++) {
            e eVar = this.f39611w0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }
}
