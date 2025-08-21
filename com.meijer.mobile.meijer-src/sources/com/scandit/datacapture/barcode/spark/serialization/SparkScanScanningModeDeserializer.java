package com.scandit.datacapture.barcode.spark.serialization;

import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningBehavior;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/serialization/SparkScanScanningModeDeserializer;", "", "", "json", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class SparkScanScanningModeDeserializer {
    public static final SparkScanScanningModeDeserializer INSTANCE = new SparkScanScanningModeDeserializer();

    @JvmStatic
    public static final SparkScanScanningMode fromJson(String json) throws JSONException {
        String string;
        String string2;
        Intrinsics.j(json, "json");
        JSONObject jSONObject = new JSONObject(json);
        JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
        String string3 = jSONObject.getString("type");
        if (Intrinsics.e(string3, "default")) {
            SparkScanScanningModeDeserializer sparkScanScanningModeDeserializer = INSTANCE;
            Intrinsics.g(jSONObject2);
            sparkScanScanningModeDeserializer.getClass();
            string = jSONObject2.has("scanningBehavior") ? jSONObject2.getString("scanningBehavior") : "single";
            string2 = jSONObject2.has("previewBehavior") ? jSONObject2.getString("previewBehavior") : "default";
            Intrinsics.g(string);
            SparkScanScanningBehavior sparkScanScanningBehaviorFromJson = SparkScanScanningBehaviorDeserializer.fromJson(string);
            Intrinsics.g(string2);
            return new SparkScanScanningMode.Default(sparkScanScanningBehaviorFromJson, SparkScanPreviewBehaviorDeserializer.fromJson(string2));
        }
        if (!Intrinsics.e(string3, "target")) {
            throw new JSONException("Invalid scanning mode type: " + string3);
        }
        SparkScanScanningModeDeserializer sparkScanScanningModeDeserializer2 = INSTANCE;
        Intrinsics.g(jSONObject2);
        sparkScanScanningModeDeserializer2.getClass();
        string = jSONObject2.has("scanningBehavior") ? jSONObject2.getString("scanningBehavior") : "single";
        string2 = jSONObject2.has("previewBehavior") ? jSONObject2.getString("previewBehavior") : "default";
        Intrinsics.g(string);
        SparkScanScanningBehavior sparkScanScanningBehaviorFromJson2 = SparkScanScanningBehaviorDeserializer.fromJson(string);
        Intrinsics.g(string2);
        return new SparkScanScanningMode.Target(sparkScanScanningBehaviorFromJson2, SparkScanPreviewBehaviorDeserializer.fromJson(string2));
    }

    private SparkScanScanningModeDeserializer() {
    }
}
