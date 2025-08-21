package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11402z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f86895a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f86896b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C0 f86897c;

    RunnableC11402z(C0 c02, String str, long j10) {
        this.f86895a = str;
        this.f86896b = j10;
        Objects.requireNonNull(c02);
        this.f86897c = c02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f86897c.k(this.f86895a, this.f86896b);
    }
}
