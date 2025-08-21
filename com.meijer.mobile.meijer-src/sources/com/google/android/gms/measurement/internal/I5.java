package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class I5 {

    /* renamed from: a, reason: collision with root package name */
    private H5 f85899a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N5 f85900b;

    final void a() {
        N5 n52 = this.f85900b;
        n52.f();
        H5 h52 = this.f85899a;
        if (h52 != null) {
            n52.r().removeCallbacks(h52);
        }
        X2 x22 = n52.f85708a;
        x22.v().f85828t.b(false);
        n52.m(false);
        if (x22.u().F(null, C11245d2.f86279U0)) {
            X2 x23 = n52.f85708a;
            if (x23.z().t0()) {
                x22.a().u().a("Retrying trigger URI registration in foreground");
                x23.z().v0();
            }
        }
    }

    final void b(long j10) {
        N5 n52 = this.f85900b;
        this.f85899a = new H5(this, n52.f85708a.zzaZ().a(), j10);
        n52.r().postDelayed(this.f85899a, 2000L);
    }

    I5(N5 n52) {
        Objects.requireNonNull(n52);
        this.f85900b = n52;
    }
}
