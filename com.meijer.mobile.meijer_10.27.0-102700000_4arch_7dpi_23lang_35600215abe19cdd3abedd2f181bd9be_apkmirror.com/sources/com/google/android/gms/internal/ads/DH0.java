package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes6.dex */
final class DH0 {

    /* renamed from: a, reason: collision with root package name */
    private long f66206a;

    /* renamed from: b, reason: collision with root package name */
    private long f66207b;

    /* renamed from: c, reason: collision with root package name */
    private long f66208c;

    /* renamed from: d, reason: collision with root package name */
    private long f66209d;

    /* renamed from: e, reason: collision with root package name */
    private long f66210e;

    /* renamed from: f, reason: collision with root package name */
    private long f66211f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f66212g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    private int f66213h;

    public final long b() {
        return this.f66211f;
    }

    public final boolean f() {
        return this.f66209d > 15 && this.f66213h == 0;
    }

    public final long a() {
        long j10 = this.f66210e;
        if (j10 == 0) {
            return 0L;
        }
        return this.f66211f / j10;
    }

    public final void c(long j10) {
        long j11 = this.f66209d;
        if (j11 == 0) {
            this.f66206a = j10;
        } else if (j11 == 1) {
            long j12 = j10 - this.f66206a;
            this.f66207b = j12;
            this.f66211f = j12;
            this.f66210e = 1L;
        } else {
            long j13 = j10 - this.f66208c;
            int i10 = (int) (j11 % 15);
            if (Math.abs(j13 - this.f66207b) <= 1000000) {
                this.f66210e++;
                this.f66211f += j13;
                boolean[] zArr = this.f66212g;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f66213h--;
                }
            } else {
                boolean[] zArr2 = this.f66212g;
                if (!zArr2[i10]) {
                    zArr2[i10] = true;
                    this.f66213h++;
                }
            }
        }
        this.f66209d++;
        this.f66208c = j10;
    }

    public final void d() {
        this.f66209d = 0L;
        this.f66210e = 0L;
        this.f66211f = 0L;
        this.f66213h = 0;
        Arrays.fill(this.f66212g, false);
    }

    public final boolean e() {
        long j10 = this.f66209d;
        if (j10 == 0) {
            return false;
        }
        return this.f66212g[(int) ((j10 - 1) % 15)];
    }
}
