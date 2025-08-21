package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.i1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10553i1 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC10580l1 f83051e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10669v1 f83052f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10553i1(C10669v1 c10669v1, BinderC10580l1 binderC10580l1) {
        super(c10669v1, true);
        this.f83051e = binderC10580l1;
        Objects.requireNonNull(c10669v1);
        this.f83052f = c10669v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f83052f.m())).registerOnMeasurementEventListener(this.f83051e);
    }
}
