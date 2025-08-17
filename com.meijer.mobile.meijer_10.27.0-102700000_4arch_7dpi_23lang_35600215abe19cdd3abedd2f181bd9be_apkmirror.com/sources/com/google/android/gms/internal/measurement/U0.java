package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes6.dex */
final class U0 extends A0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f81997a;

    U0(V0 v02, Runnable runnable) {
        this.f81997a = runnable;
        Objects.requireNonNull(v02);
    }

    @Override // com.google.android.gms.internal.measurement.B0
    public final void zze() {
        this.f81997a.run();
    }
}
