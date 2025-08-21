package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Im, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6961Im implements Uc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9546sm f68518a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6960Il f68519b;

    C6961Im(BinderC7096Mm binderC7096Mm, InterfaceC9546sm interfaceC9546sm, InterfaceC6960Il interfaceC6960Il) {
        this.f68518a = interfaceC9546sm;
        this.f68519b = interfaceC6960Il;
    }

    @Override // Uc.d
    public final void a(Gc.a aVar) {
        try {
            this.f68518a.b(aVar.d());
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
    }
}
