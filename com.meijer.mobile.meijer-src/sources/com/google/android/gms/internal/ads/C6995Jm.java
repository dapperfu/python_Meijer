package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Jm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6995Jm implements Uc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC8584jm f68808a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6960Il f68809b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC7096Mm f68810c;

    C6995Jm(BinderC7096Mm binderC7096Mm, InterfaceC8584jm interfaceC8584jm, InterfaceC6960Il interfaceC6960Il) {
        this.f68808a = interfaceC8584jm;
        this.f68809b = interfaceC6960Il;
        this.f68810c = binderC7096Mm;
    }

    @Override // Uc.d
    public final void a(Gc.a aVar) {
        try {
            this.f68808a.b(aVar.d());
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
    }
}
