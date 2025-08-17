package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class V3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f85253a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85254b;

    V3(C11268x4 c11268x4, long j10) {
        this.f85253a = j10;
        Objects.requireNonNull(c11268x4);
        this.f85254b = c11268x4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        C11268x4 c11268x4 = this.f85254b;
        c11268x4.f();
        c11268x4.h();
        X2 x22 = c11268x4.f84868a;
        x22.a().t().a("Resetting analytics data (FE)");
        X2 x23 = c11268x4.f84868a;
        N5 n5X = x23.x();
        n5X.f();
        n5X.f85137f.c();
        x23.J().n();
        boolean z10 = !c11268x4.f84868a.e();
        E2 e2V = x22.v();
        e2V.f84974f.b(this.f85253a);
        X2 x24 = e2V.f84868a;
        if (!TextUtils.isEmpty(x24.v().f84991w.a())) {
            e2V.f84991w.b(null);
        }
        e2V.f84985q.b(0L);
        e2V.f84986r.b(0L);
        if (!x24.u().J()) {
            e2V.w(z10);
        }
        e2V.f84992x.b(null);
        e2V.f84993y.b(0L);
        e2V.f84994z.b(null);
        x23.H().n();
        x23.x().f85136e.a();
        c11268x4.f86022s = z10;
        x23.H().o(new AtomicReference());
    }
}
