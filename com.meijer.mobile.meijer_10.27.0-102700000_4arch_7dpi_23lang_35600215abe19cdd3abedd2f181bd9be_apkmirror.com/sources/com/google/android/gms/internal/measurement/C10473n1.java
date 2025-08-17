package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.n1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10473n1 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f82280e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10535u1 f82281f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10473n1(C10535u1 c10535u1, Activity activity) {
        super(c10535u1.f82423a, true);
        this.f82280e = activity;
        Objects.requireNonNull(c10535u1);
        this.f82281f = c10535u1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f82281f.f82423a.m())).onActivityStartedByScionActivityInfo(J0.B(this.f82280e), this.f82231b);
    }
}
