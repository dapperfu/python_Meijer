package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import w.B;

/* loaded from: classes.dex */
public class ImageCaptureFailWithAutoFlashQuirk implements g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f47441a = Arrays.asList("sm-j700f", "sm-j710f");

    static boolean c(B b10) {
        return f47441a.contains(Build.MODEL.toLowerCase(Locale.US)) && ((Integer) b10.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
