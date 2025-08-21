package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.b1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10490b1 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC10641s0 f82970e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10669v1 f82971f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10490b1(C10669v1 c10669v1, BinderC10641s0 binderC10641s0) {
        super(c10669v1, true);
        this.f82970e = binderC10641s0;
        Objects.requireNonNull(c10669v1);
        this.f82971f = c10669v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f82971f.m())).getCurrentScreenClass(this.f82970e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    protected final void b() {
        this.f82970e.P(null);
    }
}
