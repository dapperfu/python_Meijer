package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.h1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10544h1 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f83040e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10669v1 f83041f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10544h1(C10669v1 c10669v1, boolean z10) {
        super(c10669v1, true);
        this.f83040e = z10;
        Objects.requireNonNull(c10669v1);
        this.f83041f = c10669v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f83041f.m())).setDataCollectionEnabled(this.f83040e);
    }
}
