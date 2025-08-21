package com.google.android.gms.measurement.internal;

import Qd.C4669a;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.l3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC11309l3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f86510a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC11406z3 f86511b;

    CallableC11309l3(BinderC11406z3 binderC11406z3, B6 b62) {
        this.f86510a = b62;
        Objects.requireNonNull(binderC11406z3);
        this.f86511b = binderC11406z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        BinderC11406z3 binderC11406z3 = this.f86511b;
        binderC11406z3.A9().C();
        return new C4669a(binderC11406z3.A9().Q0(this.f86510a.f85743a));
    }
}
