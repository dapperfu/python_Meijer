package V1;

import V1.e;

/* loaded from: classes.dex */
public class a extends j {

    /* renamed from: y0, reason: collision with root package name */
    private int f36555y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f36556z0 = true;

    /* renamed from: A0, reason: collision with root package name */
    private int f36554A0 = 0;

    protected void N0() {
        for (int i10 = 0; i10 < this.f36752x0; i10++) {
            e eVar = this.f36751w0[i10];
            int i11 = this.f36555y0;
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
        return this.f36556z0;
    }

    public int L0() {
        return this.f36555y0;
    }

    public int M0() {
        return this.f36554A0;
    }

    public void O0(boolean z10) {
        this.f36556z0 = z10;
    }

    public void P0(int i10) {
        this.f36555y0 = i10;
    }

    public void Q0(int i10) {
        this.f36554A0 = i10;
    }

    @Override // V1.e
    public void f(U1.d dVar) {
        d[] dVarArr;
        boolean z10;
        int i10;
        int i11;
        int i12;
        d[] dVarArr2 = this.f36607J;
        dVarArr2[0] = this.f36599B;
        dVarArr2[2] = this.f36600C;
        dVarArr2[1] = this.f36601D;
        dVarArr2[3] = this.f36602E;
        int i13 = 0;
        while (true) {
            dVarArr = this.f36607J;
            if (i13 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i13];
            dVar2.f36585g = dVar.q(dVar2);
            i13++;
        }
        int i14 = this.f36555y0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i14];
        for (int i15 = 0; i15 < this.f36752x0; i15++) {
            e eVar = this.f36751w0[i15];
            if ((this.f36556z0 || eVar.g()) && ((((i11 = this.f36555y0) == 0 || i11 == 1) && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.f36599B.f36582d != null && eVar.f36601D.f36582d != null) || (((i12 = this.f36555y0) == 2 || i12 == 3) && eVar.M() == e.b.MATCH_CONSTRAINT && eVar.f36600C.f36582d != null && eVar.f36602E.f36582d != null))) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        boolean z11 = this.f36599B.i() || this.f36601D.i();
        boolean z12 = this.f36600C.i() || this.f36602E.i();
        int i16 = !(!z10 && (((i10 = this.f36555y0) == 0 && z11) || ((i10 == 2 && z12) || ((i10 == 1 && z11) || (i10 == 3 && z12))))) ? 4 : 5;
        for (int i17 = 0; i17 < this.f36752x0; i17++) {
            e eVar2 = this.f36751w0[i17];
            if (this.f36556z0 || eVar2.g()) {
                U1.i iVarQ = dVar.q(eVar2.f36607J[this.f36555y0]);
                d[] dVarArr3 = eVar2.f36607J;
                int i18 = this.f36555y0;
                d dVar4 = dVarArr3[i18];
                dVar4.f36585g = iVarQ;
                d dVar5 = dVar4.f36582d;
                int i19 = (dVar5 == null || dVar5.f36580b != this) ? 0 : dVar4.f36583e;
                if (i18 == 0 || i18 == 2) {
                    dVar.i(dVar3.f36585g, iVarQ, this.f36554A0 - i19, z10);
                } else {
                    dVar.g(dVar3.f36585g, iVarQ, this.f36554A0 + i19, z10);
                }
                dVar.e(dVar3.f36585g, iVarQ, this.f36554A0 + i19, i16);
            }
        }
        int i20 = this.f36555y0;
        if (i20 == 0) {
            dVar.e(this.f36601D.f36585g, this.f36599B.f36585g, 0, 8);
            dVar.e(this.f36599B.f36585g, this.f36611N.f36601D.f36585g, 0, 4);
            dVar.e(this.f36599B.f36585g, this.f36611N.f36599B.f36585g, 0, 0);
            return;
        }
        if (i20 == 1) {
            dVar.e(this.f36599B.f36585g, this.f36601D.f36585g, 0, 8);
            dVar.e(this.f36599B.f36585g, this.f36611N.f36599B.f36585g, 0, 4);
            dVar.e(this.f36599B.f36585g, this.f36611N.f36601D.f36585g, 0, 0);
        } else if (i20 == 2) {
            dVar.e(this.f36602E.f36585g, this.f36600C.f36585g, 0, 8);
            dVar.e(this.f36600C.f36585g, this.f36611N.f36602E.f36585g, 0, 4);
            dVar.e(this.f36600C.f36585g, this.f36611N.f36600C.f36585g, 0, 0);
        } else if (i20 == 3) {
            dVar.e(this.f36600C.f36585g, this.f36602E.f36585g, 0, 8);
            dVar.e(this.f36600C.f36585g, this.f36611N.f36600C.f36585g, 0, 4);
            dVar.e(this.f36600C.f36585g, this.f36611N.f36602E.f36585g, 0, 0);
        }
    }

    @Override // V1.e
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i10 = 0; i10 < this.f36752x0; i10++) {
            e eVar = this.f36751w0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }
}
