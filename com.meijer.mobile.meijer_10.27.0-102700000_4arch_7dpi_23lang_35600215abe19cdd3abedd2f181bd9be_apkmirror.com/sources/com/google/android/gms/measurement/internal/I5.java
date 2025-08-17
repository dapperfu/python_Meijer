package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class I5 {

    /* renamed from: a, reason: collision with root package name */
    private H5 f85059a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N5 f85060b;

    final void a() {
        N5 n52 = this.f85060b;
        n52.f();
        H5 h52 = this.f85059a;
        if (h52 != null) {
            n52.r().removeCallbacks(h52);
        }
        X2 x22 = n52.f84868a;
        x22.v().f84988t.b(false);
        n52.m(false);
        if (x22.u().F(null, C11120d2.f85439U0)) {
            X2 x23 = n52.f84868a;
            if (x23.z().t0()) {
                x22.a().u().a("Retrying trigger URI registration in foreground");
                x23.z().v0();
            }
        }
    }

    final void b(long j10) {
        N5 n52 = this.f85060b;
        this.f85059a = new H5(this, n52.f84868a.zzaZ().a(), j10);
        n52.r().postDelayed(this.f85059a, 2000L);
    }

    I5(N5 n52) {
        Objects.requireNonNull(n52);
        this.f85060b = n52;
    }
}
