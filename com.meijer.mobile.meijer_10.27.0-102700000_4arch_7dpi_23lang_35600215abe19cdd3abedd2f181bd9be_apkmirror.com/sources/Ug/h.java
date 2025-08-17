package Ug;

import com.google.zxing.o;

/* loaded from: classes7.dex */
final class h extends g {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f36036c;

    private void l(d[] dVarArr, a aVar) {
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            d dVar = dVarArr[i10];
            if (dVar != null) {
                int iE = dVar.e() % 30;
                int iC = dVar.c();
                if (iC > aVar.c()) {
                    dVarArr[i10] = null;
                } else {
                    if (!this.f36036c) {
                        iC += 2;
                    }
                    int i11 = iC % 3;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2 && iE + 1 != aVar.a()) {
                                dVarArr[i10] = null;
                            }
                        } else if (iE / 3 != aVar.b() || iE % 3 != aVar.d()) {
                            dVarArr[i10] = null;
                        }
                    } else if ((iE * 3) + 1 != aVar.e()) {
                        dVarArr[i10] = null;
                    }
                }
            }
        }
    }

    boolean k() {
        return this.f36036c;
    }

    @Override // Ug.g
    public String toString() {
        return "IsLeft: " + this.f36036c + '\n' + super.toString();
    }

    h(c cVar, boolean z10) {
        super(cVar);
        this.f36036c = z10;
    }

    private void h(a aVar) {
        o oVarI;
        o oVarC;
        c cVarA = a();
        if (this.f36036c) {
            oVarI = cVarA.h();
        } else {
            oVarI = cVarA.i();
        }
        if (this.f36036c) {
            oVarC = cVarA.b();
        } else {
            oVarC = cVarA.c();
        }
        int iE = e((int) oVarC.d());
        d[] dVarArrD = d();
        int iC = -1;
        int i10 = 0;
        int iMax = 1;
        for (int iE2 = e((int) oVarI.d()); iE2 < iE; iE2++) {
            d dVar = dVarArrD[iE2];
            if (dVar != null) {
                dVar.j();
                int iC2 = dVar.c() - iC;
                if (iC2 == 0) {
                    i10++;
                } else {
                    if (iC2 == 1) {
                        iMax = Math.max(iMax, i10);
                        iC = dVar.c();
                    } else if (dVar.c() >= aVar.c()) {
                        dVarArrD[iE2] = null;
                    } else {
                        iC = dVar.c();
                    }
                    i10 = 1;
                }
            }
        }
    }

    private void m() {
        for (d dVar : d()) {
            if (dVar != null) {
                dVar.j();
            }
        }
    }

    void g(a aVar) {
        o oVarI;
        o oVarC;
        boolean z10;
        d[] dVarArrD = d();
        m();
        l(dVarArrD, aVar);
        c cVarA = a();
        if (this.f36036c) {
            oVarI = cVarA.h();
        } else {
            oVarI = cVarA.i();
        }
        if (this.f36036c) {
            oVarC = cVarA.b();
        } else {
            oVarC = cVarA.c();
        }
        int iE = e((int) oVarC.d());
        int iC = -1;
        int i10 = 0;
        int iMax = 1;
        for (int iE2 = e((int) oVarI.d()); iE2 < iE; iE2++) {
            d dVar = dVarArrD[iE2];
            if (dVar != null) {
                int iC2 = dVar.c() - iC;
                if (iC2 == 0) {
                    i10++;
                } else {
                    if (iC2 == 1) {
                        iMax = Math.max(iMax, i10);
                        iC = dVar.c();
                    } else if (iC2 >= 0 && dVar.c() < aVar.c() && iC2 <= iE2) {
                        if (iMax > 2) {
                            iC2 *= iMax - 2;
                        }
                        if (iC2 >= iE2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        for (int i11 = 1; i11 <= iC2 && !z10; i11++) {
                            if (dVarArrD[iE2 - i11] != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                        if (z10) {
                            dVarArrD[iE2] = null;
                        } else {
                            iC = dVar.c();
                        }
                    } else {
                        dVarArrD[iE2] = null;
                    }
                    i10 = 1;
                }
            }
        }
    }

    a i() {
        d[] dVarArrD = d();
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        for (d dVar : dVarArrD) {
            if (dVar != null) {
                dVar.j();
                int iE = dVar.e() % 30;
                int iC = dVar.c();
                if (!this.f36036c) {
                    iC += 2;
                }
                int i10 = iC % 3;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            bVar.b(iE + 1);
                        }
                    } else {
                        bVar4.b(iE / 3);
                        bVar3.b(iE % 3);
                    }
                } else {
                    bVar2.b((iE * 3) + 1);
                }
            }
        }
        if (bVar.a().length != 0 && bVar2.a().length != 0 && bVar3.a().length != 0 && bVar4.a().length != 0 && bVar.a()[0] >= 1 && bVar2.a()[0] + bVar3.a()[0] >= 3 && bVar2.a()[0] + bVar3.a()[0] <= 90) {
            a aVar = new a(bVar.a()[0], bVar2.a()[0], bVar3.a()[0], bVar4.a()[0]);
            l(dVarArrD, aVar);
            return aVar;
        }
        return null;
    }

    int[] j() {
        int iC;
        a aVarI = i();
        if (aVarI == null) {
            return null;
        }
        h(aVarI);
        int iC2 = aVarI.c();
        int[] iArr = new int[iC2];
        for (d dVar : d()) {
            if (dVar != null && (iC = dVar.c()) < iC2) {
                iArr[iC] = iArr[iC] + 1;
            }
        }
        return iArr;
    }
}
