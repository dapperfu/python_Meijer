package com.scandit.datacapture.barcode.find.feedback;

import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.feedback.ResourceSound;
import com.scandit.datacapture.core.common.feedback.Sound;
import com.scandit.datacapture.core.common.feedback.Vibration;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/barcode/find/feedback/BarcodeFindFeedback;", "", "<init>", "()V", "", "toJson", "()Ljava/lang/String;", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "value", "a", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "getFound", "()Lcom/scandit/datacapture/core/common/feedback/Feedback;", "setFound", "(Lcom/scandit/datacapture/core/common/feedback/Feedback;)V", "found", "b", "getItemListUpdated", "setItemListUpdated", "itemListUpdated", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeFindFeedback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Feedback found;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Feedback itemListUpdated;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/find/feedback/BarcodeFindFeedback$Companion;", "", "Lcom/scandit/datacapture/barcode/find/feedback/BarcodeFindFeedback;", "defaultFeedback", "()Lcom/scandit/datacapture/barcode/find/feedback/BarcodeFindFeedback;", "Lcom/scandit/datacapture/core/common/feedback/Sound;", "defaultFoundSound$scandit_barcode_capture", "()Lcom/scandit/datacapture/core/common/feedback/Sound;", "defaultFoundSound", "defaultItemListUpdatedSound$scandit_barcode_capture", "defaultItemListUpdatedSound", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public final Sound defaultItemListUpdatedSound$scandit_barcode_capture() {
            return null;
        }

        @JvmStatic
        public final BarcodeFindFeedback defaultFeedback() {
            Vibration.Companion companion = Vibration.INSTANCE;
            return new BarcodeFindFeedback(new Feedback(companion.defaultVibration(), defaultFoundSound$scandit_barcode_capture()), new Feedback(companion.defaultVibration(), defaultItemListUpdatedSound$scandit_barcode_capture()), null);
        }

        public final Sound defaultFoundSound$scandit_barcode_capture() {
            return new ResourceSound(R.raw.sc_barcode_find_found);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public BarcodeFindFeedback(Feedback feedback, Feedback feedback2, DefaultConstructorMarker defaultConstructorMarker) {
        this.found = feedback;
        this.itemListUpdated = feedback2;
    }

    @JvmStatic
    public static final BarcodeFindFeedback defaultFeedback() {
        return INSTANCE.defaultFeedback();
    }

    public final Feedback getFound() {
        return this.found;
    }

    public final Feedback getItemListUpdated() {
        return this.itemListUpdated;
    }

    public final void setFound(Feedback value) {
        Intrinsics.j(value, "value");
        this.found.release();
        this.found = value;
    }

    public final void setItemListUpdated(Feedback value) {
        Intrinsics.j(value, "value");
        this.itemListUpdated.release();
        this.itemListUpdated = value;
    }

    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("found", new JSONObject(this.found.toJson()));
        jSONObject.put("itemListUpdated", new JSONObject(this.found.toJson()));
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public BarcodeFindFeedback() {
        Feedback feedback = new Feedback(null, null);
        Feedback feedback2 = new Feedback(null, null);
        this.found = feedback;
        this.itemListUpdated = feedback2;
    }
}
