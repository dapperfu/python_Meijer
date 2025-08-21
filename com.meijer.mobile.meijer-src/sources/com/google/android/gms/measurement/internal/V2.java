package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class V2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ G3 f86091a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ X2 f86092b;

    V2(X2 x22, G3 g32) {
        this.f86091a = g32;
        Objects.requireNonNull(x22);
        this.f86092b = x22;
    }

    @Override // java.lang.Runnable
    public final void run() throws ClassNotFoundException {
        X2 x22 = this.f86092b;
        G3 g32 = this.f86091a;
        x22.n(g32);
        x22.t(g32.f85872d);
    }
}
