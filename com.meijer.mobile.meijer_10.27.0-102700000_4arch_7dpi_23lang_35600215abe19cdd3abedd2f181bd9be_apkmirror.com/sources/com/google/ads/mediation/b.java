package com.google.ads.mediation;

import Ec.h;
import Mc.InterfaceC4098a;
import Sc.i;

/* loaded from: classes4.dex */
final class b extends Ec.c implements Fc.c, InterfaceC4098a {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f64404a;

    /* renamed from: b, reason: collision with root package name */
    final i f64405b;

    @Override // Ec.c
    public final void J() {
        this.f64405b.g(this.f64404a);
    }

    @Override // Ec.c
    public final void L() {
        this.f64405b.k(this.f64404a);
    }

    @Override // Ec.c
    public final void p() {
        this.f64405b.m(this.f64404a);
    }

    @Override // Ec.c
    public final void q(h hVar) {
        this.f64405b.r(this.f64404a, hVar);
    }

    @Override // Fc.c
    public final void s(String str, String str2) {
        this.f64405b.n(this.f64404a, str, str2);
    }

    @Override // Ec.c
    public final void v() {
        this.f64405b.e(this.f64404a);
    }

    public b(AbstractAdViewAdapter abstractAdViewAdapter, i iVar) {
        this.f64404a = abstractAdViewAdapter;
        this.f64405b = iVar;
    }
}
