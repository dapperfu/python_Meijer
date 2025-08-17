package com.scandit.datacapture.barcode.spark.serialization;

import com.scandit.datacapture.core.source.BatterySavingMode;
import com.scandit.datacapture.core.source.CameraSettings;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/serialization/BatterySavingModeDeserializer;", "", "", "json", "Lcom/scandit/datacapture/core/source/BatterySavingMode;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/source/BatterySavingMode;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BatterySavingModeDeserializer {
    public static final BatterySavingModeDeserializer INSTANCE = new BatterySavingModeDeserializer();

    @JvmStatic
    public static final BatterySavingMode fromJson(String json) {
        Intrinsics.j(json, "json");
        int iHashCode = json.hashCode();
        if (iHashCode != 3551) {
            if (iHashCode != 109935) {
                if (iHashCode == 3005871 && json.equals(CameraSettings.FOCUS_STRATEGY_AUTO)) {
                    return BatterySavingMode.AUTO;
                }
            } else if (json.equals("off")) {
                return BatterySavingMode.OFF;
            }
        } else if (json.equals("on")) {
            return BatterySavingMode.ON;
        }
        throw new IllegalArgumentException("No match found for ".concat(json));
    }

    private BatterySavingModeDeserializer() {
    }
}
