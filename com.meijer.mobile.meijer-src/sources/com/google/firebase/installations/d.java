package com.google.firebase.installations;

import Vd.C5517k;

/* loaded from: classes8.dex */
class d implements g {

    /* renamed from: a, reason: collision with root package name */
    private final h f89594a;

    /* renamed from: b, reason: collision with root package name */
    private final C5517k<f> f89595b;

    @Override // com.google.firebase.installations.g
    public boolean b(Exception exc) {
        this.f89595b.d(exc);
        return true;
    }

    public d(h hVar, C5517k<f> c5517k) {
        this.f89594a = hVar;
        this.f89595b = c5517k;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(Nf.d dVar) {
        if (dVar.k() && !this.f89594a.f(dVar)) {
            this.f89595b.c(f.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
            return true;
        }
        return false;
    }
}
