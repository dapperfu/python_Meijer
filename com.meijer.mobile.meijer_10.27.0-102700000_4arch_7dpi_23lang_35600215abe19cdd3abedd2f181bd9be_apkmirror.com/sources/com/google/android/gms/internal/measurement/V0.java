package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class V0 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Runnable f82015e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10544v1 f82016f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V0(C10544v1 c10544v1, Runnable runnable) {
        super(c10544v1, true);
        this.f82015e = runnable;
        Objects.requireNonNull(c10544v1);
        this.f82016f = c10544v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f82016f.m())).retrieveAndUploadBatches(new U0(this, this.f82015e));
    }
}
