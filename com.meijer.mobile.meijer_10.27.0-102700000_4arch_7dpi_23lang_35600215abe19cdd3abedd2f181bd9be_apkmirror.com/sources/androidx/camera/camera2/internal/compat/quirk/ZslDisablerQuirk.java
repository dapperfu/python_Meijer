package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class ZslDisablerQuirk implements g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f47235a = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1");

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f47236b = Arrays.asList("MI 8");

    private static boolean d() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && c(f47235a);
    }

    private static boolean e() {
        return "xiaomi".equalsIgnoreCase(Build.BRAND) && c(f47236b);
    }

    private static boolean c(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    static boolean f() {
        if (!d() && !e()) {
            return false;
        }
        return true;
    }
}
