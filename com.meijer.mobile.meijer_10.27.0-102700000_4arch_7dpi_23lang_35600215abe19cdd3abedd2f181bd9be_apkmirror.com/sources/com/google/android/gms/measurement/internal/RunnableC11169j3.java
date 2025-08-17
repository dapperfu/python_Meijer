package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.j3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11169j3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f85640a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC11281z3 f85641b;

    RunnableC11169j3(BinderC11281z3 binderC11281z3, B6 b62) {
        this.f85640a = b62;
        Objects.requireNonNull(binderC11281z3);
        this.f85641b = binderC11281z3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        BinderC11281z3 binderC11281z3 = this.f85641b;
        binderC11281z3.A9().C();
        binderC11281z3.A9().Z(this.f85640a);
    }
}
