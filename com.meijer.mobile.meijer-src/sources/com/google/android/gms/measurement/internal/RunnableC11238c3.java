package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.c3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11238c3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C11282i f86223a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B6 f86224b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC11406z3 f86225c;

    RunnableC11238c3(BinderC11406z3 binderC11406z3, C11282i c11282i, B6 b62) {
        this.f86223a = c11282i;
        this.f86224b = b62;
        Objects.requireNonNull(binderC11406z3);
        this.f86225c = binderC11406z3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        BinderC11406z3 binderC11406z3 = this.f86225c;
        binderC11406z3.A9().C();
        C11282i c11282i = this.f86223a;
        if (c11282i.f86450c.B() == null) {
            binderC11406z3.A9().k0(c11282i, this.f86224b);
        } else {
            binderC11406z3.A9().i0(c11282i, this.f86224b);
        }
    }
}
