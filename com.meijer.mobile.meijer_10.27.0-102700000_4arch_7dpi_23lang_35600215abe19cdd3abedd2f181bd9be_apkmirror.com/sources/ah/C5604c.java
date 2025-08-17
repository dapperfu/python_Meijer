package ah;

import Gg.g;
import Gg.l;
import Gg.o;
import Zg.j;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.p;
import java.util.Map;

/* renamed from: ah.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C5604c {

    /* renamed from: a, reason: collision with root package name */
    private final Gg.b f45479a;

    /* renamed from: b, reason: collision with root package name */
    private p f45480b;

    protected final C5602a f(float f10, int i10, int i11, float f11) throws NotFoundException {
        int i12 = (int) (f11 * f10);
        int iMax = Math.max(0, i10 - i12);
        int iMin = Math.min(this.f45479a.m() - 1, i10 + i12) - iMax;
        float f12 = 3.0f * f10;
        if (iMin < f12) {
            throw NotFoundException.a();
        }
        int iMax2 = Math.max(0, i11 - i12);
        int iMin2 = Math.min(this.f45479a.j() - 1, i11 + i12) - iMax2;
        if (iMin2 >= f12) {
            return new C5603b(this.f45479a, iMax, iMax2, iMin, iMin2, f10, this.f45480b).c();
        }
        throw NotFoundException.a();
    }

    private static o d(com.google.zxing.o oVar, com.google.zxing.o oVar2, com.google.zxing.o oVar3, com.google.zxing.o oVar4, int i10) {
        float fC;
        float fD;
        float f10;
        float f11 = i10 - 3.5f;
        if (oVar4 != null) {
            fC = oVar4.c();
            fD = oVar4.d();
            f10 = f11 - 3.0f;
        } else {
            fC = (oVar2.c() - oVar.c()) + oVar3.c();
            fD = (oVar2.d() - oVar.d()) + oVar3.d();
            f10 = f11;
        }
        return o.b(3.5f, 3.5f, f11, 3.5f, f10, f10, 3.5f, f11, oVar.c(), oVar.d(), oVar2.c(), oVar2.d(), fC, fD, oVar3.c(), oVar3.d());
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        if (r15 != r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
        return Hg.a.b(r5, r6, r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008a, code lost:
    
        return Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float i(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            int r0 = r21 - r19
            int r0 = java.lang.Math.abs(r0)
            int r1 = r20 - r18
            int r1 = java.lang.Math.abs(r1)
            r3 = 1
            if (r0 <= r1) goto L11
            r0 = r3
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L1d
            r4 = r18
            r1 = r19
            r6 = r20
            r5 = r21
            goto L25
        L1d:
            r1 = r18
            r4 = r19
            r5 = r20
            r6 = r21
        L25:
            int r7 = r5 - r1
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6 - r4
            int r8 = java.lang.Math.abs(r8)
            int r9 = -r7
            r10 = 2
            int r9 = r9 / r10
            r11 = -1
            if (r1 >= r5) goto L39
            r12 = r3
            goto L3a
        L39:
            r12 = r11
        L3a:
            if (r4 >= r6) goto L3d
            r11 = r3
        L3d:
            int r5 = r5 + r12
            r13 = r1
            r14 = r4
            r15 = 0
        L41:
            if (r13 == r5) goto L80
            if (r0 == 0) goto L47
            r2 = r14
            goto L48
        L47:
            r2 = r13
        L48:
            if (r0 == 0) goto L4c
            r10 = r13
            goto L4d
        L4c:
            r10 = r14
        L4d:
            r16 = r0
            if (r15 != r3) goto L57
            r0 = r3
            r19 = r7
            r3 = r17
            goto L5c
        L57:
            r0 = 0
            r3 = r17
            r19 = r7
        L5c:
            Gg.b r7 = r3.f45479a
            boolean r2 = r7.f(r2, r10)
            if (r0 != r2) goto L6e
            r0 = 2
            if (r15 != r0) goto L6c
            float r0 = Hg.a.b(r13, r14, r1, r4)
            return r0
        L6c:
            int r15 = r15 + 1
        L6e:
            int r9 = r9 + r8
            if (r9 <= 0) goto L78
            if (r14 != r6) goto L75
            r0 = 2
            goto L83
        L75:
            int r14 = r14 + r11
            int r9 = r9 - r19
        L78:
            int r13 = r13 + r12
            r7 = r19
            r0 = r16
            r3 = 1
            r10 = 2
            goto L41
        L80:
            r3 = r17
            r0 = r10
        L83:
            if (r15 != r0) goto L8a
            float r0 = Hg.a.b(r5, r6, r1, r4)
            return r0
        L8a:
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.C5604c.i(int, int, int, int):float");
    }

    public final g e(Map<com.google.zxing.d, ?> map) throws NotFoundException, FormatException {
        this.f45480b = map == null ? null : (p) map.get(com.google.zxing.d.NEED_RESULT_POINT_CALLBACK);
        return g(new e(this.f45479a, this.f45480b).g(map));
    }

    public C5604c(Gg.b bVar) {
        this.f45479a = bVar;
    }

    private float b(com.google.zxing.o oVar, com.google.zxing.o oVar2) {
        float fJ = j((int) oVar.c(), (int) oVar.d(), (int) oVar2.c(), (int) oVar2.d());
        float fJ2 = j((int) oVar2.c(), (int) oVar2.d(), (int) oVar.c(), (int) oVar.d());
        if (Float.isNaN(fJ)) {
            return fJ2 / 7.0f;
        }
        if (Float.isNaN(fJ2)) {
            return fJ / 7.0f;
        }
        return (fJ + fJ2) / 14.0f;
    }

    private static int c(com.google.zxing.o oVar, com.google.zxing.o oVar2, com.google.zxing.o oVar3, float f10) throws NotFoundException {
        int iC = (Hg.a.c(com.google.zxing.o.b(oVar, oVar2) / f10) + Hg.a.c(com.google.zxing.o.b(oVar, oVar3) / f10)) / 2;
        int i10 = iC + 7;
        int i11 = i10 & 3;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return i10;
                }
                throw NotFoundException.a();
            }
            return iC + 6;
        }
        return iC + 8;
    }

    private static Gg.b h(Gg.b bVar, o oVar, int i10) throws NotFoundException {
        return l.b().d(bVar, i10, i10, oVar);
    }

    private float j(int i10, int i11, int i12, int i13) {
        float fM;
        float fJ;
        float fI = i(i10, i11, i12, i13);
        int iM = i10 - (i12 - i10);
        int iJ = 0;
        if (iM < 0) {
            fM = i10 / (i10 - iM);
            iM = 0;
        } else if (iM >= this.f45479a.m()) {
            fM = ((this.f45479a.m() - 1) - i10) / (iM - i10);
            iM = this.f45479a.m() - 1;
        } else {
            fM = 1.0f;
        }
        float f10 = i11;
        int i14 = (int) (f10 - ((i13 - i11) * fM));
        if (i14 < 0) {
            fJ = f10 / (i11 - i14);
        } else if (i14 >= this.f45479a.j()) {
            fJ = ((this.f45479a.j() - 1) - i11) / (i14 - i11);
            iJ = this.f45479a.j() - 1;
        } else {
            iJ = i14;
            fJ = 1.0f;
        }
        return (fI + i(i10, i11, (int) (i10 + ((iM - i10) * fJ)), iJ)) - 1.0f;
    }

    protected final float a(com.google.zxing.o oVar, com.google.zxing.o oVar2, com.google.zxing.o oVar3) {
        return (b(oVar, oVar2) + b(oVar, oVar3)) / 2.0f;
    }

    protected final g g(f fVar) throws NotFoundException, FormatException {
        C5602a c5602aF;
        com.google.zxing.o[] oVarArr;
        d dVarB = fVar.b();
        d dVarC = fVar.c();
        d dVarA = fVar.a();
        float fA = a(dVarB, dVarC, dVarA);
        if (fA >= 1.0f) {
            int iC = c(dVarB, dVarC, dVarA, fA);
            j jVarG = j.g(iC);
            int iE = jVarG.e() - 7;
            if (jVarG.d().length > 0) {
                float fC = (dVarC.c() - dVarB.c()) + dVarA.c();
                float fD = (dVarC.d() - dVarB.d()) + dVarA.d();
                float f10 = 1.0f - (3.0f / iE);
                int iC2 = (int) (dVarB.c() + ((fC - dVarB.c()) * f10));
                int iD = (int) (dVarB.d() + (f10 * (fD - dVarB.d())));
                for (int i10 = 4; i10 <= 16; i10 <<= 1) {
                    try {
                        c5602aF = f(fA, iC2, iD, i10);
                        break;
                    } catch (NotFoundException unused) {
                    }
                }
                c5602aF = null;
            } else {
                c5602aF = null;
            }
            Gg.b bVarH = h(this.f45479a, d(dVarB, dVarC, dVarA, c5602aF, iC), iC);
            if (c5602aF == null) {
                oVarArr = new com.google.zxing.o[]{dVarA, dVarB, dVarC};
            } else {
                oVarArr = new com.google.zxing.o[]{dVarA, dVarB, dVarC, c5602aF};
            }
            return new g(bVarH, oVarArr);
        }
        throw NotFoundException.a();
    }
}
