package Ug;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.o;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Vg.a f36038a = new Vg.a();

    private static c a(h hVar) throws NotFoundException {
        int[] iArrJ;
        if (hVar == null || (iArrJ = hVar.j()) == null) {
            return null;
        }
        int iP = p(iArrJ);
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArrJ) {
            i11 += iP - i12;
            if (i12 > 0) {
                break;
            }
        }
        d[] dVarArrD = hVar.d();
        for (int i13 = 0; i11 > 0 && dVarArrD[i13] == null; i13++) {
            i11--;
        }
        for (int length = iArrJ.length - 1; length >= 0; length--) {
            int i14 = iArrJ[length];
            i10 += iP - i14;
            if (i14 > 0) {
                break;
            }
        }
        for (int length2 = dVarArrD.length - 1; i10 > 0 && dVarArrD[length2] == null; length2--) {
            i10--;
        }
        return hVar.a().a(i11, i10, hVar.k());
    }

    private static void b(f fVar, b[][] bVarArr) throws NotFoundException {
        b bVar = bVarArr[0][1];
        int[] iArrA = bVar.a();
        int iJ = (fVar.j() * fVar.l()) - r(fVar.k());
        if (iArrA.length == 0) {
            if (iJ < 1 || iJ > 928) {
                throw NotFoundException.a();
            }
            bVar.b(iJ);
            return;
        }
        if (iArrA[0] == iJ || iJ < 1 || iJ > 928) {
            return;
        }
        bVar.b(iJ);
    }

    private static Gg.e h(int i10, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws ChecksumException, FormatException {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i11 = 100;
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                throw ChecksumException.a();
            }
            for (int i13 = 0; i13 < length; i13++) {
                iArr[iArr3[i13]] = iArr4[i13][iArr5[i13]];
            }
            try {
                return j(iArr, i10, iArr2);
            } catch (ChecksumException unused) {
                if (length == 0) {
                    throw ChecksumException.a();
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        break;
                    }
                    int i15 = iArr5[i14];
                    if (i15 < iArr4[i14].length - 1) {
                        iArr5[i14] = i15 + 1;
                        break;
                    }
                    iArr5[i14] = 0;
                    if (i14 == length - 1) {
                        throw ChecksumException.a();
                    }
                    i14++;
                }
                i11 = i12;
            }
        }
    }

    private static Gg.e j(int[] iArr, int i10, int[] iArr2) throws ChecksumException, FormatException {
        if (iArr.length == 0) {
            throw FormatException.a();
        }
        int i11 = 1 << (i10 + 1);
        int iE = e(iArr, iArr2, i11);
        w(iArr, i11);
        Gg.e eVarB = e.b(iArr, String.valueOf(i10));
        eVarB.n(Integer.valueOf(iE));
        eVarB.m(Integer.valueOf(iArr2.length));
        return eVarB;
    }

    private static a l(h hVar, h hVar2) {
        a aVarI;
        a aVarI2;
        if (hVar == null || (aVarI = hVar.i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.i();
        }
        if (hVar2 == null || (aVarI2 = hVar2.i()) == null || aVarI.a() == aVarI2.a() || aVarI.b() == aVarI2.b() || aVarI.c() == aVarI2.c()) {
            return aVarI;
        }
        return null;
    }

    private static int o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    private static int p(int[] iArr) {
        int iMax = -1;
        for (int i10 : iArr) {
            iMax = Math.max(iMax, i10);
        }
        return iMax;
    }

    private static int r(int i10) {
        return 2 << i10;
    }

    private static f v(h hVar, h hVar2) throws NotFoundException {
        a aVarL;
        if ((hVar == null && hVar2 == null) || (aVarL = l(hVar, hVar2)) == null) {
            return null;
        }
        return new f(aVarL, c.j(a(hVar), a(hVar2)));
    }

    private static void w(int[] iArr, int i10) throws FormatException {
        if (iArr.length < 4) {
            throw FormatException.a();
        }
        int i11 = iArr[0];
        if (i11 > iArr.length) {
            throw FormatException.a();
        }
        if (i11 == 0) {
            if (i10 >= iArr.length) {
                throw FormatException.a();
            }
            iArr[0] = iArr.length - i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
    
        r0 = -r0;
        r8 = !r8;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int c(Gg.b r5, int r6, int r7, boolean r8, int r9, int r10) {
        /*
            if (r8 == 0) goto L4
            r0 = -1
            goto L5
        L4:
            r0 = 1
        L5:
            r1 = 0
            r2 = r9
        L7:
            r3 = 2
            if (r1 >= r3) goto L28
        La:
            if (r8 == 0) goto Lf
            if (r2 < r6) goto L22
            goto L11
        Lf:
            if (r2 >= r7) goto L22
        L11:
            boolean r4 = r5.f(r2, r10)
            if (r8 != r4) goto L22
            int r4 = r9 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= r3) goto L20
            return r9
        L20:
            int r2 = r2 + r0
            goto La
        L22:
            int r0 = -r0
            r8 = r8 ^ 1
            int r1 = r1 + 1
            goto L7
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Ug.j.c(Gg.b, int, int, boolean, int, int):int");
    }

    private static boolean d(int i10, int i11, int i12) {
        return i11 + (-2) <= i10 && i10 <= i12 + 2;
    }

    private static int e(int[] iArr, int[] iArr2, int i10) throws ChecksumException {
        if ((iArr2 == null || iArr2.length <= (i10 / 2) + 3) && i10 >= 0 && i10 <= 512) {
            return f36038a.a(iArr, i10, iArr2);
        }
        throw ChecksumException.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Gg.e i(Gg.b r17, com.google.zxing.o r18, com.google.zxing.o r19, com.google.zxing.o r20, com.google.zxing.o r21, int r22, int r23) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ug.j.i(Gg.b, com.google.zxing.o, com.google.zxing.o, com.google.zxing.o, com.google.zxing.o, int, int):Gg.e");
    }

    private static int[] m(int i10) {
        int[] iArr = new int[8];
        int i11 = 0;
        int i12 = 7;
        while (true) {
            int i13 = i10 & 1;
            if (i13 != i11) {
                i12--;
                if (i12 < 0) {
                    return iArr;
                }
                i11 = i13;
            }
            iArr[i12] = iArr[i12] + 1;
            i10 >>= 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int[] q(Gg.b r7, int r8, int r9, boolean r10, int r11, int r12) {
        /*
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 1
            if (r10 == 0) goto L9
            r3 = r2
            goto La
        L9:
            r3 = -1
        La:
            r4 = 0
            r5 = r10
        Lc:
            if (r10 == 0) goto L11
            if (r11 >= r9) goto L27
            goto L13
        L11:
            if (r11 < r8) goto L27
        L13:
            if (r4 >= r0) goto L27
            boolean r6 = r7.f(r11, r12)
            if (r6 != r5) goto L22
            r6 = r1[r4]
            int r6 = r6 + r2
            r1[r4] = r6
            int r11 = r11 + r3
            goto Lc
        L22:
            int r4 = r4 + 1
            r5 = r5 ^ 1
            goto Lc
        L27:
            if (r4 == r0) goto L34
            if (r10 == 0) goto L2c
            r8 = r9
        L2c:
            if (r11 != r8) goto L32
            r7 = 7
            if (r4 != r7) goto L32
            goto L34
        L32:
            r7 = 0
            return r7
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ug.j.q(Gg.b, int, int, boolean, int, int):int[]");
    }

    private static h s(Gg.b bVar, c cVar, o oVar, boolean z10, int i10, int i11) {
        h hVar = new h(cVar, z10);
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i12 == 0 ? 1 : -1;
            int iC = (int) oVar.c();
            for (int iD = (int) oVar.d(); iD <= cVar.e() && iD >= cVar.g(); iD += i13) {
                d dVarK = k(bVar, 0, bVar.m(), z10, iC, iD, i10, i11);
                if (dVarK != null) {
                    hVar.f(iD, dVarK);
                    iC = z10 ? dVarK.d() : dVarK.b();
                }
            }
            i12++;
        }
        return hVar;
    }

    private static int t(f fVar, int i10, int i11, boolean z10) {
        int i12 = z10 ? 1 : -1;
        int i13 = i10 - i12;
        d dVarB = u(fVar, i13) ? fVar.n(i13).b(i11) : null;
        if (dVarB != null) {
            return z10 ? dVarB.b() : dVarB.d();
        }
        d dVarC = fVar.n(i10).c(i11);
        if (dVarC != null) {
            return z10 ? dVarC.d() : dVarC.b();
        }
        if (u(fVar, i13)) {
            dVarC = fVar.n(i13).c(i11);
        }
        if (dVarC != null) {
            return z10 ? dVarC.b() : dVarC.d();
        }
        int i14 = 0;
        while (true) {
            i10 -= i12;
            if (!u(fVar, i10)) {
                c cVarM = fVar.m();
                return z10 ? cVarM.f() : cVarM.d();
            }
            for (d dVar : fVar.n(i10).d()) {
                if (dVar != null) {
                    return (z10 ? dVar.b() : dVar.d()) + (i12 * i14 * (dVar.b() - dVar.d()));
                }
            }
            i14++;
        }
    }

    private static boolean u(f fVar, int i10) {
        return i10 >= 0 && i10 <= fVar.j() + 1;
    }

    private static b[][] f(f fVar) {
        int iC;
        b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, fVar.l(), fVar.j() + 2);
        for (b[] bVarArr2 : bVarArr) {
            int i10 = 0;
            while (true) {
                if (i10 < bVarArr2.length) {
                    bVarArr2[i10] = new b();
                    i10++;
                }
            }
        }
        int i11 = 0;
        for (g gVar : fVar.o()) {
            if (gVar != null) {
                for (d dVar : gVar.d()) {
                    if (dVar != null && (iC = dVar.c()) >= 0 && iC < bVarArr.length) {
                        bVarArr[iC][i11].b(dVar.e());
                    }
                }
            }
            i11++;
        }
        return bVarArr;
    }

    private static Gg.e g(f fVar) throws NotFoundException, ChecksumException, FormatException {
        b[][] bVarArrF = f(fVar);
        b(fVar, bVarArrF);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[fVar.l() * fVar.j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < fVar.l(); i10++) {
            int i11 = 0;
            while (i11 < fVar.j()) {
                int i12 = i11 + 1;
                int[] iArrA = bVarArrF[i10][i12].a();
                int iJ = (fVar.j() * i10) + i11;
                if (iArrA.length == 0) {
                    arrayList.add(Integer.valueOf(iJ));
                } else if (iArrA.length == 1) {
                    iArr[iJ] = iArrA[0];
                } else {
                    arrayList3.add(Integer.valueOf(iJ));
                    arrayList2.add(iArrA);
                }
                i11 = i12;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i13 = 0; i13 < size; i13++) {
            iArr2[i13] = (int[]) arrayList2.get(i13);
        }
        return h(fVar.k(), iArr, Tg.a.b(arrayList), Tg.a.b(arrayList3), iArr2);
    }

    private static d k(Gg.b bVar, int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        int i16;
        int iD;
        int iA;
        int iC = c(bVar, i10, i11, z10, i12, i13);
        int[] iArrQ = q(bVar, i10, i11, z10, iC, i13);
        if (iArrQ == null) {
            return null;
        }
        int iD2 = Hg.a.d(iArrQ);
        if (z10) {
            i16 = iC + iD2;
        } else {
            for (int i17 = 0; i17 < iArrQ.length / 2; i17++) {
                int i18 = iArrQ[i17];
                iArrQ[i17] = iArrQ[(iArrQ.length - 1) - i17];
                iArrQ[(iArrQ.length - 1) - i17] = i18;
            }
            iC -= iD2;
            i16 = iC;
        }
        if (!d(iD2, i14, i15) || (iA = Tg.a.a((iD = i.d(iArrQ)))) == -1) {
            return null;
        }
        return new d(iC, i16, n(iD), iA);
    }

    private static int n(int i10) {
        return o(m(i10));
    }
}
