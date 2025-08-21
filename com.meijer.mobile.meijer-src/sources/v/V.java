package v;

import androidx.camera.core.impl.i;
import u.C17296a;

/* loaded from: classes.dex */
class V implements i.b {

    /* renamed from: a, reason: collision with root package name */
    static final V f164924a = new V();

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
        C17296a c17296a = new C17296a(d10);
        aVar.u(c17296a.a0(iK));
        aVar.c(T0.e(c17296a.d0(U.c())));
        aVar.e(c17296a.Z());
    }

    V() {
    }
}
