package com.scandit.datacapture.barcode.spark.internal.module.serialization;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings;
import com.scandit.datacapture.barcode.spark.internal.module.ui.NativeSparkScanOverlay;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeSparkScanDeserializerListener {
    public abstract void onModeDeserializationFinished(NativeSparkScanDeserializer nativeSparkScanDeserializer, NativeSparkScan nativeSparkScan, NativeJsonValue nativeJsonValue);

    public abstract void onModeDeserializationStarted(NativeSparkScanDeserializer nativeSparkScanDeserializer, NativeSparkScan nativeSparkScan, NativeJsonValue nativeJsonValue);

    public abstract void onOverlayDeserializationFinished(NativeSparkScanDeserializer nativeSparkScanDeserializer, NativeSparkScanOverlay nativeSparkScanOverlay, NativeJsonValue nativeJsonValue);

    public abstract void onOverlayDeserializationStarted(NativeSparkScanDeserializer nativeSparkScanDeserializer, NativeSparkScanOverlay nativeSparkScanOverlay, NativeJsonValue nativeJsonValue);

    public abstract void onSettingsDeserializationFinished(NativeSparkScanDeserializer nativeSparkScanDeserializer, NativeSparkScanSettings nativeSparkScanSettings, NativeJsonValue nativeJsonValue);

    public abstract void onSettingsDeserializationStarted(NativeSparkScanDeserializer nativeSparkScanDeserializer, NativeSparkScanSettings nativeSparkScanSettings, NativeJsonValue nativeJsonValue);
}
