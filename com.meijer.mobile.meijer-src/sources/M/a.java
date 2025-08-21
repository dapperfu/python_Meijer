package M;

import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final CaptureFailedRetryQuirk f19490a = (CaptureFailedRetryQuirk) androidx.camera.core.internal.compat.quirk.a.b(CaptureFailedRetryQuirk.class);

    public int a() {
        CaptureFailedRetryQuirk captureFailedRetryQuirk = this.f19490a;
        if (captureFailedRetryQuirk == null) {
            return 0;
        }
        return captureFailedRetryQuirk.c();
    }
}
