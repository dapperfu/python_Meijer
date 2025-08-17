package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class O0 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f81933e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f81934f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ BinderC10516s0 f81935g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C10544v1 f81936h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O0(C10544v1 c10544v1, String str, String str2, BinderC10516s0 binderC10516s0) {
        super(c10544v1, true);
        this.f81933e = str;
        this.f81934f = str2;
        this.f81935g = binderC10516s0;
        Objects.requireNonNull(c10544v1);
        this.f81936h = c10544v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f81936h.m())).getConditionalUserProperties(this.f81933e, this.f81934f, this.f81935g);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    protected final void b() {
        this.f81935g.P(null);
    }
}
