package Rg;

import com.google.android.gms.common.api.a;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes8.dex */
public final class e extends r {

    /* renamed from: e, reason: collision with root package name */
    static final int[] f32586e = {52, HttpResponseStatus.SUCCESS_UNKNOWN, 97, 352, 49, HttpResponseStatus.REDIRECTION_NOT_MODIFIED, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, HttpResponseStatus.ERROR_BAD_REQUEST, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32587a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32588b;

    /* renamed from: c, reason: collision with root package name */
    private final StringBuilder f32589c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f32590d;

    public e() {
        this(false);
    }

    private static char j(int i10) throws NotFoundException {
        int i11 = 0;
        while (true) {
            int[] iArr = f32586e;
            if (i11 >= iArr.length) {
                if (i10 == 148) {
                    return '*';
                }
                throw NotFoundException.a();
            }
            if (iArr[i11] == i10) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i11);
            }
            i11++;
        }
    }

    private static int k(int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            int i11 = a.e.API_PRIORITY_OTHER;
            for (int i12 : iArr) {
                if (i12 < i11 && i12 > i10) {
                    i11 = i12;
                }
            }
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                int i17 = iArr[i16];
                if (i17 > i11) {
                    i14 |= 1 << ((length - 1) - i16);
                    i13++;
                    i15 += i17;
                }
            }
            if (i13 == 3) {
                for (int i18 = 0; i18 < length && i13 > 0; i18++) {
                    int i19 = iArr[i18];
                    if (i19 > i11) {
                        i13--;
                        if (i19 * 2 >= i15) {
                            return -1;
                        }
                    }
                }
                return i14;
            }
            if (i13 <= 3) {
                return -1;
            }
            i10 = i11;
        }
    }

    public e(boolean z10) {
        this(z10, false);
    }

    @Override // Rg.r
    public com.google.zxing.m c(int i10, Ig.a aVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] iArr = this.f32590d;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f32589c;
        sb2.setLength(0);
        int iJ = aVar.j(i(aVar, iArr)[1]);
        int iL = aVar.l();
        while (true) {
            r.f(aVar, iJ, iArr);
            int iK = k(iArr);
            if (iK < 0) {
                throw NotFoundException.a();
            }
            char cJ = j(iK);
            sb2.append(cJ);
            int i11 = iJ;
            for (int i12 : iArr) {
                i11 += i12;
            }
            int iJ2 = aVar.j(i11);
            if (cJ == '*') {
                sb2.setLength(sb2.length() - 1);
                int i13 = 0;
                for (int i14 : iArr) {
                    i13 += i14;
                }
                int i15 = (iJ2 - iJ) - i13;
                if (iJ2 != iL && i15 * 2 < i13) {
                    throw NotFoundException.a();
                }
                if (this.f32587a) {
                    int length = sb2.length() - 1;
                    int iIndexOf = 0;
                    for (int i16 = 0; i16 < length; i16++) {
                        iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f32589c.charAt(i16));
                    }
                    if (sb2.charAt(length) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(iIndexOf % 43)) {
                        throw ChecksumException.a();
                    }
                    sb2.setLength(length);
                }
                if (sb2.length() == 0) {
                    throw NotFoundException.a();
                }
                float f10 = i10;
                com.google.zxing.m mVar = new com.google.zxing.m(this.f32588b ? h(sb2) : sb2.toString(), null, new com.google.zxing.o[]{new com.google.zxing.o((r2[1] + r2[0]) / 2.0f, f10), new com.google.zxing.o(iJ + (i13 / 2.0f), f10)}, com.google.zxing.a.CODE_39);
                mVar.h(com.google.zxing.n.SYMBOLOGY_IDENTIFIER, "]A0");
                return mVar;
            }
            iJ = iJ2;
        }
    }

    public e(boolean z10, boolean z11) {
        this.f32587a = z10;
        this.f32588b = z11;
        this.f32589c = new StringBuilder(20);
        this.f32590d = new int[9];
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String h(java.lang.CharSequence r12) throws com.google.zxing.FormatException {
        /*
            int r0 = r12.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r0) goto Lbf
            char r4 = r12.charAt(r3)
            r5 = 47
            r6 = 37
            r7 = 36
            r8 = 43
            if (r4 == r8) goto L27
            if (r4 == r7) goto L27
            if (r4 == r6) goto L27
            if (r4 != r5) goto L22
            goto L27
        L22:
            r1.append(r4)
            goto Lb6
        L27:
            int r3 = r3 + 1
            char r9 = r12.charAt(r3)
            r10 = 90
            r11 = 65
            if (r4 == r7) goto Lac
            r7 = 79
            if (r4 == r6) goto L5e
            if (r4 == r8) goto L52
            if (r4 == r5) goto L3e
        L3b:
            r4 = r2
            goto Lb3
        L3e:
            if (r9 < r11) goto L47
            if (r9 > r7) goto L47
            int r9 = r9 + (-32)
        L44:
            char r4 = (char) r9
            goto Lb3
        L47:
            if (r9 != r10) goto L4d
            r4 = 58
            goto Lb3
        L4d:
            com.google.zxing.FormatException r12 = com.google.zxing.FormatException.a()
            throw r12
        L52:
            if (r9 < r11) goto L59
            if (r9 > r10) goto L59
            int r9 = r9 + 32
            goto L44
        L59:
            com.google.zxing.FormatException r12 = com.google.zxing.FormatException.a()
            throw r12
        L5e:
            if (r9 < r11) goto L67
            r4 = 69
            if (r9 > r4) goto L67
            int r9 = r9 + (-38)
            goto L44
        L67:
            r4 = 70
            if (r9 < r4) goto L72
            r4 = 74
            if (r9 > r4) goto L72
            int r9 = r9 + (-11)
            goto L44
        L72:
            r4 = 75
            if (r9 < r4) goto L7b
            if (r9 > r7) goto L7b
            int r9 = r9 + 16
            goto L44
        L7b:
            r4 = 80
            if (r9 < r4) goto L86
            r4 = 84
            if (r9 > r4) goto L86
            int r9 = r9 + 43
            goto L44
        L86:
            r4 = 85
            if (r9 != r4) goto L8b
            goto L3b
        L8b:
            r4 = 86
            if (r9 != r4) goto L92
            r4 = 64
            goto Lb3
        L92:
            r4 = 87
            if (r9 != r4) goto L99
            r4 = 96
            goto Lb3
        L99:
            r4 = 88
            if (r9 == r4) goto La9
            r4 = 89
            if (r9 == r4) goto La9
            if (r9 != r10) goto La4
            goto La9
        La4:
            com.google.zxing.FormatException r12 = com.google.zxing.FormatException.a()
            throw r12
        La9:
            r4 = 127(0x7f, float:1.78E-43)
            goto Lb3
        Lac:
            if (r9 < r11) goto Lba
            if (r9 > r10) goto Lba
            int r9 = r9 + (-64)
            goto L44
        Lb3:
            r1.append(r4)
        Lb6:
            int r3 = r3 + 1
            goto Lb
        Lba:
            com.google.zxing.FormatException r12 = com.google.zxing.FormatException.a()
            throw r12
        Lbf:
            java.lang.String r12 = r1.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Rg.e.h(java.lang.CharSequence):java.lang.String");
    }

    private static int[] i(Ig.a aVar, int[] iArr) throws NotFoundException {
        int iL = aVar.l();
        int iJ = aVar.j(0);
        int length = iArr.length;
        boolean z10 = false;
        int i10 = 0;
        int i11 = iJ;
        while (iJ < iL) {
            if (aVar.g(iJ) != z10) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 == length - 1) {
                    if (k(iArr) == 148 && aVar.n(Math.max(0, i11 - ((iJ - i11) / 2)), i11, false)) {
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
}
