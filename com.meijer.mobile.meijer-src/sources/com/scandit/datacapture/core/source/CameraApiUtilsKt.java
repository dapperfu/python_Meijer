package com.scandit.datacapture.core.source;

import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"getCameraApi", "Lcom/scandit/datacapture/core/internal/module/source/NativeCameraApi;", "Lcom/scandit/datacapture/core/source/CameraSettings;", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CameraApiUtilsKt {
    public static final NativeCameraApi getCameraApi(CameraSettings cameraSettings) {
        Intrinsics.j(cameraSettings, "<this>");
        Object property = cameraSettings.getProperty("api");
        if (Intrinsics.e(property, 1)) {
            return NativeCameraApi.CAMERA1;
        }
        if (Intrinsics.e(property, 2)) {
            return NativeCameraApi.CAMERA2;
        }
        return null;
    }
}
