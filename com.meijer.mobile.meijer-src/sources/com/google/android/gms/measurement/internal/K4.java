package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC10695y0;
import java.util.Objects;

/* loaded from: classes6.dex */
final class K4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC10695y0 f85929a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85930b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f85931c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f85932d;

    K4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC10695y0 interfaceC10695y0, String str, String str2) {
        this.f85929a = interfaceC10695y0;
        this.f85930b = str;
        this.f85931c = str2;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f85932d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f85932d.f85720a.H().d0(this.f85929a, this.f85930b, this.f85931c);
    }
}
