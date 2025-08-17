package com.google.firebase.installations;

import Td.C5233k;

/* loaded from: classes7.dex */
class e implements g {

    /* renamed from: a, reason: collision with root package name */
    final C5233k<String> f88756a;

    @Override // com.google.firebase.installations.g
    public boolean a(Exception exc) {
        return false;
    }

    public e(C5233k<String> c5233k) {
        this.f88756a = c5233k;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(Lf.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f88756a.e(dVar.d());
        return true;
    }
}
