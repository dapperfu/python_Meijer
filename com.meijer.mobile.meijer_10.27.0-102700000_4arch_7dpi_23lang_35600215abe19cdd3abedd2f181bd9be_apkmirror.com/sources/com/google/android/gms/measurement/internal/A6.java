package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class A6 implements Od.A {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.E0 f84878a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f84879b;

    @Override // Od.A
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f84878a.V0(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            X2 x22 = this.f84879b.f84880a;
            if (x22 != null) {
                x22.a().p().b("Event listener threw exception", e10);
            }
        }
    }

    A6(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.E0 e02) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f84879b = appMeasurementDynamiteService;
        this.f84878a = e02;
    }
}
