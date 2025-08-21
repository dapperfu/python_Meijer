package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
final class Y2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f86156a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC11406z3 f86157b;

    Y2(BinderC11406z3 binderC11406z3, String str) {
        this.f86156a = str;
        Objects.requireNonNull(binderC11406z3);
        this.f86157b = binderC11406z3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        BinderC11406z3 binderC11406z3 = this.f86157b;
        binderC11406z3.A9().C();
        return binderC11406z3.A9().D0().A0(this.f86156a);
    }
}
