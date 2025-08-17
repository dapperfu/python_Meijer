package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.os.Build;
import android.util.Pair;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<Pair<String, String>> f47215a = new HashSet();

    static {
        c("sprd", "lemp");
        c("sprd", "DM20C");
    }

    private static void c(String str, String str2) {
        Set<Pair<String, String>> set = f47215a;
        Locale locale = Locale.US;
        set.add(new Pair<>(str.toLowerCase(locale), str2.toLowerCase(locale)));
    }

    static boolean d() {
        Set<Pair<String, String>> set = f47215a;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
