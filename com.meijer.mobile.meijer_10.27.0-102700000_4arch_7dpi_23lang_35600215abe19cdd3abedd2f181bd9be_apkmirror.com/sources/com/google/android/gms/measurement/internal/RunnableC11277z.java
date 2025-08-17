package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11277z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f86055a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f86056b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0 f86057c;

    RunnableC11277z(C0 c02, String str, long j10) {
        this.f86055a = str;
        this.f86056b = j10;
        Objects.requireNonNull(c02);
        this.f86057c = c02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f86057c.k(this.f86055a, this.f86056b);
    }
}
