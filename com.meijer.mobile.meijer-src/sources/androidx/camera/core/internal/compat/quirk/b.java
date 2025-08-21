package androidx.camera.core.internal.compat.quirk;

import F.g0;
import F.h0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {
    static List<g0> a(h0 h0Var) {
        ArrayList arrayList = new ArrayList();
        if (h0Var.a(ImageCaptureRotationOptionQuirk.class, ImageCaptureRotationOptionQuirk.h())) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (h0Var.a(SurfaceOrderQuirk.class, SurfaceOrderQuirk.c())) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (h0Var.a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.d())) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (h0Var.a(LowMemoryQuirk.class, LowMemoryQuirk.c())) {
            arrayList.add(new LowMemoryQuirk());
        }
        if (h0Var.a(LargeJpegImageQuirk.class, LargeJpegImageQuirk.f())) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        if (h0Var.a(IncorrectJpegMetadataQuirk.class, IncorrectJpegMetadataQuirk.g())) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        return arrayList;
    }
}
