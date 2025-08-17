package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.d3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11121d3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C11157i f85514a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC11281z3 f85515b;

    RunnableC11121d3(BinderC11281z3 binderC11281z3, C11157i c11157i) {
        this.f85514a = c11157i;
        Objects.requireNonNull(binderC11281z3);
        this.f85515b = binderC11281z3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        BinderC11281z3 binderC11281z3 = this.f85515b;
        binderC11281z3.A9().C();
        C11157i c11157i = this.f85514a;
        if (c11157i.f85610c.B() == null) {
            binderC11281z3.A9().j0(c11157i);
        } else {
            binderC11281z3.A9().h0(c11157i);
        }
    }
}
