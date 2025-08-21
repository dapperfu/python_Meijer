package E;

import O.C4348v;
import O.C4351y;
import android.graphics.Bitmap;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.utils.ImageUtil;
import java.util.Objects;

/* renamed from: E.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3169i implements O.A<O.B<Bitmap>, O.B<Bitmap>> {

    /* renamed from: a, reason: collision with root package name */
    private final C4351y f6927a;

    @Override // O.A
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public O.B<Bitmap> apply(O.B<Bitmap> b10) throws ImageCaptureException {
        androidx.camera.core.n nVarA = this.f6927a.c(new C4348v(new T(b10), 1)).a();
        Objects.requireNonNull(nVarA);
        Bitmap bitmapC = ImageUtil.c(nVarA.getPlanes(), nVarA.getWidth(), nVarA.getHeight());
        G.f fVarD = b10.d();
        Objects.requireNonNull(fVarD);
        return O.B.j(bitmapC, fVarD, b10.b(), b10.f(), b10.g(), b10.a());
    }

    C3169i(C4351y c4351y) {
        this.f6927a = c4351y;
    }
}
