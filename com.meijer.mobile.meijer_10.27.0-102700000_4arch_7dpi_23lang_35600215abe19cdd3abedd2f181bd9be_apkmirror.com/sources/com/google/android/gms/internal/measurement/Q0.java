package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class Q0 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ J0 f81963e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f81964f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f81965g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C10544v1 f81966h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q0(C10544v1 c10544v1, J0 j02, String str, String str2) {
        super(c10544v1, true);
        this.f81963e = j02;
        this.f81964f = str;
        this.f81965g = str2;
        Objects.requireNonNull(c10544v1);
        this.f81966h = c10544v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f81966h.m())).setCurrentScreenByScionActivityInfo(this.f81963e, this.f81964f, this.f81965g, this.f82230a);
    }
}
