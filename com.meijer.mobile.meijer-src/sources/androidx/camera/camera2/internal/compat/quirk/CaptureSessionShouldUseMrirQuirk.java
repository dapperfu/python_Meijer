package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.os.Build;

/* loaded from: classes.dex */
public class CaptureSessionShouldUseMrirQuirk implements g0 {
    static boolean c() {
        return "google".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT >= 35;
    }
}
