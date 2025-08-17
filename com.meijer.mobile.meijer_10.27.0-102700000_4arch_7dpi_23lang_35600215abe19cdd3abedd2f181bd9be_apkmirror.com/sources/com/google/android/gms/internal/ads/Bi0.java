package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes6.dex */
public final class Bi0 {
    public static int a(int i10, int i11) {
        long j10 = i10 + i11;
        int i12 = (int) j10;
        if (j10 == i12) {
            return i12;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i10 + ", " + i11 + ")");
    }

    public static int c(int i10, RoundingMode roundingMode) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch (Ai0.f65159a[roundingMode.ordinal()]) {
            case 1:
                Ei0.b(((i10 + (-1)) & i10) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i10 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
                return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i10) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static int b(int i10, int i11, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i11 != 0) {
            int i12 = i10 / i11;
            int i13 = i10 - (i11 * i12);
            if (i13 != 0) {
                int i14 = 1;
                int i15 = ((i10 ^ i11) >> 31) | 1;
                switch (Ai0.f65159a[roundingMode.ordinal()]) {
                    case 1:
                        Ei0.b(false);
                        return i12;
                    case 2:
                        return i12;
                    case 3:
                        if (i15 >= 0) {
                            return i12;
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        if (i15 <= 0) {
                            return i12;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int iAbs = Math.abs(i13);
                        int iAbs2 = iAbs - (Math.abs(i11) - iAbs);
                        if (iAbs2 == 0) {
                            if (roundingMode != RoundingMode.HALF_UP) {
                                if (roundingMode != RoundingMode.HALF_EVEN) {
                                    i14 = 0;
                                }
                                if ((i12 & 1 & i14) == 0) {
                                    return i12;
                                }
                            }
                        } else if (iAbs2 <= 0) {
                            return i12;
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
                return i12 + i15;
            }
            return i12;
        }
        throw new ArithmeticException("/ by zero");
    }
}
