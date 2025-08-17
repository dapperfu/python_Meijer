package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class Z2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f85330a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC11281z3 f85331b;

    Z2(BinderC11281z3 binderC11281z3, B6 b62) {
        this.f85330a = b62;
        Objects.requireNonNull(binderC11281z3);
        this.f85331b = binderC11281z3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        BinderC11281z3 binderC11281z3 = this.f85331b;
        binderC11281z3.A9().C();
        binderC11281z3.A9().f0(this.f85330a);
    }
}
