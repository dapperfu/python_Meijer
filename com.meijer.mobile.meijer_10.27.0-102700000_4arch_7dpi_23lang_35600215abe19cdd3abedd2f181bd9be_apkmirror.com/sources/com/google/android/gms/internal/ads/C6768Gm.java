package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Gm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6768Gm implements Sc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9101pm f67271a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6835Il f67272b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC6971Mm f67273c;

    C6768Gm(BinderC6971Mm binderC6971Mm, InterfaceC9101pm interfaceC9101pm, InterfaceC6835Il interfaceC6835Il) {
        this.f67271a = interfaceC9101pm;
        this.f67272b = interfaceC6835Il;
        this.f67273c = binderC6971Mm;
    }

    @Override // Sc.d
    public final void a(Ec.a aVar) {
        try {
            this.f67271a.b(aVar.d());
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
    }
}
