package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class P0 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f82795e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10669v1 f82796f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P0(C10669v1 c10669v1, String str) {
        super(c10669v1, true);
        this.f82795e = str;
        Objects.requireNonNull(c10669v1);
        this.f82796f = c10669v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f82796f.m())).setUserId(this.f82795e, this.f83070a);
    }
}
