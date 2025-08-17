package W6;

import android.net.Uri;

/* loaded from: classes4.dex */
public final class b {
    public static boolean c(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean e(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }

    public static boolean a(Uri uri) {
        if (c(uri) && uri.getPathSegments().contains("picker")) {
            return true;
        }
        return false;
    }

    public static boolean b(Uri uri) {
        if (c(uri) && !f(uri)) {
            return true;
        }
        return false;
    }

    public static boolean d(Uri uri) {
        if (c(uri) && f(uri)) {
            return true;
        }
        return false;
    }

    private static boolean f(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
