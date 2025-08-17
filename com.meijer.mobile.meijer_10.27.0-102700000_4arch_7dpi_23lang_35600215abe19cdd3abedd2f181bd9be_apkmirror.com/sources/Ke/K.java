package Ke;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class K {
    private static void b(byte[] bArr, byte[] bArr2, int i10) {
        int iMin = Math.min(16, bArr2.length - i10);
        System.arraycopy(bArr2, i10, bArr, 0, iMin);
        bArr[iMin] = 1;
        if (iMin != 16) {
            Arrays.fill(bArr, iMin + 1, bArr.length, (byte) 0);
        }
    }

    private static void e(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j10);
            i11++;
            j10 >>= 8;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jC = c(bArr, 0, 0) & 67108863;
        int i10 = 3;
        int i11 = 2;
        long jC2 = c(bArr, 3, 2) & 67108611;
        long jC3 = c(bArr, 6, 4) & 67092735;
        long jC4 = c(bArr, 9, 6) & 66076671;
        long jC5 = c(bArr, 12, 8) & 1048575;
        long j10 = jC2 * 5;
        long j11 = jC3 * 5;
        long j12 = jC4 * 5;
        long j13 = jC5 * 5;
        byte[] bArr3 = new byte[17];
        long j14 = 0;
        int i12 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        while (i12 < bArr2.length) {
            b(bArr3, bArr2, i12);
            long jC6 = j18 + c(bArr3, 0, 0);
            long jC7 = j14 + c(bArr3, i10, i11);
            long jC8 = j15 + c(bArr3, 6, 4);
            long jC9 = j16 + c(bArr3, 9, 6);
            long j19 = jC2;
            long jC10 = j17 + (c(bArr3, 12, 8) | (bArr3[16] << 24));
            long j20 = (jC6 * jC) + (jC7 * j13) + (jC8 * j12) + (jC9 * j11) + (jC10 * j10);
            long j21 = (jC6 * j19) + (jC7 * jC) + (jC8 * j13) + (jC9 * j12) + (jC10 * j11);
            long j22 = (jC6 * jC3) + (jC7 * j19) + (jC8 * jC) + (jC9 * j13) + (jC10 * j12);
            long j23 = (jC6 * jC4) + (jC7 * jC3) + (jC8 * j19) + (jC9 * jC) + (jC10 * j13);
            long j24 = (jC6 * jC5) + (jC7 * jC4) + (jC8 * jC3) + (jC9 * j19) + (jC10 * jC);
            long j25 = j21 + (j20 >> 26);
            long j26 = j22 + (j25 >> 26);
            j15 = j26 & 67108863;
            long j27 = j23 + (j26 >> 26);
            j16 = j27 & 67108863;
            long j28 = j24 + (j27 >> 26);
            j17 = j28 & 67108863;
            long j29 = (j20 & 67108863) + ((j28 >> 26) * 5);
            j18 = j29 & 67108863;
            j14 = (j25 & 67108863) + (j29 >> 26);
            i12 += 16;
            jC2 = j19;
            i10 = 3;
            i11 = 2;
        }
        long j30 = j15 + (j14 >> 26);
        long j31 = j30 & 67108863;
        long j32 = j16 + (j30 >> 26);
        long j33 = j32 & 67108863;
        long j34 = j17 + (j32 >> 26);
        long j35 = j34 & 67108863;
        long j36 = j18 + ((j34 >> 26) * 5);
        long j37 = j36 & 67108863;
        long j38 = (j14 & 67108863) + (j36 >> 26);
        long j39 = j37 + 5;
        long j40 = j39 & 67108863;
        long j41 = (j39 >> 26) + j38;
        long j42 = j31 + (j41 >> 26);
        long j43 = j33 + (j42 >> 26);
        long j44 = j43 & 67108863;
        long j45 = (j35 + (j43 >> 26)) - 67108864;
        long j46 = j45 >> 63;
        long j47 = j37 & j46;
        long j48 = j38 & j46;
        long j49 = j31 & j46;
        long j50 = j33 & j46;
        long j51 = j35 & j46;
        long j52 = ~j46;
        long j53 = (j41 & 67108863 & j52) | j48;
        long j54 = (j42 & 67108863 & j52) | j49;
        long j55 = (j44 & j52) | j50;
        long j56 = j51 | (j45 & j52);
        long j57 = (j47 | (j40 & j52) | (j53 << 26)) & 4294967295L;
        long j58 = ((j53 >> 6) | (j54 << 20)) & 4294967295L;
        long j59 = ((j54 >> 12) | (j55 << 14)) & 4294967295L;
        long j60 = ((j55 >> 18) | (j56 << 8)) & 4294967295L;
        long jD = j57 + d(bArr, 16);
        long j61 = jD & 4294967295L;
        long jD2 = j58 + d(bArr, 20) + (jD >> 32);
        long j62 = jD2 & 4294967295L;
        long jD3 = j59 + d(bArr, 24) + (jD2 >> 32);
        long j63 = jD3 & 4294967295L;
        long jD4 = (j60 + d(bArr, 28) + (jD3 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        e(bArr4, j61, 0);
        e(bArr4, j62, 4);
        e(bArr4, j63, 8);
        e(bArr4, jD4, 12);
        return bArr4;
    }

    private static long d(byte[] bArr, int i10) {
        return (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16)) & 4294967295L;
    }

    private static long c(byte[] bArr, int i10, int i11) {
        return (d(bArr, i10) >> i11) & 67108863;
    }

    public static void f(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (Ve.f.b(a(bArr, bArr2), bArr3)) {
        } else {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
