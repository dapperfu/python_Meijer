package com.google.maps.internal.ratelimiter;

/* loaded from: classes7.dex */
public final class LongMath {
    public static long saturatedAdd(long j10, long j11) {
        long j12 = j10 + j11;
        return (((j11 ^ j10) > 0L ? 1 : ((j11 ^ j10) == 0L ? 0 : -1)) < 0) | ((j10 ^ j12) >= 0) ? j12 : ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    private LongMath() {
    }
}
