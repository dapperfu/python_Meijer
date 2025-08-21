package a2;

import android.content.pm.PackageInfo;
import android.os.Build;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5642a {

    /* renamed from: a2.a$a, reason: collision with other inner class name */
    private static class C0938a {
        static long a(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }

    public static long a(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C0938a.a(packageInfo) : packageInfo.versionCode;
    }
}
