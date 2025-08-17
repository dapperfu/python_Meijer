package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Yl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7373Yl implements Sc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6835Il f71606a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC7713cm f71607b;

    C7373Yl(BinderC7713cm binderC7713cm, InterfaceC6835Il interfaceC6835Il) {
        this.f71606a = interfaceC6835Il;
        this.f71607b = binderC7713cm;
    }

    @Override // Sc.d
    public final void a(Ec.a aVar) {
        try {
            Qc.p.b(this.f71607b.f73236a.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + aVar.a() + ". ErrorMessage = " + aVar.c() + ". ErrorDomain = " + aVar.b());
            this.f71606a.G1(aVar.d());
            this.f71606a.n1(aVar.a(), aVar.c());
            this.f71606a.zzg(aVar.a());
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
    }
}
