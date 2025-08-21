package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.m1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10589m1 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f83106e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Activity f83107f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10660u1 f83108g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10589m1(C10660u1 c10660u1, Bundle bundle, Activity activity) {
        super(c10660u1.f83263a, true);
        this.f83106e = bundle;
        this.f83107f = activity;
        Objects.requireNonNull(c10660u1);
        this.f83108g = c10660u1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        Bundle bundle;
        Bundle bundle2 = this.f83106e;
        if (bundle2 != null) {
            bundle = new Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = bundle2.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        InterfaceC10668v0 interfaceC10668v0 = (InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f83108g.f83263a.m());
        Activity activity = this.f83107f;
        interfaceC10668v0.onActivityCreatedByScionActivityInfo(J0.B(activity), bundle, this.f83071b);
    }
}
