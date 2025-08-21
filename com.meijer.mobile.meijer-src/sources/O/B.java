package O;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.utils.ImageUtil;

/* loaded from: classes.dex */
public abstract class B<T> {
    public abstract F.r a();

    public abstract Rect b();

    public abstract T c();

    public abstract G.f d();

    public abstract int e();

    public abstract int f();

    public abstract Matrix g();

    public abstract Size h();

    public static B<Bitmap> j(Bitmap bitmap, G.f fVar, Rect rect, int i10, Matrix matrix, F.r rVar) {
        return new C4329b(bitmap, fVar, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i10, matrix, rVar);
    }

    public static B<androidx.camera.core.n> k(androidx.camera.core.n nVar, G.f fVar, Rect rect, int i10, Matrix matrix, F.r rVar) {
        return l(nVar, fVar, new Size(nVar.getWidth(), nVar.getHeight()), rect, i10, matrix, rVar);
    }

    public static B<byte[]> m(byte[] bArr, G.f fVar, int i10, Size size, Rect rect, int i11, Matrix matrix, F.r rVar) {
        return new C4329b(bArr, fVar, i10, size, rect, i11, matrix, rVar);
    }

    public static B<androidx.camera.core.n> l(androidx.camera.core.n nVar, G.f fVar, Size size, Rect rect, int i10, Matrix matrix, F.r rVar) {
        if (ImageUtil.h(nVar.getFormat())) {
            o2.i.h(fVar, "JPEG image must have Exif.");
        }
        return new C4329b(nVar, fVar, nVar.getFormat(), size, rect, i10, matrix, rVar);
    }

    public boolean i() {
        return G.p.h(b(), h());
    }
}
