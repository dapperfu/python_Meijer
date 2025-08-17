package Pg;

import com.google.zxing.NotFoundException;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes7.dex */
final class w {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f25404c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a, reason: collision with root package name */
    private final int[] f25405a = new int[4];

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f25406b = new StringBuilder();

    private static int c(int i10) throws NotFoundException {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f25404c[i11]) {
                return i11;
            }
        }
        throw NotFoundException.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String e(java.lang.String r5) throws java.lang.NumberFormatException {
        /*
            r0 = 0
            char r1 = r5.charAt(r0)
            r2 = 48
            r3 = 1
            if (r1 == r2) goto L4d
            r2 = 53
            if (r1 == r2) goto L4a
            r2 = 57
            java.lang.String r4 = ""
            if (r1 == r2) goto L15
            goto L4f
        L15:
            int r1 = r5.hashCode()
            r2 = -1
            switch(r1) {
                case 54118329: goto L35;
                case 54395376: goto L2a;
                case 54395377: goto L1f;
                default: goto L1d;
            }
        L1d:
            r0 = r2
            goto L3e
        L1f:
            java.lang.String r0 = "99991"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L28
            goto L1d
        L28:
            r0 = 2
            goto L3e
        L2a:
            java.lang.String r0 = "99990"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L33
            goto L1d
        L33:
            r0 = r3
            goto L3e
        L35:
            java.lang.String r1 = "90000"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L3e
            goto L1d
        L3e:
            switch(r0) {
                case 0: goto L48;
                case 1: goto L45;
                case 2: goto L42;
                default: goto L41;
            }
        L41:
            goto L4f
        L42:
            java.lang.String r5 = "0.00"
            return r5
        L45:
            java.lang.String r5 = "Used"
            return r5
        L48:
            r5 = 0
            return r5
        L4a:
            java.lang.String r4 = "$"
            goto L4f
        L4d:
            java.lang.String r4 = "£"
        L4f:
            java.lang.String r5 = r5.substring(r3)
            int r5 = java.lang.Integer.parseInt(r5)
            int r0 = r5 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r5 % 100
            r1 = 10
            if (r5 >= r1) goto L75
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "0"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            goto L79
        L75:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L79:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Pg.w.e(java.lang.String):java.lang.String");
    }

    private int a(Gg.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f25405a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iL = aVar.l();
        int iK = iArr[1];
        int i10 = 0;
        for (int i11 = 0; i11 < 5 && iK < iL; i11++) {
            int iJ = y.j(aVar, iArr2, iK, y.f25414h);
            sb2.append((char) ((iJ % 10) + 48));
            for (int i12 : iArr2) {
                iK += i12;
            }
            if (iJ >= 10) {
                i10 |= 1 << (4 - i11);
            }
            if (i11 != 4) {
                iK = aVar.k(aVar.j(iK));
            }
        }
        if (sb2.length() != 5) {
            throw NotFoundException.a();
        }
        if (d(sb2.toString()) == c(i10)) {
            return iK;
        }
        throw NotFoundException.a();
    }

    com.google.zxing.m b(int i10, Gg.a aVar, int[] iArr) throws NotFoundException {
        StringBuilder sb2 = this.f25406b;
        sb2.setLength(0);
        int iA = a(aVar, iArr, sb2);
        String string = sb2.toString();
        Map<com.google.zxing.n, Object> mapF = f(string);
        float f10 = i10;
        com.google.zxing.m mVar = new com.google.zxing.m(string, null, new com.google.zxing.o[]{new com.google.zxing.o((iArr[0] + iArr[1]) / 2.0f, f10), new com.google.zxing.o(iA, f10)}, com.google.zxing.a.UPC_EAN_EXTENSION);
        if (mapF != null) {
            mVar.g(mapF);
        }
        return mVar;
    }

    w() {
    }

    private static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int iCharAt = 0;
        for (int i10 = length - 2; i10 >= 0; i10 -= 2) {
            iCharAt += charSequence.charAt(i10) - '0';
        }
        int iCharAt2 = iCharAt * 3;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            iCharAt2 += charSequence.charAt(i11) - '0';
        }
        return (iCharAt2 * 3) % 10;
    }

    private static Map<com.google.zxing.n, Object> f(String str) {
        String strE;
        if (str.length() != 5 || (strE = e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(com.google.zxing.n.class);
        enumMap.put((EnumMap) com.google.zxing.n.SUGGESTED_PRICE, (com.google.zxing.n) strE);
        return enumMap;
    }
}
