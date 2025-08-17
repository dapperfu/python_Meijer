package com.google.android.gms.measurement.internal;

import Od.C4463a;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.l3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class CallableC11184l3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f85670a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC11281z3 f85671b;

    CallableC11184l3(BinderC11281z3 binderC11281z3, B6 b62) {
        this.f85670a = b62;
        Objects.requireNonNull(binderC11281z3);
        this.f85671b = binderC11281z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        BinderC11281z3 binderC11281z3 = this.f85671b;
        binderC11281z3.A9().C();
        return new C4463a(binderC11281z3.A9().Q0(this.f85670a.f84903a));
    }
}
