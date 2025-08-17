package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeCountListener {
    public abstract void onObservationStarted(NativeBarcodeCount nativeBarcodeCount);

    public abstract void onObservationStopped(NativeBarcodeCount nativeBarcodeCount);

    public abstract void onScan(NativeBarcodeCount nativeBarcodeCount, NativeBarcodeCountSession nativeBarcodeCountSession, NativeFrameData nativeFrameData);

    public abstract void onSessionUpdated(NativeBarcodeCount nativeBarcodeCount, NativeBarcodeCountSession nativeBarcodeCountSession, NativeFrameData nativeFrameData);

    public abstract void onTrackedBarcodeUncounted(NativeBarcodeCountSession nativeBarcodeCountSession, NativeTrackedBarcode nativeTrackedBarcode);
}
