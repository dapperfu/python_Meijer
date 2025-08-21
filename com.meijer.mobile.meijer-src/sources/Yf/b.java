package Yf;

import dg.g;

/* loaded from: classes8.dex */
final class b extends e {

    /* renamed from: b, reason: collision with root package name */
    private final g f43049b;

    @Override // Yf.e
    public boolean c() {
        if (!this.f43049b.n0()) {
            return false;
        }
        if (this.f43049b.j0() > 0 || this.f43049b.i0() > 0) {
            return true;
        }
        return this.f43049b.m0() && this.f43049b.l0().e0();
    }

    b(g gVar) {
        this.f43049b = gVar;
    }
}
