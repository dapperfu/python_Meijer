package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class PreviewPixelHDRnetQuirk implements g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f47230a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    static boolean c() {
        return "Google".equals(Build.MANUFACTURER) && f47230a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
