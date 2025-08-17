package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.p3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11212p3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v6 f85748a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B6 f85749b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC11281z3 f85750c;

    RunnableC11212p3(BinderC11281z3 binderC11281z3, v6 v6Var, B6 b62) {
        this.f85748a = v6Var;
        this.f85749b = b62;
        Objects.requireNonNull(binderC11281z3);
        this.f85750c = binderC11281z3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        BinderC11281z3 binderC11281z3 = this.f85750c;
        binderC11281z3.A9().C();
        v6 v6Var = this.f85748a;
        if (v6Var.B() != null) {
            binderC11281z3.A9().a0(v6Var, this.f85749b);
        } else {
            B6 b62 = this.f85749b;
            binderC11281z3.A9().b0(v6Var.f85926b, b62);
        }
    }
}
