package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.d1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10508d1 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f82991e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f82992f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10669v1 f82993g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10508d1(C10669v1 c10669v1, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(c10669v1, false);
        this.f82991e = str;
        this.f82992f = obj;
        Objects.requireNonNull(c10669v1);
        this.f82993g = c10669v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f82993g.m())).logHealthData(5, this.f82991e, com.google.android.gms.dynamic.d.I2(this.f82992f), com.google.android.gms.dynamic.d.I2(null), com.google.android.gms.dynamic.d.I2(null));
    }
}
