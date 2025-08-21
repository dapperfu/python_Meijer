package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Em, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6825Em implements Uc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC8905mm f67351a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6960Il f67352b;

    C6825Em(BinderC7096Mm binderC7096Mm, InterfaceC8905mm interfaceC8905mm, InterfaceC6960Il interfaceC6960Il) {
        this.f67351a = interfaceC8905mm;
        this.f67352b = interfaceC6960Il;
    }

    @Override // Uc.d
    public final void a(Gc.a aVar) {
        try {
            this.f67351a.b(aVar.d());
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
    }
}
