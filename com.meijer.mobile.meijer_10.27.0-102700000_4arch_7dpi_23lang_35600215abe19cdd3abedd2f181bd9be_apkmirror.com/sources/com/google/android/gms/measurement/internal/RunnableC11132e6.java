package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.e6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11132e6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r6 f85539a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q6 f85540b;

    RunnableC11132e6(q6 q6Var, r6 r6Var) {
        this.f85539a = r6Var;
        Objects.requireNonNull(q6Var);
        this.f85540b = q6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q6 q6Var = this.f85540b;
        q6Var.s0(this.f85539a);
        q6Var.y0();
    }
}
