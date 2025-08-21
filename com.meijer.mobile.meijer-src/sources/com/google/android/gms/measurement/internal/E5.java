package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class E5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f85844a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N5 f85845b;

    E5(N5 n52, long j10) {
        this.f85844a = j10;
        Objects.requireNonNull(n52);
        this.f85845b = n52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f85845b.p(this.f85844a);
    }
}
