package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class M0 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f81830e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10544v1 f81831f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M0(C10544v1 c10544v1, Bundle bundle) {
        super(c10544v1, true);
        this.f81830e = bundle;
        Objects.requireNonNull(c10544v1);
        this.f81831f = c10544v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f81831f.m())).setConditionalUserProperty(this.f81830e, this.f82230a);
    }
}
