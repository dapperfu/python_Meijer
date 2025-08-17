package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.n3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11198n3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ G f85718a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85719b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC11281z3 f85720c;

    RunnableC11198n3(BinderC11281z3 binderC11281z3, G g10, String str) {
        this.f85718a = g10;
        this.f85719b = str;
        Objects.requireNonNull(binderC11281z3);
        this.f85720c = binderC11281z3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        BinderC11281z3 binderC11281z3 = this.f85720c;
        binderC11281z3.A9().C();
        binderC11281z3.A9().g(this.f85718a, this.f85719b);
    }
}
