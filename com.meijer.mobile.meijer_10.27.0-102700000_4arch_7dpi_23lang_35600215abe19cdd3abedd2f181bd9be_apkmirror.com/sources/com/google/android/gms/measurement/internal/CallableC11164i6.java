package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.i6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC11164i6 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f85632a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q6 f85633b;

    CallableC11164i6(q6 q6Var, B6 b62) {
        this.f85632a = b62;
        Objects.requireNonNull(q6Var);
        this.f85633b = q6Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        B6 b62 = this.f85632a;
        String str = (String) com.google.android.gms.common.internal.r.l(b62.f84903a);
        q6 q6Var = this.f85633b;
        E3 e3E = q6Var.e(str);
        Od.v vVar = Od.v.ANALYTICS_STORAGE;
        if (e3E.o(vVar) && E3.f(b62.f84921s, 100).o(vVar)) {
            return q6Var.m0(b62).p0();
        }
        q6Var.a().u().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
