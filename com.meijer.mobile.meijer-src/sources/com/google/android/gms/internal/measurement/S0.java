package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class S0 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f82818e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10669v1 f82819f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S0(C10669v1 c10669v1, String str) {
        super(c10669v1, true);
        this.f82818e = str;
        Objects.requireNonNull(c10669v1);
        this.f82819f = c10669v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f82819f.m())).beginAdUnitExposure(this.f82818e, this.f83071b);
    }
}
