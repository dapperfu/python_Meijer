package z;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import java.util.Iterator;
import java.util.List;

/* renamed from: z.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18343w {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f171400a;

    public boolean a(List<CaptureRequest> list, boolean z10) {
        if (this.f171400a && z10) {
            Iterator<CaptureRequest> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next().get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (iIntValue == 2 || iIntValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public C18343w() {
        boolean z10;
        if (((StillCaptureFlashStopRepeatingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(StillCaptureFlashStopRepeatingQuirk.class)) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f171400a = z10;
    }
}
