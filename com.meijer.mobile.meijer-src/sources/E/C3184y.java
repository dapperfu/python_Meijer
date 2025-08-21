package E;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import androidx.camera.core.ImageCaptureException;
import java.io.IOException;
import java.util.Objects;

/* renamed from: E.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3184y implements O.A<O.B<byte[]>, O.B<Bitmap>> {
    private Bitmap b(byte[] bArr, Rect rect) throws ImageCaptureException, IOException {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e10) {
            throw new ImageCaptureException(1, "Failed to decode JPEG.", e10);
        }
    }

    C3184y() {
    }

    @Override // O.A
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public O.B<Bitmap> apply(O.B<byte[]> b10) throws ImageCaptureException, IOException {
        Rect rectB = b10.b();
        Bitmap bitmapB = b(b10.c(), rectB);
        G.f fVarD = b10.d();
        Objects.requireNonNull(fVarD);
        return O.B.j(bitmapB, fVarD, new Rect(0, 0, bitmapB.getWidth(), bitmapB.getHeight()), b10.f(), G.p.t(b10.g(), rectB), b10.a());
    }
}
