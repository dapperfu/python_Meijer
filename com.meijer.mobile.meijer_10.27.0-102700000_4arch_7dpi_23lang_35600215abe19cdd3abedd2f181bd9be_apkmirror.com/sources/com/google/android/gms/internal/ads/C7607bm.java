package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.bm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7607bm implements Sc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC6835Il f72861a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BinderC7713cm f72862b;

    C7607bm(BinderC7713cm binderC7713cm, InterfaceC6835Il interfaceC6835Il) {
        this.f72861a = interfaceC6835Il;
        this.f72862b = binderC7713cm;
    }

    @Override // Sc.d
    public final void a(Ec.a aVar) {
        try {
            Qc.p.b(this.f72862b.f73236a.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + aVar.a() + ". ErrorMessage = " + aVar.c() + ". ErrorDomain = " + aVar.b());
            this.f72861a.G1(aVar.d());
            this.f72861a.n1(aVar.a(), aVar.c());
            this.f72861a.zzg(aVar.a());
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
    }
}
