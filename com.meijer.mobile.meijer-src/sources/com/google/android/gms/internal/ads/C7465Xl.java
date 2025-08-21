package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Xl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7465Xl implements Uc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6960Il f72228a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC7838cm f72229b;

    C7465Xl(BinderC7838cm binderC7838cm, InterfaceC6960Il interfaceC6960Il) {
        this.f72228a = interfaceC6960Il;
        this.f72229b = binderC7838cm;
    }

    @Override // Uc.d
    public final void a(Gc.a aVar) {
        try {
            Sc.p.b(this.f72229b.f74076a.getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + aVar.a() + ". ErrorMessage = " + aVar.c() + ". ErrorDomain = " + aVar.b());
            this.f72228a.z8(aVar.d());
            this.f72228a.t1(aVar.a(), aVar.c());
            this.f72228a.zzg(aVar.a());
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
    }
}
