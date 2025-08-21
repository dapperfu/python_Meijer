package com.scandit.datacapture.barcode.spark.internal.module.serialization;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeSparkScanDeserializerHelper {
    public abstract void applySettings(NativeSparkScan nativeSparkScan, NativeSparkScanSettings nativeSparkScanSettings);

    public abstract NativeSparkScan createMode(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract NativeCameraSettings createRecommendedCameraSettings();

    public abstract NativeSparkScanSettings createSettings();

    public abstract void updateModeFromJson(NativeSparkScan nativeSparkScan, NativeJsonValue nativeJsonValue);

    public abstract void updateSettingsFromJson(NativeSparkScanSettings nativeSparkScanSettings, NativeJsonValue nativeJsonValue);
}
