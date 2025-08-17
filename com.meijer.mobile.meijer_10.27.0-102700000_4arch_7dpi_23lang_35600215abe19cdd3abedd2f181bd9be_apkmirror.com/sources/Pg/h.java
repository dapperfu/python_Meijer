package Pg;

import java.util.Collection;
import java.util.Collections;

/* loaded from: classes7.dex */
public class h extends s {
    private static int i(boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < 9; i12++) {
            boolean z10 = true;
            int i13 = i10 + i12;
            if (((1 << (8 - i12)) & i11) == 0) {
                z10 = false;
            }
            zArr[i13] = z10;
        }
        return 9;
    }

    @Override // Pg.s
    protected Collection<com.google.zxing.a> g() {
        return Collections.singleton(com.google.zxing.a.CODE_93);
    }

    private static int j(String str, int i10) {
        int iIndexOf = 0;
        int i11 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i11;
            i11++;
            if (i11 > i10) {
                i11 = 1;
            }
        }
        return iIndexOf % 47;
    }

    static String k(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length * 2);
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == 0) {
                sb2.append("bU");
            } else if (cCharAt <= 26) {
                sb2.append('a');
                sb2.append((char) (cCharAt + '@'));
            } else if (cCharAt <= 31) {
                sb2.append('b');
                sb2.append((char) (cCharAt + '&'));
            } else if (cCharAt != ' ' && cCharAt != '$' && cCharAt != '%' && cCharAt != '+') {
                if (cCharAt <= ',') {
                    sb2.append('c');
                    sb2.append((char) (cCharAt + ' '));
                } else if (cCharAt <= '9') {
                    sb2.append(cCharAt);
                } else if (cCharAt == ':') {
                    sb2.append("cZ");
                } else if (cCharAt <= '?') {
                    sb2.append('b');
                    sb2.append((char) (cCharAt + 11));
                } else if (cCharAt == '@') {
                    sb2.append("bV");
                } else if (cCharAt <= 'Z') {
                    sb2.append(cCharAt);
                } else if (cCharAt <= '_') {
                    sb2.append('b');
                    sb2.append((char) (cCharAt - 16));
                } else if (cCharAt == '`') {
                    sb2.append("bW");
                } else if (cCharAt <= 'z') {
                    sb2.append('d');
                    sb2.append((char) (cCharAt - ' '));
                } else if (cCharAt <= 127) {
                    sb2.append('b');
                    sb2.append((char) (cCharAt - '+'));
                } else {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + cCharAt + "'");
                }
            } else {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    @Override // Pg.s
    public boolean[] d(String str) {
        String strK = k(str);
        int length = strK.length();
        if (length <= 80) {
            boolean[] zArr = new boolean[((strK.length() + 4) * 9) + 1];
            int i10 = i(zArr, 0, g.f25379e);
            for (int i11 = 0; i11 < length; i11++) {
                i10 += i(zArr, i10, g.f25378d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(strK.charAt(i11))]);
            }
            int iJ = j(strK, 20);
            int[] iArr = g.f25378d;
            int i12 = i10 + i(zArr, i10, iArr[iJ]);
            int i13 = i12 + i(zArr, i12, iArr[j(strK + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iJ), 15)]);
            zArr[i13 + i(zArr, i13, g.f25379e)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got " + length);
    }
}
