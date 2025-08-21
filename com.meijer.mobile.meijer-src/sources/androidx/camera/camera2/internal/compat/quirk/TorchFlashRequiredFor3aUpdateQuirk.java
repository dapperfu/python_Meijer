package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import v.C17557u;
import w.B;

/* loaded from: classes.dex */
public class TorchFlashRequiredFor3aUpdateQuirk implements g0 {

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f47456b = Arrays.asList("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");

    /* renamed from: a, reason: collision with root package name */
    private final B f47457a;

    private static boolean d() {
        Iterator<String> it = f47456b.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean e(B b10) {
        return Build.VERSION.SDK_INT >= 28 && C17557u.D(b10, 5) == 5;
    }

    private static boolean g(B b10) {
        return ((Integer) b10.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    public boolean f() {
        return !e(this.f47457a);
    }

    public TorchFlashRequiredFor3aUpdateQuirk(B b10) {
        this.f47457a = b10;
    }

    private static boolean c(B b10) {
        if (d() && g(b10)) {
            return true;
        }
        return false;
    }

    static boolean h(B b10) {
        return c(b10);
    }
}
