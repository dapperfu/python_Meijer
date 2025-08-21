package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class N0 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f82748e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f82749f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Bundle f82750g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C10669v1 f82751h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N0(C10669v1 c10669v1, String str, String str2, Bundle bundle) {
        super(c10669v1, true);
        this.f82748e = str;
        this.f82749f = str2;
        this.f82750g = bundle;
        Objects.requireNonNull(c10669v1);
        this.f82751h = c10669v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f82751h.m())).clearConditionalUserProperty(this.f82748e, this.f82749f, this.f82750g);
    }
}
