package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.f1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10526f1 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f83018e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ BinderC10641s0 f83019f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10669v1 f83020g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10526f1(C10669v1 c10669v1, Bundle bundle, BinderC10641s0 binderC10641s0) {
        super(c10669v1, true);
        this.f83018e = bundle;
        this.f83019f = binderC10641s0;
        Objects.requireNonNull(c10669v1);
        this.f83020g = c10669v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f83020g.m())).performAction(this.f83018e, this.f83019f, this.f83070a);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    protected final void b() {
        this.f83019f.P(null);
    }
}
