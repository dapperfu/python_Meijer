package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.g4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11146g4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Boolean f85582a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85583b;

    RunnableC11146g4(C11268x4 c11268x4, Boolean bool) {
        this.f85582a = bool;
        Objects.requireNonNull(c11268x4);
        this.f85583b = c11268x4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f85583b.U(this.f85582a, true);
    }
}
