package com.scandit.datacapture.barcode.batch.internal.module.capture;

import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeTrackingListener {
    public abstract void onObservationStarted(NativeBarcodeTracking nativeBarcodeTracking);

    public abstract void onObservationStopped(NativeBarcodeTracking nativeBarcodeTracking);

    public abstract void onSessionUpdated(NativeBarcodeTracking nativeBarcodeTracking, NativeBarcodeTrackingSession nativeBarcodeTrackingSession, NativeFrameData nativeFrameData);
}
