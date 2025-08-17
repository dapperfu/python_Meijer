package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Tl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7208Tl implements Sc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6835Il f70448a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Sc.a f70449b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC7713cm f70450c;

    C7208Tl(BinderC7713cm binderC7713cm, InterfaceC6835Il interfaceC6835Il, Sc.a aVar) {
        this.f70448a = interfaceC6835Il;
        this.f70449b = aVar;
        this.f70450c = binderC7713cm;
    }

    @Override // Sc.d
    public final void a(Ec.a aVar) {
        try {
            Qc.p.b(this.f70449b.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + aVar.a() + ". ErrorMessage = " + aVar.c() + ". ErrorDomain = " + aVar.b());
            this.f70448a.G1(aVar.d());
            this.f70448a.n1(aVar.a(), aVar.c());
            this.f70448a.zzg(aVar.a());
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
    }
}
