package com.scandit.datacapture.barcode.internal.sdk.feedback;

import com.scandit.datacapture.barcode.spark.capture.SparkScanViewDefaults;
import com.scandit.datacapture.barcode.spark.feedback.SparkScanBarcodeFeedback;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.internal.sdk.common.feedback.FeedbackDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.time.TimeInterval;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/feedback/SparkScanBarcodeErrorFeedbackDeserializer;", "", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback$Error;", "fromJson", "(Lcom/scandit/datacapture/core/json/JsonValue;)Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback$Error;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class SparkScanBarcodeErrorFeedbackDeserializer {
    public static final SparkScanBarcodeErrorFeedbackDeserializer INSTANCE = new SparkScanBarcodeErrorFeedbackDeserializer();

    @JvmStatic
    public static final SparkScanBarcodeFeedback.Error fromJson(JsonValue json) {
        Feedback feedbackDefaultErrorFeedback;
        Intrinsics.j(json, "json");
        String strRequireByKeyAsString = json.requireByKeyAsString("message");
        TimeInterval timeIntervalSeconds = TimeInterval.INSTANCE.seconds(json.requireByKeyAsFloat("resumeCapturingDelay"));
        int byKeyAsAndroidColor = SparkScanFeedbackDeserializerKt.getByKeyAsAndroidColor(json, "visualFeedbackColor", SparkScanViewDefaults.getDefaultVisualFeedbackErrorColor());
        Brush byKeyAsBrush = json.getByKeyAsBrush("brush", SparkScanViewDefaults.getDefaultErrorBrush());
        JsonValue byKeyAsObject = json.getByKeyAsObject("feedback", null);
        if (byKeyAsObject == null || (feedbackDefaultErrorFeedback = FeedbackDeserializer.fromJson(byKeyAsObject)) == null) {
            feedbackDefaultErrorFeedback = SparkScanBarcodeFeedback.INSTANCE.defaultErrorFeedback();
        }
        return new SparkScanBarcodeFeedback.Error(strRequireByKeyAsString, timeIntervalSeconds, byKeyAsAndroidColor, byKeyAsBrush, feedbackDefaultErrorFeedback);
    }

    private SparkScanBarcodeErrorFeedbackDeserializer() {
    }
}
