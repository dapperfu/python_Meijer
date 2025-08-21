package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.g4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11271g4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Boolean f86422a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11393x4 f86423b;

    RunnableC11271g4(C11393x4 c11393x4, Boolean bool) {
        this.f86422a = bool;
        Objects.requireNonNull(c11393x4);
        this.f86423b = c11393x4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f86423b.U(this.f86422a, true);
    }
}
