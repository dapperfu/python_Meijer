package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.h1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10419h1 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f82200e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10544v1 f82201f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10419h1(C10544v1 c10544v1, boolean z10) {
        super(c10544v1, true);
        this.f82200e = z10;
        Objects.requireNonNull(c10544v1);
        this.f82201f = c10544v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f82201f.m())).setDataCollectionEnabled(this.f82200e);
    }
}
