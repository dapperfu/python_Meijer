package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zi0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10288zi0 {
    static long a(double d10) {
        C6782Df0.f(b(d10), "not a normal value");
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        if (exponent == -1023) {
            return jDoubleToRawLongBits + jDoubleToRawLongBits;
        }
        return jDoubleToRawLongBits | 4503599627370496L;
    }

    static boolean b(double d10) {
        if (Math.getExponent(d10) <= 1023) {
            return true;
        }
        return false;
    }
}
