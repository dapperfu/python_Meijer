package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.j6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11297j6 implements Qd.z {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.E0 f86488a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f86489b;

    @Override // Qd.z
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f86488a.X0(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            X2 x22 = this.f86489b.f85720a;
            if (x22 != null) {
                x22.a().p().b("Event interceptor threw exception", e10);
            }
        }
    }

    C11297j6(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.E0 e02) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f86489b = appMeasurementDynamiteService;
        this.f86488a = e02;
    }
}
