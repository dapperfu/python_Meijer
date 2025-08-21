package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Yl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7498Yl implements Uc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6960Il f72446a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC7838cm f72447b;

    C7498Yl(BinderC7838cm binderC7838cm, InterfaceC6960Il interfaceC6960Il) {
        this.f72446a = interfaceC6960Il;
        this.f72447b = binderC7838cm;
    }

    @Override // Uc.d
    public final void a(Gc.a aVar) {
        try {
            Sc.p.b(this.f72447b.f74076a.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + aVar.a() + ". ErrorMessage = " + aVar.c() + ". ErrorDomain = " + aVar.b());
            this.f72446a.z8(aVar.d());
            this.f72446a.t1(aVar.a(), aVar.c());
            this.f72446a.zzg(aVar.a());
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
    }
}
