package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Im, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6836Im implements Sc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9421sm f67678a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6835Il f67679b;

    C6836Im(BinderC6971Mm binderC6971Mm, InterfaceC9421sm interfaceC9421sm, InterfaceC6835Il interfaceC6835Il) {
        this.f67678a = interfaceC9421sm;
        this.f67679b = interfaceC6835Il;
    }

    @Override // Sc.d
    public final void a(Ec.a aVar) {
        try {
            this.f67678a.b(aVar.d());
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
    }
}
