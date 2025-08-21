package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.capture.DataCaptureContextListener;
import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.source.FrameSource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class d implements DataCaptureContextListener {
    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onModeAdded(DataCaptureContext dataCaptureContext, DataCaptureMode dataCaptureMode) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(dataCaptureMode, "dataCaptureMode");
        dataCaptureMode._setDataCaptureContext(dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onModeRemoved(DataCaptureContext dataCaptureContext, DataCaptureMode dataCaptureMode) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(dataCaptureMode, "dataCaptureMode");
        dataCaptureMode._setDataCaptureContext(null);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onFrameSourceChanged(DataCaptureContext dataCaptureContext, FrameSource frameSource) {
        DataCaptureContextListener.DefaultImpls.onFrameSourceChanged(this, dataCaptureContext, frameSource);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onObservationStarted(DataCaptureContext dataCaptureContext) {
        DataCaptureContextListener.DefaultImpls.onObservationStarted(this, dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onObservationStopped(DataCaptureContext dataCaptureContext) {
        DataCaptureContextListener.DefaultImpls.onObservationStopped(this, dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onStatusChanged(DataCaptureContext dataCaptureContext, ContextStatus contextStatus) {
        DataCaptureContextListener.DefaultImpls.onStatusChanged(this, dataCaptureContext, contextStatus);
    }
}
