package com.scandit.datacapture.core.internal.sdk.extensions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"toAngle", "", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RotationExtensionsKt {
    public static final int toAngle(int i10) {
        if (i10 == 1) {
            return 90;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 270;
        }
        return 180;
    }
}
