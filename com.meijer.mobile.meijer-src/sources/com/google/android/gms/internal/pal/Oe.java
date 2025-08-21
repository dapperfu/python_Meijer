package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* loaded from: classes6.dex */
final class Oe {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f83659a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f83660b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f83661c = {67108863, 33554431};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f83662d = {26, 25};

    static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j10 = jArr2[0];
        long j11 = jArr3[1] * j10;
        long j12 = jArr2[1];
        long j13 = jArr3[0];
        jArr[1] = j11 + (j12 * j13);
        long j14 = jArr2[1];
        long j15 = jArr3[1];
        jArr[2] = ((j14 + j14) * j15) + (jArr3[2] * j10) + (jArr2[2] * j13);
        long j16 = jArr3[2];
        long j17 = jArr2[2];
        jArr[3] = (j14 * j16) + (j17 * j15) + (jArr3[3] * j10) + (jArr2[3] * j13);
        long j18 = jArr3[3];
        long j19 = jArr2[3];
        long j20 = (j14 * j18) + (j19 * j15);
        jArr[4] = (j17 * j16) + j20 + j20 + (jArr3[4] * j10) + (jArr2[4] * j13);
        long j21 = jArr3[4];
        long j22 = jArr2[4];
        jArr[5] = (j17 * j18) + (j19 * j16) + (j14 * j21) + (j22 * j15) + (jArr3[5] * j10) + (jArr2[5] * j13);
        long j23 = jArr3[5];
        long j24 = jArr2[5];
        long j25 = (j19 * j18) + (j14 * j23) + (j24 * j15);
        jArr[6] = j25 + j25 + (j17 * j21) + (j22 * j16) + (jArr3[6] * j10) + (jArr2[6] * j13);
        long j26 = jArr3[6];
        long j27 = jArr2[6];
        jArr[7] = (j19 * j21) + (j22 * j18) + (j17 * j23) + (j24 * j16) + (j14 * j26) + (j27 * j15) + (jArr3[7] * j10) + (jArr2[7] * j13);
        long j28 = jArr3[7];
        long j29 = jArr2[7];
        long j30 = (j19 * j23) + (j24 * j18) + (j14 * j28) + (j29 * j15);
        jArr[8] = (j22 * j21) + j30 + j30 + (j17 * j26) + (j27 * j16) + (jArr3[8] * j10) + (jArr2[8] * j13);
        long j31 = jArr3[8];
        long j32 = jArr2[8];
        jArr[9] = (j22 * j23) + (j24 * j21) + (j19 * j26) + (j27 * j18) + (j17 * j28) + (j29 * j16) + (j14 * j31) + (j32 * j15) + (j10 * jArr3[9]) + (jArr2[9] * j13);
        long j33 = jArr3[9];
        long j34 = jArr2[9];
        long j35 = (j24 * j23) + (j19 * j28) + (j29 * j18) + (j14 * j33) + (j15 * j34);
        jArr[10] = j35 + j35 + (j22 * j26) + (j27 * j21) + (j17 * j31) + (j32 * j16);
        jArr[11] = (j24 * j26) + (j27 * j23) + (j22 * j28) + (j29 * j21) + (j19 * j31) + (j32 * j18) + (j17 * j33) + (j16 * j34);
        long j36 = (j24 * j28) + (j29 * j23) + (j19 * j33) + (j18 * j34);
        jArr[12] = (j27 * j26) + j36 + j36 + (j22 * j31) + (j32 * j21);
        jArr[13] = (j27 * j28) + (j29 * j26) + (j24 * j31) + (j32 * j23) + (j22 * j33) + (j21 * j34);
        long j37 = (j29 * j28) + (j24 * j33) + (j23 * j34);
        jArr[14] = j37 + j37 + (j27 * j31) + (j32 * j26);
        jArr[15] = (j29 * j31) + (j32 * j28) + (j27 * j33) + (j26 * j34);
        long j38 = (j29 * j33) + (j28 * j34);
        jArr[16] = (j32 * j31) + j38 + j38;
        jArr[17] = (j32 * j33) + (j31 * j34);
        jArr[18] = (j34 + j34) * j33;
    }

    static void e(long[] jArr) {
        long j10 = jArr[8];
        long j11 = jArr[18];
        long j12 = j10 + (j11 << 4);
        jArr[8] = j12;
        long j13 = j12 + j11 + j11;
        jArr[8] = j13;
        jArr[8] = j13 + j11;
        long j14 = jArr[7];
        long j15 = jArr[17];
        long j16 = j14 + (j15 << 4);
        jArr[7] = j16;
        long j17 = j16 + j15 + j15;
        jArr[7] = j17;
        jArr[7] = j17 + j15;
        long j18 = jArr[6];
        long j19 = jArr[16];
        long j20 = j18 + (j19 << 4);
        jArr[6] = j20;
        long j21 = j20 + j19 + j19;
        jArr[6] = j21;
        jArr[6] = j21 + j19;
        long j22 = jArr[5];
        long j23 = jArr[15];
        long j24 = j22 + (j23 << 4);
        jArr[5] = j24;
        long j25 = j24 + j23 + j23;
        jArr[5] = j25;
        jArr[5] = j25 + j23;
        long j26 = jArr[4];
        long j27 = jArr[14];
        long j28 = j26 + (j27 << 4);
        jArr[4] = j28;
        long j29 = j28 + j27 + j27;
        jArr[4] = j29;
        jArr[4] = j29 + j27;
        long j30 = jArr[3];
        long j31 = jArr[13];
        long j32 = j30 + (j31 << 4);
        jArr[3] = j32;
        long j33 = j32 + j31 + j31;
        jArr[3] = j33;
        jArr[3] = j33 + j31;
        long j34 = jArr[2];
        long j35 = jArr[12];
        long j36 = j34 + (j35 << 4);
        jArr[2] = j36;
        long j37 = j36 + j35 + j35;
        jArr[2] = j37;
        jArr[2] = j37 + j35;
        long j38 = jArr[1];
        long j39 = jArr[11];
        long j40 = j38 + (j39 << 4);
        jArr[1] = j40;
        long j41 = j40 + j39 + j39;
        jArr[1] = j41;
        jArr[1] = j41 + j39;
        long j42 = jArr[0];
        long j43 = jArr[10];
        long j44 = j42 + (j43 << 4);
        jArr[0] = j44;
        long j45 = j44 + j43 + j43;
        jArr[0] = j45;
        jArr[0] = j45 + j43;
    }

    static void f(long[] jArr, long[] jArr2, long j10) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] * j10;
        }
    }

    static void g(long[] jArr, long[] jArr2) {
        long j10 = jArr2[0];
        long j11 = j10 * j10;
        long j12 = jArr2[1];
        long j13 = (j10 + j10) * j12;
        long j14 = jArr2[2];
        long j15 = (j12 * j12) + (j10 * j14);
        long j16 = jArr2[3];
        long j17 = (j12 * j14) + (j10 * j16);
        long j18 = jArr2[4];
        long j19 = (j14 * j14) + (j12 * 4 * j16) + ((j10 + j10) * j18);
        long j20 = jArr2[5];
        long j21 = (j14 * j16) + (j12 * j18) + (j10 * j20);
        long j22 = jArr2[6];
        long j23 = (j16 * j16) + (j14 * j18) + (j10 * j22) + ((j12 + j12) * j20);
        long j24 = jArr2[7];
        long j25 = (j16 * j18) + (j14 * j20) + (j12 * j22) + (j10 * j24);
        long j26 = jArr2[8];
        long j27 = (j12 * j24) + (j16 * j20);
        long j28 = (j14 * j22) + (j10 * j26) + j27 + j27;
        long j29 = (j18 * j18) + j28 + j28;
        long j30 = jArr2[9];
        long j31 = (j18 * j20) + (j16 * j22) + (j14 * j24) + (j12 * j26) + (j10 * j30);
        long j32 = (j16 * j24) + (j12 * j30);
        long j33 = (j20 * j20) + (j18 * j22) + (j14 * j26) + j32 + j32;
        long j34 = (j20 * j22) + (j18 * j24) + (j16 * j26) + (j14 * j30);
        long j35 = (j20 * j24) + (j16 * j30);
        long j36 = (j18 * j26) + j35 + j35;
        long j37 = (j22 * j22) + j36 + j36;
        long j38 = (j22 * j24) + (j20 * j26) + (j18 * j30);
        long j39 = (j24 * j24) + (j22 * j26) + ((j20 + j20) * j30);
        long j40 = (j24 * j26) + (j22 * j30);
        c(new long[]{j11, j13, j15 + j15, j17 + j17, j19, j21 + j21, j23 + j23, j25 + j25, j29, j31 + j31, j33 + j33, j34 + j34, j37, j38 + j38, j39 + j39, j40 + j40, (j26 * j26) + (j24 * 4 * j30), (j26 + j26) * j30, (j30 + j30) * j30}, jArr);
    }

    static void h(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }

    static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        b(jArr4, jArr2, jArr3);
        c(jArr4, jArr);
    }

    static void d(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j10 = jArr[i10];
            long j11 = j10 / 67108864;
            jArr[i10] = j10 - (j11 << 26);
            int i11 = i10 + 1;
            long j12 = jArr[i11] + j11;
            jArr[i11] = j12;
            long j13 = j12 / 33554432;
            jArr[i11] = j12 - (j13 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j13;
        }
        long j14 = jArr[0];
        long j15 = jArr[10];
        long j16 = j14 + (j15 << 4);
        jArr[0] = j16;
        long j17 = j16 + j15 + j15;
        jArr[0] = j17;
        long j18 = j17 + j15;
        jArr[0] = j18;
        jArr[10] = 0;
        long j19 = j18 / 67108864;
        jArr[0] = j18 - (j19 << 26);
        jArr[1] = jArr[1] + j19;
    }

    static byte[] j(long[] jArr) {
        int i10;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i11 = 0;
        while (true) {
            if (i11 >= 2) {
                break;
            }
            int i12 = 0;
            while (i12 < 9) {
                long j10 = jArrCopyOf[i12];
                int i13 = -((int) (((j10 >> 31) & j10) >> f83662d[i12 & 1]));
                jArrCopyOf[i12] = j10 + (i13 << r9);
                i12++;
                jArrCopyOf[i12] = jArrCopyOf[i12] - i13;
            }
            long j11 = jArrCopyOf[9];
            int i14 = -((int) (((j11 >> 31) & j11) >> 25));
            jArrCopyOf[9] = j11 + (i14 << 25);
            jArrCopyOf[0] = jArrCopyOf[0] - (i14 * 19);
            i11++;
        }
        long j12 = jArrCopyOf[0];
        jArrCopyOf[0] = j12 + (r2 << 26);
        jArrCopyOf[1] = jArrCopyOf[1] - (-((int) (((j12 >> 31) & j12) >> 26)));
        for (int i15 = 0; i15 < 2; i15++) {
            int i16 = 0;
            while (i16 < 9) {
                long j13 = jArrCopyOf[i16];
                int i17 = f83662d[i16 & 1];
                jArrCopyOf[i16] = f83661c[r11] & j13;
                i16++;
                jArrCopyOf[i16] = jArrCopyOf[i16] + ((int) (j13 >> i17));
            }
        }
        jArrCopyOf[9] = 33554431 & jArrCopyOf[9];
        jArrCopyOf[0] = jArrCopyOf[0] + (((int) (r8 >> 25)) * 19);
        int i18 = ~((((int) r10) - 67108845) >> 31);
        for (int i19 = 1; i19 < 10; i19++) {
            int i20 = ~(((int) jArrCopyOf[i19]) ^ f83661c[i19 & 1]);
            int i21 = i20 & (i20 << 16);
            int i22 = i21 & (i21 << 8);
            int i23 = i22 & (i22 << 4);
            int i24 = i23 & (i23 << 2);
            i18 &= (i24 & (i24 + i24)) >> 31;
        }
        jArrCopyOf[0] = jArrCopyOf[0] - (67108845 & i18);
        long j14 = 33554431 & i18;
        jArrCopyOf[1] = jArrCopyOf[1] - j14;
        for (i10 = 2; i10 < 10; i10 += 2) {
            jArrCopyOf[i10] = jArrCopyOf[i10] - (67108863 & i18);
            int i25 = i10 + 1;
            jArrCopyOf[i25] = jArrCopyOf[i25] - j14;
        }
        for (int i26 = 0; i26 < 10; i26++) {
            jArrCopyOf[i26] = jArrCopyOf[i26] << f83660b[i26];
        }
        byte[] bArr = new byte[32];
        for (int i27 = 0; i27 < 10; i27++) {
            int i28 = f83659a[i27];
            byte b10 = bArr[i28];
            long j15 = jArrCopyOf[i27];
            bArr[i28] = (byte) (b10 | (j15 & 255));
            bArr[i28 + 1] = (byte) (bArr[r4] | ((j15 >> 8) & 255));
            bArr[i28 + 2] = (byte) (bArr[r4] | ((j15 >> 16) & 255));
            bArr[i28 + 3] = (byte) (((j15 >> 24) & 255) | bArr[r3]);
        }
        return bArr;
    }

    static long[] k(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = f83659a[i10];
            jArr[i10] = (((((bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8)) | ((bArr[i11 + 2] & 255) << 16)) | ((bArr[i11 + 3] & 255) << 24)) >> f83660b[i10]) & f83661c[i10 & 1];
        }
        return jArr;
    }

    static void c(long[] jArr, long[] jArr2) {
        e(jArr);
        d(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }
}
