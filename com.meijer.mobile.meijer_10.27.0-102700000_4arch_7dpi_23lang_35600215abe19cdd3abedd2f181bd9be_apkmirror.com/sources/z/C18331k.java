package z;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import u.C17169a;

/* renamed from: z.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18331k {
    @SuppressLint({"NewApi"})
    public void a(int i10, C17169a.C2558a c2558a) {
        if (((ImageCapturePixelHDRPlusQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ImageCapturePixelHDRPlusQuirk.class)) == null) {
            return;
        }
        if (i10 == 0) {
            c2558a.f(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
        } else {
            if (i10 != 1) {
                return;
            }
            c2558a.f(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
        }
    }
}
