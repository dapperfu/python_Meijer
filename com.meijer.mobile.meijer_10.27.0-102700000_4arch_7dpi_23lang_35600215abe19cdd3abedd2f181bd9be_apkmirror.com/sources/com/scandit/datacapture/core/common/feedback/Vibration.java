package com.scandit.datacapture.core.common.feedback;

import com.scandit.datacapture.core.time.TimeInterval;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/core/common/feedback/Vibration;", "", "<init>", "()V", "", "toJson", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/scandit/datacapture/core/time/TimeInterval;", "a", "Lcom/scandit/datacapture/core/time/TimeInterval;", "getDuration", "()Lcom/scandit/datacapture/core/time/TimeInterval;", "setDuration", "(Lcom/scandit/datacapture/core/time/TimeInterval;)V", "duration", "b", "I", "getAmplitude", "setAmplitude", "(I)V", "amplitude", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class Vibration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEFAULT_AMPLITUDE = -1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private TimeInterval duration = TimeInterval.INSTANCE.millis(300);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int amplitude = -1;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/common/feedback/Vibration$Companion;", "", "Lcom/scandit/datacapture/core/common/feedback/Vibration;", "defaultVibration", "()Lcom/scandit/datacapture/core/common/feedback/Vibration;", "", "DEFAULT_AMPLITUDE", "I", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final Vibration defaultVibration() {
            return new Vibration();
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final Vibration defaultVibration() {
        return INSTANCE.defaultVibration();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.e(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.h(other, "null cannot be cast to non-null type com.scandit.datacapture.core.common.feedback.Vibration");
        Vibration vibration = (Vibration) other;
        return Intrinsics.e(this.duration, vibration.duration) && this.amplitude == vibration.amplitude && Intrinsics.e(this.duration, vibration.duration);
    }

    public final int getAmplitude() {
        return this.amplitude;
    }

    public final TimeInterval getDuration() {
        return this.duration;
    }

    public int hashCode() {
        return (this.duration.hashCode() * 31) + this.amplitude;
    }

    public final void setAmplitude(int i10) {
        this.amplitude = i10;
    }

    public final void setDuration(TimeInterval timeInterval) {
        Intrinsics.j(timeInterval, "<set-?>");
        this.duration = timeInterval;
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "default");
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }
}
