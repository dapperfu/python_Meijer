package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.nU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8982nU {

    /* renamed from: a, reason: collision with root package name */
    private long f77896a;

    /* renamed from: b, reason: collision with root package name */
    private long f77897b;

    /* renamed from: c, reason: collision with root package name */
    private long f77898c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal f77899d = new ThreadLocal();

    public final synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!j()) {
                long jLongValue = this.f77896a;
                if (jLongValue == 9223372036854775806L) {
                    Long l10 = (Long) this.f77899d.get();
                    if (l10 == null) {
                        throw null;
                    }
                    jLongValue = l10.longValue();
                }
                this.f77897b = jLongValue - j10;
                notifyAll();
            }
            this.f77898c = j10;
            return j10 + this.f77897b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f77898c;
            if (j11 != -9223372036854775807L) {
                long jH = h(j11);
                long j12 = (4294967296L + jH) / 8589934592L;
                long j13 = (((-1) + j12) * 8589934592L) + j10;
                j10 += j12 * 8589934592L;
                if (Math.abs(j13 - jH) < Math.abs(j10 - jH)) {
                    j10 = j13;
                }
            }
            return a(g(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f77898c;
            if (j11 != -9223372036854775807L) {
                long jH = h(j11);
                long j12 = jH / 8589934592L;
                long j13 = (j12 * 8589934592L) + j10;
                j10 += (j12 + 1) * 8589934592L;
                if (j13 >= jH) {
                    j10 = j13;
                }
            }
            return a(g(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long d() {
        long j10 = this.f77896a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j10;
    }

    public final synchronized long e() {
        long j10;
        try {
            j10 = this.f77898c;
        } catch (Throwable th2) {
            throw th2;
        }
        return j10 != -9223372036854775807L ? j10 + this.f77897b : d();
    }

    public final synchronized long f() {
        return this.f77897b;
    }

    public final synchronized void i(long j10) {
        this.f77896a = j10;
        this.f77897b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f77898c = -9223372036854775807L;
    }

    public final synchronized boolean j() {
        return this.f77897b != -9223372036854775807L;
    }

    public C8982nU(long j10) {
        i(0L);
    }

    public static long g(long j10) {
        return OV.M(j10, 1000000L, 90000L, RoundingMode.DOWN);
    }

    public static long h(long j10) {
        return OV.M(j10, 90000L, 1000000L, RoundingMode.DOWN);
    }
}
