package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.os.Build;

/* loaded from: classes.dex */
public class PreviewDelayWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, g0 {
    static boolean c() {
        return "Huawei".equalsIgnoreCase(Build.MANUFACTURER);
    }
}
