package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class T0 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f81987e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10544v1 f81988f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T0(C10544v1 c10544v1, String str) {
        super(c10544v1, true);
        this.f81987e = str;
        Objects.requireNonNull(c10544v1);
        this.f81988f = c10544v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f81988f.m())).endAdUnitExposure(this.f81987e, this.f82231b);
    }
}
