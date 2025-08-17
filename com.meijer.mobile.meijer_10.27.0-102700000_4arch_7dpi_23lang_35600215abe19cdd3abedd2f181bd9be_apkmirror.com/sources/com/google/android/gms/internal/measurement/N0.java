package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class N0 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f81908e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f81909f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Bundle f81910g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C10544v1 f81911h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N0(C10544v1 c10544v1, String str, String str2, Bundle bundle) {
        super(c10544v1, true);
        this.f81908e = str;
        this.f81909f = str2;
        this.f81910g = bundle;
        Objects.requireNonNull(c10544v1);
        this.f81911h = c10544v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f81911h.m())).clearConditionalUserProperty(this.f81908e, this.f81909f, this.f81910g);
    }
}
