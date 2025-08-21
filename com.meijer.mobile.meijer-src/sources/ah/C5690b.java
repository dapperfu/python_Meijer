package ah;

import com.google.zxing.WriterException;
import com.google.zxing.f;
import com.google.zxing.q;
import dh.C13682b;
import dh.c;
import dh.g;
import java.util.Map;

/* renamed from: ah.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5690b implements q {
    private static Ig.b b(g gVar, int i10, int i11, int i12) {
        C13682b c13682bA = gVar.a();
        if (c13682bA != null) {
            int iE = c13682bA.e();
            int iD = c13682bA.d();
            int i13 = i12 * 2;
            int i14 = iE + i13;
            int i15 = i13 + iD;
            int iMax = Math.max(i10, i14);
            int iMax2 = Math.max(i11, i15);
            int iMin = Math.min(iMax / i14, iMax2 / i15);
            int i16 = (iMax - (iE * iMin)) / 2;
            int i17 = (iMax2 - (iD * iMin)) / 2;
            Ig.b bVar = new Ig.b(iMax, iMax2);
            int i18 = 0;
            while (i18 < iD) {
                int i19 = 0;
                int i20 = i16;
                while (i19 < iE) {
                    if (c13682bA.b(i19, i18) == 1) {
                        bVar.r(i20, i17, iMin, iMin);
                    }
                    i19++;
                    i20 += iMin;
                }
                i18++;
                i17 += iMin;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.zxing.q
    public Ig.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<f, ?> map) throws NumberFormatException, WriterException {
        if (!str.isEmpty()) {
            if (aVar == com.google.zxing.a.QR_CODE) {
                if (i10 >= 0 && i11 >= 0) {
                    bh.f fVarValueOf = bh.f.L;
                    int i12 = 4;
                    if (map != null) {
                        f fVar = f.ERROR_CORRECTION;
                        if (map.containsKey(fVar)) {
                            fVarValueOf = bh.f.valueOf(map.get(fVar).toString());
                        }
                        f fVar2 = f.MARGIN;
                        if (map.containsKey(fVar2)) {
                            i12 = Integer.parseInt(map.get(fVar2).toString());
                        }
                    }
                    return b(c.n(str, fVarValueOf, map), i10, i11, i12);
                }
                throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
            }
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + aVar);
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
