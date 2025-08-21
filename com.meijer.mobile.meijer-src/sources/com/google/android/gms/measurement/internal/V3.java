package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class V3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f86093a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11393x4 f86094b;

    V3(C11393x4 c11393x4, long j10) {
        this.f86093a = j10;
        Objects.requireNonNull(c11393x4);
        this.f86094b = c11393x4;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        C11393x4 c11393x4 = this.f86094b;
        c11393x4.f();
        c11393x4.h();
        X2 x22 = c11393x4.f85708a;
        x22.a().t().a("Resetting analytics data (FE)");
        X2 x23 = c11393x4.f85708a;
        N5 n5X = x23.x();
        n5X.f();
        n5X.f85977f.c();
        x23.J().n();
        boolean z10 = !c11393x4.f85708a.e();
        E2 e2V = x22.v();
        e2V.f85814f.b(this.f86093a);
        X2 x24 = e2V.f85708a;
        if (!TextUtils.isEmpty(x24.v().f85831w.a())) {
            e2V.f85831w.b(null);
        }
        e2V.f85825q.b(0L);
        e2V.f85826r.b(0L);
        if (!x24.u().J()) {
            e2V.w(z10);
        }
        e2V.f85832x.b(null);
        e2V.f85833y.b(0L);
        e2V.f85834z.b(null);
        x23.H().n();
        x23.x().f85976e.a();
        c11393x4.f86862s = z10;
        x23.H().o(new AtomicReference());
    }
}
