package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.c3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11113c3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C11157i f85383a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B6 f85384b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC11281z3 f85385c;

    RunnableC11113c3(BinderC11281z3 binderC11281z3, C11157i c11157i, B6 b62) {
        this.f85383a = c11157i;
        this.f85384b = b62;
        Objects.requireNonNull(binderC11281z3);
        this.f85385c = binderC11281z3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        BinderC11281z3 binderC11281z3 = this.f85385c;
        binderC11281z3.A9().C();
        C11157i c11157i = this.f85383a;
        if (c11157i.f85610c.B() == null) {
            binderC11281z3.A9().k0(c11157i, this.f85384b);
        } else {
            binderC11281z3.A9().i0(c11157i, this.f85384b);
        }
    }
}
