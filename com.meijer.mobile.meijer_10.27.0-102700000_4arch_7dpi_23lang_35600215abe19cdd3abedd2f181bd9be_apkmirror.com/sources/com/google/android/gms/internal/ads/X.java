package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    private final long f71223a;

    /* renamed from: b, reason: collision with root package name */
    private final long f71224b;

    /* renamed from: c, reason: collision with root package name */
    private final long f71225c;

    /* renamed from: d, reason: collision with root package name */
    private long f71226d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f71227e;

    /* renamed from: f, reason: collision with root package name */
    private long f71228f;

    /* renamed from: g, reason: collision with root package name */
    private long f71229g;

    /* renamed from: h, reason: collision with root package name */
    private long f71230h;

    protected static long f(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || 1 + j11 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        return Math.max(j13, Math.min(((j13 + j16) - j15) - (j16 / 20), j14 - 1));
    }

    static /* bridge */ /* synthetic */ void g(X x10, long j10, long j11) {
        x10.f71227e = j10;
        x10.f71229g = j11;
        x10.i();
    }

    static /* bridge */ /* synthetic */ void h(X x10, long j10, long j11) {
        x10.f71226d = j10;
        x10.f71228f = j11;
        x10.i();
    }

    private final void i() {
        this.f71230h = f(this.f71224b, this.f71226d, this.f71227e, this.f71228f, this.f71229g, this.f71225c);
    }

    protected X(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f71223a = j10;
        this.f71224b = j11;
        this.f71227e = j13;
        this.f71228f = j14;
        this.f71229g = j15;
        this.f71225c = j16;
        this.f71230h = f(j11, 0L, j13, j14, j15, j16);
    }
}
