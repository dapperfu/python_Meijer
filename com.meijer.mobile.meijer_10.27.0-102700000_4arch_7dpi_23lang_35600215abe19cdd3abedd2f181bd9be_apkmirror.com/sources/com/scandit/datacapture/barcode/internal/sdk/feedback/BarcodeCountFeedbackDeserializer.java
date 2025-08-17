package com.scandit.datacapture.barcode.internal.sdk.feedback;

import com.scandit.datacapture.barcode.count.feedback.BarcodeCountFeedback;
import com.scandit.datacapture.core.internal.sdk.common.feedback.FeedbackDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/feedback/BarcodeCountFeedbackDeserializer;", "", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback;", "fromJson", "(Lcom/scandit/datacapture/core/json/JsonValue;)Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeCountFeedbackDeserializer {
    public static final BarcodeCountFeedbackDeserializer INSTANCE = new BarcodeCountFeedbackDeserializer();

    @JvmStatic
    public static final BarcodeCountFeedback fromJson(JsonValue json) {
        Intrinsics.j(json, "json");
        BarcodeCountFeedback barcodeCountFeedbackDefaultFeedback = BarcodeCountFeedback.INSTANCE.defaultFeedback();
        JsonValue byKeyAsObject = json.getByKeyAsObject("success", null);
        if (byKeyAsObject != null) {
            barcodeCountFeedbackDefaultFeedback.setSuccess(FeedbackDeserializer.fromJson(byKeyAsObject));
        }
        JsonValue byKeyAsObject2 = json.getByKeyAsObject("unrecognized", null);
        if (byKeyAsObject2 != null) {
            barcodeCountFeedbackDefaultFeedback.setUnrecognized$scandit_barcode_capture(FeedbackDeserializer.fromJson(byKeyAsObject2));
        }
        JsonValue byKeyAsObject3 = json.getByKeyAsObject("failure", null);
        if (byKeyAsObject3 != null) {
            barcodeCountFeedbackDefaultFeedback.setFailure(FeedbackDeserializer.fromJson(byKeyAsObject3));
        }
        return barcodeCountFeedbackDefaultFeedback;
    }

    private BarcodeCountFeedbackDeserializer() {
    }
}
