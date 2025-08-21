package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceState;

/* loaded from: classes12.dex */
public interface S {
    void a(DataCaptureContext dataCaptureContext);

    void b(DataCaptureContext dataCaptureContext);

    void onFrameOutput(FrameSource frameSource, FrameData frameData);

    void onObservationStarted(FrameSource frameSource);

    void onObservationStopped(FrameSource frameSource);

    void onStateChanged(FrameSource frameSource, FrameSourceState frameSourceState);
}
