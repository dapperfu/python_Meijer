package com.scandit.datacapture.barcode.spark.internal.module.capture;

import com.scandit.datacapture.barcode.spark.ui.SparkScanViewState;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeSparkScanViewHandlerDelegate {
    public abstract void onStateTransition(SparkScanViewState sparkScanViewState);

    public abstract void resetAllTimers();
}
