package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Zl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7531Zl implements Uc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6960Il f73078a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC7838cm f73079b;

    C7531Zl(BinderC7838cm binderC7838cm, InterfaceC6960Il interfaceC6960Il) {
        this.f73078a = interfaceC6960Il;
        this.f73079b = binderC7838cm;
    }

    @Override // Uc.d
    public final void a(Gc.a aVar) {
        try {
            Sc.p.b(this.f73079b.f74076a.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + aVar.a() + ". ErrorMessage = " + aVar.c() + ". ErrorDomain = " + aVar.b());
            this.f73078a.z8(aVar.d());
            this.f73078a.t1(aVar.a(), aVar.c());
            this.f73078a.zzg(aVar.a());
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
    }
}
