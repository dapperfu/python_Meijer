package com.scandit.datacapture.barcode.batch.internal.module.ui.overlay;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeTrackingBasicOverlayListener {
    public abstract NativeBrush brushForTrackedBarcode(NativeBarcodeTrackingBasicOverlay nativeBarcodeTrackingBasicOverlay, NativeTrackedBarcode nativeTrackedBarcode);

    public abstract void onTrackedBarcodeTapped(NativeBarcodeTrackingBasicOverlay nativeBarcodeTrackingBasicOverlay, NativeTrackedBarcode nativeTrackedBarcode);
}
