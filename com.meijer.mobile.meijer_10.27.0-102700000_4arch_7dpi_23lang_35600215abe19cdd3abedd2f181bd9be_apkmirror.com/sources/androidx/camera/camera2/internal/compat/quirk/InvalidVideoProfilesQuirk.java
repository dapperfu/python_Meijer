package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class InvalidVideoProfilesQuirk implements g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f47224a = Arrays.asList("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f47225b = Arrays.asList("cph2417", "cph2451");

    /* renamed from: c, reason: collision with root package name */
    private static final List<String> f47226c = Arrays.asList("cph2437", "cph2525", "pht110");

    private static boolean c() {
        return Build.VERSION.SDK_INT == 33;
    }

    private static boolean e() {
        return f47225b.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    private static boolean g() {
        return f47226c.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    private static boolean j() {
        return f47224a.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    private static boolean k() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && o();
    }

    private static boolean l() {
        String str = Build.BRAND;
        if ("redmi".equalsIgnoreCase(str) || "xiaomi".equalsIgnoreCase(str)) {
            return n() || o();
        }
        return false;
    }

    private static boolean m() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("td1a");
    }

    private static boolean n() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tkq1");
    }

    private static boolean o() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a");
    }

    private static boolean d() {
        if (e() && c()) {
            return true;
        }
        return false;
    }

    private static boolean f() {
        if (g() && c()) {
            return true;
        }
        return false;
    }

    private static boolean h() {
        if (!o() && !m()) {
            return false;
        }
        return true;
    }

    private static boolean i() {
        if (j() && h()) {
            return true;
        }
        return false;
    }

    static boolean p() {
        if (!k() && !i() && !l() && !d() && !f()) {
            return false;
        }
        return true;
    }
}
