package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.source.CameraPosition;
import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f125728a = new LinkedHashMap();

    public static B a(CameraPosition cameraPosition) {
        int i10 = C.f125723a[cameraPosition.ordinal()];
        if (i10 == 1) {
            return C13509z.f126081a;
        }
        if (i10 == 2) {
            return A.f125722a;
        }
        throw new IllegalStateException(("Unsupported camera position " + cameraPosition).toString());
    }
}
