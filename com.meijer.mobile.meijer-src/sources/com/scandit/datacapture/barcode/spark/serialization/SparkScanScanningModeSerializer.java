package com.scandit.datacapture.barcode.spark.serialization;

import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/serialization/SparkScanScanningModeSerializer;", "", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "scanningMode", "", "snakeCase", "", "toJson", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;Z)Ljava/lang/String;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class SparkScanScanningModeSerializer {
    public static final SparkScanScanningModeSerializer INSTANCE = new SparkScanScanningModeSerializer();

    @JvmStatic
    public static final String toJson(SparkScanScanningMode scanningMode, boolean snakeCase) throws JSONException {
        JSONObject jSONObject;
        Intrinsics.j(scanningMode, "scanningMode");
        if (scanningMode instanceof SparkScanScanningMode.Default) {
            jSONObject = new JSONObject();
            jSONObject.put("type", "default");
            SparkScanScanningMode.Default r82 = (SparkScanScanningMode.Default) scanningMode;
            INSTANCE.getClass();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(snakeCase ? "scanning_behavior" : "scanningBehavior", SparkScanScanningBehaviorSerializer.toJson(r82.getScanningBehavior()));
            jSONObject2.put(snakeCase ? "preview_behavior" : "previewBehavior", SparkScanPreviewBehaviorSerializer.toJson(r82.getPreviewBehavior()));
            jSONObject.put("settings", jSONObject2);
        } else {
            if (!(scanningMode instanceof SparkScanScanningMode.Target)) {
                throw new NoWhenBranchMatchedException();
            }
            jSONObject = new JSONObject();
            jSONObject.put("type", "target");
            SparkScanScanningMode.Target target = (SparkScanScanningMode.Target) scanningMode;
            INSTANCE.getClass();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(snakeCase ? "scanning_behavior" : "scanningBehavior", SparkScanScanningBehaviorSerializer.toJson(target.getScanningBehavior()));
            jSONObject3.put(snakeCase ? "preview_behavior" : "previewBehavior", SparkScanPreviewBehaviorSerializer.toJson(target.getPreviewBehavior()));
            jSONObject.put("settings", jSONObject3);
        }
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String toJson$default(SparkScanScanningMode sparkScanScanningMode, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return toJson(sparkScanScanningMode, z10);
    }

    private SparkScanScanningModeSerializer() {
    }
}
