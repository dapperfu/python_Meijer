package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.i1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10428i1 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC10455l1 f82211e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10544v1 f82212f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10428i1(C10544v1 c10544v1, BinderC10455l1 binderC10455l1) {
        super(c10544v1, true);
        this.f82211e = binderC10455l1;
        Objects.requireNonNull(c10544v1);
        this.f82212f = c10544v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f82212f.m())).registerOnMeasurementEventListener(this.f82211e);
    }
}
