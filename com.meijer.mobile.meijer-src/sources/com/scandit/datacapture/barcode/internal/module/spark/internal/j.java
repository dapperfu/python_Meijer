package com.scandit.datacapture.barcode.internal.module.spark.internal;

import com.scandit.datacapture.barcode.spark.capture.SparkScanSession;
import com.scandit.datacapture.core.data.FrameData;

/* loaded from: classes12.dex */
public interface j {
    void onBarcodeScanned(SparkScanInternal sparkScanInternal, SparkScanSession sparkScanSession, FrameData frameData);

    void onObservationStarted(SparkScanInternal sparkScanInternal);

    void onObservationStopped(SparkScanInternal sparkScanInternal);

    void onSessionUpdated(SparkScanInternal sparkScanInternal, SparkScanSession sparkScanSession, FrameData frameData);
}
