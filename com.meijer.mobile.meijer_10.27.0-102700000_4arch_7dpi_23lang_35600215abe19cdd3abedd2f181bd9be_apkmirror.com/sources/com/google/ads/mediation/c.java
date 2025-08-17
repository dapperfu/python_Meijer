package com.google.ads.mediation;

import Ec.h;
import Sc.l;

/* loaded from: classes4.dex */
final class c extends Rc.b {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f64406a;

    /* renamed from: b, reason: collision with root package name */
    final l f64407b;

    @Override // Ec.d
    public final void a(h hVar) {
        this.f64407b.j(this.f64406a, hVar);
    }

    @Override // Ec.d
    public final /* bridge */ /* synthetic */ void b(Rc.a aVar) {
        AbstractAdViewAdapter abstractAdViewAdapter = this.f64406a;
        Rc.a aVar2 = aVar;
        abstractAdViewAdapter.mInterstitialAd = aVar2;
        aVar2.c(new d(abstractAdViewAdapter, this.f64407b));
        this.f64407b.p(this.f64406a);
    }

    public c(AbstractAdViewAdapter abstractAdViewAdapter, l lVar) {
        this.f64406a = abstractAdViewAdapter;
        this.f64407b = lVar;
    }
}
