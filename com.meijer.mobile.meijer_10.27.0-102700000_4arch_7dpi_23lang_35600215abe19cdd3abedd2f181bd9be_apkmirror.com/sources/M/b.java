package M;

import androidx.camera.core.impl.i;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.n;

/* loaded from: classes.dex */
public class b {
    public boolean a() {
        ImageCaptureRotationOptionQuirk imageCaptureRotationOptionQuirk = (ImageCaptureRotationOptionQuirk) androidx.camera.core.internal.compat.quirk.a.b(ImageCaptureRotationOptionQuirk.class);
        return imageCaptureRotationOptionQuirk == null || imageCaptureRotationOptionQuirk.g(i.f47400i);
    }

    public boolean b(n nVar) {
        if (a() && ImageUtil.h(nVar.getFormat())) {
            return true;
        }
        return false;
    }
}
