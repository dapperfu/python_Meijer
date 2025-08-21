package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.c1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10499c1 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f82981e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f82982f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f82983g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ BinderC10641s0 f82984h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C10669v1 f82985i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10499c1(C10669v1 c10669v1, String str, String str2, boolean z10, BinderC10641s0 binderC10641s0) {
        super(c10669v1, true);
        this.f82981e = str;
        this.f82982f = str2;
        this.f82983g = z10;
        this.f82984h = binderC10641s0;
        Objects.requireNonNull(c10669v1);
        this.f82985i = c10669v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f82985i.m())).getUserProperties(this.f82981e, this.f82982f, this.f82983g, this.f82984h);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    protected final void b() {
        this.f82984h.P(null);
    }
}
