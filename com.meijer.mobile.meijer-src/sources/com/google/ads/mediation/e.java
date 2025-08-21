package com.google.ads.mediation;

import Gc.h;
import Jc.f;
import Jc.j;
import Jc.k;
import Jc.m;
import Uc.n;
import com.google.android.gms.internal.ads.C9429rh;

/* loaded from: classes4.dex */
final class e extends Gc.c implements m, k, j {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f65250a;

    /* renamed from: b, reason: collision with root package name */
    final n f65251b;

    @Override // Gc.c
    public final void J() {
    }

    @Override // Gc.c
    public final void C() {
        this.f65251b.k(this.f65250a);
    }

    @Override // Gc.c
    public final void L() {
        this.f65251b.a(this.f65250a);
    }

    @Override // Jc.j
    public final void a(C9429rh c9429rh, String str) {
        this.f65251b.h(this.f65250a, c9429rh, str);
    }

    @Override // Jc.k
    public final void i(C9429rh c9429rh) {
        this.f65251b.c(this.f65250a, c9429rh);
    }

    @Override // Jc.m
    public final void j(f fVar) {
        this.f65251b.m(this.f65250a, new a(fVar));
    }

    @Override // Gc.c
    public final void p() {
        this.f65251b.e(this.f65250a);
    }

    @Override // Gc.c
    public final void q(h hVar) {
        this.f65251b.g(this.f65250a, hVar);
    }

    @Override // Gc.c
    public final void v() {
        this.f65251b.o(this.f65250a);
    }

    public e(AbstractAdViewAdapter abstractAdViewAdapter, n nVar) {
        this.f65250a = abstractAdViewAdapter;
        this.f65251b = nVar;
    }
}
