package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class J3 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C11393x4 f85913a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws IllegalStateException {
        this.f85913a.f85708a.b().r(runnable);
    }

    J3(C11393x4 c11393x4) {
        Objects.requireNonNull(c11393x4);
        this.f85913a = c11393x4;
    }
}
