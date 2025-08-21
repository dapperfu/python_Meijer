package Q1;

import R1.o;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class i extends e implements h {

    /* renamed from: K0, reason: collision with root package name */
    public e[] f27690K0 = new e[4];

    /* renamed from: L0, reason: collision with root package name */
    public int f27691L0 = 0;

    public void Y0(ArrayList<o> arrayList, int i10, o oVar) {
        for (int i11 = 0; i11 < this.f27691L0; i11++) {
            oVar.a(this.f27690K0[i11]);
        }
        for (int i12 = 0; i12 < this.f27691L0; i12++) {
            R1.i.a(this.f27690K0[i12], i10, arrayList, oVar);
        }
    }

    public int Z0(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.f27691L0; i13++) {
            e eVar = this.f27690K0[i13];
            if (i10 == 0 && (i12 = eVar.f27572H0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = eVar.f27574I0) != -1) {
                return i11;
            }
        }
        return -1;
    }

    public void X0(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i10 = this.f27691L0 + 1;
        e[] eVarArr = this.f27690K0;
        if (i10 > eVarArr.length) {
            this.f27690K0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f27690K0;
        int i11 = this.f27691L0;
        eVarArr2[i11] = eVar;
        this.f27691L0 = i11 + 1;
    }
}
