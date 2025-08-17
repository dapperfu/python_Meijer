package Pg;

import java.util.Collection;
import java.util.Collections;

/* loaded from: classes7.dex */
public final class f extends s {
    private static void i(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) != 0) {
                i12 = 2;
            }
            iArr[i11] = i12;
        }
    }

    @Override // Pg.s
    protected Collection<com.google.zxing.a> g() {
        return Collections.singleton(com.google.zxing.a.CODE_39);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String j(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pg.f.j(java.lang.String):java.lang.String");
    }

    @Override // Pg.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length <= 80) {
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i10)) < 0) {
                    str = j(str);
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i10++;
                }
            }
            int[] iArr = new int[9];
            boolean[] zArr = new boolean[(length * 13) + 25];
            i(148, iArr);
            int iB = s.b(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int iB2 = iB + s.b(zArr, iB, iArr2, false);
            for (int i11 = 0; i11 < length; i11++) {
                i(e.f25372e["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i11))], iArr);
                int iB3 = iB2 + s.b(zArr, iB2, iArr, true);
                iB2 = iB3 + s.b(zArr, iB3, iArr2, false);
            }
            i(148, iArr);
            s.b(zArr, iB2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
    }
}
