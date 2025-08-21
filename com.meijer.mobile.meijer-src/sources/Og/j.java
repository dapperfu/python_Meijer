package Og;

import java.util.Arrays;

/* loaded from: classes8.dex */
public final class j {
    private static int c(float[] fArr, int[] iArr, int i10, byte[] bArr) {
        for (int i11 = 0; i11 < 6; i11++) {
            int iCeil = (int) Math.ceil(fArr[i11]);
            iArr[i11] = iCeil;
            if (i10 > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i10 = iCeil;
            }
            if (i10 == iCeil) {
                bArr[i11] = (byte) (bArr[i11] + 1);
            }
        }
        return i10;
    }

    private static int d(byte[] bArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 += bArr[i11];
        }
        return i10;
    }

    private static boolean l(char c10) {
        return false;
    }

    public static String b(String str, m mVar, com.google.zxing.e eVar, com.google.zxing.e eVar2, boolean z10) {
        c cVar = new c();
        int iE = 0;
        g[] gVarArr = {new a(), cVar, new n(), new o(), new f(), new b()};
        h hVar = new h(str);
        hVar.n(mVar);
        hVar.l(eVar, eVar2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.r((char) 236);
            hVar.m(2);
            hVar.f23733f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            hVar.r((char) 237);
            hVar.m(2);
            hVar.f23733f += 7;
        }
        if (z10) {
            cVar.d(hVar);
            iE = hVar.e();
            hVar.j();
        }
        while (hVar.i()) {
            gVarArr[iE].a(hVar);
            if (hVar.e() >= 0) {
                iE = hVar.e();
                hVar.j();
            }
        }
        int iA = hVar.a();
        hVar.p();
        int iA2 = hVar.g().a();
        if (iA < iA2 && iE != 0 && iE != 5 && iE != 4) {
            hVar.r((char) 254);
        }
        StringBuilder sbB = hVar.b();
        if (sbB.length() < iA2) {
            sbB.append((char) 129);
        }
        while (sbB.length() < iA2) {
            sbB.append(r(sbB.length() + 1));
        }
        return hVar.b().toString();
    }

    static boolean f(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    static boolean g(char c10) {
        return c10 >= 128 && c10 <= 255;
    }

    static boolean h(char c10) {
        if (c10 == ' ') {
            return true;
        }
        if (c10 < '0' || c10 > '9') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    static boolean i(char c10) {
        return c10 >= ' ' && c10 <= '^';
    }

    static boolean j(char c10) {
        if (c10 == ' ') {
            return true;
        }
        if (c10 < '0' || c10 > '9') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    private static boolean m(char c10) {
        return c10 == '\r' || c10 == '*' || c10 == '>';
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0208, code lost:
    
        return r18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int o(java.lang.CharSequence r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Og.j.o(java.lang.CharSequence, int, int):int");
    }

    private static char r(int i10) {
        int i11 = (i10 * 149) % 253;
        int i12 = i11 + 130;
        if (i12 > 254) {
            i12 = i11 - 124;
        }
        return (char) i12;
    }

    public static int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = i10;
        while (i11 < length && f(charSequence.charAt(i11))) {
            i11++;
        }
        return i11 - i10;
    }

    static void e(char c10) {
        String hexString = Integer.toHexString(c10);
        throw new IllegalArgumentException("Illegal character: " + c10 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    static boolean k(char c10) {
        if (!m(c10) && c10 != ' ') {
            if (c10 < '0' || c10 > '9') {
                if (c10 < 'A' || c10 > 'Z') {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    static int n(CharSequence charSequence, int i10, int i11) {
        int iO = o(charSequence, i10, i11);
        if (i11 == 3 && iO == 3) {
            int iMin = Math.min(i10 + 3, charSequence.length());
            while (i10 < iMin) {
                if (!k(charSequence.charAt(i10))) {
                    return 0;
                }
                i10++;
            }
        } else if (i11 == 4 && iO == 4) {
            int iMin2 = Math.min(i10 + 4, charSequence.length());
            while (i10 < iMin2) {
                if (!i(charSequence.charAt(i10))) {
                    return 0;
                }
                i10++;
            }
        }
        return iO;
    }

    private static int p(int i10, int i11, int i12, int i13) {
        return Math.min(i10, Math.min(i11, Math.min(i12, i13)));
    }

    private static int q(int i10, int i11, int i12, int i13, int i14) {
        return Math.min(p(i10, i11, i12, i13), i14);
    }
}
