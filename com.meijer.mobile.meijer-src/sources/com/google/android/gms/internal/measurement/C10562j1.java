package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.j1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10562j1 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Long f83056e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f83057f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f83058g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Bundle f83059h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f83060i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ boolean f83061j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ C10669v1 f83062k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10562j1(C10669v1 c10669v1, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(c10669v1, true);
        this.f83056e = l10;
        this.f83057f = str;
        this.f83058g = str2;
        this.f83059h = bundle;
        this.f83060i = z10;
        this.f83061j = z11;
        Objects.requireNonNull(c10669v1);
        this.f83062k = c10669v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        Long l10 = this.f83056e;
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f83062k.m())).logEvent(this.f83057f, this.f83058g, this.f83059h, this.f83060i, this.f83061j, l10 == null ? this.f83070a : l10.longValue());
    }
}
