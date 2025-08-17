package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.source.CameraPosition;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f124776a = new LinkedHashMap();

    public static B a(CameraPosition cameraPosition) {
        int i10 = C.f124771a[cameraPosition.ordinal()];
        if (i10 == 1) {
            return C13376z.f125129a;
        }
        if (i10 == 2) {
            return A.f124770a;
        }
        throw new IllegalStateException(("Unsupported camera position " + cameraPosition).toString());
    }
}
