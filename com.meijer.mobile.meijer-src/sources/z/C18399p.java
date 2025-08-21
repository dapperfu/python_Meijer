package z;

import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.core.impl.w;
import u.C17296a;

/* renamed from: z.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18399p {

    /* renamed from: a, reason: collision with root package name */
    public static final Rational f172185a = new Rational(16, 9);

    private static boolean a(Size size, Rational rational) {
        return rational.equals(new Rational(size.getWidth(), size.getHeight()));
    }

    public static void b(Size size, w.b bVar) {
        if (((PreviewPixelHDRnetQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(PreviewPixelHDRnetQuirk.class)) == null || a(size, f172185a)) {
            return;
        }
        C17296a.C2582a c2582a = new C17296a.C2582a();
        c2582a.f(CaptureRequest.TONEMAP_MODE, 2);
        bVar.g(c2582a.c());
    }
}
