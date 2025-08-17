package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.b0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11102b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f85355a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0 f85356b;

    RunnableC11102b0(C0 c02, long j10) {
        this.f85355a = j10;
        Objects.requireNonNull(c02);
        this.f85356b = c02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f85356b.l(this.f85355a);
    }
}
