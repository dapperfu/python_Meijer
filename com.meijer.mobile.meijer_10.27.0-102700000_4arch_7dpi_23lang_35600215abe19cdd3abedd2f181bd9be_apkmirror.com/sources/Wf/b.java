package Wf;

import bg.g;

/* loaded from: classes7.dex */
final class b extends e {

    /* renamed from: b, reason: collision with root package name */
    private final g f38650b;

    @Override // Wf.e
    public boolean c() {
        if (!this.f38650b.n0()) {
            return false;
        }
        if (this.f38650b.j0() > 0 || this.f38650b.i0() > 0) {
            return true;
        }
        return this.f38650b.m0() && this.f38650b.l0().e0();
    }

    b(g gVar) {
        this.f38650b = gVar;
    }
}
