package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.r1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10633r1 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f83198e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ BinderC10641s0 f83199f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10660u1 f83200g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10633r1(C10660u1 c10660u1, Activity activity, BinderC10641s0 binderC10641s0) {
        super(c10660u1.f83263a, true);
        this.f83198e = activity;
        this.f83199f = binderC10641s0;
        Objects.requireNonNull(c10660u1);
        this.f83200g = c10660u1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f83200g.f83263a.m())).onActivitySaveInstanceStateByScionActivityInfo(J0.B(this.f83198e), this.f83199f, this.f83071b);
    }
}
