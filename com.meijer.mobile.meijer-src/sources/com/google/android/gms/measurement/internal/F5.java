package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class F5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f85858a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N5 f85859b;

    F5(N5 n52, long j10) {
        this.f85858a = j10;
        Objects.requireNonNull(n52);
        this.f85859b = n52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f85859b.q(this.f85858a);
    }
}
