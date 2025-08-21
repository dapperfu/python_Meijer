package com.scandit.datacapture.core.internal.sdk.capture;

import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.common.NativeContextStatus;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeDataCaptureContextListener {
    public abstract void onFrameSourceChanged(NativeDataCaptureContext nativeDataCaptureContext, NativeFrameSource nativeFrameSource);

    public abstract void onModeAdded(NativeDataCaptureContext nativeDataCaptureContext, NativeDataCaptureMode nativeDataCaptureMode);

    public abstract void onModeRemoved(NativeDataCaptureContext nativeDataCaptureContext, NativeDataCaptureMode nativeDataCaptureMode);

    public abstract void onObservationStarted(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract void onObservationStopped(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract void onStatusChanged(NativeDataCaptureContext nativeDataCaptureContext, NativeContextStatus nativeContextStatus);
}
