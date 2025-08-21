package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class Q0 extends AbstractRunnableC10571k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ J0 f82803e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f82804f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f82805g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C10669v1 f82806h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q0(C10669v1 c10669v1, J0 j02, String str, String str2) {
        super(c10669v1, true);
        this.f82803e = j02;
        this.f82804f = str;
        this.f82805g = str2;
        Objects.requireNonNull(c10669v1);
        this.f82806h = c10669v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10571k1
    final void a() throws RemoteException {
        ((InterfaceC10668v0) com.google.android.gms.common.internal.r.l(this.f82806h.m())).setCurrentScreenByScionActivityInfo(this.f82803e, this.f82804f, this.f82805g, this.f83070a);
    }
}
