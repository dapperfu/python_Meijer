package androidx.camera.view.internal.compat.quirk;

import F.g0;
import android.os.Build;

/* loaded from: classes.dex */
public class SurfaceViewNotCroppedByParentQuirk implements g0 {
    static boolean c() {
        return "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL);
    }
}
