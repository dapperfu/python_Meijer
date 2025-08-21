package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class Z2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f86170a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC11406z3 f86171b;

    Z2(BinderC11406z3 binderC11406z3, B6 b62) {
        this.f86170a = b62;
        Objects.requireNonNull(binderC11406z3);
        this.f86171b = binderC11406z3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        BinderC11406z3 binderC11406z3 = this.f86171b;
        binderC11406z3.A9().C();
        binderC11406z3.A9().f0(this.f86170a);
    }
}
