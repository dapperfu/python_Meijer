package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Vl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7274Vl implements Sc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6835Il f70912a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC7713cm f70913b;

    C7274Vl(BinderC7713cm binderC7713cm, InterfaceC6835Il interfaceC6835Il) {
        this.f70912a = interfaceC6835Il;
        this.f70913b = binderC7713cm;
    }

    @Override // Sc.d
    public final void a(Ec.a aVar) {
        try {
            Qc.p.b(this.f70913b.f73236a.getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + aVar.a() + ". ErrorMessage = " + aVar.c() + ". ErrorDomain = " + aVar.b());
            this.f70912a.G1(aVar.d());
            this.f70912a.n1(aVar.a(), aVar.c());
            this.f70912a.zzg(aVar.a());
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
    }
}
