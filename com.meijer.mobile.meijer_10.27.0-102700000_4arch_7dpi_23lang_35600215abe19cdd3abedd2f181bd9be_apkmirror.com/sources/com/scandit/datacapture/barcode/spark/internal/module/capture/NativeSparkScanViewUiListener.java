package com.scandit.datacapture.barcode.spark.internal.module.capture;

import com.scandit.datacapture.barcode.spark.ui.SparkScanViewState;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeSparkScanViewUiListener {
    public abstract void onScanningModeChanged(NativeSparkScanScanningMode nativeSparkScanScanningMode, NativeSparkScanScanningMode nativeSparkScanScanningMode2);

    public abstract void onViewStateChanged(SparkScanViewState sparkScanViewState);
}
