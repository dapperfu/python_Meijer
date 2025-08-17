package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.os.Build;

/* loaded from: classes.dex */
public class RepeatingStreamConstraintForVideoRecordingQuirk implements g0 {
    public static boolean c() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL);
    }

    static boolean d() {
        return c();
    }
}
