package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.j3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11294j3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f86480a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC11406z3 f86481b;

    RunnableC11294j3(BinderC11406z3 binderC11406z3, B6 b62) {
        this.f86480a = b62;
        Objects.requireNonNull(binderC11406z3);
        this.f86481b = binderC11406z3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        BinderC11406z3 binderC11406z3 = this.f86481b;
        binderC11406z3.A9().C();
        binderC11406z3.A9().Z(this.f86480a);
    }
}
