package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Fm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6734Fm implements Sc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC8780mm f66845a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6835Il f66846b;

    C6734Fm(BinderC6971Mm binderC6971Mm, InterfaceC8780mm interfaceC8780mm, InterfaceC6835Il interfaceC6835Il) {
        this.f66845a = interfaceC8780mm;
        this.f66846b = interfaceC6835Il;
    }

    @Override // Sc.d
    public final void a(Ec.a aVar) {
        try {
            this.f66845a.b(aVar.d());
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
    }
}
