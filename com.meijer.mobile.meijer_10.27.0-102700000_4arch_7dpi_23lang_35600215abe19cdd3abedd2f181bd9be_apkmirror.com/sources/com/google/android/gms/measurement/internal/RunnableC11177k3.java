package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.k3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11177k3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f85653a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC11281z3 f85654b;

    RunnableC11177k3(BinderC11281z3 binderC11281z3, B6 b62) {
        this.f85653a = b62;
        Objects.requireNonNull(binderC11281z3);
        this.f85654b = binderC11281z3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException, NumberFormatException {
        BinderC11281z3 binderC11281z3 = this.f85654b;
        binderC11281z3.A9().C();
        q6 q6VarA9 = binderC11281z3.A9();
        q6VarA9.b().f();
        q6VarA9.M0();
        B6 b62 = this.f85653a;
        com.google.android.gms.common.internal.r.f(b62.f84903a);
        q6VarA9.N0(b62);
        q6VarA9.O0(b62);
    }
}
