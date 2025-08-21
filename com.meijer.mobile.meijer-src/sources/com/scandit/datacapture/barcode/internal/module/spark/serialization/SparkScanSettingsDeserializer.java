package com.scandit.datacapture.barcode.internal.module.spark.serialization;

import com.scandit.datacapture.barcode.spark.capture.SparkScanSettings;
import com.scandit.datacapture.core.json.JsonValue;
import java.util.LinkedHashSet;

/* loaded from: classes12.dex */
public interface SparkScanSettingsDeserializer {
    LinkedHashSet a(JsonValue jsonValue);

    void a(SparkScanSettings sparkScanSettings, JsonValue jsonValue);
}
