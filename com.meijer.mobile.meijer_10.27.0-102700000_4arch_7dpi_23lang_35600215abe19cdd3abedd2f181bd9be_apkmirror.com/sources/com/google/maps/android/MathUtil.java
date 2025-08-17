package com.google.maps.android;

/* loaded from: classes7.dex */
class MathUtil {
    static final double EARTH_RADIUS = 6371009.0d;

    static double clamp(double d10, double d11, double d12) {
        return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
    }

    static double havFromSin(double d10) {
        double d11 = d10 * d10;
        return (d11 / (Math.sqrt(1.0d - d11) + 1.0d)) * 0.5d;
    }

    static double mod(double d10, double d11) {
        return ((d10 % d11) + d11) % d11;
    }

    static double hav(double d10) {
        double dSin = Math.sin(d10 * 0.5d);
        return dSin * dSin;
    }

    static double havDistance(double d10, double d11, double d12) {
        return hav(d10 - d11) + (hav(d12) * Math.cos(d10) * Math.cos(d11));
    }

    static double mercator(double d10) {
        return Math.log(Math.tan((d10 * 0.5d) + 0.7853981633974483d));
    }

    static double sinFromHav(double d10) {
        return Math.sqrt(d10 * (1.0d - d10)) * 2.0d;
    }

    static double sinSumFromHav(double d10, double d11) {
        double dSqrt = Math.sqrt((1.0d - d10) * d10);
        double dSqrt2 = Math.sqrt((1.0d - d11) * d11);
        return ((dSqrt + dSqrt2) - (((dSqrt * d11) + (dSqrt2 * d10)) * 2.0d)) * 2.0d;
    }

    static double wrap(double d10, double d11, double d12) {
        return (d10 < d11 || d10 >= d12) ? mod(d10 - d11, d12 - d11) + d11 : d10;
    }

    MathUtil() {
    }

    static double arcHav(double d10) {
        return Math.asin(Math.sqrt(d10)) * 2.0d;
    }

    static double inverseMercator(double d10) {
        return (Math.atan(Math.exp(d10)) * 2.0d) - 1.5707963267948966d;
    }
}
