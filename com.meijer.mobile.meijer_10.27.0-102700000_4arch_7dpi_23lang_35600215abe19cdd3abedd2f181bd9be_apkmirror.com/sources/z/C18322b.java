package z;

import F.l0;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18322b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f171373a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f171374b;

    public int a(int i10) {
        if ((this.f171373a || this.f171374b) && i10 == 2) {
            return 1;
        }
        return i10;
    }

    public C18322b(l0 l0Var) {
        boolean z10;
        this.f171373a = l0Var.a(ImageCaptureFailWithAutoFlashQuirk.class);
        if (androidx.camera.camera2.internal.compat.quirk.b.b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f171374b = z10;
    }
}
