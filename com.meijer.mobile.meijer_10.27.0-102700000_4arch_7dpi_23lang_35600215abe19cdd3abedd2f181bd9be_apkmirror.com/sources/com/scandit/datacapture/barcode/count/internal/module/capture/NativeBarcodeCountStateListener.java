package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.barcode.count.capture.BarcodeCountState;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeCountStateListener {
    public abstract void onObservationStarted(NativeBarcodeCount nativeBarcodeCount);

    public abstract void onObservationStopped(NativeBarcodeCount nativeBarcodeCount);

    public abstract void onStateChanged(BarcodeCountState barcodeCountState, BarcodeCountState barcodeCountState2, NativeFrameData nativeFrameData, NativeBarcodeCount nativeBarcodeCount);
}
