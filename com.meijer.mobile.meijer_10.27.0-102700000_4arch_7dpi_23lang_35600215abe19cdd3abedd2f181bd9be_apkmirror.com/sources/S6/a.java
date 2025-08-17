package S6;

import java.util.Arrays;

/* loaded from: classes4.dex */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f33243a;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f33244b;

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f33245c;

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f33246d;

    static int b(byte[] bArr, byte[] bArr2, int i10) {
        int length = bArr.length;
        int i11 = (length / 3) * 3;
        int i12 = length - 1;
        int i13 = ((i12 / 3) + 1) << 2;
        int i14 = i10;
        int i15 = 0;
        while (i15 < i11) {
            int i16 = i15 + 2;
            int i17 = ((bArr[i15 + 1] & 255) << 8) | ((bArr[i15] & 255) << 16);
            i15 += 3;
            int i18 = i17 | (bArr[i16] & 255);
            byte[] bArr3 = f33244b;
            bArr2[i14] = bArr3[(i18 >>> 18) & 63];
            bArr2[i14 + 1] = bArr3[(i18 >>> 12) & 63];
            int i19 = i14 + 3;
            bArr2[i14 + 2] = bArr3[(i18 >>> 6) & 63];
            i14 += 4;
            bArr2[i19] = bArr3[i18 & 63];
        }
        int i20 = length - i11;
        if (i20 > 0) {
            int i21 = ((bArr[i11] & 255) << 10) | (i20 == 2 ? (bArr[i12] & 255) << 2 : 0);
            int i22 = i10 + i13;
            byte[] bArr4 = f33244b;
            bArr2[i22 - 4] = bArr4[i21 >> 12];
            bArr2[i22 - 3] = bArr4[(i21 >>> 6) & 63];
            bArr2[i22 - 2] = i20 == 2 ? bArr4[i21 & 63] : (byte) 61;
            bArr2[i22 - 1] = 61;
        }
        return i13;
    }

    static int c(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (f33245c[bArr[i10] & 255] < 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f33243a = charArray;
        int[] iArr = new int[256];
        f33245c = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i10 = 0; i10 < length; i10++) {
            f33245c[f33243a[i10]] = i10;
        }
        f33245c[61] = 0;
        f33244b = new byte[f33243a.length];
        int i11 = 0;
        while (true) {
            char[] cArr = f33243a;
            if (i11 >= cArr.length) {
                f33246d = new byte[0];
                return;
            } else {
                f33244b[i11] = (byte) cArr[i11];
                i11++;
            }
        }
    }

    static byte[] a(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = i11 - i10;
        if (i13 == 0) {
            return f33246d;
        }
        int i14 = i11 - 1;
        int i15 = i10;
        while (i15 < i14 && f33245c[bArr[i15] & 255] < 0) {
            i15++;
        }
        while (i14 > 0 && f33245c[bArr[i14] & 255] < 0) {
            i14--;
        }
        int i16 = 0;
        int i17 = bArr[i14] == 61 ? bArr[i14 + (-1)] == 61 ? 2 : 1 : 0;
        int i18 = (i14 - i15) + 1;
        if (i13 > 76) {
            i12 = (bArr[76] == 13 ? i18 / 78 : 0) << 1;
        } else {
            i12 = 0;
        }
        int i19 = (((i18 - i12) * 6) >> 3) - i17;
        byte[] bArr2 = new byte[i19];
        int i20 = (i19 / 3) * 3;
        int i21 = 0;
        int i22 = 0;
        while (i21 < i20) {
            int[] iArr = f33245c;
            int i23 = i15 + 4;
            int i24 = iArr[bArr[i15 + 3]] | (iArr[bArr[i15 + 1]] << 12) | (iArr[bArr[i15]] << 18) | (iArr[bArr[i15 + 2]] << 6);
            bArr2[i21] = (byte) (i24 >> 16);
            int i25 = i21 + 2;
            bArr2[i21 + 1] = (byte) (i24 >> 8);
            i21 += 3;
            bArr2[i25] = (byte) i24;
            if (i12 <= 0 || (i22 = i22 + 1) != 19) {
                i15 = i23;
            } else {
                i15 += 6;
                i22 = 0;
            }
        }
        if (i21 < i19) {
            int i26 = 0;
            while (i15 <= i14 - i17) {
                i16 |= f33245c[bArr[i15]] << (18 - (i26 * 6));
                i26++;
                i15++;
            }
            int i27 = 16;
            while (i21 < i19) {
                bArr2[i21] = (byte) (i16 >> i27);
                i27 -= 8;
                i21++;
            }
        }
        return bArr2;
    }
}
