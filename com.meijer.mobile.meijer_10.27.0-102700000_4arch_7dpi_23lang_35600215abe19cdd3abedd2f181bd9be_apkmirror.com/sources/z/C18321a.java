package z;

import F.l0;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.impl.k;
import u.C17169a;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18321a {

    /* renamed from: a, reason: collision with root package name */
    private final Range<Integer> f171372a;

    public void a(C17169a.C2558a c2558a) {
        Range<Integer> range = this.f171372a;
        if (range != null) {
            c2558a.g(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range, k.c.REQUIRED);
        }
    }

    public C18321a(l0 l0Var) {
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) l0Var.b(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            this.f171372a = null;
        } else {
            this.f171372a = aeFpsRangeLegacyQuirk.d();
        }
    }
}
