package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.am, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7625am implements Uc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6960Il f73328a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC7838cm f73329b;

    C7625am(BinderC7838cm binderC7838cm, InterfaceC6960Il interfaceC6960Il) {
        this.f73328a = interfaceC6960Il;
        this.f73329b = binderC7838cm;
    }

    @Override // Uc.d
    public final void a(Gc.a aVar) {
        try {
            Sc.p.b(this.f73329b.f74076a.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + aVar.a() + ". ErrorMessage = " + aVar.c() + ". ErrorDomain = " + aVar.b());
            this.f73328a.z8(aVar.d());
            this.f73328a.t1(aVar.a(), aVar.c());
            this.f73328a.zzg(aVar.a());
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
    }
}
