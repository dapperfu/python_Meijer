package Pg;

import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes7.dex */
public final class l extends z {
    @Override // Pg.s
    protected Collection<com.google.zxing.a> g() {
        return Collections.singleton(com.google.zxing.a.EAN_8);
    }

    @Override // Pg.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length != 7) {
            if (length == 8) {
                try {
                    if (!y.i(str)) {
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
                str = str + y.r(str);
            } catch (FormatException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        s.c(str);
        boolean[] zArr = new boolean[67];
        int iB = s.b(zArr, 0, y.f25410d, true);
        for (int i10 = 0; i10 <= 3; i10++) {
            iB += s.b(zArr, iB, y.f25413g[Character.digit(str.charAt(i10), 10)], false);
        }
        int iB2 = iB + s.b(zArr, iB, y.f25411e, false);
        for (int i11 = 4; i11 <= 7; i11++) {
            iB2 += s.b(zArr, iB2, y.f25413g[Character.digit(str.charAt(i11), 10)], true);
        }
        s.b(zArr, iB2, y.f25410d, true);
        return zArr;
    }
}
