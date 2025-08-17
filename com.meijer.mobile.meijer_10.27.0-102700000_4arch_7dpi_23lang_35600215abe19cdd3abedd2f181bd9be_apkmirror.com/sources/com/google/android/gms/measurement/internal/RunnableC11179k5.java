package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC10570y0;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.k5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11179k5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC10570y0 f85660a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f85661b;

    RunnableC11179k5(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC10570y0 interfaceC10570y0) {
        this.f85660a = interfaceC10570y0;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f85661b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f85661b;
        appMeasurementDynamiteService.f84880a.A().c0(this.f85660a, appMeasurementDynamiteService.f84880a.d());
    }
}
