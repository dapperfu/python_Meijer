package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class M0 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f82670e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10669v1 f82671f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M0(C10669v1 c10669v1, Bundle bundle) {
        super(c10669v1, true);
        this.f82670e = bundle;
        Objects.requireNonNull(c10669v1);
        this.f82671f = c10669v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f82671f.m())).setConditionalUserProperty(this.f82670e, this.f83070a);
    }
}
