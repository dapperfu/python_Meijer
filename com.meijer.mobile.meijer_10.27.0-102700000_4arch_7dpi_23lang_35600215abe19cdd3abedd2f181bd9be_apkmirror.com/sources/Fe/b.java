package Fe;

import Be.p;

/* loaded from: classes6.dex */
final class b {
    static long a(double d10) {
        p.e(b(d10), "not a normal value");
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        if (exponent == -1023) {
            return jDoubleToRawLongBits << 1;
        }
        return jDoubleToRawLongBits | 4503599627370496L;
    }

    static boolean b(double d10) {
        if (Math.getExponent(d10) <= 1023) {
            return true;
        }
        return false;
    }

    static boolean c(double d10) {
        if (Math.getExponent(d10) >= -1022) {
            return true;
        }
        return false;
    }

    static double d(double d10) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d10) & 4503599627370495L) | 4607182418800017408L);
    }
}
