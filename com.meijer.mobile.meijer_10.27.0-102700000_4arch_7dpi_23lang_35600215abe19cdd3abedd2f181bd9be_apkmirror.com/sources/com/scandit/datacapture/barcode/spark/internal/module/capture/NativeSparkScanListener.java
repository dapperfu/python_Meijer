package com.scandit.datacapture.barcode.spark.internal.module.capture;

import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeSparkScanListener {
    public abstract void onObservationStarted(NativeSparkScan nativeSparkScan);

    public abstract void onObservationStopped(NativeSparkScan nativeSparkScan);

    public abstract void onScan(NativeSparkScan nativeSparkScan, NativeSparkScanSession nativeSparkScanSession, NativeFrameData nativeFrameData);

    public abstract void onSessionUpdated(NativeSparkScan nativeSparkScan, NativeSparkScanSession nativeSparkScanSession, NativeFrameData nativeFrameData);
}
