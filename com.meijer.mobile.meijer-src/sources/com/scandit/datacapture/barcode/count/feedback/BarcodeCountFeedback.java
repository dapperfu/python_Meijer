package com.scandit.datacapture.barcode.count.feedback;

import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.sdk.feedback.BarcodeCountFeedbackDeserializer;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.feedback.ResourceSound;
import com.scandit.datacapture.core.common.feedback.Vibration;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR*\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R*\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015¨\u0006 "}, d2 = {"Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback;", "", "<init>", "()V", "", "emitSuccess$scandit_barcode_capture", "emitSuccess", "emitUnrecognized$scandit_barcode_capture", "emitUnrecognized", "emitFailure$scandit_barcode_capture", "emitFailure", "", "toJson", "()Ljava/lang/String;", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "value", "a", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "getSuccess", "()Lcom/scandit/datacapture/core/common/feedback/Feedback;", "setSuccess", "(Lcom/scandit/datacapture/core/common/feedback/Feedback;)V", "success", "b", "getUnrecognized$scandit_barcode_capture", "setUnrecognized$scandit_barcode_capture", "unrecognized", "c", "getFailure", "setFailure", "failure", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeCountFeedback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Feedback success;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Feedback unrecognized;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Feedback failure;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback$Companion;", "", "Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback;", "defaultFeedback", "()Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback;", "", "soundEnabled", "vibrationEnabled", "defaultFeedback$scandit_barcode_capture", "(ZZ)Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback;", "", "json", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/count/feedback/BarcodeCountFeedback;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final BarcodeCountFeedback defaultFeedback() {
            return defaultFeedback$scandit_barcode_capture(true, true);
        }

        public final BarcodeCountFeedback defaultFeedback$scandit_barcode_capture(boolean soundEnabled, boolean vibrationEnabled) {
            return new BarcodeCountFeedback(new Feedback(vibrationEnabled ? Vibration.INSTANCE.defaultVibration() : null, soundEnabled ? new ResourceSound(R.raw.sc_barcode_count_success) : null), new Feedback(vibrationEnabled ? Vibration.INSTANCE.defaultVibration() : null, soundEnabled ? new ResourceSound(R.raw.sc_barcode_count_unrecognized) : null), new Feedback(vibrationEnabled ? Vibration.INSTANCE.defaultVibration() : null, soundEnabled ? new ResourceSound(R.raw.sc_barcode_count_failure) : null), null);
        }

        @JvmStatic
        public final BarcodeCountFeedback fromJson(String json) {
            Intrinsics.j(json, "json");
            return BarcodeCountFeedbackDeserializer.fromJson(new JsonValue(json));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public BarcodeCountFeedback(Feedback feedback, Feedback feedback2, Feedback feedback3, DefaultConstructorMarker defaultConstructorMarker) {
        this.success = feedback;
        this.unrecognized = feedback2;
        this.failure = feedback3;
    }

    @JvmStatic
    public static final BarcodeCountFeedback defaultFeedback() {
        return INSTANCE.defaultFeedback();
    }

    @JvmStatic
    public static final BarcodeCountFeedback fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public final void emitFailure$scandit_barcode_capture() {
        this.failure.emit();
    }

    public final void emitSuccess$scandit_barcode_capture() {
        this.success.emit();
    }

    public final void emitUnrecognized$scandit_barcode_capture() {
        this.unrecognized.emit();
    }

    public final Feedback getFailure() {
        return this.failure;
    }

    public final Feedback getSuccess() {
        return this.success;
    }

    /* renamed from: getUnrecognized$scandit_barcode_capture, reason: from getter */
    public final Feedback getUnrecognized() {
        return this.unrecognized;
    }

    public final void setFailure(Feedback value) {
        Intrinsics.j(value, "value");
        this.failure.release();
        this.failure = value;
    }

    public final void setSuccess(Feedback value) {
        Intrinsics.j(value, "value");
        this.success.release();
        this.success = value;
    }

    public final void setUnrecognized$scandit_barcode_capture(Feedback value) {
        Intrinsics.j(value, "value");
        this.unrecognized.release();
        this.unrecognized = value;
    }

    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", new JSONObject(this.success.toJson()));
        jSONObject.put("unrecognized", new JSONObject(this.unrecognized.toJson()));
        jSONObject.put("failure", new JSONObject(this.failure.toJson()));
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public BarcodeCountFeedback() {
        Feedback feedback = new Feedback(null, null);
        Feedback feedback2 = new Feedback(null, null);
        Feedback feedback3 = new Feedback(null, null);
        this.success = feedback;
        this.unrecognized = feedback2;
        this.failure = feedback3;
    }
}
