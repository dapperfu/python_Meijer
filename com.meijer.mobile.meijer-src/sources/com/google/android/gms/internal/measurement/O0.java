package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class O0 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f82773e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f82774f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ BinderC10641s0 f82775g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C10669v1 f82776h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O0(C10669v1 c10669v1, String str, String str2, BinderC10641s0 binderC10641s0) {
        super(c10669v1, true);
        this.f82773e = str;
        this.f82774f = str2;
        this.f82775g = binderC10641s0;
        Objects.requireNonNull(c10669v1);
        this.f82776h = c10669v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f82776h.m())).getConditionalUserProperties(this.f82773e, this.f82774f, this.f82775g);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    protected final void b() {
        this.f82775g.P(null);
    }
}
