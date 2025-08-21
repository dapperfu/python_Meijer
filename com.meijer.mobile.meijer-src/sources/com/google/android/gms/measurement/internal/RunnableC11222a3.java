package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.a3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11222a3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f86188a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC11406z3 f86189b;

    RunnableC11222a3(BinderC11406z3 binderC11406z3, B6 b62) {
        this.f86188a = b62;
        Objects.requireNonNull(binderC11406z3);
        this.f86189b = binderC11406z3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        BinderC11406z3 binderC11406z3 = this.f86189b;
        binderC11406z3.A9().C();
        binderC11406z3.A9().g0(this.f86188a);
    }
}
