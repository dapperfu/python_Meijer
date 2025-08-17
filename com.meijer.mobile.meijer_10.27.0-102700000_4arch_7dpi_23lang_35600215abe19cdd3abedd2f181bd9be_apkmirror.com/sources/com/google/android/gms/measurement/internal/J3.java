package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class J3 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85073a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws IllegalStateException {
        this.f85073a.f84868a.b().r(runnable);
    }

    J3(C11268x4 c11268x4) {
        Objects.requireNonNull(c11268x4);
        this.f85073a = c11268x4;
    }
}
