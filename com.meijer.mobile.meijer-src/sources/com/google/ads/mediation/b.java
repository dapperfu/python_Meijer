package com.google.ads.mediation;

import Gc.h;
import Oc.InterfaceC4376a;
import Uc.i;

/* loaded from: classes4.dex */
final class b extends Gc.c implements Hc.c, InterfaceC4376a {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f65244a;

    /* renamed from: b, reason: collision with root package name */
    final i f65245b;

    @Override // Gc.c
    public final void J() {
        this.f65245b.f(this.f65244a);
    }

    @Override // Gc.c
    public final void L() {
        this.f65245b.j(this.f65244a);
    }

    @Override // Gc.c
    public final void p() {
        this.f65245b.l(this.f65244a);
    }

    @Override // Gc.c
    public final void q(h hVar) {
        this.f65245b.i(this.f65244a, hVar);
    }

    @Override // Hc.c
    public final void s(String str, String str2) {
        this.f65245b.n(this.f65244a, str, str2);
    }

    @Override // Gc.c
    public final void v() {
        this.f65245b.d(this.f65244a);
    }

    public b(AbstractAdViewAdapter abstractAdViewAdapter, i iVar) {
        this.f65244a = abstractAdViewAdapter;
        this.f65245b = iVar;
    }
}
