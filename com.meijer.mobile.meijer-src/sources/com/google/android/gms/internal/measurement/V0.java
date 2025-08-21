package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class V0 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Runnable f82855e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10669v1 f82856f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V0(C10669v1 c10669v1, Runnable runnable) {
        super(c10669v1, true);
        this.f82855e = runnable;
        Objects.requireNonNull(c10669v1);
        this.f82856f = c10669v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f82856f.m())).retrieveAndUploadBatches(new U0(this, this.f82855e));
    }
}
