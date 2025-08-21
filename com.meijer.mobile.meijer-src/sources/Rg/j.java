package Rg;

import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes8.dex */
public final class j extends z {
    @Override // Rg.s
    protected Collection<com.google.zxing.a> g() {
        return Collections.singleton(com.google.zxing.a.EAN_13);
    }

    @Override // Rg.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length != 12) {
            if (length == 13) {
                try {
                    if (!y.i(str)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (FormatException unused) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got " + length);
            }
        } else {
            try {
                str = str + y.r(str);
            } catch (FormatException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        s.c(str);
        int i10 = i.f32596j[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iB = s.b(zArr, 0, y.f32624d, true);
        for (int i11 = 1; i11 <= 6; i11++) {
            int iDigit = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                iDigit += 10;
            }
            iB += s.b(zArr, iB, y.f32628h[iDigit], false);
        }
        int iB2 = iB + s.b(zArr, iB, y.f32625e, false);
        for (int i12 = 7; i12 <= 12; i12++) {
            iB2 += s.b(zArr, iB2, y.f32627g[Character.digit(str.charAt(i12), 10)], true);
        }
        s.b(zArr, iB2, y.f32624d, true);
        return zArr;
    }
}
