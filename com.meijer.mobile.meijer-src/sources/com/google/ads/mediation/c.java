package com.google.ads.mediation;

import Gc.h;
import Uc.l;

/* loaded from: classes4.dex */
final class c extends Tc.b {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f65246a;

    /* renamed from: b, reason: collision with root package name */
    final l f65247b;

    @Override // Gc.d
    public final void a(h hVar) {
        this.f65247b.p(this.f65246a, hVar);
    }

    @Override // Gc.d
    public final /* bridge */ /* synthetic */ void b(Tc.a aVar) {
        AbstractAdViewAdapter abstractAdViewAdapter = this.f65246a;
        Tc.a aVar2 = aVar;
        abstractAdViewAdapter.mInterstitialAd = aVar2;
        aVar2.c(new d(abstractAdViewAdapter, this.f65247b));
        this.f65247b.q(this.f65246a);
    }

    public c(AbstractAdViewAdapter abstractAdViewAdapter, l lVar) {
        this.f65246a = abstractAdViewAdapter;
        this.f65247b = lVar;
    }
}
