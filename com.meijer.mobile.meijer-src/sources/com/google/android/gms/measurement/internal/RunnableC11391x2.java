package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.x2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11391x2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f86840a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11398y2 f86841b;

    RunnableC11391x2(C11398y2 c11398y2, boolean z10) {
        this.f86840a = z10;
        Objects.requireNonNull(c11398y2);
        this.f86841b = c11398y2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f86841b.c().q0(this.f86840a);
    }
}
