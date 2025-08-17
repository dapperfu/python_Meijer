package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC10570y0;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.v3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11253v3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC10570y0 f85919a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ G f85920b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f85921c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f85922d;

    RunnableC11253v3(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC10570y0 interfaceC10570y0, G g10, String str) {
        this.f85919a = interfaceC10570y0;
        this.f85920b = g10;
        this.f85921c = str;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f85922d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f85922d.f84880a.H().z(this.f85919a, this.f85920b, this.f85921c);
    }
}
