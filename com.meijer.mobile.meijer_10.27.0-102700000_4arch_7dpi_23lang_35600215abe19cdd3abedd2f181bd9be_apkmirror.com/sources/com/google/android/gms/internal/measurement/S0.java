package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class S0 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f81978e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10544v1 f81979f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S0(C10544v1 c10544v1, String str) {
        super(c10544v1, true);
        this.f81978e = str;
        Objects.requireNonNull(c10544v1);
        this.f81979f = c10544v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f81979f.m())).beginAdUnitExposure(this.f81978e, this.f82231b);
    }
}
