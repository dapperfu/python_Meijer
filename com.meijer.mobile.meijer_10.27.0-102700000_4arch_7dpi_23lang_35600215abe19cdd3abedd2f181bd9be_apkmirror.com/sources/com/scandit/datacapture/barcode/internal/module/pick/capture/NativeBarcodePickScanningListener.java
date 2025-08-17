package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodePickScanningListener {
    public abstract void onObservationStarted(NativeBarcodePick nativeBarcodePick);

    public abstract void onObservationStopped(NativeBarcodePick nativeBarcodePick);

    public abstract void onScanningSessionCompleted(NativeBarcodePick nativeBarcodePick, NativeBarcodePickScanningSession nativeBarcodePickScanningSession);

    public abstract void onScanningSessionUpdated(NativeBarcodePick nativeBarcodePick, NativeBarcodePickScanningSession nativeBarcodePickScanningSession);
}
