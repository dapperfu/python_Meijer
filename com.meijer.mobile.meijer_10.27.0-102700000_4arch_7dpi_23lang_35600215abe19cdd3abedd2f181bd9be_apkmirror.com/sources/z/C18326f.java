package z;

import F.u0;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18326f {

    /* renamed from: a, reason: collision with root package name */
    private final ExtraSupportedSurfaceCombinationsQuirk f171377a = (ExtraSupportedSurfaceCombinationsQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraSupportedSurfaceCombinationsQuirk.class);

    public List<u0> a(String str) {
        ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = this.f171377a;
        return extraSupportedSurfaceCombinationsQuirk == null ? new ArrayList() : extraSupportedSurfaceCombinationsQuirk.e(str);
    }
}
