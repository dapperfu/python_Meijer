package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.n4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11199n4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C11172j6 f85721a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f85722b;

    RunnableC11199n4(AppMeasurementDynamiteService appMeasurementDynamiteService, C11172j6 c11172j6) {
        this.f85721a = c11172j6;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f85722b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f85722b.f84880a.z().G(this.f85721a);
    }
}
