package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.j6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11172j6 implements Od.z {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.E0 f85648a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f85649b;

    @Override // Od.z
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f85648a.V0(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            X2 x22 = this.f85649b.f84880a;
            if (x22 != null) {
                x22.a().p().b("Event interceptor threw exception", e10);
            }
        }
    }

    C11172j6(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.E0 e02) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.f85649b = appMeasurementDynamiteService;
        this.f85648a = e02;
    }
}
