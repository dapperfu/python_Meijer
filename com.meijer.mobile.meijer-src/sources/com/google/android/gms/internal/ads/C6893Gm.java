package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Gm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6893Gm implements Uc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9226pm f68111a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6960Il f68112b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC7096Mm f68113c;

    C6893Gm(BinderC7096Mm binderC7096Mm, InterfaceC9226pm interfaceC9226pm, InterfaceC6960Il interfaceC6960Il) {
        this.f68111a = interfaceC9226pm;
        this.f68112b = interfaceC6960Il;
        this.f68113c = binderC7096Mm;
    }

    @Override // Uc.d
    public final void a(Gc.a aVar) {
        try {
            this.f68111a.b(aVar.d());
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
    }
}
