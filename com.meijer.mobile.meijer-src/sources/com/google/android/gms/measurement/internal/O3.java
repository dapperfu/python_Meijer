package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC10695y0;
import java.util.Objects;

/* loaded from: classes6.dex */
final class O3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC10695y0 f85984a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85985b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f85986c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f85987d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f85988e;

    O3(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC10695y0 interfaceC10695y0, String str, String str2, boolean z10) {
        this.f85984a = interfaceC10695y0;
        this.f85985b = str;
        this.f85986c = str2;
        this.f85987d = z10;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f85988e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f85988e.f85720a.H().f0(this.f85984a, this.f85985b, this.f85986c, this.f85987d);
    }
}
