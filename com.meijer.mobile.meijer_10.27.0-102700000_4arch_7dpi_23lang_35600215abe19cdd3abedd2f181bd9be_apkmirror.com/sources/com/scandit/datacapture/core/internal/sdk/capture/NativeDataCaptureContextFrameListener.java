package com.scandit.datacapture.core.internal.sdk.capture;

import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeDataCaptureContextFrameListener {
    public abstract void onFrameProcessingFinished(NativeDataCaptureContext nativeDataCaptureContext, NativeFrameData nativeFrameData);

    public abstract void onFrameProcessingStarted(NativeDataCaptureContext nativeDataCaptureContext, NativeFrameData nativeFrameData);

    public abstract void onObservationStarted(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract void onObservationStopped(NativeDataCaptureContext nativeDataCaptureContext);
}
