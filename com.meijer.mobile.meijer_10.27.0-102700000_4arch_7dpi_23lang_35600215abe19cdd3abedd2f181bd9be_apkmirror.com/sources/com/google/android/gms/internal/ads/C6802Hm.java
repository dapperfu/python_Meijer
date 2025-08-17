package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Hm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6802Hm implements Sc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9421sm f67506a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6835Il f67507b;

    C6802Hm(BinderC6971Mm binderC6971Mm, InterfaceC9421sm interfaceC9421sm, InterfaceC6835Il interfaceC6835Il) {
        this.f67506a = interfaceC9421sm;
        this.f67507b = interfaceC6835Il;
    }

    @Override // Sc.d
    public final void a(Ec.a aVar) {
        try {
            this.f67506a.b(aVar.d());
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
    }
}
