package De;

import java.util.Locale;

/* loaded from: classes6.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final n f6156a = c();

    private static final class b implements n {
        private b() {
        }
    }

    static String b(double d10) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d10));
    }

    private static n c() {
        return new b();
    }

    static String d(String str) {
        return str == null ? "" : str;
    }

    static boolean e(String str) {
        return str == null || str.isEmpty();
    }

    static String a(String str) {
        if (e(str)) {
            return null;
        }
        return str;
    }
}
