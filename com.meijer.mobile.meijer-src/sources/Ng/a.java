package Ng;

import Ig.b;
import Ig.g;
import Ig.l;
import com.google.zxing.NotFoundException;
import com.google.zxing.o;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f20920a;

    /* renamed from: b, reason: collision with root package name */
    private final Jg.b f20921b;

    private o a(o[] oVarArr) {
        o oVar = oVarArr[0];
        o oVar2 = oVarArr[1];
        o oVar3 = oVarArr[2];
        o oVar4 = oVarArr[3];
        int iJ = j(oVar, oVar4);
        o oVarH = h(oVar, oVar2, (j(oVar2, oVar4) + 1) * 4);
        o oVarH2 = h(oVar3, oVar2, (iJ + 1) * 4);
        int iJ2 = j(oVarH, oVar4);
        int iJ3 = j(oVarH2, oVar4);
        float f10 = iJ2 + 1;
        o oVar5 = new o(oVar4.c() + ((oVar3.c() - oVar2.c()) / f10), oVar4.d() + ((oVar3.d() - oVar2.d()) / f10));
        float f11 = iJ3 + 1;
        o oVar6 = new o(oVar4.c() + ((oVar.c() - oVar2.c()) / f11), oVar4.d() + ((oVar.d() - oVar2.d()) / f11));
        if (e(oVar5)) {
            if (!e(oVar6) || j(oVarH, oVar5) + j(oVarH2, oVar5) > j(oVarH, oVar6) + j(oVarH2, oVar6)) {
                return oVar5;
            }
        } else if (!e(oVar6)) {
            return null;
        }
        return oVar6;
    }

    private o[] c(o[] oVarArr) {
        o oVar = oVarArr[0];
        o oVar2 = oVarArr[1];
        o oVar3 = oVarArr[3];
        o oVar4 = oVarArr[2];
        int iJ = j(oVar, oVar2);
        int iJ2 = j(oVar2, oVar3);
        int iJ3 = j(oVar3, oVar4);
        int iJ4 = j(oVar4, oVar);
        o[] oVarArr2 = {oVar4, oVar, oVar2, oVar3};
        if (iJ > iJ2) {
            oVarArr2[0] = oVar;
            oVarArr2[1] = oVar2;
            oVarArr2[2] = oVar3;
            oVarArr2[3] = oVar4;
            iJ = iJ2;
        }
        if (iJ > iJ3) {
            oVarArr2[0] = oVar2;
            oVarArr2[1] = oVar3;
            oVarArr2[2] = oVar4;
            oVarArr2[3] = oVar;
        } else {
            iJ3 = iJ;
        }
        if (iJ3 > iJ4) {
            oVarArr2[0] = oVar3;
            oVarArr2[1] = oVar4;
            oVarArr2[2] = oVar;
            oVarArr2[3] = oVar2;
        }
        return oVarArr2;
    }

    private o[] d(o[] oVarArr) {
        o oVar = oVarArr[0];
        o oVar2 = oVarArr[1];
        o oVar3 = oVarArr[2];
        o oVar4 = oVarArr[3];
        int iJ = (j(oVar, oVar4) + 1) * 4;
        if (j(h(oVar2, oVar3, iJ), oVar) < j(h(oVar3, oVar2, iJ), oVar4)) {
            oVarArr[0] = oVar;
            oVarArr[1] = oVar2;
            oVarArr[2] = oVar3;
            oVarArr[3] = oVar4;
            return oVarArr;
        }
        oVarArr[0] = oVar2;
        oVarArr[1] = oVar3;
        oVarArr[2] = oVar4;
        oVarArr[3] = oVar;
        return oVarArr;
    }

    private o[] i(o[] oVarArr) {
        o oVar = oVarArr[0];
        o oVar2 = oVarArr[1];
        o oVar3 = oVarArr[2];
        o oVar4 = oVarArr[3];
        int iJ = j(oVar, oVar4) + 1;
        o oVarH = h(oVar, oVar2, (j(oVar3, oVar4) + 1) * 4);
        o oVarH2 = h(oVar3, oVar2, iJ * 4);
        int iJ2 = j(oVarH, oVar4);
        int i10 = iJ2 + 1;
        int iJ3 = j(oVarH2, oVar4);
        int i11 = iJ3 + 1;
        if ((i10 & 1) == 1) {
            i10 = iJ2 + 2;
        }
        if ((i11 & 1) == 1) {
            i11 = iJ3 + 2;
        }
        float fC = (((oVar.c() + oVar2.c()) + oVar3.c()) + oVar4.c()) / 4.0f;
        float fD = (((oVar.d() + oVar2.d()) + oVar3.d()) + oVar4.d()) / 4.0f;
        o oVarF = f(oVar, fC, fD);
        o oVarF2 = f(oVar2, fC, fD);
        o oVarF3 = f(oVar3, fC, fD);
        o oVarF4 = f(oVar4, fC, fD);
        int i12 = i11 * 4;
        int i13 = i10 * 4;
        return new o[]{h(h(oVarF, oVarF2, i12), oVarF4, i13), h(h(oVarF2, oVarF, i12), oVarF3, i13), h(h(oVarF3, oVarF4, i12), oVarF2, i13), h(h(oVarF4, oVarF3, i12), oVarF, i13)};
    }

    private int j(o oVar, o oVar2) {
        int iC = (int) oVar.c();
        int iD = (int) oVar.d();
        int iC2 = (int) oVar2.c();
        int iMin = Math.min(this.f20920a.j() - 1, (int) oVar2.d());
        int i10 = 0;
        boolean z10 = Math.abs(iMin - iD) > Math.abs(iC2 - iC);
        if (z10) {
            iD = iC;
            iC = iD;
            iMin = iC2;
            iC2 = iMin;
        }
        int iAbs = Math.abs(iC2 - iC);
        int iAbs2 = Math.abs(iMin - iD);
        int i11 = (-iAbs) / 2;
        int i12 = iD < iMin ? 1 : -1;
        int i13 = iC >= iC2 ? -1 : 1;
        boolean zF = this.f20920a.f(z10 ? iD : iC, z10 ? iC : iD);
        while (iC != iC2) {
            boolean zF2 = this.f20920a.f(z10 ? iD : iC, z10 ? iC : iD);
            if (zF2 != zF) {
                i10++;
                zF = zF2;
            }
            i11 += iAbs2;
            if (i11 > 0) {
                if (iD == iMin) {
                    return i10;
                }
                iD += i12;
                i11 -= iAbs;
            }
            iC += i13;
        }
        return i10;
    }

    public g b() throws NotFoundException {
        int iMax;
        o[] oVarArrD = d(c(this.f20921b.c()));
        o oVarA = a(oVarArrD);
        oVarArrD[3] = oVarA;
        if (oVarA == null) {
            throw NotFoundException.a();
        }
        o[] oVarArrI = i(oVarArrD);
        o oVar = oVarArrI[0];
        o oVar2 = oVarArrI[1];
        o oVar3 = oVarArrI[2];
        o oVar4 = oVarArrI[3];
        int iJ = j(oVar, oVar4);
        int i10 = iJ + 1;
        int iJ2 = j(oVar3, oVar4);
        int i11 = iJ2 + 1;
        if ((i10 & 1) == 1) {
            i10 = iJ + 2;
        }
        if ((i11 & 1) == 1) {
            i11 = iJ2 + 2;
        }
        if (i10 * 4 >= i11 * 6 || i11 * 4 >= i10 * 6) {
            iMax = i10;
        } else {
            iMax = Math.max(i10, i11);
            i11 = iMax;
        }
        return new g(g(this.f20920a, oVar, oVar2, oVar3, oVar4, iMax, i11), new o[]{oVar, oVar2, oVar3, oVar4});
    }

    public a(b bVar) throws NotFoundException {
        this.f20920a = bVar;
        this.f20921b = new Jg.b(bVar);
    }

    private boolean e(o oVar) {
        if (oVar.c() >= 0.0f && oVar.c() <= this.f20920a.m() - 1 && oVar.d() > 0.0f && oVar.d() <= this.f20920a.j() - 1) {
            return true;
        }
        return false;
    }

    private static o f(o oVar, float f10, float f11) {
        float f12;
        float f13;
        float fC = oVar.c();
        float fD = oVar.d();
        if (fC < f10) {
            f12 = fC - 1.0f;
        } else {
            f12 = fC + 1.0f;
        }
        if (fD < f11) {
            f13 = fD - 1.0f;
        } else {
            f13 = fD + 1.0f;
        }
        return new o(f12, f13);
    }

    private static b g(b bVar, o oVar, o oVar2, o oVar3, o oVar4, int i10, int i11) throws NotFoundException {
        float f10 = i10 - 0.5f;
        float f11 = i11 - 0.5f;
        return l.b().c(bVar, i10, i11, 0.5f, 0.5f, f10, 0.5f, f10, f11, 0.5f, f11, oVar.c(), oVar.d(), oVar4.c(), oVar4.d(), oVar3.c(), oVar3.d(), oVar2.c(), oVar2.d());
    }

    private static o h(o oVar, o oVar2, int i10) {
        float f10 = i10 + 1;
        return new o(oVar.c() + ((oVar2.c() - oVar.c()) / f10), oVar.d() + ((oVar2.d() - oVar.d()) / f10));
    }
}
