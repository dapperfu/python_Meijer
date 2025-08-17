package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.c1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10374c1 extends AbstractRunnableC10446k1 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f82141e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f82142f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f82143g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ BinderC10516s0 f82144h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ C10544v1 f82145i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10374c1(C10544v1 c10544v1, String str, String str2, boolean z10, BinderC10516s0 binderC10516s0) {
        super(c10544v1, true);
        this.f82141e = str;
        this.f82142f = str2;
        this.f82143g = z10;
        this.f82144h = binderC10516s0;
        Objects.requireNonNull(c10544v1);
        this.f82145i = c10544v1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    final void a() throws RemoteException {
        ((InterfaceC10543v0) com.google.android.gms.common.internal.r.l(this.f82145i.m())).getUserProperties(this.f82141e, this.f82142f, this.f82143g, this.f82144h);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC10446k1
    protected final void b() {
        this.f82144h.P(null);
    }
}
