package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.b1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10365b1 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC10516s0 f82130e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10544v1 f82131f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10365b1(C10544v1 c10544v1, BinderC10516s0 binderC10516s0) {
        super(c10544v1, true);
        this.f82130e = binderC10516s0;
        Objects.requireNonNull(c10544v1);
        this.f82131f = c10544v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f82131f.m())).getCurrentScreenClass(this.f82130e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    protected final void b() {
        this.f82130e.P(null);
    }
}
