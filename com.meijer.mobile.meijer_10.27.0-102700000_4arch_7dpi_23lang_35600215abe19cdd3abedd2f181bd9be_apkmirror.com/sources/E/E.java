package E;

import E.N;
import F.r;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.utils.ImageUtil;
import java.io.IOException;

/* loaded from: classes.dex */
final class E implements O.A<N.b, O.B<androidx.camera.core.n>> {
    private static O.B<androidx.camera.core.n> c(O o10, G.f fVar, androidx.camera.core.n nVar) {
        Size size = new Size(nVar.getWidth(), nVar.getHeight());
        int iF = o10.f() - fVar.n();
        Size sizeE = e(iF, size);
        Matrix matrixD = G.p.d(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, sizeE.getWidth(), sizeE.getHeight()), iF);
        return O.B.l(nVar, fVar, sizeE, f(o10.b(), matrixD), fVar.n(), g(o10.g(), matrixD), d(nVar));
    }

    private static Rect f(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    private static Matrix g(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    E() {
    }

    private static O.B<androidx.camera.core.n> b(O o10, G.f fVar, androidx.camera.core.n nVar) {
        return O.B.k(nVar, fVar, o10.b(), o10.f(), o10.g(), d(nVar));
    }

    private static F.r d(androidx.camera.core.n nVar) {
        if (nVar.S2() instanceof J.b) {
            return ((J.b) nVar.S2()).d();
        }
        return r.a.k();
    }

    private static Size e(int i10, Size size) {
        if (G.p.i(G.p.u(i10))) {
            return new Size(size.getHeight(), size.getWidth());
        }
        return size;
    }

    @Override // O.A
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public O.B<androidx.camera.core.n> apply(N.b bVar) throws ImageCaptureException {
        G.f fVarG;
        androidx.camera.core.n nVarA = bVar.a();
        O oB = bVar.b();
        if (ImageUtil.h(nVarA.getFormat())) {
            try {
                fVarG = G.f.g(nVarA);
                nVarA.getPlanes()[0].e().rewind();
            } catch (IOException e10) {
                throw new ImageCaptureException(1, "Failed to extract EXIF data.", e10);
            }
        } else {
            fVarG = null;
        }
        if (C3421x.f7546g.b(nVarA)) {
            o2.i.h(fVarG, "JPEG image must have exif.");
            return c(oB, fVarG, nVarA);
        }
        return b(oB, fVarG, nVarA);
    }
}
