package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.d3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11246d3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C11282i f86354a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC11406z3 f86355b;

    RunnableC11246d3(BinderC11406z3 binderC11406z3, C11282i c11282i) {
        this.f86354a = c11282i;
        Objects.requireNonNull(binderC11406z3);
        this.f86355b = binderC11406z3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        BinderC11406z3 binderC11406z3 = this.f86355b;
        binderC11406z3.A9().C();
        C11282i c11282i = this.f86354a;
        if (c11282i.f86450c.B() == null) {
            binderC11406z3.A9().j0(c11282i);
        } else {
            binderC11406z3.A9().h0(c11282i);
        }
    }
}
