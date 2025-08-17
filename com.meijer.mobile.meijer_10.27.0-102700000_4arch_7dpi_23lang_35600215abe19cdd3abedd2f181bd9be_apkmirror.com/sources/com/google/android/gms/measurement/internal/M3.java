package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class M3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f85110a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85111b;

    M3(C11268x4 c11268x4, boolean z10) {
        this.f85110a = z10;
        Objects.requireNonNull(c11268x4);
        this.f85111b = c11268x4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        C11268x4 c11268x4 = this.f85111b;
        X2 x22 = c11268x4.f84868a;
        boolean zE = x22.e();
        boolean zD = x22.d();
        boolean z10 = this.f85110a;
        x22.N(z10);
        if (zD == z10) {
            x22.a().u().b("Default data collection state already set to", Boolean.valueOf(z10));
        }
        if (x22.e() == zE || x22.e() != x22.d()) {
            x22.a().r().c("Default data collection is different than actual status", Boolean.valueOf(z10), Boolean.valueOf(zE));
        }
        c11268x4.W();
    }
}
