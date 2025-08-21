package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class L0 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f82661e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f82662f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Object f82663g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f82664h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C10669v1 f82665i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L0(C10669v1 c10669v1, String str, String str2, Object obj, boolean z10) {
        super(c10669v1, true);
        this.f82661e = str;
        this.f82662f = str2;
        this.f82663g = obj;
        this.f82664h = z10;
        Objects.requireNonNull(c10669v1);
        this.f82665i = c10669v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f82665i.m())).setUserProperty(this.f82661e, this.f82662f, com.google.android.gms.dynamic.d.I2(this.f82663g), this.f82664h, this.f83070a);
    }
}
