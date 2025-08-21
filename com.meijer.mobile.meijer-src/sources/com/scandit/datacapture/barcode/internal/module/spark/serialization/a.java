package com.scandit.datacapture.barcode.internal.module.spark.serialization;

import com.scandit.datacapture.barcode.data.CapturePreset;
import com.scandit.datacapture.barcode.spark.capture.SparkScanSettings;
import com.scandit.datacapture.barcode.spark.serialization.BatterySavingModeDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a implements SparkScanSettingsDeserializer {
    @Override // com.scandit.datacapture.barcode.internal.module.spark.serialization.SparkScanSettingsDeserializer
    public final void a(SparkScanSettings settings, JsonValue json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        settings.getF124822a().updateFromJson(json.getF126782a());
        if (json.contains("batterySaving")) {
            settings.setBatterySaving(BatterySavingModeDeserializer.fromJson(json.requireByKeyAsString("batterySaving")));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.serialization.SparkScanSettingsDeserializer
    public final LinkedHashSet a(JsonValue json) {
        CapturePreset capturePreset;
        Intrinsics.j(json, "json");
        if (!json.contains("capturePresets")) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        JsonValue jsonValueRequireByKeyAsArray = json.requireByKeyAsArray("capturePresets");
        int size = (int) jsonValueRequireByKeyAsArray.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            JsonValue jsonValueRequireByIndex = jsonValueRequireByKeyAsArray.requireByIndex(i10);
            CapturePreset[] capturePresetArrValues = CapturePreset.values();
            int length = capturePresetArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    capturePreset = null;
                    break;
                }
                capturePreset = capturePresetArrValues[i11];
                String lowerCase = capturePreset.name().toLowerCase(Locale.ROOT);
                Intrinsics.i(lowerCase, "toLowerCase(...)");
                if (Intrinsics.e(lowerCase, jsonValueRequireByIndex.asString())) {
                    break;
                }
                i11++;
            }
            if (capturePreset != null) {
                linkedHashSet.add(capturePreset);
            }
        }
        return linkedHashSet;
    }
}
