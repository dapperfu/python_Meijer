package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class X0 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC10516s0 f82092e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10544v1 f82093f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X0(C10544v1 c10544v1, BinderC10516s0 binderC10516s0) {
        super(c10544v1, true);
        this.f82092e = binderC10516s0;
        Objects.requireNonNull(c10544v1);
        this.f82093f = c10544v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f82093f.m())).getCachedAppInstanceId(this.f82092e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    protected final void b() {
        this.f82092e.P(null);
    }
}
