package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class A6 implements Qd.A {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.E0 f85718a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f85719b;

    @Override // Qd.A
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f85718a.X0(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            X2 x22 = this.f85719b.f85720a;
            if (x22 != null) {
                x22.a().p().b("Event listener threw exception", e10);
            }
        }
    }

    A6(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.E0 e02) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f85719b = appMeasurementDynamiteService;
        this.f85718a = e02;
    }
}
