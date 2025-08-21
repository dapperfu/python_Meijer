package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC10695y0;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.k5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11304k5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC10695y0 f86500a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f86501b;

    RunnableC11304k5(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC10695y0 interfaceC10695y0) {
        this.f86500a = interfaceC10695y0;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f86501b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f86501b;
        appMeasurementDynamiteService.f85720a.A().c0(this.f86500a, appMeasurementDynamiteService.f85720a.d());
    }
}
