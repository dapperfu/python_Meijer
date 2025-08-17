package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class F5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f85018a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N5 f85019b;

    F5(N5 n52, long j10) {
        this.f85018a = j10;
        Objects.requireNonNull(n52);
        this.f85019b = n52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f85019b.q(this.f85018a);
    }
}
