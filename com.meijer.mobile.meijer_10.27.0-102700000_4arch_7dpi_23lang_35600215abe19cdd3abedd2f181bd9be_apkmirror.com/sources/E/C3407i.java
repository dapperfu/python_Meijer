package E;

import O.C4435v;
import O.C4438y;
import android.graphics.Bitmap;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.utils.ImageUtil;
import java.util.Objects;

/* renamed from: E.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3407i implements O.A<O.B<Bitmap>, O.B<Bitmap>> {

    /* renamed from: a, reason: collision with root package name */
    private final C4438y f7520a;

    @Override // O.A
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public O.B<Bitmap> apply(O.B<Bitmap> b10) throws ImageCaptureException {
        androidx.camera.core.n nVarA = this.f7520a.c(new C4435v(new T(b10), 1)).a();
        Objects.requireNonNull(nVarA);
        Bitmap bitmapC = ImageUtil.c(nVarA.getPlanes(), nVarA.getWidth(), nVarA.getHeight());
        G.f fVarD = b10.d();
        Objects.requireNonNull(fVarD);
        return O.B.j(bitmapC, fVarD, b10.b(), b10.f(), b10.g(), b10.a());
    }

    C3407i(C4438y c4438y) {
        this.f7520a = c4438y;
    }
}
