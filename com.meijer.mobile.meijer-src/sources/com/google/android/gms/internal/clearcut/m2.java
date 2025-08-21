package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes6.dex */
public final class m2 {
    private static int a(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    private static long b(long j10, long j11, long j12) {
        long j13 = (j10 ^ j11) * j12;
        long j14 = ((j13 ^ (j13 >>> 47)) ^ j11) * j12;
        return (j14 ^ (j14 >>> 47)) * j12;
    }

    public static long c(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length < 0 || length > bArr2.length) {
            StringBuilder sb2 = new StringBuilder(67);
            sb2.append("Out of bound index with offput: 0 and length: ");
            sb2.append(length);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        char c10 = '/';
        char c11 = 0;
        if (length <= 32) {
            if (length > 16) {
                long j10 = (length << 1) - 7286425919675154353L;
                long jE = e(bArr2, 0) * (-5435081209227447693L);
                long jE2 = e(bArr2, 8);
                long jE3 = e(bArr2, length - 8) * j10;
                return b(Long.rotateRight(jE + jE2, 43) + Long.rotateRight(jE3, 30) + (e(bArr2, length - 16) * (-7286425919675154353L)), jE + Long.rotateRight(jE2 - 7286425919675154353L, 18) + jE3, j10);
            }
            if (length >= 8) {
                long j11 = (length << 1) - 7286425919675154353L;
                long jE4 = e(bArr2, 0) - 7286425919675154353L;
                long jE5 = e(bArr2, length - 8);
                return b((Long.rotateRight(jE5, 37) * j11) + jE4, (Long.rotateRight(jE4, 25) + jE5) * j11, j11);
            }
            if (length >= 4) {
                return b(length + ((a(bArr2, 0) & 4294967295L) << 3), a(bArr2, length - 4) & 4294967295L, (length << 1) - 7286425919675154353L);
            }
            if (length <= 0) {
                return -7286425919675154353L;
            }
            byte b10 = bArr2[0];
            byte b11 = bArr2[length >> 1];
            long j12 = ((length + ((bArr2[length - 1] & 255) << 2)) * (-4348849565147123417L)) ^ (((b10 & 255) + ((b11 & 255) << 8)) * (-7286425919675154353L));
            return (j12 ^ (j12 >>> 47)) * (-7286425919675154353L);
        }
        char c12 = '@';
        if (length <= 64) {
            long j13 = (length << 1) - 7286425919675154353L;
            long jE6 = e(bArr2, 0) * (-7286425919675154353L);
            long jE7 = e(bArr2, 8);
            long jE8 = e(bArr2, length - 8) * j13;
            long jRotateRight = Long.rotateRight(jE6 + jE7, 43) + Long.rotateRight(jE8, 30) + (e(bArr2, length - 16) * (-7286425919675154353L));
            long jB = b(jRotateRight, Long.rotateRight(jE7 - 7286425919675154353L, 18) + jE6 + jE8, j13);
            long jE9 = e(bArr2, 16) * j13;
            long jE10 = e(bArr2, 24);
            long jE11 = (jRotateRight + e(bArr2, length - 32)) * j13;
            return b(Long.rotateRight(jE9 + jE10, 43) + Long.rotateRight(jE11, 30) + ((jB + e(bArr2, length - 24)) * j13), jE9 + Long.rotateRight(jE10 + jE6, 18) + jE11, j13);
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jE12 = e(bArr2, 0) + 95310865018149119L;
        int i10 = length - 1;
        int i11 = (i10 / 64) << 6;
        int i12 = i10 & 63;
        int i13 = i11 + i12;
        int i14 = i13 - 63;
        long j14 = 2480279821605975764L;
        long j15 = 1390051526045402406L;
        int i15 = i12;
        int i16 = 0;
        while (true) {
            char c13 = c11;
            long jRotateRight2 = Long.rotateRight(jE12 + j14 + jArr[c11] + e(bArr2, i16 + 8), 37) * (-5435081209227447693L);
            long jRotateRight3 = Long.rotateRight(j14 + jArr[1] + e(bArr2, i16 + 48), 42) * (-5435081209227447693L);
            long j16 = jRotateRight2 ^ jArr2[1];
            char c14 = c12;
            long jE13 = jRotateRight3 + jArr[c13] + e(bArr2, i16 + 40);
            long jRotateRight4 = Long.rotateRight(j15 + jArr2[c13], 33) * (-5435081209227447693L);
            char c15 = c10;
            int i17 = i15;
            d(bArr2, i16, jArr[1] * (-5435081209227447693L), j16 + jArr2[c13], jArr);
            int i18 = i16;
            long[] jArr3 = jArr;
            d(bArr2, i18 + 32, jRotateRight4 + jArr2[1], jE13 + e(bArr2, i18 + 16), jArr2);
            i16 = i18 + 64;
            if (i16 == i11) {
                long j17 = ((j16 & 255) << 1) - 5435081209227447693L;
                long j18 = jArr2[c13] + i17;
                jArr2[c13] = j18;
                long j19 = jArr3[c13] + j18;
                jArr3[c13] = j19;
                jArr2[c13] = jArr2[c13] + j19;
                long jRotateRight5 = Long.rotateRight(jRotateRight4 + jE13 + jArr3[c13] + e(bArr2, i13 - 55), 37) * j17;
                long jRotateRight6 = Long.rotateRight(jE13 + jArr3[1] + e(bArr2, i13 - 15), 42) * j17;
                long j20 = jRotateRight5 ^ (jArr2[1] * 9);
                long jE14 = jRotateRight6 + (jArr3[c13] * 9) + e(bArr2, i13 - 23);
                long jRotateRight7 = Long.rotateRight(j16 + jArr2[c13], 33) * j17;
                d(bArr2, i14, jArr3[1] * j17, jArr2[c13] + j20, jArr3);
                d(bArr2, i13 - 31, jArr2[1] + jRotateRight7, e(bArr2, i13 - 47) + jE14, jArr2);
                return b(b(jArr3[c13], jArr2[c13], j17) + (((jE14 >>> c15) ^ jE14) * (-4348849565147123417L)) + j20, b(jArr3[1], jArr2[1], j17) + jRotateRight7, j17);
            }
            bArr2 = bArr;
            jE12 = jRotateRight4;
            jArr = jArr3;
            c11 = c13;
            j15 = j16;
            c12 = c14;
            j14 = jE13;
            i15 = i17;
            c10 = c15;
        }
    }

    private static void d(byte[] bArr, int i10, long j10, long j11, long[] jArr) {
        long jE = e(bArr, i10);
        long jE2 = e(bArr, i10 + 8);
        long jE3 = e(bArr, i10 + 16);
        long jE4 = e(bArr, i10 + 24);
        long j12 = j10 + jE;
        long j13 = jE2 + j12 + jE3;
        long jRotateRight = Long.rotateRight(j11 + j12 + jE4, 21) + Long.rotateRight(j13, 44);
        jArr[0] = j13 + jE4;
        jArr[1] = jRotateRight + j12;
    }

    private static long e(byte[] bArr, int i10) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i10, 8);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getLong();
    }
}
