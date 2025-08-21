package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import w.B;

/* loaded from: classes.dex */
public class CameraNoResponseWhenEnablingFlashQuirk implements UseTorchAsFlashQuirk {

    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f47431a = Arrays.asList("SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN");

    static boolean c(B b10) {
        return f47431a.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) b10.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
