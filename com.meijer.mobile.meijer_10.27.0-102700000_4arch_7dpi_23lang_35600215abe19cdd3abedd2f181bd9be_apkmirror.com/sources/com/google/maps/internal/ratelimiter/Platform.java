package com.google.maps.internal.ratelimiter;

import java.util.Locale;

/* loaded from: classes7.dex */
final class Platform {
    static String formatCompact4Digits(double d10) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d10));
    }

    private Platform() {
    }

    static long systemNanoTime() {
        return System.nanoTime();
    }
}
