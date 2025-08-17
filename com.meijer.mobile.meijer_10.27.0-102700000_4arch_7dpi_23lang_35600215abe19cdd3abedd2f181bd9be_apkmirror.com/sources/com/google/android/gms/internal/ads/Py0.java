package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes6.dex */
public final class Py0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f69458a;

    /* renamed from: b, reason: collision with root package name */
    private final long f69459b;

    /* renamed from: c, reason: collision with root package name */
    private long f69460c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    private long f69461d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    private long f69463f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f69464g = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private float f69467j = 0.97f;

    /* renamed from: i, reason: collision with root package name */
    private float f69466i = 1.03f;

    /* renamed from: k, reason: collision with root package name */
    private float f69468k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private long f69469l = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    private long f69462e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f69465h = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    private long f69470m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private long f69471n = -9223372036854775807L;

    /* synthetic */ Py0(float f10, float f11, long j10, float f12, long j11, long j12, float f13, Oy0 oy0) {
        this.f69458a = j11;
        this.f69459b = j12;
    }

    private static long f(long j10, long j11, float f10) {
        return (long) ((j10 * 0.999f) + (j11 * 9.999871E-4f));
    }

    private final void g() {
        long j10;
        long j11 = this.f69460c;
        if (j11 != -9223372036854775807L) {
            j10 = this.f69461d;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f69463f;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f69464g;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f69462e == j10) {
            return;
        }
        this.f69462e = j10;
        this.f69465h = j10;
        this.f69470m = -9223372036854775807L;
        this.f69471n = -9223372036854775807L;
        this.f69469l = -9223372036854775807L;
    }

    public final long b() {
        return this.f69465h;
    }

    public final void c() {
        long j10 = this.f69465h;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f69459b;
        this.f69465h = j11;
        long j12 = this.f69464g;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f69465h = j12;
        }
        this.f69469l = -9223372036854775807L;
    }

    public final float a(long j10, long j11) {
        long j12;
        if (this.f69460c == -9223372036854775807L) {
            return 1.0f;
        }
        long j13 = j10 - j11;
        long j14 = this.f69470m;
        if (j14 == -9223372036854775807L) {
            this.f69470m = j13;
            this.f69471n = 0L;
        } else {
            long jMax = Math.max(j13, f(j14, j13, 0.999f));
            this.f69470m = jMax;
            this.f69471n = f(this.f69471n, Math.abs(j13 - jMax), 0.999f);
        }
        if (this.f69469l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f69469l < 1000) {
            return this.f69468k;
        }
        this.f69469l = SystemClock.elapsedRealtime();
        long j15 = this.f69470m + (this.f69471n * 3);
        if (this.f69465h > j15) {
            float fK = OV.K(1000L);
            long[] jArr = {j15, this.f69462e, this.f69465h - (((long) ((this.f69468k - 1.0f) * fK)) + ((long) ((this.f69466i - 1.0f) * fK)))};
            j12 = jArr[0];
            for (int i10 = 1; i10 < 3; i10++) {
                long j16 = jArr[i10];
                if (j16 > j12) {
                    j12 = j16;
                }
            }
            this.f69465h = j12;
        } else {
            long jMax2 = Math.max(this.f69465h, Math.min(j10 - ((long) (Math.max(0.0f, this.f69468k - 1.0f) / 1.0E-7f)), j15));
            this.f69465h = jMax2;
            long j17 = this.f69464g;
            if (j17 == -9223372036854775807L || jMax2 <= j17) {
                j12 = jMax2;
            } else {
                this.f69465h = j17;
                j12 = j17;
            }
        }
        long j18 = j10 - j12;
        if (Math.abs(j18) < this.f69458a) {
            this.f69468k = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.f69467j, Math.min((j18 * 1.0E-7f) + 1.0f, this.f69466i));
        this.f69468k = fMax;
        return fMax;
    }

    public final void d(J4 j42) {
        long j10 = j42.f67757a;
        this.f69460c = OV.K(-9223372036854775807L);
        this.f69463f = OV.K(-9223372036854775807L);
        this.f69464g = OV.K(-9223372036854775807L);
        this.f69467j = 0.97f;
        this.f69466i = 1.03f;
        g();
    }

    public final void e(long j10) {
        this.f69461d = j10;
        g();
    }
}
