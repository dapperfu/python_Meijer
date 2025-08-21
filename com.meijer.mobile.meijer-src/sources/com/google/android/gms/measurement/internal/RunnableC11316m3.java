package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.m3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11316m3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ G f86526a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B6 f86527b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC11406z3 f86528c;

    RunnableC11316m3(BinderC11406z3 binderC11406z3, G g10, B6 b62) {
        this.f86526a = g10;
        this.f86527b = b62;
        Objects.requireNonNull(binderC11406z3);
        this.f86528c = binderC11406z3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        G g10 = this.f86526a;
        B6 b62 = this.f86527b;
        BinderC11406z3 binderC11406z3 = this.f86528c;
        binderC11406z3.E9(binderC11406z3.F9(g10, b62), b62);
    }
}
