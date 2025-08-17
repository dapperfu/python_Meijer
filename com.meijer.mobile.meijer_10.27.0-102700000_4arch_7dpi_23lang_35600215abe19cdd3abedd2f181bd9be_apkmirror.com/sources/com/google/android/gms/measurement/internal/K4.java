package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC10570y0;
import java.util.Objects;

/* loaded from: classes6.dex */
final class K4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC10570y0 f85089a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85090b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f85091c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f85092d;

    K4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC10570y0 interfaceC10570y0, String str, String str2) {
        this.f85089a = interfaceC10570y0;
        this.f85090b = str;
        this.f85091c = str2;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f85092d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f85092d.f84880a.H().d0(this.f85089a, this.f85090b, this.f85091c);
    }
}
