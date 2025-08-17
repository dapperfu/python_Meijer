package Pg;

import com.google.zxing.NotFoundException;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes7.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f25402a = new int[4];

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f25403b = new StringBuilder();

    private int a(Gg.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f25402a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iL = aVar.l();
        int iK = iArr[1];
        int i10 = 0;
        for (int i11 = 0; i11 < 2 && iK < iL; i11++) {
            int iJ = y.j(aVar, iArr2, iK, y.f25414h);
            sb2.append((char) ((iJ % 10) + 48));
            for (int i12 : iArr2) {
                iK += i12;
            }
            if (iJ >= 10) {
                i10 |= 1 << (1 - i11);
            }
            if (i11 != 1) {
                iK = aVar.k(aVar.j(iK));
            }
        }
        if (sb2.length() != 2) {
            throw NotFoundException.a();
        }
        if (Integer.parseInt(sb2.toString()) % 4 == i10) {
            return iK;
        }
        throw NotFoundException.a();
    }

    com.google.zxing.m b(int i10, Gg.a aVar, int[] iArr) throws NotFoundException {
        StringBuilder sb2 = this.f25403b;
        sb2.setLength(0);
        int iA = a(aVar, iArr, sb2);
        String string = sb2.toString();
        Map<com.google.zxing.n, Object> mapC = c(string);
        float f10 = i10;
        com.google.zxing.m mVar = new com.google.zxing.m(string, null, new com.google.zxing.o[]{new com.google.zxing.o((iArr[0] + iArr[1]) / 2.0f, f10), new com.google.zxing.o(iA, f10)}, com.google.zxing.a.UPC_EAN_EXTENSION);
        if (mapC != null) {
            mVar.g(mapC);
        }
        return mVar;
    }

    v() {
    }

    private static Map<com.google.zxing.n, Object> c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(com.google.zxing.n.class);
        enumMap.put((EnumMap) com.google.zxing.n.ISSUE_NUMBER, (com.google.zxing.n) Integer.valueOf(str));
        return enumMap;
    }
}
