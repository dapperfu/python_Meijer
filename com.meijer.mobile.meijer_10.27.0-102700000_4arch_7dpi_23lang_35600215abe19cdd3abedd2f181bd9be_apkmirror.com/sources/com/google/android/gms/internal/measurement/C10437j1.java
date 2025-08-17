package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.j1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10437j1 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Long f82216e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f82217f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f82218g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Bundle f82219h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f82220i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ boolean f82221j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ C10544v1 f82222k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10437j1(C10544v1 c10544v1, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(c10544v1, true);
        this.f82216e = l10;
        this.f82217f = str;
        this.f82218g = str2;
        this.f82219h = bundle;
        this.f82220i = z10;
        this.f82221j = z11;
        Objects.requireNonNull(c10544v1);
        this.f82222k = c10544v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        Long l10 = this.f82216e;
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f82222k.m())).logEvent(this.f82217f, this.f82218g, this.f82219h, this.f82220i, this.f82221j, l10 == null ? this.f82230a : l10.longValue());
    }
}
