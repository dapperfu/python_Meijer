package com.google.android.gms.internal.ads;

import java.util.Random;

/* loaded from: classes6.dex */
public final class W90 {

    /* renamed from: a, reason: collision with root package name */
    private final long f71020a;

    /* renamed from: b, reason: collision with root package name */
    private final long f71021b;

    /* renamed from: e, reason: collision with root package name */
    private long f71024e;

    /* renamed from: d, reason: collision with root package name */
    private long f71023d = 5;

    /* renamed from: f, reason: collision with root package name */
    private final Random f71025f = new Random();

    /* renamed from: c, reason: collision with root package name */
    private long f71022c = 0;

    public final void c() {
        this.f71024e = this.f71020a;
        this.f71022c = 0L;
    }

    public final synchronized void d(int i10) {
        com.google.android.gms.common.internal.r.a(i10 > 0);
        this.f71023d = i10;
    }

    public final long a() {
        double d10 = this.f71024e;
        double d11 = 0.2d * d10;
        long j10 = (long) (d10 + d11);
        return ((long) (d10 - d11)) + ((long) (this.f71025f.nextDouble() * ((j10 - r0) + 1)));
    }

    public final void b() {
        double d10 = this.f71024e;
        this.f71024e = Math.min((long) (d10 + d10), this.f71021b);
        this.f71022c++;
    }

    public final boolean e() {
        return this.f71022c > Math.max(this.f71023d, (long) ((Integer) Mc.A.c().a(C8659lf.f76599z)).intValue()) && this.f71024e >= this.f71021b;
    }

    public W90(long j10, double d10, long j11, double d11) {
        this.f71020a = j10;
        this.f71021b = j11;
        c();
    }
}
