package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC10695y0;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.v3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11378v3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC10695y0 f86759a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ G f86760b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f86761c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f86762d;

    RunnableC11378v3(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC10695y0 interfaceC10695y0, G g10, String str) {
        this.f86759a = interfaceC10695y0;
        this.f86760b = g10;
        this.f86761c = str;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f86762d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f86762d.f85720a.H().z(this.f86759a, this.f86760b, this.f86761c);
    }
}
