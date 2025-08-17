package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.z5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11283z5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q6 f86073a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f86074b;

    RunnableC11283z5(D5 d52, q6 q6Var, Runnable runnable) {
        this.f86073a = q6Var;
        this.f86074b = runnable;
        Objects.requireNonNull(d52);
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        q6 q6Var = this.f86073a;
        q6Var.C();
        q6Var.B(this.f86074b);
        q6Var.p();
    }
}
