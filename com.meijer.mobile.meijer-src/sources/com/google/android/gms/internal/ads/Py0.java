package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes6.dex */
public final class Py0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f70298a;

    /* renamed from: b, reason: collision with root package name */
    private final long f70299b;

    /* renamed from: c, reason: collision with root package name */
    private long f70300c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    private long f70301d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    private long f70303f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f70304g = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private float f70307j = 0.97f;

    /* renamed from: i, reason: collision with root package name */
    private float f70306i = 1.03f;

    /* renamed from: k, reason: collision with root package name */
    private float f70308k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private long f70309l = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    private long f70302e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f70305h = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    private long f70310m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private long f70311n = -9223372036854775807L;

    /* synthetic */ Py0(float f10, float f11, long j10, float f12, long j11, long j12, float f13, Oy0 oy0) {
        this.f70298a = j11;
        this.f70299b = j12;
    }

    private static long f(long j10, long j11, float f10) {
        return (long) ((j10 * 0.999f) + (j11 * 9.999871E-4f));
    }

    private final void g() {
        long j10;
        long j11 = this.f70300c;
        if (j11 != -9223372036854775807L) {
            j10 = this.f70301d;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f70303f;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f70304g;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f70302e == j10) {
            return;
        }
        this.f70302e = j10;
        this.f70305h = j10;
        this.f70310m = -9223372036854775807L;
        this.f70311n = -9223372036854775807L;
        this.f70309l = -9223372036854775807L;
    }

    public final long b() {
        return this.f70305h;
    }

    public final void c() {
        long j10 = this.f70305h;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f70299b;
        this.f70305h = j11;
        long j12 = this.f70304g;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f70305h = j12;
        }
        this.f70309l = -9223372036854775807L;
    }

    public final float a(long j10, long j11) {
        long j12;
        if (this.f70300c == -9223372036854775807L) {
            return 1.0f;
        }
        long j13 = j10 - j11;
        long j14 = this.f70310m;
        if (j14 == -9223372036854775807L) {
            this.f70310m = j13;
            this.f70311n = 0L;
        } else {
            long jMax = Math.max(j13, f(j14, j13, 0.999f));
            this.f70310m = jMax;
            this.f70311n = f(this.f70311n, Math.abs(j13 - jMax), 0.999f);
        }
        if (this.f70309l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f70309l < 1000) {
            return this.f70308k;
        }
        this.f70309l = SystemClock.elapsedRealtime();
        long j15 = this.f70310m + (this.f70311n * 3);
        if (this.f70305h > j15) {
            float fK = OV.K(1000L);
            long[] jArr = {j15, this.f70302e, this.f70305h - (((long) ((this.f70308k - 1.0f) * fK)) + ((long) ((this.f70306i - 1.0f) * fK)))};
            j12 = jArr[0];
            for (int i10 = 1; i10 < 3; i10++) {
                long j16 = jArr[i10];
                if (j16 > j12) {
                    j12 = j16;
                }
            }
            this.f70305h = j12;
        } else {
            long jMax2 = Math.max(this.f70305h, Math.min(j10 - ((long) (Math.max(0.0f, this.f70308k - 1.0f) / 1.0E-7f)), j15));
            this.f70305h = jMax2;
            long j17 = this.f70304g;
            if (j17 == -9223372036854775807L || jMax2 <= j17) {
                j12 = jMax2;
            } else {
                this.f70305h = j17;
                j12 = j17;
            }
        }
        long j18 = j10 - j12;
        if (Math.abs(j18) < this.f70298a) {
            this.f70308k = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.f70307j, Math.min((j18 * 1.0E-7f) + 1.0f, this.f70306i));
        this.f70308k = fMax;
        return fMax;
    }

    public final void d(J4 j42) {
        long j10 = j42.f68597a;
        this.f70300c = OV.K(-9223372036854775807L);
        this.f70303f = OV.K(-9223372036854775807L);
        this.f70304g = OV.K(-9223372036854775807L);
        this.f70307j = 0.97f;
        this.f70306i = 1.03f;
        g();
    }

    public final void e(long j10) {
        this.f70301d = j10;
        g();
    }
}
