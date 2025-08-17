package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import w.B;

/* loaded from: classes.dex */
public class ImageCaptureFlashNotFireQuirk implements UseTorchAsFlashQuirk {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f47219a = Arrays.asList("itel w6004");

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f47220b = Arrays.asList("sm-j700f", "sm-j710f");

    static boolean c(B b10) {
        List<String> list = f47220b;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        return (list.contains(str.toLowerCase(locale)) && ((Integer) b10.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || f47219a.contains(str.toLowerCase(locale));
    }
}
