package com.scandit.datacapture.barcode.internal.sdk.feedback;

import com.scandit.datacapture.barcode.ar.feedback.BarcodeArFeedback;
import com.scandit.datacapture.core.internal.sdk.common.feedback.FeedbackDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/feedback/BarcodeArFeedbackDeserializer;", "", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "Lcom/scandit/datacapture/barcode/ar/feedback/BarcodeArFeedback;", "fromJson", "(Lcom/scandit/datacapture/core/json/JsonValue;)Lcom/scandit/datacapture/barcode/ar/feedback/BarcodeArFeedback;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeArFeedbackDeserializer {
    public static final BarcodeArFeedbackDeserializer INSTANCE = new BarcodeArFeedbackDeserializer();

    @JvmStatic
    public static final BarcodeArFeedback fromJson(JsonValue json) {
        Intrinsics.j(json, "json");
        BarcodeArFeedback barcodeArFeedbackDefaultFeedback = BarcodeArFeedback.INSTANCE.defaultFeedback();
        JsonValue byKeyAsObject = json.getByKeyAsObject("tapped", null);
        if (byKeyAsObject != null) {
            barcodeArFeedbackDefaultFeedback.setTapped(FeedbackDeserializer.fromJson(byKeyAsObject));
        }
        JsonValue byKeyAsObject2 = json.getByKeyAsObject("scanned", null);
        if (byKeyAsObject2 != null) {
            barcodeArFeedbackDefaultFeedback.setScanned(FeedbackDeserializer.fromJson(byKeyAsObject2));
        }
        return barcodeArFeedbackDefaultFeedback;
    }

    private BarcodeArFeedbackDeserializer() {
    }
}
