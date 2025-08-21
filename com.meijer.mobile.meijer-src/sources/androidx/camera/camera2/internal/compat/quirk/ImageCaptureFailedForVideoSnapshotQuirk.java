package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class ImageCaptureFailedForVideoSnapshotQuirk implements g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f47442a = new HashSet(Arrays.asList("itel l6006", "itel w6004", "moto g(20)", "moto e13", "moto e20", "rmx3231", "rmx3511", "sm-a032f", "sm-a035m", "tecno mobile bf6"));

    private static boolean c() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "FIG-LX1".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean d() {
        Set<String> set = f47442a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (set.contains(str.toLowerCase(locale))) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            return true;
        }
        String str2 = Build.HARDWARE;
        if (str2.toLowerCase(locale).startsWith("ums")) {
            return true;
        }
        return "itel".equalsIgnoreCase(Build.BRAND) && str2.toLowerCase(locale).startsWith("sp");
    }

    static boolean e() {
        if (!d() && !c()) {
            return false;
        }
        return true;
    }
}
