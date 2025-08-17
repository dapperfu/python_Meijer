package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC10570y0;
import java.util.Objects;

/* loaded from: classes6.dex */
final class U2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC10570y0 f85242a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f85243b;

    U2(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC10570y0 interfaceC10570y0) {
        this.f85242a = interfaceC10570y0;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f85243b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f85243b.f84880a.H().p(this.f85242a);
    }
}
