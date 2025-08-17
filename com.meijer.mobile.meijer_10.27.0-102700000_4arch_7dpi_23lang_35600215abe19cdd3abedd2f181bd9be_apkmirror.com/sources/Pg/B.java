package Pg;

import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes7.dex */
public final class B extends z {
    @Override // Pg.s
    protected Collection<com.google.zxing.a> g() {
        return Collections.singleton(com.google.zxing.a.UPC_E);
    }

    @Override // Pg.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length != 7) {
            if (length == 8) {
                try {
                    if (!y.i(A.s(str))) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (FormatException unused) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got " + length);
            }
        } else {
            try {
                str = str + y.r(A.s(str));
            } catch (FormatException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        s.c(str);
        int iDigit = Character.digit(str.charAt(0), 10);
        if (iDigit != 0 && iDigit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i10 = A.f25339k[iDigit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int iB = s.b(zArr, 0, y.f25410d, true);
        for (int i11 = 1; i11 <= 6; i11++) {
            int iDigit2 = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                iDigit2 += 10;
            }
            iB += s.b(zArr, iB, y.f25414h[iDigit2], false);
        }
        s.b(zArr, iB, y.f25412f, false);
        return zArr;
    }
}
