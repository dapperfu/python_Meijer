package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class Z0 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC10641s0 f82952e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10669v1 f82953f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z0(C10669v1 c10669v1, BinderC10641s0 binderC10641s0) {
        super(c10669v1, true);
        this.f82952e = binderC10641s0;
        Objects.requireNonNull(c10669v1);
        this.f82953f = c10669v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f82953f.m())).getCurrentScreenName(this.f82952e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    protected final void b() {
        this.f82952e.P(null);
    }
}
