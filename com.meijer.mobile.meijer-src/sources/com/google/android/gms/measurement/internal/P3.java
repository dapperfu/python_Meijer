package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class P3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f86005a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11393x4 f86006b;

    P3(C11393x4 c11393x4, long j10) {
        this.f86005a = j10;
        Objects.requireNonNull(c11393x4);
        this.f86006b = c11393x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        X2 x22 = this.f86006b.f85708a;
        B2 b22 = x22.v().f85820l;
        long j10 = this.f86005a;
        b22.b(j10);
        x22.a().t().b("Session timeout duration set", Long.valueOf(j10));
    }
}
