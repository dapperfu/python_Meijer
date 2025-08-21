package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes6.dex */
public final class XF0 extends AbstractC7432Wl {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f72140g = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final long f72141b;

    /* renamed from: c, reason: collision with root package name */
    private final long f72142c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f72143d;

    /* renamed from: e, reason: collision with root package name */
    private final H7 f72144e;

    /* renamed from: f, reason: collision with root package name */
    private final J4 f72145f;

    @Override // com.google.android.gms.internal.ads.AbstractC7432Wl
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7432Wl
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7432Wl
    public final C7431Wk d(int i10, C7431Wk c7431Wk, boolean z10) {
        C8211gC.a(i10, 0, 1);
        c7431Wk.i(null, z10 ? f72140g : null, 0, this.f72141b, 0L, C8992nc.f77938e, false);
        return c7431Wk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7432Wl
    public final Object f(int i10) {
        C8211gC.a(i10, 0, 1);
        return f72140g;
    }

    static {
        E1 e12 = new E1();
        e12.a("SinglePeriodTimeline");
        e12.b(Uri.EMPTY);
        e12.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7432Wl
    public final int a(Object obj) {
        return f72140g.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7432Wl
    public final C10079xl e(int i10, C10079xl c10079xl, long j10) {
        C8211gC.a(i10, 0, 1);
        Object obj = C10079xl.f80684o;
        H7 h72 = this.f72144e;
        long j11 = this.f72142c;
        c10079xl.a(obj, h72, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f72143d, false, this.f72145f, 0L, j11, 0, 0, 0L);
        return c10079xl;
    }

    public XF0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, H7 h72, J4 j42) {
        this.f72141b = j13;
        this.f72142c = j14;
        this.f72143d = z10;
        h72.getClass();
        this.f72144e = h72;
        this.f72145f = j42;
    }
}
