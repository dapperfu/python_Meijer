package com.scandit.datacapture.core.internal.module.source;

import android.util.Range;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class Q {
    public static final Range a(CameraProfile cameraProfile, float f10, Range[] frameRateRanges, boolean z10, NativeCameraApi cameraApi, NativePreferredFrameRateRange nativePreferredFrameRateRange) {
        Integer num;
        Intrinsics.j(cameraProfile, "cameraProfile");
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        Intrinsics.j(cameraApi, "cameraApi");
        Intrinsics.j(cameraApi, "<this>");
        int i10 = O.f124811a[cameraApi.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 1000;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.j(cameraProfile, "cameraProfile");
        Intrinsics.j(cameraApi, "cameraApi");
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        P frameRateRangeSelector = new P(cameraApi, cameraProfile, frameRateRanges, nativePreferredFrameRateRange);
        if (!z10) {
            return frameRateRangeSelector.a(f10);
        }
        float f11 = i11 * 20.0f;
        Intrinsics.j(frameRateRangeSelector, "frameRateRangeSelector");
        Range rangeA = frameRateRangeSelector.a(25.0f);
        if (f11 >= ((rangeA == null || (num = (Integer) rangeA.getUpper()) == null) ? 0 : num.intValue())) {
            rangeA = null;
        }
        return rangeA == null ? frameRateRangeSelector.a(f10) : rangeA;
    }
}
