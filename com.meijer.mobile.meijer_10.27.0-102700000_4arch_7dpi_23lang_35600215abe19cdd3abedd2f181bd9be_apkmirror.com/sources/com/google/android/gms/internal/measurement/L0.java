package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class L0 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f81821e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f81822f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Object f81823g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f81824h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C10544v1 f81825i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L0(C10544v1 c10544v1, String str, String str2, Object obj, boolean z10) {
        super(c10544v1, true);
        this.f81821e = str;
        this.f81822f = str2;
        this.f81823g = obj;
        this.f81824h = z10;
        Objects.requireNonNull(c10544v1);
        this.f81825i = c10544v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f81825i.m())).setUserProperty(this.f81821e, this.f81822f, com.google.android.gms.dynamic.d.F2(this.f81823g), this.f81824h, this.f82230a);
    }
}
