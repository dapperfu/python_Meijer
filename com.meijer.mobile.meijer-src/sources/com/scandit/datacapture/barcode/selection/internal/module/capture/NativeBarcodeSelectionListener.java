package com.scandit.datacapture.barcode.selection.internal.module.capture;

import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeSelectionListener {
    public abstract void onObservationStarted(NativeBarcodeSelection nativeBarcodeSelection);

    public abstract void onObservationStopped(NativeBarcodeSelection nativeBarcodeSelection);

    public abstract void onSelectionUpdated(NativeBarcodeSelection nativeBarcodeSelection, NativeBarcodeSelectionSession nativeBarcodeSelectionSession, NativeFrameData nativeFrameData);

    public abstract void onSessionUpdated(NativeBarcodeSelection nativeBarcodeSelection, NativeBarcodeSelectionSession nativeBarcodeSelectionSession, NativeFrameData nativeFrameData);
}
