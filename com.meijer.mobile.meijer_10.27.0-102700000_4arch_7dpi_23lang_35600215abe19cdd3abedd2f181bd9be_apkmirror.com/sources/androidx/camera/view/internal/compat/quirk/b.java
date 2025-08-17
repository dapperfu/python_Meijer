package androidx.camera.view.internal.compat.quirk;

import F.g0;
import F.h0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {
    static List<g0> a(h0 h0Var) {
        ArrayList arrayList = new ArrayList();
        if (h0Var.a(SurfaceViewStretchedQuirk.class, SurfaceViewStretchedQuirk.f())) {
            arrayList.add(new SurfaceViewStretchedQuirk());
        }
        if (h0Var.a(SurfaceViewNotCroppedByParentQuirk.class, SurfaceViewNotCroppedByParentQuirk.c())) {
            arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
        }
        return arrayList;
    }
}
