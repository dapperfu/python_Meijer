package androidx.camera.camera2.internal.compat.quirk;

import F.g0;
import F.l0;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface CaptureIntentPreviewQuirk extends g0 {
    default boolean a() {
        return true;
    }

    static boolean b(l0 l0Var) {
        Iterator it = l0Var.c(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).a()) {
                return true;
            }
        }
        return false;
    }
}
