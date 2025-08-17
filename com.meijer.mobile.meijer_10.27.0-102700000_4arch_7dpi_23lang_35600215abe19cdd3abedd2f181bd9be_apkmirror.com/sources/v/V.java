package v;

import androidx.camera.core.impl.i;
import u.C17169a;

/* loaded from: classes.dex */
class V implements i.b {

    /* renamed from: a, reason: collision with root package name */
    static final V f163890a = new V();

    @Override // androidx.camera.core.impl.i.b
    public void a(androidx.camera.core.impl.D<?> d10, i.a aVar) {
        androidx.camera.core.impl.i iVarS = d10.s(null);
        androidx.camera.core.impl.k kVarZ = androidx.camera.core.impl.t.Z();
        int iK = androidx.camera.core.impl.i.b().k();
        if (iVarS != null) {
            iK = iVarS.k();
            aVar.a(iVarS.c());
            kVarZ = iVarS.g();
        }
        aVar.r(kVarZ);
        C17169a c17169a = new C17169a(d10);
        aVar.u(c17169a.a0(iK));
        aVar.c(T0.e(c17169a.d0(U.c())));
        aVar.e(c17169a.Z());
    }

    V() {
    }
}
