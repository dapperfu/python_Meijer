package com.scandit.datacapture.barcode.ar.feedback;

import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.feedback.ResourceSound;
import com.scandit.datacapture.core.common.feedback.Vibration;
import com.scandit.datacapture.core.time.TimeInterval;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/feedback/BarcodeArFeedback;", "", "<init>", "()V", "", "toJson", "()Ljava/lang/String;", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "value", "a", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "getScanned", "()Lcom/scandit/datacapture/core/common/feedback/Feedback;", "setScanned", "(Lcom/scandit/datacapture/core/common/feedback/Feedback;)V", "scanned", "b", "getTapped", "setTapped", "tapped", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeArFeedback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Feedback scanned;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Feedback tapped;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/feedback/BarcodeArFeedback$Companion;", "", "Lcom/scandit/datacapture/barcode/ar/feedback/BarcodeArFeedback;", "defaultFeedback", "()Lcom/scandit/datacapture/barcode/ar/feedback/BarcodeArFeedback;", "", "SHORTEST_FEEDBACK_DURATION", "J", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final BarcodeArFeedback defaultFeedback() {
            Vibration vibration = new Vibration();
            TimeInterval.Companion companion = TimeInterval.INSTANCE;
            vibration.setDuration(companion.millis(50L));
            Feedback feedback = new Feedback(vibration, new ResourceSound(R.raw.sc_barcode_ar_scan));
            Vibration vibration2 = new Vibration();
            vibration2.setDuration(companion.millis(50L));
            return new BarcodeArFeedback(feedback, new Feedback(vibration2, null), null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public BarcodeArFeedback(Feedback feedback, Feedback feedback2, DefaultConstructorMarker defaultConstructorMarker) {
        this.scanned = feedback;
        this.tapped = feedback2;
    }

    @JvmStatic
    public static final BarcodeArFeedback defaultFeedback() {
        return INSTANCE.defaultFeedback();
    }

    public final Feedback getScanned() {
        return this.scanned;
    }

    public final Feedback getTapped() {
        return this.tapped;
    }

    public final void setScanned(Feedback value) {
        Intrinsics.j(value, "value");
        this.scanned.release();
        this.scanned = value;
    }

    public final void setTapped(Feedback value) {
        Intrinsics.j(value, "value");
        this.tapped.release();
        this.tapped = value;
    }

    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scanned", new JSONObject(this.scanned.toJson()));
        jSONObject.put("tapped", new JSONObject(this.tapped.toJson()));
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public BarcodeArFeedback() {
        Feedback feedback = new Feedback(null, null);
        Feedback feedback2 = new Feedback(null, null);
        this.scanned = feedback;
        this.tapped = feedback2;
    }
}
