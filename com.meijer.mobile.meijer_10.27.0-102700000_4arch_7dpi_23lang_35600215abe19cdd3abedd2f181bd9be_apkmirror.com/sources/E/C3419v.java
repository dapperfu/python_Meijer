package E;

import F.l0;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.utils.ImageUtil;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;

/* renamed from: E.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3419v implements O.A<a, O.B<byte[]>> {

    /* renamed from: a, reason: collision with root package name */
    private final M.d f7544a;

    /* renamed from: E.v$a */
    static abstract class a {
        abstract int a();

        abstract O.B<androidx.camera.core.n> b();

        static a c(O.B<androidx.camera.core.n> b10, int i10) {
            return new C3401c(b10, i10);
        }

        a() {
        }
    }

    private static G.f b(byte[] bArr) throws ImageCaptureException {
        try {
            return G.f.h(new ByteArrayInputStream(bArr));
        } catch (IOException e10) {
            throw new ImageCaptureException(0, "Failed to extract Exif from YUV-generated JPEG", e10);
        }
    }

    C3419v(l0 l0Var) {
        this.f7544a = new M.d(l0Var);
    }

    private O.B<byte[]> c(a aVar, int i10) {
        O.B<androidx.camera.core.n> b10 = aVar.b();
        byte[] bArrA = this.f7544a.a(b10.c());
        G.f fVarD = b10.d();
        Objects.requireNonNull(fVarD);
        return O.B.m(bArrA, fVarD, i10, b10.h(), b10.b(), b10.f(), b10.g(), b10.a());
    }

    private O.B<byte[]> d(a aVar) throws ImageCaptureException {
        O.B<androidx.camera.core.n> b10 = aVar.b();
        androidx.camera.core.n nVarC = b10.c();
        Rect rectB = b10.b();
        try {
            byte[] bArrK = ImageUtil.k(nVarC, rectB, aVar.a(), b10.f());
            return O.B.m(bArrK, b(bArrK), 256, new Size(rectB.width(), rectB.height()), new Rect(0, 0, rectB.width(), rectB.height()), b10.f(), G.p.t(b10.g(), rectB), b10.a());
        } catch (ImageUtil.CodecFailedException e10) {
            throw new ImageCaptureException(1, "Failed to encode the image to JPEG.", e10);
        }
    }

    @Override // O.A
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public O.B<byte[]> apply(a aVar) throws ImageCaptureException {
        O.B<byte[]> bD;
        try {
            int iE = aVar.b().e();
            if (iE != 35) {
                if (iE != 256 && iE != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + iE);
                }
                bD = c(aVar, iE);
            } else {
                bD = d(aVar);
            }
            aVar.b().c().close();
            return bD;
        } catch (Throwable th2) {
            aVar.b().c().close();
            throw th2;
        }
    }
}
