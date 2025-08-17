package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.f1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10401f1 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f82178e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ BinderC10516s0 f82179f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10544v1 f82180g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10401f1(C10544v1 c10544v1, Bundle bundle, BinderC10516s0 binderC10516s0) {
        super(c10544v1, true);
        this.f82178e = bundle;
        this.f82179f = binderC10516s0;
        Objects.requireNonNull(c10544v1);
        this.f82180g = c10544v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f82180g.m())).performAction(this.f82178e, this.f82179f, this.f82230a);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    protected final void b() {
        this.f82179f.P(null);
    }
}
