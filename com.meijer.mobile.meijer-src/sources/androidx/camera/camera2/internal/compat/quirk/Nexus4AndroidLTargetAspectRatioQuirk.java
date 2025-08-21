package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class Nexus4AndroidLTargetAspectRatioQuirk implements g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f47453a = Arrays.asList("NEXUS 4");

    public int c() {
        return 2;
    }

    static boolean d() {
        "GOOGLE".equalsIgnoreCase(Build.BRAND);
        return false;
    }
}
