package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.m3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11191m3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ G f85686a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B6 f85687b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC11281z3 f85688c;

    RunnableC11191m3(BinderC11281z3 binderC11281z3, G g10, B6 b62) {
        this.f85686a = g10;
        this.f85687b = b62;
        Objects.requireNonNull(binderC11281z3);
        this.f85688c = binderC11281z3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        G g10 = this.f85686a;
        B6 b62 = this.f85687b;
        BinderC11281z3 binderC11281z3 = this.f85688c;
        binderC11281z3.E9(binderC11281z3.F9(g10, b62), b62);
    }
}
