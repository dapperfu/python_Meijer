package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Em, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6700Em implements Sc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC8780mm f66511a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6835Il f66512b;

    C6700Em(BinderC6971Mm binderC6971Mm, InterfaceC8780mm interfaceC8780mm, InterfaceC6835Il interfaceC6835Il) {
        this.f66511a = interfaceC8780mm;
        this.f66512b = interfaceC6835Il;
    }

    @Override // Sc.d
    public final void a(Ec.a aVar) {
        try {
            this.f66511a.b(aVar.d());
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
    }
}
