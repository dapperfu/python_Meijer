package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Vl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7399Vl implements Uc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6960Il f71752a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC7838cm f71753b;

    C7399Vl(BinderC7838cm binderC7838cm, InterfaceC6960Il interfaceC6960Il) {
        this.f71752a = interfaceC6960Il;
        this.f71753b = binderC7838cm;
    }

    @Override // Uc.d
    public final void a(Gc.a aVar) {
        try {
            Sc.p.b(this.f71753b.f74076a.getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + aVar.a() + ". ErrorMessage = " + aVar.c() + ". ErrorDomain = " + aVar.b());
            this.f71752a.z8(aVar.d());
            this.f71752a.t1(aVar.a(), aVar.c());
            this.f71752a.zzg(aVar.a());
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
    }
}
