package com.scandit.datacapture.barcode.internal.module.spark.capture;

import com.scandit.datacapture.barcode.spark.capture.SparkScanSettings;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;

/* loaded from: classes11.dex */
public interface SparkScanModeViewListener {
    SparkScanScanningMode getScanningMode();

    void onApplySettings(SparkScanSettings sparkScanSettings);
}
