package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.d1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10383d1 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f82151e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f82152f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10544v1 f82153g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10383d1(C10544v1 c10544v1, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(c10544v1, false);
        this.f82151e = str;
        this.f82152f = obj;
        Objects.requireNonNull(c10544v1);
        this.f82153g = c10544v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f82153g.m())).logHealthData(5, this.f82151e, com.google.android.gms.dynamic.d.F2(this.f82152f), com.google.android.gms.dynamic.d.F2(null), com.google.android.gms.dynamic.d.F2(null));
    }
}
