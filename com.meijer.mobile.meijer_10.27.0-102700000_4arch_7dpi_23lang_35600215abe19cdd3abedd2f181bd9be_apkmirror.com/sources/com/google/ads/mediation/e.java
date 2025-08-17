package com.google.ads.mediation;

import Ec.h;
import Hc.f;
import Hc.j;
import Hc.k;
import Hc.m;
import Sc.n;
import com.google.android.gms.internal.ads.C9304rh;

/* loaded from: classes4.dex */
final class e extends Ec.c implements m, k, j {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f64410a;

    /* renamed from: b, reason: collision with root package name */
    final n f64411b;

    @Override // Ec.c
    public final void J() {
    }

    @Override // Ec.c
    public final void C() {
        this.f64411b.l(this.f64410a);
    }

    @Override // Ec.c
    public final void L() {
        this.f64411b.a(this.f64410a);
    }

    @Override // Hc.j
    public final void a(C9304rh c9304rh, String str) {
        this.f64411b.h(this.f64410a, c9304rh, str);
    }

    @Override // Hc.k
    public final void i(C9304rh c9304rh) {
        this.f64411b.c(this.f64410a, c9304rh);
    }

    @Override // Hc.m
    public final void j(f fVar) {
        this.f64411b.d(this.f64410a, new a(fVar));
    }

    @Override // Ec.c
    public final void p() {
        this.f64411b.f(this.f64410a);
    }

    @Override // Ec.c
    public final void q(h hVar) {
        this.f64411b.i(this.f64410a, hVar);
    }

    @Override // Ec.c
    public final void v() {
        this.f64411b.o(this.f64410a);
    }

    public e(AbstractAdViewAdapter abstractAdViewAdapter, n nVar) {
        this.f64410a = abstractAdViewAdapter;
        this.f64411b = nVar;
    }
}
