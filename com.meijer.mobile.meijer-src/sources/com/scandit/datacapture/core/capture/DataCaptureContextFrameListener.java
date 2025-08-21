package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextFrameListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ProxyReversedAdapter(owner = DataCaptureContext.class, value = NativeDataCaptureContextFrameListener.class)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureContextFrameListener;", "", "onFrameProcessingFinished", "", "dataCaptureContext", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "frameData", "Lcom/scandit/datacapture/core/data/FrameData;", "onFrameProcessingStarted", "onObservationStarted", "onObservationStopped", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DataCaptureContextFrameListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onFrameProcessingFinished(DataCaptureContextFrameListener dataCaptureContextFrameListener, DataCaptureContext dataCaptureContext, FrameData frameData) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            Intrinsics.j(frameData, "frameData");
        }

        @ProxyFunction
        public static void onFrameProcessingStarted(DataCaptureContextFrameListener dataCaptureContextFrameListener, DataCaptureContext dataCaptureContext, FrameData frameData) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            Intrinsics.j(frameData, "frameData");
        }

        @ProxyFunction
        public static void onObservationStarted(DataCaptureContextFrameListener dataCaptureContextFrameListener, DataCaptureContext dataCaptureContext) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        }

        @ProxyFunction
        public static void onObservationStopped(DataCaptureContextFrameListener dataCaptureContextFrameListener, DataCaptureContext dataCaptureContext) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        }
    }

    @ProxyFunction
    void onFrameProcessingFinished(DataCaptureContext dataCaptureContext, FrameData frameData);

    @ProxyFunction
    void onFrameProcessingStarted(DataCaptureContext dataCaptureContext, FrameData frameData);

    @ProxyFunction
    void onObservationStarted(DataCaptureContext dataCaptureContext);

    @ProxyFunction
    void onObservationStopped(DataCaptureContext dataCaptureContext);
}
