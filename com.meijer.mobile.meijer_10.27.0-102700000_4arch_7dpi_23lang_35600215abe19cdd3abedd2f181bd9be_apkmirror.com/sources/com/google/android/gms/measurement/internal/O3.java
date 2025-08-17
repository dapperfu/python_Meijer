package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC10570y0;
import java.util.Objects;

/* loaded from: classes6.dex */
final class O3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC10570y0 f85144a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85145b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f85146c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f85147d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f85148e;

    O3(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC10570y0 interfaceC10570y0, String str, String str2, boolean z10) {
        this.f85144a = interfaceC10570y0;
        this.f85145b = str;
        this.f85146c = str2;
        this.f85147d = z10;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f85148e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f85148e.f84880a.H().f0(this.f85144a, this.f85145b, this.f85146c, this.f85147d);
    }
}
