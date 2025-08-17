package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Pn0 {
    private static void d(byte[] bArr, long j10, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i10 + i11] = (byte) (255 & j10);
            j10 >>= 8;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        long jB = b(bArr, 0, 0);
        long jB2 = b(bArr, 3, 2) & 67108611;
        long jB3 = b(bArr, 6, 4) & 67092735;
        long jB4 = b(bArr, 9, 6) & 66076671;
        long jB5 = b(bArr, 12, 8) & 1048575;
        int i10 = 17;
        byte[] bArr3 = new byte[17];
        long j10 = 0;
        int i11 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        while (true) {
            int length = bArr2.length;
            if (i11 >= length) {
                long j15 = j10 + (j11 >> 26);
                long j16 = j15 & 67108863;
                long j17 = j12 + (j15 >> 26);
                long j18 = j17 & 67108863;
                long j19 = j13 + (j17 >> 26);
                long j20 = j19 & 67108863;
                long j21 = j14 + ((j19 >> 26) * 5);
                long j22 = j21 & 67108863;
                long j23 = j22 + 5;
                long j24 = (j11 & 67108863) + (j21 >> 26);
                long j25 = j24 + (j23 >> 26);
                long j26 = (j25 >> 26) + j16;
                long j27 = j18 + (j26 >> 26);
                long j28 = (j20 + (j27 >> 26)) - 67108864;
                long j29 = j28 >> 63;
                long j30 = ~j29;
                long j31 = (j24 & j29) | (j25 & 67108863 & j30);
                long j32 = (j16 & j29) | (j26 & 67108863 & j30);
                long j33 = (j18 & j29) | (j27 & 67108863 & j30);
                long j34 = (j20 & j29) | (j28 & j30);
                long jC = (((j29 & j22) | (j23 & 67108863 & j30) | (j31 << 26)) & 4294967295L) + c(bArr, 16);
                long jC2 = (((j31 >> 6) | (j32 << 20)) & 4294967295L) + c(bArr, 20);
                long jC3 = (((j32 >> 12) | (j33 << 14)) & 4294967295L) + c(bArr, 24);
                long jC4 = (((j33 >> 18) | (j34 << 8)) & 4294967295L) + c(bArr, 28);
                byte[] bArr4 = new byte[16];
                d(bArr4, jC & 4294967295L, 0);
                long j35 = jC2 + (jC >> 32);
                d(bArr4, j35 & 4294967295L, 4);
                long j36 = jC3 + (j35 >> 32);
                d(bArr4, j36 & 4294967295L, 8);
                d(bArr4, (jC4 + (j36 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i11);
            System.arraycopy(bArr2, i11, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i10, (byte) 0);
            }
            long j37 = jB5 * 5;
            long j38 = jB4 * 5;
            long j39 = jB3 * 5;
            long jB6 = j14 + b(bArr3, 0, 0);
            long jB7 = j11 + b(bArr3, 3, 2);
            long jB8 = j10 + b(bArr3, 6, 4);
            long jB9 = j12 + b(bArr3, 9, 6);
            long jB10 = j13 + (b(bArr3, 12, 8) | (bArr3[16] << 24));
            long j40 = jB7 * jB;
            long j41 = jB7 * jB2;
            long j42 = jB7 * jB3;
            long j43 = jB9 * jB;
            long j44 = jB7 * jB4;
            long j45 = jB10 * jB;
            long j46 = (jB6 * jB) + (jB7 * j37) + (jB8 * j38) + (jB9 * j39) + (jB2 * 5 * jB10);
            long j47 = (jB6 * jB2) + j40 + (jB8 * j37) + (jB9 * j38) + (j39 * jB10) + (j46 >> 26);
            long j48 = (jB6 * jB3) + j41 + (jB8 * jB) + (jB9 * j37) + (j38 * jB10) + (j47 >> 26);
            long j49 = (jB6 * jB4) + j42 + (jB8 * jB2) + j43 + (jB10 * j37) + (j48 >> 26);
            long j50 = (jB6 * jB5) + j44 + (jB8 * jB3) + (jB9 * jB2) + j45 + (j49 >> 26);
            long j51 = (j46 & 67108863) + ((j50 >> 26) * 5);
            j11 = (j47 & 67108863) + (j51 >> 26);
            i11 += 16;
            j10 = j48 & 67108863;
            j12 = j49 & 67108863;
            j13 = j50 & 67108863;
            i10 = 17;
            j14 = j51 & 67108863;
        }
    }

    private static long c(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return (((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16)) & 4294967295L;
    }

    private static long b(byte[] bArr, int i10, int i11) {
        return (c(bArr, i10) >> i11) & 67108863;
    }
}
