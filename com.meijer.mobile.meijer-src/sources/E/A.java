package E;

import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import java.util.Objects;

/* loaded from: classes.dex */
public class A implements O.A<O.B<byte[]>, O.B<androidx.camera.core.n>> {
    @Override // O.A
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public O.B<androidx.camera.core.n> apply(O.B<byte[]> b10) throws ImageCaptureException {
        androidx.camera.core.q qVar = new androidx.camera.core.q(androidx.camera.core.o.a(b10.h().getWidth(), b10.h().getHeight(), 256, 2));
        androidx.camera.core.n nVarE = ImageProcessingUtil.e(qVar, b10.c());
        qVar.j();
        Objects.requireNonNull(nVarE);
        G.f fVarD = b10.d();
        Objects.requireNonNull(fVarD);
        return O.B.k(nVarE, fVarD, b10.b(), b10.f(), b10.g(), b10.a());
    }
}
