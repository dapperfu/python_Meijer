package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Jm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6870Jm implements Sc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC8459jm f67968a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6835Il f67969b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC6971Mm f67970c;

    C6870Jm(BinderC6971Mm binderC6971Mm, InterfaceC8459jm interfaceC8459jm, InterfaceC6835Il interfaceC6835Il) {
        this.f67968a = interfaceC8459jm;
        this.f67969b = interfaceC6835Il;
        this.f67970c = binderC6971Mm;
    }

    @Override // Sc.d
    public final void a(Ec.a aVar) {
        try {
            this.f67968a.b(aVar.d());
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
    }
}
