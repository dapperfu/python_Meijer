package com.scandit.datacapture.barcode.internal.sdk.feedback;

import com.scandit.datacapture.barcode.spark.capture.SparkScanViewDefaults;
import com.scandit.datacapture.barcode.spark.feedback.SparkScanBarcodeFeedback;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.internal.sdk.common.feedback.FeedbackDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/feedback/SparkScanBarcodeSuccessFeedbackDeserializer;", "", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback$Success;", "fromJson", "(Lcom/scandit/datacapture/core/json/JsonValue;)Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback$Success;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SparkScanBarcodeSuccessFeedbackDeserializer {
    public static final SparkScanBarcodeSuccessFeedbackDeserializer INSTANCE = new SparkScanBarcodeSuccessFeedbackDeserializer();

    @JvmStatic
    public static final SparkScanBarcodeFeedback.Success fromJson(JsonValue json) {
        Feedback feedbackDefaultSuccessFeedback;
        Intrinsics.j(json, "json");
        JsonValue byKeyAsObject = json.getByKeyAsObject("feedback", null);
        if (byKeyAsObject == null || (feedbackDefaultSuccessFeedback = FeedbackDeserializer.fromJson(byKeyAsObject)) == null) {
            feedbackDefaultSuccessFeedback = SparkScanBarcodeFeedback.INSTANCE.defaultSuccessFeedback();
        }
        return new SparkScanBarcodeFeedback.Success(SparkScanFeedbackDeserializerKt.getByKeyAsAndroidColor(json, "visualFeedbackColor", SparkScanViewDefaults.getDefaultVisualFeedbackSuccessColor()), json.getByKeyAsBrush("brush", SparkScanViewDefaults.getDefaultBrush()), feedbackDefaultSuccessFeedback);
    }

    private SparkScanBarcodeSuccessFeedbackDeserializer() {
    }
}
