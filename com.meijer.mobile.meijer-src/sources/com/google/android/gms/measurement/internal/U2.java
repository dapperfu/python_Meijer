package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC10695y0;
import java.util.Objects;

/* loaded from: classes6.dex */
final class U2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC10695y0 f86082a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f86083b;

    U2(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC10695y0 interfaceC10695y0) {
        this.f86082a = interfaceC10695y0;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f86083b = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f86083b.f85720a.H().p(this.f86082a);
    }
}
