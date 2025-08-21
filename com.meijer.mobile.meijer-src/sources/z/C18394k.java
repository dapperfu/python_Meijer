package z;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import u.C17296a;

/* renamed from: z.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18394k {
    @SuppressLint({"NewApi"})
    public void a(int i10, C17296a.C2582a c2582a) {
        if (((ImageCapturePixelHDRPlusQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        if (i10 == 0) {
            c2582a.f(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
        } else {
            if (i10 != 1) {
                return;
            }
            c2582a.f(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
        }
    }
}
