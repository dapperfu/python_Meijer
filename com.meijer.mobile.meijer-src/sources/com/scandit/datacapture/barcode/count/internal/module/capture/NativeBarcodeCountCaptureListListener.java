package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeCountCaptureListListener {
    public abstract void onCaptureListCompleted(NativeBarcodeCountCaptureList nativeBarcodeCountCaptureList, NativeBarcodeCountCaptureListSession nativeBarcodeCountCaptureListSession);

    public abstract void onCaptureListSessionUpdated(NativeBarcodeCountCaptureList nativeBarcodeCountCaptureList, NativeBarcodeCountCaptureListSession nativeBarcodeCountCaptureListSession);

    public abstract void onObservationStarted(NativeBarcodeCountCaptureList nativeBarcodeCountCaptureList);

    public abstract void onObservationStopped(NativeBarcodeCountCaptureList nativeBarcodeCountCaptureList);
}
