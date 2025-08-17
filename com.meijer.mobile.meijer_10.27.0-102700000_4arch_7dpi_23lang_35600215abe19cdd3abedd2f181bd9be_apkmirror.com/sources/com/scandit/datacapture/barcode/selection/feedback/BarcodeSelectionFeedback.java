package com.scandit.datacapture.barcode.selection.feedback;

import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.sdk.feedback.BarcodeSelectionFeedbackDeserializer;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.feedback.ResourceSound;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R*\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/feedback/BarcodeSelectionFeedback;", "", "<init>", "()V", "", "emitSelection$scandit_barcode_capture", "emitSelection", "", "toJson", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "value", "a", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "getSelection", "()Lcom/scandit/datacapture/core/common/feedback/Feedback;", "setSelection", "(Lcom/scandit/datacapture/core/common/feedback/Feedback;)V", "selection", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeSelectionFeedback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Feedback selection;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/feedback/BarcodeSelectionFeedback$Companion;", "", "Lcom/scandit/datacapture/barcode/selection/feedback/BarcodeSelectionFeedback;", "defaultFeedback", "()Lcom/scandit/datacapture/barcode/selection/feedback/BarcodeSelectionFeedback;", "", "json", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/selection/feedback/BarcodeSelectionFeedback;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final BarcodeSelectionFeedback defaultFeedback() {
            return new BarcodeSelectionFeedback(new Feedback(new ResourceSound(R.raw.sc_selection_beep)), null);
        }

        @JvmStatic
        public final BarcodeSelectionFeedback fromJson(String json) {
            Intrinsics.j(json, "json");
            return BarcodeSelectionFeedbackDeserializer.fromJson(new JsonValue(json));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public BarcodeSelectionFeedback(Feedback feedback, DefaultConstructorMarker defaultConstructorMarker) {
        this.selection = feedback;
    }

    @JvmStatic
    public static final BarcodeSelectionFeedback defaultFeedback() {
        return INSTANCE.defaultFeedback();
    }

    @JvmStatic
    public static final BarcodeSelectionFeedback fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public final void emitSelection$scandit_barcode_capture() {
        this.selection.emit();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof BarcodeSelectionFeedback) {
            return Intrinsics.e(this.selection, ((BarcodeSelectionFeedback) other).selection);
        }
        return false;
    }

    public final Feedback getSelection() {
        return this.selection;
    }

    public int hashCode() {
        return this.selection.hashCode();
    }

    public final void setSelection(Feedback value) {
        Intrinsics.j(value, "value");
        this.selection.release();
        this.selection = value;
    }

    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("selection", new JSONObject(this.selection.toJson()));
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public BarcodeSelectionFeedback() {
        this.selection = new Feedback(null, null);
    }
}
