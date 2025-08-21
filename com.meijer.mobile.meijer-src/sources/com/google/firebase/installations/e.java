package com.google.firebase.installations;

import Vd.C5517k;

/* loaded from: classes8.dex */
class e implements g {

    /* renamed from: a, reason: collision with root package name */
    final C5517k<String> f89596a;

    @Override // com.google.firebase.installations.g
    public boolean b(Exception exc) {
        return false;
    }

    public e(C5517k<String> c5517k) {
        this.f89596a = c5517k;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(Nf.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f89596a.e(dVar.d());
        return true;
    }
}
