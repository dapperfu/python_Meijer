package com.google.firebase.installations;

import Td.C5233k;

/* loaded from: classes7.dex */
class d implements g {

    /* renamed from: a, reason: collision with root package name */
    private final h f88754a;

    /* renamed from: b, reason: collision with root package name */
    private final C5233k<f> f88755b;

    @Override // com.google.firebase.installations.g
    public boolean a(Exception exc) {
        this.f88755b.d(exc);
        return true;
    }

    public d(h hVar, C5233k<f> c5233k) {
        this.f88754a = hVar;
        this.f88755b = c5233k;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(Lf.d dVar) {
        if (dVar.k() && !this.f88754a.f(dVar)) {
            this.f88755b.c(f.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
            return true;
        }
        return false;
    }
}
