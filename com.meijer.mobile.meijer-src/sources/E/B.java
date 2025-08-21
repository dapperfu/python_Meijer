package E;

import androidx.camera.core.ImageCaptureException;

/* loaded from: classes.dex */
public class B implements O.A<O.B<androidx.camera.core.n>, androidx.camera.core.n> {
    @Override // O.A
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public androidx.camera.core.n apply(O.B<androidx.camera.core.n> b10) throws ImageCaptureException {
        androidx.camera.core.n nVarC = b10.c();
        androidx.camera.core.r rVar = new androidx.camera.core.r(nVarC, b10.h(), C.N.d(nVarC.S2().a(), nVarC.S2().getTimestamp(), b10.f(), b10.g()));
        rVar.R0(b10.b());
        return rVar;
    }
}
