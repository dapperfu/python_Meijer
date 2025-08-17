package Jg;

import Mg.e;
import Mg.l;
import bh.C6251b;
import com.google.zxing.q;

/* loaded from: classes7.dex */
public final class b implements q {
    private static Gg.b b(C6251b c6251b, int i10, int i11) {
        Gg.b bVar;
        int iE = c6251b.e();
        int iD = c6251b.d();
        int iMax = Math.max(i10, iE);
        int iMax2 = Math.max(i11, iD);
        int iMin = Math.min(iMax / iE, iMax2 / iD);
        int i12 = (iMax - (iE * iMin)) / 2;
        int i13 = (iMax2 - (iD * iMin)) / 2;
        if (i11 >= iD && i10 >= iE) {
            bVar = new Gg.b(i10, i11);
        } else {
            bVar = new Gg.b(iE, iD);
            i12 = 0;
            i13 = 0;
        }
        bVar.b();
        int i14 = 0;
        while (i14 < iD) {
            int i15 = i12;
            int i16 = 0;
            while (i16 < iE) {
                if (c6251b.b(i16, i14) == 1) {
                    bVar.r(i15, i13, iMin, iMin);
                }
                i16++;
                i15 += iMin;
            }
            i14++;
            i13 += iMin;
        }
        return bVar;
    }

    private static Gg.b c(e eVar, l lVar, int i10, int i11) {
        boolean z10;
        boolean z11;
        int iH = lVar.h();
        int iG = lVar.g();
        C6251b c6251b = new C6251b(lVar.j(), lVar.i());
        int i12 = 0;
        for (int i13 = 0; i13 < iG; i13++) {
            if (i13 % lVar.f19582e == 0) {
                int i14 = 0;
                for (int i15 = 0; i15 < lVar.j(); i15++) {
                    if (i15 % 2 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c6251b.g(i14, i12, z11);
                    i14++;
                }
                i12++;
            }
            int i16 = 0;
            for (int i17 = 0; i17 < iH; i17++) {
                if (i17 % lVar.f19581d == 0) {
                    c6251b.g(i16, i12, true);
                    i16++;
                }
                c6251b.g(i16, i12, eVar.e(i17, i13));
                int i18 = i16 + 1;
                int i19 = lVar.f19581d;
                if (i17 % i19 == i19 - 1) {
                    if (i13 % 2 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c6251b.g(i18, i12, z10);
                    i16 += 2;
                } else {
                    i16 = i18;
                }
            }
            int i20 = i12 + 1;
            int i21 = lVar.f19582e;
            if (i13 % i21 == i21 - 1) {
                int i22 = 0;
                for (int i23 = 0; i23 < lVar.j(); i23++) {
                    c6251b.g(i22, i20, true);
                    i22++;
                }
                i12 += 2;
            } else {
                i12 = i20;
            }
        }
        return b(c6251b, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    @Override // com.google.zxing.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Gg.b a(java.lang.String r8, com.google.zxing.a r9, int r10, int r11, java.util.Map<com.google.zxing.f, ?> r12) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Jg.b.a(java.lang.String, com.google.zxing.a, int, int, java.util.Map):Gg.b");
    }
}
