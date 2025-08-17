package z;

import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.core.impl.w;
import u.C17169a;

/* renamed from: z.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18336p {

    /* renamed from: a, reason: collision with root package name */
    public static final Rational f171389a = new Rational(16, 9);

    private static boolean a(Size size, Rational rational) {
        return rational.equals(new Rational(size.getWidth(), size.getHeight()));
    }

    public static void b(Size size, w.b bVar) {
        if (((PreviewPixelHDRnetQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(PreviewPixelHDRnetQuirk.class)) == null || a(size, f171389a)) {
            return;
        }
        C17169a.C2558a c2558a = new C17169a.C2558a();
        c2558a.f(CaptureRequest.TONEMAP_MODE, 2);
        bVar.g(c2558a.c());
    }
}
