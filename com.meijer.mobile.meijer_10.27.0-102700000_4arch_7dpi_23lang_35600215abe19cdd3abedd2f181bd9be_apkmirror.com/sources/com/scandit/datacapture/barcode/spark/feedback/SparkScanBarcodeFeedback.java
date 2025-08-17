package com.scandit.datacapture.barcode.spark.feedback;

import com.medallia.digital.mobilesdk.l3;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.module.extensions.a;
import com.scandit.datacapture.barcode.internal.sdk.feedback.SparkScanBarcodeFeedbackDeserializer;
import com.scandit.datacapture.barcode.spark.capture.SparkScanViewDefaults;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.feedback.ResourceSound;
import com.scandit.datacapture.core.common.feedback.Vibration;
import com.scandit.datacapture.core.common.feedback.WaveFormVibration;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.time.TimeInterval;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.core.ui.style.BrushSerializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00052\u00020\u0001:\u0003\u0005\u0006\u0007J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback;", "", "", "toJson", "()Ljava/lang/String;", "Companion", "Error", "Success", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback$Error;", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback$Success;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public abstract class SparkScanBarcodeFeedback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback$Companion;", "", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "defaultSuccessFeedback", "()Lcom/scandit/datacapture/core/common/feedback/Feedback;", "defaultErrorFeedback", "", "json", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback;", "", "DEFAULT_ERROR_VIBRATION_DURATION", "J", "DEFAULT_SUCCESS_VIBRATION_DURATION", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final Feedback defaultErrorFeedback() {
            ResourceSound resourceSound = new ResourceSound(R.raw.sc_barcode_count_failure);
            Vibration vibration = new Vibration();
            vibration.setDuration(TimeInterval.INSTANCE.millis(600L));
            return new Feedback(vibration, resourceSound);
        }

        @JvmStatic
        public final Feedback defaultSuccessFeedback() {
            ResourceSound resourceSound = new ResourceSound(R.raw.sc_spark_success_beep);
            WaveFormVibration waveFormVibration = new WaveFormVibration(new long[]{20, 40, 100, 60}, new int[]{0, l3.f92484c, 0, l3.f92484c});
            waveFormVibration.setDuration(TimeInterval.INSTANCE.millis(300L));
            return new Feedback(waveFormVibration, resourceSound);
        }

        @JvmStatic
        public final SparkScanBarcodeFeedback fromJson(String json) {
            Intrinsics.j(json, "json");
            return SparkScanBarcodeFeedbackDeserializer.fromJson(new JsonValue(json));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback$Error;", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback;", "", "message", "Lcom/scandit/datacapture/core/time/TimeInterval;", "resumeCapturingDelay", "", "visualFeedbackColor", "Lcom/scandit/datacapture/core/ui/style/Brush;", "brush", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "feedback", "<init>", "(Ljava/lang/String;Lcom/scandit/datacapture/core/time/TimeInterval;ILcom/scandit/datacapture/core/ui/style/Brush;Lcom/scandit/datacapture/core/common/feedback/Feedback;)V", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/core/time/TimeInterval;", "getResumeCapturingDelay", "()Lcom/scandit/datacapture/core/time/TimeInterval;", "c", "I", "getVisualFeedbackColor", "()I", "d", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "e", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "getFeedback", "()Lcom/scandit/datacapture/core/common/feedback/Feedback;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Error extends SparkScanBarcodeFeedback {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final TimeInterval resumeCapturingDelay;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int visualFeedbackColor;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Brush brush;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Feedback feedback;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Error(String message, TimeInterval resumeCapturingDelay) {
            this(message, resumeCapturingDelay, 0, null, null, 28, null);
            Intrinsics.j(message, "message");
            Intrinsics.j(resumeCapturingDelay, "resumeCapturingDelay");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Error(String message, TimeInterval resumeCapturingDelay, int i10) {
            this(message, resumeCapturingDelay, i10, null, null, 24, null);
            Intrinsics.j(message, "message");
            Intrinsics.j(resumeCapturingDelay, "resumeCapturingDelay");
        }

        public final Brush getBrush() {
            return this.brush;
        }

        public final Feedback getFeedback() {
            return this.feedback;
        }

        public final String getMessage() {
            return this.message;
        }

        public final TimeInterval getResumeCapturingDelay() {
            return this.resumeCapturingDelay;
        }

        public final int getVisualFeedbackColor() {
            return this.visualFeedbackColor;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Error(String message, TimeInterval resumeCapturingDelay, int i10, Brush brush) {
            this(message, resumeCapturingDelay, i10, brush, null, 16, null);
            Intrinsics.j(message, "message");
            Intrinsics.j(resumeCapturingDelay, "resumeCapturingDelay");
            Intrinsics.j(brush, "brush");
        }

        public /* synthetic */ Error(String str, TimeInterval timeInterval, int i10, Brush brush, Feedback feedback, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, timeInterval, (i11 & 4) != 0 ? SparkScanViewDefaults.getDefaultVisualFeedbackErrorColor() : i10, (i11 & 8) != 0 ? SparkScanViewDefaults.getDefaultErrorBrush() : brush, (i11 & 16) != 0 ? SparkScanBarcodeFeedback.INSTANCE.defaultErrorFeedback() : feedback);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Error(String message, TimeInterval resumeCapturingDelay, int i10, Brush brush, Feedback feedback) {
            super(null);
            Intrinsics.j(message, "message");
            Intrinsics.j(resumeCapturingDelay, "resumeCapturingDelay");
            Intrinsics.j(brush, "brush");
            this.message = message;
            this.resumeCapturingDelay = resumeCapturingDelay;
            this.visualFeedbackColor = i10;
            this.brush = brush;
            this.feedback = feedback;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback$Success;", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback;", "", "visualFeedbackColor", "Lcom/scandit/datacapture/core/ui/style/Brush;", "brush", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "feedback", "<init>", "(ILcom/scandit/datacapture/core/ui/style/Brush;Lcom/scandit/datacapture/core/common/feedback/Feedback;)V", "a", "I", "getVisualFeedbackColor", "()I", "b", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "c", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "getFeedback", "()Lcom/scandit/datacapture/core/common/feedback/Feedback;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Success extends SparkScanBarcodeFeedback {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int visualFeedbackColor;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Brush brush;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Feedback feedback;

        @JvmOverloads
        public Success() {
            this(0, null, null, 7, null);
        }

        @JvmOverloads
        public Success(int i10) {
            this(i10, null, null, 6, null);
        }

        public final Brush getBrush() {
            return this.brush;
        }

        public final Feedback getFeedback() {
            return this.feedback;
        }

        public final int getVisualFeedbackColor() {
            return this.visualFeedbackColor;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Success(int i10, Brush brush) {
            this(i10, brush, null, 4, null);
            Intrinsics.j(brush, "brush");
        }

        public /* synthetic */ Success(int i10, Brush brush, Feedback feedback, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? SparkScanViewDefaults.getDefaultVisualFeedbackSuccessColor() : i10, (i11 & 2) != 0 ? SparkScanViewDefaults.getDefaultBrush() : brush, (i11 & 4) != 0 ? SparkScanBarcodeFeedback.INSTANCE.defaultSuccessFeedback() : feedback);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Success(int i10, Brush brush, Feedback feedback) {
            super(null);
            Intrinsics.j(brush, "brush");
            this.visualFeedbackColor = i10;
            this.brush = brush;
            this.feedback = feedback;
        }
    }

    @JvmStatic
    public static final Feedback defaultErrorFeedback() {
        return INSTANCE.defaultErrorFeedback();
    }

    @JvmStatic
    public static final Feedback defaultSuccessFeedback() {
        return INSTANCE.defaultSuccessFeedback();
    }

    @JvmStatic
    public static final SparkScanBarcodeFeedback fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public final String toJson() throws JSONException {
        JSONObject jSONObject;
        if (this instanceof Error) {
            jSONObject = new JSONObject();
            jSONObject.put("type", "error");
            JSONObject jSONObject2 = new JSONObject();
            Error error = (Error) this;
            jSONObject2.put("visualFeedbackColor", a.a(error.getVisualFeedbackColor()));
            if (error.getFeedback() != null) {
                jSONObject2.put("feedback", new JSONObject(error.getFeedback().toJson()));
            }
            jSONObject2.put("message", error.getMessage());
            jSONObject2.put("resumeCapturingDelay", Float.valueOf(error.getResumeCapturingDelay().asSeconds()));
            jSONObject2.put("brush", new JSONObject(BrushSerializer.toJson(error.getBrush())));
            Unit unit = Unit.f142422a;
            jSONObject.put("barcodeFeedback", jSONObject2);
        } else {
            if (!(this instanceof Success)) {
                throw new NoWhenBranchMatchedException();
            }
            jSONObject = new JSONObject();
            jSONObject.put("type", "success");
            JSONObject jSONObject3 = new JSONObject();
            Success success = (Success) this;
            jSONObject3.put("visualFeedbackColor", a.a(success.getVisualFeedbackColor()));
            jSONObject3.put("brush", new JSONObject(BrushSerializer.toJson(success.getBrush())));
            if (success.getFeedback() != null) {
                jSONObject3.put("feedback", new JSONObject(success.getFeedback().toJson()));
            }
            Unit unit2 = Unit.f142422a;
            jSONObject.put("barcodeFeedback", jSONObject3);
        }
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public SparkScanBarcodeFeedback(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
