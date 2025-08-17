package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.a3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11097a3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f85348a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC11281z3 f85349b;

    RunnableC11097a3(BinderC11281z3 binderC11281z3, B6 b62) {
        this.f85348a = b62;
        Objects.requireNonNull(binderC11281z3);
        this.f85349b = binderC11281z3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        BinderC11281z3 binderC11281z3 = this.f85349b;
        binderC11281z3.A9().C();
        binderC11281z3.A9().g0(this.f85348a);
    }
}
