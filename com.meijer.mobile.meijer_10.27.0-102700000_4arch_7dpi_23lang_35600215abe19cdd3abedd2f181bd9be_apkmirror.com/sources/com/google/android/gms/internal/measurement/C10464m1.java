package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.m1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10464m1 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f82266e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Activity f82267f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10535u1 f82268g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10464m1(C10535u1 c10535u1, Bundle bundle, Activity activity) {
        super(c10535u1.f82423a, true);
        this.f82266e = bundle;
        this.f82267f = activity;
        Objects.requireNonNull(c10535u1);
        this.f82268g = c10535u1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        Bundle bundle;
        Bundle bundle2 = this.f82266e;
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
        InterfaceC10543v0 interfaceC10543v0 = (InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f82268g.f82423a.m());
        Activity activity = this.f82267f;
        interfaceC10543v0.onActivityCreatedByScionActivityInfo(J0.B(activity), bundle, this.f82231b);
    }
}
