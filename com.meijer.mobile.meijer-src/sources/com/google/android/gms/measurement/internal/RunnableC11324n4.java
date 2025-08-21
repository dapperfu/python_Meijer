package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.n4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11324n4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C11297j6 f86561a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f86562b;

    RunnableC11324n4(AppMeasurementDynamiteService appMeasurementDynamiteService, C11297j6 c11297j6) {
        this.f86561a = c11297j6;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f86562b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f86562b.f85720a.z().G(this.f86561a);
    }
}
