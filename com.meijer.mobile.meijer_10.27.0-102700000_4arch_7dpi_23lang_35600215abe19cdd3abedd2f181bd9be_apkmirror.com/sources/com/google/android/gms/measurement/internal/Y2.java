package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
final class Y2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f85316a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC11281z3 f85317b;

    Y2(BinderC11281z3 binderC11281z3, String str) {
        this.f85316a = str;
        Objects.requireNonNull(binderC11281z3);
        this.f85317b = binderC11281z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        BinderC11281z3 binderC11281z3 = this.f85317b;
        binderC11281z3.A9().C();
        return binderC11281z3.A9().D0().A0(this.f85316a);
    }
}
