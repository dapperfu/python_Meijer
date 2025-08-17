package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class P3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f85165a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85166b;

    P3(C11268x4 c11268x4, long j10) {
        this.f85165a = j10;
        Objects.requireNonNull(c11268x4);
        this.f85166b = c11268x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        X2 x22 = this.f85166b.f84868a;
        B2 b22 = x22.v().f84980l;
        long j10 = this.f85165a;
        b22.b(j10);
        x22.a().t().b("Session timeout duration set", Long.valueOf(j10));
    }
}
