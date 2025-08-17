package Pg;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes7.dex */
public final class g extends r {

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f25377c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d, reason: collision with root package name */
    static final int[] f25378d;

    /* renamed from: e, reason: collision with root package name */
    static final int f25379e;

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f25380a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    private final int[] f25381b = new int[6];

    private static char l(int i10) throws NotFoundException {
        int i11 = 0;
        while (true) {
            int[] iArr = f25378d;
            if (i11 >= iArr.length) {
                throw NotFoundException.a();
            }
            if (iArr[i11] == i10) {
                return f25377c[i11];
            }
            i11++;
        }
    }

    private static int m(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int iRound = Math.round((iArr[i13] * 9.0f) / i10);
            if (iRound < 1 || iRound > 4) {
                return -1;
            }
            if ((i13 & 1) == 0) {
                for (int i14 = 0; i14 < iRound; i14++) {
                    i12 = (i12 << 1) | 1;
                }
            } else {
                i12 <<= iRound;
            }
        }
        return i12;
    }

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, HttpResponseStatus.ERROR_NOT_FOUND, HttpResponseStatus.ERROR_PAYMENT_REQUIRED, 394, 360, 356, 354, 308, 282, 344, 332, 326, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 278, 436, 434, 428, HttpResponseStatus.ERROR_UNPROCESSABLE_ENTITY, HttpResponseStatus.ERROR_NOT_ACCEPTABLE, HttpResponseStatus.ERROR_GONE, 364, 358, 310, 314, HttpResponseStatus.REDIRECTION_FOUND, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f25378d = iArr;
        f25379e = iArr[47];
    }

    private static void i(CharSequence charSequence, int i10, int i11) throws ChecksumException {
        int iIndexOf = 0;
        int i12 = 1;
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i13)) * i12;
            i12++;
            if (i12 > i11) {
                i12 = 1;
            }
        }
        if (charSequence.charAt(i10) != f25377c[iIndexOf % 47]) {
            throw ChecksumException.a();
        }
    }

    private static void h(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        i(charSequence, length - 2, 20);
        i(charSequence, length - 1, 15);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String j(java.lang.CharSequence r9) throws com.google.zxing.FormatException {
        /*
            int r0 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r0) goto Lb3
            char r4 = r9.charAt(r3)
            r5 = 97
            if (r4 < r5) goto Lac
            r5 = 100
            if (r4 > r5) goto Lac
            int r5 = r0 + (-1)
            if (r3 >= r5) goto La7
            int r3 = r3 + 1
            char r5 = r9.charAt(r3)
            r6 = 79
            r7 = 90
            r8 = 65
            switch(r4) {
                case 97: goto L97;
                case 98: goto L4e;
                case 99: goto L3d;
                case 100: goto L2f;
                default: goto L2c;
            }
        L2c:
            r4 = r2
            goto L9e
        L2f:
            if (r5 < r8) goto L38
            if (r5 > r7) goto L38
            int r5 = r5 + 32
        L35:
            char r4 = (char) r5
            goto L9e
        L38:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.a()
            throw r9
        L3d:
            if (r5 < r8) goto L44
            if (r5 > r6) goto L44
            int r5 = r5 + (-32)
            goto L35
        L44:
            if (r5 != r7) goto L49
            r4 = 58
            goto L9e
        L49:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.a()
            throw r9
        L4e:
            if (r5 < r8) goto L57
            r4 = 69
            if (r5 > r4) goto L57
            int r5 = r5 + (-38)
            goto L35
        L57:
            r4 = 70
            if (r5 < r4) goto L62
            r4 = 74
            if (r5 > r4) goto L62
            int r5 = r5 + (-11)
            goto L35
        L62:
            r4 = 75
            if (r5 < r4) goto L6b
            if (r5 > r6) goto L6b
            int r5 = r5 + 16
            goto L35
        L6b:
            r4 = 80
            if (r5 < r4) goto L76
            r4 = 84
            if (r5 > r4) goto L76
            int r5 = r5 + 43
            goto L35
        L76:
            r4 = 85
            if (r5 != r4) goto L7b
            goto L2c
        L7b:
            r4 = 86
            if (r5 != r4) goto L82
            r4 = 64
            goto L9e
        L82:
            r4 = 87
            if (r5 != r4) goto L89
            r4 = 96
            goto L9e
        L89:
            r4 = 88
            if (r5 < r4) goto L92
            if (r5 > r7) goto L92
            r4 = 127(0x7f, float:1.78E-43)
            goto L9e
        L92:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.a()
            throw r9
        L97:
            if (r5 < r8) goto La2
            if (r5 > r7) goto La2
            int r5 = r5 + (-64)
            goto L35
        L9e:
            r1.append(r4)
            goto Laf
        La2:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.a()
            throw r9
        La7:
            com.google.zxing.FormatException r9 = com.google.zxing.FormatException.a()
            throw r9
        Lac:
            r1.append(r4)
        Laf:
            int r3 = r3 + 1
            goto Lb
        Lb3:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Pg.g.j(java.lang.CharSequence):java.lang.String");
    }

    private int[] k(Gg.a aVar) throws NotFoundException {
        int iL = aVar.l();
        int iJ = aVar.j(0);
        Arrays.fill(this.f25381b, 0);
        int[] iArr = this.f25381b;
        int length = iArr.length;
        boolean z10 = false;
        int i10 = 0;
        int i11 = iJ;
        while (iJ < iL) {
            if (aVar.g(iJ) != z10) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 == length - 1) {
                    if (m(iArr) == f25379e) {
                        return new int[]{i11, iJ};
                    }
                    i11 += iArr[0] + iArr[1];
                    int i12 = i10 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i12);
                    iArr[i12] = 0;
                    iArr[i10] = 0;
                    i10--;
                } else {
                    i10++;
                }
                iArr[i10] = 1;
                z10 = !z10;
            }
            iJ++;
        }
        throw NotFoundException.a();
    }

    @Override // Pg.r
    public com.google.zxing.m c(int i10, Gg.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int iJ = aVar.j(k(aVar)[1]);
        int iL = aVar.l();
        int[] iArr = this.f25381b;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f25380a;
        sb2.setLength(0);
        while (true) {
            r.f(aVar, iJ, iArr);
            int iM = m(iArr);
            if (iM >= 0) {
                char cL = l(iM);
                sb2.append(cL);
                int i11 = iJ;
                for (int i12 : iArr) {
                    i11 += i12;
                }
                int iJ2 = aVar.j(i11);
                if (cL == '*') {
                    sb2.deleteCharAt(sb2.length() - 1);
                    int i13 = 0;
                    for (int i14 : iArr) {
                        i13 += i14;
                    }
                    if (iJ2 != iL && aVar.g(iJ2)) {
                        if (sb2.length() >= 2) {
                            h(sb2);
                            sb2.setLength(sb2.length() - 2);
                            float f10 = i10;
                            com.google.zxing.m mVar = new com.google.zxing.m(j(sb2), null, new com.google.zxing.o[]{new com.google.zxing.o((r14[1] + r14[0]) / 2.0f, f10), new com.google.zxing.o(iJ + (i13 / 2.0f), f10)}, com.google.zxing.a.CODE_93);
                            mVar.h(com.google.zxing.n.SYMBOLOGY_IDENTIFIER, "]G0");
                            return mVar;
                        }
                        throw NotFoundException.a();
                    }
                    throw NotFoundException.a();
                }
                iJ = iJ2;
            } else {
                throw NotFoundException.a();
            }
        }
    }
}
