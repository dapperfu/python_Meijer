package com.scandit.datacapture.barcode.feedback;

import com.scandit.datacapture.barcode.internal.sdk.feedback.BarcodeCaptureFeedbackDeserializer;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/barcode/feedback/BarcodeCaptureFeedback;", "", "<init>", "()V", "", "onScannedSuccessfully$scandit_barcode_capture", "onScannedSuccessfully", "", "toJson", "()Ljava/lang/String;", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "value", "a", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "getSuccess", "()Lcom/scandit/datacapture/core/common/feedback/Feedback;", "setSuccess", "(Lcom/scandit/datacapture/core/common/feedback/Feedback;)V", "success", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeCaptureFeedback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Feedback success;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/barcode/feedback/BarcodeCaptureFeedback$Companion;", "", "Lcom/scandit/datacapture/barcode/feedback/BarcodeCaptureFeedback;", "defaultFeedback", "()Lcom/scandit/datacapture/barcode/feedback/BarcodeCaptureFeedback;", "", "json", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/feedback/BarcodeCaptureFeedback;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final BarcodeCaptureFeedback defaultFeedback() {
            return new BarcodeCaptureFeedback(Feedback.INSTANCE.defaultFeedback(), null);
        }

        @JvmStatic
        public final BarcodeCaptureFeedback fromJson(String json) {
            Intrinsics.j(json, "json");
            return BarcodeCaptureFeedbackDeserializer.fromJson(new JsonValue(json));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public BarcodeCaptureFeedback(Feedback feedback, DefaultConstructorMarker defaultConstructorMarker) {
        this.success = feedback;
    }

    @JvmStatic
    public static final BarcodeCaptureFeedback defaultFeedback() {
        return INSTANCE.defaultFeedback();
    }

    @JvmStatic
    public static final BarcodeCaptureFeedback fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public final Feedback getSuccess() {
        return this.success;
    }

    public final void onScannedSuccessfully$scandit_barcode_capture() {
        this.success.emit();
    }

    public final void setSuccess(Feedback value) {
        Intrinsics.j(value, "value");
        this.success.release();
        this.success = value;
    }

    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", new JSONObject(this.success.toJson()));
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public BarcodeCaptureFeedback() {
        this.success = new Feedback(null, null);
    }
}
