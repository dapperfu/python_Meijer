package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.p3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11337p3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v6 f86588a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B6 f86589b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC11406z3 f86590c;

    RunnableC11337p3(BinderC11406z3 binderC11406z3, v6 v6Var, B6 b62) {
        this.f86588a = v6Var;
        this.f86589b = b62;
        Objects.requireNonNull(binderC11406z3);
        this.f86590c = binderC11406z3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        BinderC11406z3 binderC11406z3 = this.f86590c;
        binderC11406z3.A9().C();
        v6 v6Var = this.f86588a;
        if (v6Var.B() != null) {
            binderC11406z3.A9().a0(v6Var, this.f86589b);
        } else {
            B6 b62 = this.f86589b;
            binderC11406z3.A9().b0(v6Var.f86766b, b62);
        }
    }
}
