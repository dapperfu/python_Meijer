package z;

import F.l0;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: z.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18346z {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f171404a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f171405b;

    public Map<CaptureRequest.Key<?>, Object> a(int i10) {
        if (i10 == 3 && this.f171404a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            return Collections.unmodifiableMap(map);
        }
        if (i10 != 4 || !this.f171405b) {
            return Collections.EMPTY_MAP;
        }
        HashMap map2 = new HashMap();
        map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
        return Collections.unmodifiableMap(map2);
    }

    public C18346z(l0 l0Var) {
        this.f171404a = CaptureIntentPreviewQuirk.b(l0Var);
        this.f171405b = l0Var.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }
}
