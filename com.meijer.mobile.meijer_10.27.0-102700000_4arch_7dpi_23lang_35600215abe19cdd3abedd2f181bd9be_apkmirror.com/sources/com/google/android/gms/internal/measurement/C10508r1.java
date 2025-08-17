package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.r1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10508r1 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f82358e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ BinderC10516s0 f82359f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10535u1 f82360g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10508r1(C10535u1 c10535u1, Activity activity, BinderC10516s0 binderC10516s0) {
        super(c10535u1.f82423a, true);
        this.f82358e = activity;
        this.f82359f = binderC10516s0;
        Objects.requireNonNull(c10535u1);
        this.f82360g = c10535u1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f82360g.f82423a.m())).onActivitySaveInstanceStateByScionActivityInfo(J0.B(this.f82358e), this.f82359f, this.f82231b);
    }
}
