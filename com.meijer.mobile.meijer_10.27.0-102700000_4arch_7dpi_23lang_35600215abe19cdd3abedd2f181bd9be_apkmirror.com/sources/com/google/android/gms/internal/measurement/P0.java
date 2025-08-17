package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class P0 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f81955e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10544v1 f81956f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P0(C10544v1 c10544v1, String str) {
        super(c10544v1, true);
        this.f81955e = str;
        Objects.requireNonNull(c10544v1);
        this.f81956f = c10544v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f81956f.m())).setUserId(this.f81955e, this.f82230a);
    }
}
