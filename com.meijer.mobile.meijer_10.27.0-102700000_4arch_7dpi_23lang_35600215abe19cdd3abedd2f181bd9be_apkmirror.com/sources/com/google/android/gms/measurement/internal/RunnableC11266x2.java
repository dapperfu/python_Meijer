package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.x2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11266x2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f86000a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11273y2 f86001b;

    RunnableC11266x2(C11273y2 c11273y2, boolean z10) {
        this.f86000a = z10;
        Objects.requireNonNull(c11273y2);
        this.f86001b = c11273y2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f86001b.c().q0(this.f86000a);
    }
}
