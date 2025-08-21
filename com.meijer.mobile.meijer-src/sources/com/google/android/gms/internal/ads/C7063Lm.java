package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Lm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7063Lm implements Uc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9974wm f69264a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6960Il f69265b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC7096Mm f69266c;

    C7063Lm(BinderC7096Mm binderC7096Mm, InterfaceC9974wm interfaceC9974wm, InterfaceC6960Il interfaceC6960Il) {
        this.f69264a = interfaceC9974wm;
        this.f69265b = interfaceC6960Il;
        this.f69266c = binderC7096Mm;
    }

    @Override // Uc.d
    public final void a(Gc.a aVar) {
        try {
            this.f69264a.b(aVar.d());
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
    }
}
