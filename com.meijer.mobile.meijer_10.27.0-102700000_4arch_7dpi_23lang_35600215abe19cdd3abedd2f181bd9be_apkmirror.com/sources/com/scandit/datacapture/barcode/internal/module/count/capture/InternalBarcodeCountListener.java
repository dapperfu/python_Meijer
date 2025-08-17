package com.scandit.datacapture.barcode.internal.module.count.capture;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.core.data.FrameData;

/* loaded from: classes11.dex */
public interface InternalBarcodeCountListener {
    void a(BarcodeCount barcodeCount, InternalBarcodeCountSession internalBarcodeCountSession, FrameData frameData);

    void a(InternalBarcodeCountSession internalBarcodeCountSession, TrackedBarcode trackedBarcode);

    void b(BarcodeCount barcodeCount, InternalBarcodeCountSession internalBarcodeCountSession, FrameData frameData);

    void onObservationStarted(BarcodeCount barcodeCount);

    void onObservationStopped(BarcodeCount barcodeCount);
}
