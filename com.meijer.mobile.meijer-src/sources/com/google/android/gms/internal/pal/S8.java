package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class S8 {
    private static void d(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j10);
            i11++;
            j10 >>= 8;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        long jB = b(bArr, 0, 0);
        long jB2 = b(bArr, 3, 2) & 67108611;
        long jB3 = b(bArr, 6, 4) & 67092735;
        long jB4 = b(bArr, 9, 6) & 66076671;
        long jB5 = b(bArr, 12, 8) & 1048575;
        long j10 = jB2 * 5;
        long j11 = jB3 * 5;
        long j12 = jB4 * 5;
        long j13 = jB5 * 5;
        int i10 = 17;
        byte[] bArr3 = new byte[17];
        long j14 = 0;
        int i11 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        while (true) {
            int length = bArr2.length;
            if (i11 >= length) {
                long j19 = j14 + (j15 >> 26);
                long j20 = j19 & 67108863;
                long j21 = j16 + (j19 >> 26);
                long j22 = j21 & 67108863;
                long j23 = j17 + (j21 >> 26);
                long j24 = j23 & 67108863;
                long j25 = j18 + ((j23 >> 26) * 5);
                long j26 = j25 & 67108863;
                long j27 = (j15 & 67108863) + (j25 >> 26);
                long j28 = j26 + 5;
                long j29 = (j28 >> 26) + j27;
                long j30 = j20 + (j29 >> 26);
                long j31 = j22 + (j30 >> 26);
                long j32 = (j24 + (j31 >> 26)) - 67108864;
                long j33 = j32 >> 63;
                long j34 = ~j33;
                long j35 = (j27 & j33) | (j29 & 67108863 & j34);
                long j36 = (j20 & j33) | (j30 & 67108863 & j34);
                long j37 = (j22 & j33) | (j31 & 67108863 & j34);
                long jC = (((j26 & j33) | (j28 & 67108863 & j34) | (j35 << 26)) & 4294967295L) + c(bArr, 16);
                long jC2 = (((j35 >> 6) | (j36 << 20)) & 4294967295L) + c(bArr, 20) + (jC >> 32);
                long jC3 = (((j36 >> 12) | (j37 << 14)) & 4294967295L) + c(bArr, 24) + (jC2 >> 32);
                long jC4 = c(bArr, 28);
                byte[] bArr4 = new byte[16];
                d(bArr4, jC & 4294967295L, 0);
                d(bArr4, jC2 & 4294967295L, 4);
                d(bArr4, jC3 & 4294967295L, 8);
                d(bArr4, ((((j37 >> 18) | (((j33 & j24) | (j32 & j34)) << 8)) & 4294967295L) + jC4 + (jC3 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i11);
            System.arraycopy(bArr2, i11, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i10, (byte) 0);
            }
            long jB6 = j18 + b(bArr3, 0, 0);
            long jB7 = j15 + b(bArr3, 3, 2);
            long jB8 = j14 + b(bArr3, 6, 4);
            long jB9 = j16 + b(bArr3, 9, 6);
            long jB10 = j17 + (b(bArr3, 12, 8) | (bArr3[16] << 24));
            long j38 = (jB6 * jB) + (jB7 * j13) + (jB8 * j12) + (jB9 * j11) + (jB10 * j10);
            long j39 = (jB6 * jB2) + (jB7 * jB) + (jB8 * j13) + (jB9 * j12) + (jB10 * j11) + (j38 >> 26);
            long j40 = (jB6 * jB3) + (jB7 * jB2) + (jB8 * jB) + (jB9 * j13) + (jB10 * j12) + (j39 >> 26);
            long j41 = (jB6 * jB4) + (jB7 * jB3) + (jB8 * jB2) + (jB9 * jB) + (jB10 * j13) + (j40 >> 26);
            long j42 = (jB6 * jB5) + (jB7 * jB4) + (jB8 * jB3) + (jB9 * jB2) + (jB10 * jB) + (j41 >> 26);
            j17 = j42 & 67108863;
            long j43 = (j38 & 67108863) + ((j42 >> 26) * 5);
            j18 = j43 & 67108863;
            j15 = (j39 & 67108863) + (j43 >> 26);
            i11 += 16;
            j16 = j41 & 67108863;
            j14 = j40 & 67108863;
            i10 = 17;
        }
    }

    private static long c(byte[] bArr, int i10) {
        return (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16)) & 4294967295L;
    }

    private static long b(byte[] bArr, int i10, int i11) {
        return (c(bArr, i10) >> i11) & 67108863;
    }
}
