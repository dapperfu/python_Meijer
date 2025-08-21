package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes6.dex */
public final class Di0 {
    public static long d(long j10, long j11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j11);
        if (iNumberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        long j12 = j10 ^ j11;
        long j13 = (j12 >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j11 == Long.MIN_VALUE) & (j10 < 0)))) {
            long j14 = j10 * j11;
            if (j10 == 0 || j14 / j10 == j11) {
                return j14;
            }
        }
        return j13;
    }

    public static long a(long j10, long j11) {
        long j12 = j10 + j11;
        if (((j10 ^ j11) < 0) || ((j10 ^ j12) >= 0)) {
            return j12;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + j10 + ", " + j11 + ")");
    }

    public static long c(long j10, long j11) {
        Ei0.a("a", j10);
        Ei0.a("b", j11);
        if (j10 == 0) {
            return j11;
        }
        if (j11 == 0) {
            return j10;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
        long jNumberOfTrailingZeros = j10 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j11);
        long j12 = j11 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j12) {
            long j13 = jNumberOfTrailingZeros - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            jNumberOfTrailingZeros = j15 >> Long.numberOfTrailingZeros(j15);
            j12 += j14;
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long b(long j10, long j11, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j12 = j10 / j11;
        long j13 = j10 - (j11 * j12);
        if (j13 != 0) {
            int i10 = ((int) ((j10 ^ j11) >> 63)) | 1;
            switch (Ci0.f66656a[roundingMode.ordinal()]) {
                case 1:
                    Ei0.b(false);
                    return j12;
                case 2:
                    return j12;
                case 3:
                    if (i10 >= 0) {
                        return j12;
                    }
                    break;
                case 4:
                    break;
                case 5:
                    if (i10 <= 0) {
                        return j12;
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    long jAbs = Math.abs(j13);
                    long jAbs2 = jAbs - (Math.abs(j11) - jAbs);
                    if (jAbs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j12) == 0)) {
                            return j12;
                        }
                    } else if (jAbs2 <= 0) {
                        return j12;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            return j12 + i10;
        }
        return j12;
    }
}
