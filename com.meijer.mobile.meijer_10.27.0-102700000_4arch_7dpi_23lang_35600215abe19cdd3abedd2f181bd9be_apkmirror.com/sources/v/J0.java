package v;

import android.util.Size;
import androidx.camera.core.impl.w;
import u.C17169a;
import z.C18336p;

/* loaded from: classes.dex */
final class J0 implements w.e {

    /* renamed from: a, reason: collision with root package name */
    static final J0 f163722a = new J0();

    @Override // androidx.camera.core.impl.w.e
    public void a(Size size, androidx.camera.core.impl.D<?> d10, w.b bVar) {
        androidx.camera.core.impl.w wVarO = d10.o(null);
        androidx.camera.core.impl.k kVarZ = androidx.camera.core.impl.t.Z();
        int iP = androidx.camera.core.impl.w.b().p();
        if (wVarO != null) {
            iP = wVarO.p();
            bVar.b(wVarO.c());
            bVar.d(wVarO.l());
            bVar.c(wVarO.j());
            kVarZ = wVarO.f();
        }
        bVar.s(kVarZ);
        if (d10 instanceof androidx.camera.core.impl.u) {
            C18336p.b(size, bVar);
        }
        C17169a c17169a = new C17169a(d10);
        bVar.w(c17169a.a0(iP));
        bVar.f(c17169a.b0(N0.b()));
        bVar.k(c17169a.e0(M0.b()));
        bVar.e(T0.e(c17169a.d0(U.c())));
        bVar.x(d10.x());
        bVar.v(d10.E());
        androidx.camera.core.impl.s sVarB0 = androidx.camera.core.impl.s.b0();
        sVarB0.r(C17169a.f162459P, c17169a.c0(null));
        sVarB0.r(C17169a.f162454K, Long.valueOf(c17169a.f0(-1L)));
        bVar.g(sVarB0);
        bVar.g(c17169a.Z());
    }

    J0() {
    }
}
