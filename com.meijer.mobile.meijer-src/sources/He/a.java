package He;

import java.math.RoundingMode;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final double f13519a = Math.log(2.0d);

    /* renamed from: b, reason: collision with root package name */
    static final double[] f13520b = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* renamed from: He.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0202a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13521a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f13521a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13521a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13521a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13521a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13521a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13521a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13521a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13521a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static boolean a(double d10, double d11, double d12) {
        e.d("tolerance", d12);
        if (Math.copySign(d10 - d11, 1.0d) <= d12 || d10 == d11) {
            return true;
        }
        return Double.isNaN(d10) && Double.isNaN(d11);
    }

    public static boolean c(double d10) {
        if (d10 > 0.0d && b.b(d10)) {
            long jA = b.a(d10);
            if ((jA & (jA - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(double r5, java.math.RoundingMode r7) {
        /*
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L10
            boolean r0 = He.b.b(r5)
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.String r3 = "x must be positive and finite"
            De.p.e(r0, r3)
            int r0 = java.lang.Math.getExponent(r5)
            boolean r3 = He.b.c(r5)
            if (r3 != 0) goto L2a
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r5 = r5 * r0
            int r5 = d(r5, r7)
            int r5 = r5 + (-52)
            return r5
        L2a:
            int[] r3 = He.a.C0202a.f13521a
            int r7 = r7.ordinal()
            r7 = r3[r7]
            switch(r7) {
                case 1: goto L61;
                case 2: goto L68;
                case 3: goto L5a;
                case 4: goto L52;
                case 5: goto L48;
                case 6: goto L3b;
                case 7: goto L3b;
                case 8: goto L3b;
                default: goto L35;
            }
        L35:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L3b:
            double r5 = He.b.d(r5)
            double r5 = r5 * r5
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L68
            r1 = r2
            goto L68
        L48:
            if (r0 < 0) goto L4b
            r1 = r2
        L4b:
            boolean r5 = c(r5)
        L4f:
            r5 = r5 ^ r2
            r1 = r1 & r5
            goto L68
        L52:
            if (r0 >= 0) goto L55
            r1 = r2
        L55:
            boolean r5 = c(r5)
            goto L4f
        L5a:
            boolean r5 = c(r5)
            r1 = r5 ^ 1
            goto L68
        L61:
            boolean r5 = c(r5)
            He.e.g(r5)
        L68:
            if (r1 == 0) goto L6b
            int r0 = r0 + r2
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: He.a.d(double, java.math.RoundingMode):int");
    }

    public static boolean b(double d10) {
        if (b.b(d10)) {
            if (d10 == 0.0d || 52 - Long.numberOfTrailingZeros(b.a(d10)) <= Math.getExponent(d10)) {
                return true;
            }
            return false;
        }
        return false;
    }

    static double e(double d10, RoundingMode roundingMode) {
        int i10;
        if (b.b(d10)) {
            switch (C0202a.f13521a[roundingMode.ordinal()]) {
                case 1:
                    e.g(b(d10));
                    return d10;
                case 2:
                    if (d10 < 0.0d && !b(d10)) {
                        return ((long) d10) - 1;
                    }
                    return d10;
                case 3:
                    if (d10 > 0.0d && !b(d10)) {
                        return ((long) d10) + 1;
                    }
                    return d10;
                case 4:
                    return d10;
                case 5:
                    if (!b(d10)) {
                        long j10 = (long) d10;
                        if (d10 > 0.0d) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        return j10 + i10;
                    }
                    return d10;
                case 6:
                    return Math.rint(d10);
                case 7:
                    double dRint = Math.rint(d10);
                    if (Math.abs(d10 - dRint) == 0.5d) {
                        return d10 + Math.copySign(0.5d, d10);
                    }
                    return dRint;
                case 8:
                    double dRint2 = Math.rint(d10);
                    if (Math.abs(d10 - dRint2) != 0.5d) {
                        return dRint2;
                    }
                    return d10;
                default:
                    throw new AssertionError();
            }
        }
        throw new ArithmeticException("input is infinite or NaN");
    }

    public static long f(double d10, RoundingMode roundingMode) {
        boolean z10;
        double dE = e(d10, roundingMode);
        boolean z11 = false;
        if ((-9.223372036854776E18d) - dE < 1.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (dE < 9.223372036854776E18d) {
            z11 = true;
        }
        e.a(z10 & z11, d10, roundingMode);
        return (long) dE;
    }
}
