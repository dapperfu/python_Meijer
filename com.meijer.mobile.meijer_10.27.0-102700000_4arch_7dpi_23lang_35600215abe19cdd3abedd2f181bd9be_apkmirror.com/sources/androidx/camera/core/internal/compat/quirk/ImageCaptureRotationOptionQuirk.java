package androidx.camera.core.internal.compat.quirk;

import F.g0;
import android.os.Build;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.k;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;

/* loaded from: classes.dex */
public final class ImageCaptureRotationOptionQuirk implements g0 {
    private static boolean c() {
        String str = Build.FINGERPRINT;
        if (str.startsWith("generic") || str.startsWith(zzbz.UNKNOWN_CONTENT_TYPE)) {
            return true;
        }
        String str2 = Build.MODEL;
        if (str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Cuttlefish") || str2.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
            return true;
        }
        return (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || Build.PRODUCT.equals("google_sdk") || Build.HARDWARE.contains("ranchu");
    }

    private static boolean e() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean f() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL);
    }

    public boolean g(k.a<?> aVar) {
        return aVar != i.f47400i;
    }

    private static boolean d() {
        c();
        return false;
    }

    static boolean h() {
        if (!f() && !e() && !d()) {
            return false;
        }
        return true;
    }
}
