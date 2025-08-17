package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.data.NativeFloatRange;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import java.util.ArrayList;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class NativeCameraInfo {
    final ArrayList<Size2> availableFrameResolutions;
    final NativeFloatRange availableZoomRange;

    public ArrayList<Size2> getAvailableFrameResolutions() {
        return this.availableFrameResolutions;
    }

    public NativeFloatRange getAvailableZoomRange() {
        return this.availableZoomRange;
    }

    public String toString() {
        return "NativeCameraInfo{availableZoomRange=" + this.availableZoomRange + ",availableFrameResolutions=" + this.availableFrameResolutions + "}";
    }

    public NativeCameraInfo(NativeFloatRange nativeFloatRange, ArrayList<Size2> arrayList) {
        this.availableZoomRange = nativeFloatRange;
        this.availableFrameResolutions = arrayList;
    }
}
