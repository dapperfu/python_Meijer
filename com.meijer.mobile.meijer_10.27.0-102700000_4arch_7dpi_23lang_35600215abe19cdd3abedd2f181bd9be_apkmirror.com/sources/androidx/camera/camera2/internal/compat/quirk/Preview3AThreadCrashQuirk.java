package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.os.Build;

/* loaded from: classes.dex */
public class Preview3AThreadCrashQuirk implements g0 {
    static boolean c() {
        return "samsungexynos7870".equalsIgnoreCase(Build.HARDWARE);
    }
}
