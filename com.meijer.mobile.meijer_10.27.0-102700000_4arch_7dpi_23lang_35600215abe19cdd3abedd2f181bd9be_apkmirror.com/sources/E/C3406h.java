package E;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.camera.core.ImageCaptureException;
import java.io.ByteArrayOutputStream;
import java.util.Objects;

/* renamed from: E.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3406h implements O.A<b, O.B<byte[]>> {

    /* renamed from: E.h$b */
    static abstract class b {
        abstract int a();

        abstract O.B<Bitmap> b();

        static b c(O.B<Bitmap> b10, int i10) {
            return new C3399a(b10, i10);
        }

        b() {
        }
    }

    /* renamed from: E.h$a */
    private static class a {
        static boolean a(Bitmap bitmap) {
            return bitmap.hasGainmap();
        }
    }

    private static int b(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 34 || !a.a(bitmap)) ? 256 : 4101;
    }

    C3406h() {
    }

    @Override // O.A
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public O.B<byte[]> apply(b bVar) throws ImageCaptureException {
        O.B<Bitmap> b10 = bVar.b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b10.c().compress(Bitmap.CompressFormat.JPEG, bVar.a(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        G.f fVarD = b10.d();
        Objects.requireNonNull(fVarD);
        return O.B.m(byteArray, fVarD, b(b10.c()), b10.h(), b10.b(), b10.f(), b10.g(), b10.a());
    }
}
