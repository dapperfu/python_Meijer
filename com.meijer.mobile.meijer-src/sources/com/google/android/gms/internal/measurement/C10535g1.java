package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.g1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10535g1 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f83028e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ BinderC10641s0 f83029f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10669v1 f83030g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10535g1(C10669v1 c10669v1, String str, BinderC10641s0 binderC10641s0) {
        super(c10669v1, true);
        this.f83028e = str;
        this.f83029f = binderC10641s0;
        Objects.requireNonNull(c10669v1);
        this.f83030g = c10669v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f83030g.m())).getMaxUserProperties(this.f83028e, this.f83029f);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    protected final void b() {
        this.f83029f.P(null);
    }
}
