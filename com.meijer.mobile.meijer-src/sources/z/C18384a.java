package z;

import F.l0;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.impl.k;
import u.C17296a;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18384a {

    /* renamed from: a, reason: collision with root package name */
    private final Range<Integer> f172168a;

    public void a(C17296a.C2582a c2582a) {
        Range<Integer> range = this.f172168a;
        if (range != null) {
            c2582a.g(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range, k.c.REQUIRED);
        }
    }

    public C18384a(l0 l0Var) {
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) l0Var.b(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            this.f172168a = null;
        } else {
            this.f172168a = aeFpsRangeLegacyQuirk.d();
        }
    }
}
