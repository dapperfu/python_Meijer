package com.google.android.gms.internal.ads;

import java.util.Random;

/* loaded from: classes6.dex */
public final class W90 {

    /* renamed from: a, reason: collision with root package name */
    private final long f71860a;

    /* renamed from: b, reason: collision with root package name */
    private final long f71861b;

    /* renamed from: e, reason: collision with root package name */
    private long f71864e;

    /* renamed from: d, reason: collision with root package name */
    private long f71863d = 5;

    /* renamed from: f, reason: collision with root package name */
    private final Random f71865f = new Random();

    /* renamed from: c, reason: collision with root package name */
    private long f71862c = 0;

    public final void c() {
        this.f71864e = this.f71860a;
        this.f71862c = 0L;
    }

    public final synchronized void d(int i10) {
        com.google.android.gms.common.internal.r.a(i10 > 0);
        this.f71863d = i10;
    }

    public final long a() {
        double d10 = this.f71864e;
        double d11 = 0.2d * d10;
        long j10 = (long) (d10 + d11);
        return ((long) (d10 - d11)) + ((long) (this.f71865f.nextDouble() * ((j10 - r0) + 1)));
    }

    public final void b() {
        double d10 = this.f71864e;
        this.f71864e = Math.min((long) (d10 + d10), this.f71861b);
        this.f71862c++;
    }

    public final boolean e() {
        return this.f71862c > Math.max(this.f71863d, (long) ((Integer) Oc.A.c().a(C8784lf.f77439z)).intValue()) && this.f71864e >= this.f71861b;
    }

    public W90(long j10, double d10, long j11, double d11) {
        this.f71860a = j10;
        this.f71861b = j11;
        c();
    }
}
