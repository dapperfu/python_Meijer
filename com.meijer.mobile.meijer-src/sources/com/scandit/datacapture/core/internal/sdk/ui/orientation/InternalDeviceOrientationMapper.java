package com.scandit.datacapture.core.internal.sdk.ui.orientation;

import com.scandit.datacapture.core.ui.orientation.DeviceOrientation;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/orientation/InternalDeviceOrientationMapper;", "", "", "naturalOrientation", "rotation", "Lcom/scandit/datacapture/core/ui/orientation/DeviceOrientation;", "getDeviceOrientation", "(II)Lcom/scandit/datacapture/core/ui/orientation/DeviceOrientation;", "orientation", "getDeviceNaturalOrientation", "(II)I", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class InternalDeviceOrientationMapper {
    public static final InternalDeviceOrientationMapper INSTANCE = new InternalDeviceOrientationMapper();

    public final int getDeviceNaturalOrientation(int orientation, int rotation) {
        return ((orientation == 2 && rotation == 2) || (orientation == 1 && rotation == 3) || ((orientation == 2 && rotation == 0) || (orientation == 1 && rotation == 1))) ? 2 : 1;
    }

    public final DeviceOrientation getDeviceOrientation(int naturalOrientation, int rotation) {
        return ((naturalOrientation == 1 && rotation == 0) || (naturalOrientation == 2 && rotation == 3)) ? DeviceOrientation.PORTRAIT : ((naturalOrientation == 2 && rotation == 0) || (naturalOrientation == 1 && rotation == 1)) ? DeviceOrientation.LANDSCAPE_RIGHT : ((naturalOrientation == 1 && rotation == 2) || (naturalOrientation == 2 && rotation == 1)) ? DeviceOrientation.PORTRAIT_UPSIDE_DOWN : ((naturalOrientation == 2 && rotation == 2) || (naturalOrientation == 1 && rotation == 3)) ? DeviceOrientation.LANDSCAPE_LEFT : DeviceOrientation.PORTRAIT;
    }

    private InternalDeviceOrientationMapper() {
    }
}
