package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes6.dex */
final class DH0 {

    /* renamed from: a, reason: collision with root package name */
    private long f67046a;

    /* renamed from: b, reason: collision with root package name */
    private long f67047b;

    /* renamed from: c, reason: collision with root package name */
    private long f67048c;

    /* renamed from: d, reason: collision with root package name */
    private long f67049d;

    /* renamed from: e, reason: collision with root package name */
    private long f67050e;

    /* renamed from: f, reason: collision with root package name */
    private long f67051f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f67052g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    private int f67053h;

    public final long b() {
        return this.f67051f;
    }

    public final boolean f() {
        return this.f67049d > 15 && this.f67053h == 0;
    }

    public final long a() {
        long j10 = this.f67050e;
        if (j10 == 0) {
            return 0L;
        }
        return this.f67051f / j10;
    }

    public final void c(long j10) {
        long j11 = this.f67049d;
        if (j11 == 0) {
            this.f67046a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f67046a;
            this.f67047b = j12;
            this.f67051f = j12;
            this.f67050e = 1L;
        } else {
            long j13 = j10 - this.f67048c;
            int i10 = (int) (j11 % 15);
            if (Math.abs(j13 - this.f67047b) <= 1000000) {
                this.f67050e++;
                this.f67051f += j13;
                boolean[] zArr = this.f67052g;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f67053h--;
                }
            } else {
                boolean[] zArr2 = this.f67052g;
                if (!zArr2[i10]) {
                    zArr2[i10] = true;
                    this.f67053h++;
                }
            }
        }
        this.f67049d++;
        this.f67048c = j10;
    }

    public final void d() {
        this.f67049d = 0L;
        this.f67050e = 0L;
        this.f67051f = 0L;
        this.f67053h = 0;
        Arrays.fill(this.f67052g, false);
    }

    public final boolean e() {
        long j10 = this.f67049d;
        if (j10 == 0) {
            return false;
        }
        return this.f67052g[(int) ((j10 - 1) % 15)];
    }
}
