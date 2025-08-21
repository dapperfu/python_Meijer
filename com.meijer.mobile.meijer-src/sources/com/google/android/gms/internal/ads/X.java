package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    private final long f72063a;

    /* renamed from: b, reason: collision with root package name */
    private final long f72064b;

    /* renamed from: c, reason: collision with root package name */
    private final long f72065c;

    /* renamed from: d, reason: collision with root package name */
    private long f72066d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f72067e;

    /* renamed from: f, reason: collision with root package name */
    private long f72068f;

    /* renamed from: g, reason: collision with root package name */
    private long f72069g;

    /* renamed from: h, reason: collision with root package name */
    private long f72070h;

    protected static long f(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || 1 + j11 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        return Math.max(j13, Math.min(((j13 + j16) - j15) - (j16 / 20), j14 - 1));
    }

    static /* bridge */ /* synthetic */ void g(X x10, long j10, long j11) {
        x10.f72067e = j10;
        x10.f72069g = j11;
        x10.i();
    }

    static /* bridge */ /* synthetic */ void h(X x10, long j10, long j11) {
        x10.f72066d = j10;
        x10.f72068f = j11;
        x10.i();
    }

    private final void i() {
        this.f72070h = f(this.f72064b, this.f72066d, this.f72067e, this.f72068f, this.f72069g, this.f72065c);
    }

    protected X(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f72063a = j10;
        this.f72064b = j11;
        this.f72067e = j13;
        this.f72068f = j14;
        this.f72069g = j15;
        this.f72065c = j16;
        this.f72070h = f(j11, 0L, j13, j14, j15, j16);
    }
}
