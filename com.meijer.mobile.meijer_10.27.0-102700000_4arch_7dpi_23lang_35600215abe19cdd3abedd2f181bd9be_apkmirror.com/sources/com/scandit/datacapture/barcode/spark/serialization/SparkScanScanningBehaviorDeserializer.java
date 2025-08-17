package com.scandit.datacapture.barcode.spark.serialization;

import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningBehavior;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/serialization/SparkScanScanningBehaviorDeserializer;", "", "", "json", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningBehavior;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SparkScanScanningBehaviorDeserializer {
    public static final SparkScanScanningBehaviorDeserializer INSTANCE = new SparkScanScanningBehaviorDeserializer();

    @JvmStatic
    public static final SparkScanScanningBehavior fromJson(String json) {
        Intrinsics.j(json, "json");
        if (Intrinsics.e(json, "single")) {
            return SparkScanScanningBehavior.SINGLE;
        }
        if (Intrinsics.e(json, "continuous")) {
            return SparkScanScanningBehavior.CONTINUOUS;
        }
        throw new IllegalArgumentException("No match found for " + json);
    }

    private SparkScanScanningBehaviorDeserializer() {
    }
}
