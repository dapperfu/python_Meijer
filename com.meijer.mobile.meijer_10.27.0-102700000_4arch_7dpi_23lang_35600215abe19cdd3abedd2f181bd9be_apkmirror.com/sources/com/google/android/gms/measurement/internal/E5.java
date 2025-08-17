package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class E5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f85004a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N5 f85005b;

    E5(N5 n52, long j10) {
        this.f85004a = j10;
        Objects.requireNonNull(n52);
        this.f85005b = n52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f85005b.p(this.f85004a);
    }
}
