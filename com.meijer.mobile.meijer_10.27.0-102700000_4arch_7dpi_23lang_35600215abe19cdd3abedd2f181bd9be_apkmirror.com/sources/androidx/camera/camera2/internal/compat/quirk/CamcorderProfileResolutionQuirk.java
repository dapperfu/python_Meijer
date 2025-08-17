package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import java.util.List;
import w.B;
import w.U;

/* loaded from: classes.dex */
public class CamcorderProfileResolutionQuirk implements g0 {

    /* renamed from: a, reason: collision with root package name */
    private final U f47205a;

    /* renamed from: b, reason: collision with root package name */
    private List<Size> f47206b = null;

    static boolean c(B b10) {
        Integer num = (Integer) b10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public CamcorderProfileResolutionQuirk(B b10) {
        this.f47205a = b10.b();
    }
}
