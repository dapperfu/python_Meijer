package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class ImageCapturePixelHDRPlusQuirk implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f47445a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    static boolean c() {
        return f47445a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26;
    }
}
