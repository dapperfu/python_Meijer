package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Tl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7333Tl implements Uc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6960Il f71288a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Uc.a f71289b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC7838cm f71290c;

    C7333Tl(BinderC7838cm binderC7838cm, InterfaceC6960Il interfaceC6960Il, Uc.a aVar) {
        this.f71288a = interfaceC6960Il;
        this.f71289b = aVar;
        this.f71290c = binderC7838cm;
    }

    @Override // Uc.d
    public final void a(Gc.a aVar) {
        try {
            Sc.p.b(this.f71289b.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + aVar.a() + ". ErrorMessage = " + aVar.c() + ". ErrorDomain = " + aVar.b());
            this.f71288a.z8(aVar.d());
            this.f71288a.t1(aVar.a(), aVar.c());
            this.f71288a.zzg(aVar.a());
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
    }
}
