package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes6.dex */
public final class XF0 extends AbstractC7307Wl {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f71300g = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final long f71301b;

    /* renamed from: c, reason: collision with root package name */
    private final long f71302c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f71303d;

    /* renamed from: e, reason: collision with root package name */
    private final H7 f71304e;

    /* renamed from: f, reason: collision with root package name */
    private final J4 f71305f;

    @Override // com.google.android.gms.internal.ads.AbstractC7307Wl
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7307Wl
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7307Wl
    public final C7306Wk d(int i10, C7306Wk c7306Wk, boolean z10) {
        C8086gC.a(i10, 0, 1);
        c7306Wk.i(null, z10 ? f71300g : null, 0, this.f71301b, 0L, C8867nc.f77098e, false);
        return c7306Wk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7307Wl
    public final Object f(int i10) {
        C8086gC.a(i10, 0, 1);
        return f71300g;
    }

    static {
        E1 e12 = new E1();
        e12.a("SinglePeriodTimeline");
        e12.b(Uri.EMPTY);
        e12.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7307Wl
    public final int a(Object obj) {
        return f71300g.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7307Wl
    public final C9954xl e(int i10, C9954xl c9954xl, long j10) {
        C8086gC.a(i10, 0, 1);
        Object obj = C9954xl.f79844o;
        H7 h72 = this.f71304e;
        long j11 = this.f71302c;
        c9954xl.a(obj, h72, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f71303d, false, this.f71305f, 0L, j11, 0, 0, 0L);
        return c9954xl;
    }

    public XF0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, H7 h72, J4 j42) {
        this.f71301b = j13;
        this.f71302c = j14;
        this.f71303d = z10;
        h72.getClass();
        this.f71304e = h72;
        this.f71305f = j42;
    }
}
