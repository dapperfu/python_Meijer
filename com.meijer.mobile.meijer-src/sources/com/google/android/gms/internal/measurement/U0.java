package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes6.dex */
final class U0 extends A0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f82837a;

    U0(V0 v02, Runnable runnable) {
        this.f82837a = runnable;
        Objects.requireNonNull(v02);
    }

    @Override // com.google.android.gms.internal.measurement.B0
    public final void zze() {
        this.f82837a.run();
    }
}
