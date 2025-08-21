package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.p1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10616p1 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f83166e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10660u1 f83167f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10616p1(C10660u1 c10660u1, Activity activity) {
        super(c10660u1.f83263a, true);
        this.f83166e = activity;
        Objects.requireNonNull(c10660u1);
        this.f83167f = c10660u1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f83167f.f83263a.m())).onActivityPausedByScionActivityInfo(J0.B(this.f83166e), this.f83071b);
    }
}
