package com.scandit.datacapture.core.internal.module.serialization;

import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.module.ui.NativeSwipeToZoom;
import com.scandit.datacapture.core.internal.module.ui.NativeTapToFocus;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeDataCaptureViewDeserializerHelper {
    public abstract NativeSwipeToZoom createSwipeToZoom();

    public abstract NativeTapToFocus createTapToFocus(boolean z10);

    public abstract NativeDataCaptureView createView(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract void createdNullFocusGesture();

    public abstract void createdNullZoomGesture();

    public abstract void updateViewFromJson(NativeDataCaptureView nativeDataCaptureView, NativeJsonValue nativeJsonValue);
}
