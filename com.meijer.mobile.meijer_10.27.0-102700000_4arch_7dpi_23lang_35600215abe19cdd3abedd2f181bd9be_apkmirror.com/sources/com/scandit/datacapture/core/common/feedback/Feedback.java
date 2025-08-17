package com.scandit.datacapture.core.common.feedback;

import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.common.feedback.FeedbackDeserializer;
import com.scandit.datacapture.core.internal.sdk.feedback.FeedbackEmitter;
import com.scandit.datacapture.core.internal.sdk.feedback.FeedbackEmitterFactoryHolder;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B!\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/scandit/datacapture/core/common/feedback/Feedback;", "", "Lcom/scandit/datacapture/core/common/feedback/Vibration;", "vibration", "Lcom/scandit/datacapture/core/common/feedback/Sound;", "sound", "<init>", "(Lcom/scandit/datacapture/core/common/feedback/Vibration;Lcom/scandit/datacapture/core/common/feedback/Sound;)V", "(Lcom/scandit/datacapture/core/common/feedback/Sound;)V", "", "loadSoundResourceInternal$scandit_capture_core", "()V", "loadSoundResourceInternal", "emit", "release", "", "toJson", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lcom/scandit/datacapture/core/common/feedback/Vibration;", "getVibration", "()Lcom/scandit/datacapture/core/common/feedback/Vibration;", "b", "Lcom/scandit/datacapture/core/common/feedback/Sound;", "getSound", "()Lcom/scandit/datacapture/core/common/feedback/Sound;", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes11.dex */
public final class Feedback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Vibration vibration;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Sound sound;

    /* renamed from: c, reason: collision with root package name */
    private final FeedbackEmitter f124118c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/core/common/feedback/Feedback$Companion;", "", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "defaultFeedback", "()Lcom/scandit/datacapture/core/common/feedback/Feedback;", "", "json", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/core/common/feedback/Feedback;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final Feedback defaultFeedback() {
            return new Feedback(Vibration.INSTANCE.defaultVibration(), Sound.INSTANCE.defaultSound());
        }

        @JvmStatic
        public final Feedback fromJson(String json) {
            Intrinsics.j(json, "json");
            return FeedbackDeserializer.fromJson(new JsonValue(json));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public Feedback() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @JvmStatic
    public static final Feedback defaultFeedback() {
        return INSTANCE.defaultFeedback();
    }

    @JvmStatic
    public static final Feedback fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.e(Feedback.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.h(other, "null cannot be cast to non-null type com.scandit.datacapture.core.common.feedback.Feedback");
        Feedback feedback = (Feedback) other;
        return Intrinsics.e(this.vibration, feedback.vibration) && Intrinsics.e(this.sound, feedback.sound);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public Feedback(Vibration vibration) {
        this(vibration, null, 2, 0 == true ? 1 : 0);
    }

    public final void emit() {
        this.f124118c.emitAsync();
    }

    public final Sound getSound() {
        return this.sound;
    }

    public final Vibration getVibration() {
        return this.vibration;
    }

    public int hashCode() {
        Vibration vibration = this.vibration;
        int iHashCode = (vibration != null ? vibration.hashCode() : 0) * 31;
        Sound sound = this.sound;
        return iHashCode + (sound != null ? sound.hashCode() : 0);
    }

    public final void loadSoundResourceInternal$scandit_capture_core() {
        this.f124118c.loadAsync();
    }

    public final void release() {
        this.f124118c.releaseAsync();
    }

    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Sound sound = this.sound;
        if (sound != null) {
            jSONObject.put("sound", new JSONObject(sound.toJson()));
        }
        Vibration vibration = this.vibration;
        if (vibration != null) {
            jSONObject.put("vibration", new JSONObject(vibration.toJson()));
        }
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    @JvmOverloads
    public Feedback(Vibration vibration, Sound sound) {
        this.vibration = vibration;
        this.sound = sound;
        this.f124118c = FeedbackEmitterFactoryHolder.INSTANCE.getInstance().create(vibration, sound, AppAndroidEnvironment.INSTANCE.getApplicationContext());
        loadSoundResourceInternal$scandit_capture_core();
    }

    public /* synthetic */ Feedback(Vibration vibration, Sound sound, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : vibration, (i10 & 2) != 0 ? null : sound);
    }

    public Feedback(Sound sound) {
        this(null, sound);
    }
}
