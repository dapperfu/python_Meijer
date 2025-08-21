package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeCountViewHandler {
    public abstract void clear();

    public abstract void hideClassificationPopupForNotInListBarcode(NativeTrackedBarcode nativeTrackedBarcode, NativeBarcodeCountNotInListStatus nativeBarcodeCountNotInListStatus);

    public abstract void setEnableProgressBar(boolean z10);

    public abstract void setEnableShutterAnimation(boolean z10);

    public abstract void setProgressBarState(int i10, int i11);

    public abstract void setShutterDimmed(boolean z10);

    public abstract void showClassificationPopupForNotInListBarcode(NativeTrackedBarcode nativeTrackedBarcode, NativeBarcodeCountNotInListStatus nativeBarcodeCountNotInListStatus);
}
