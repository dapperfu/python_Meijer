package com.scandit.datacapture.core.common.feedback;

import com.scandit.datacapture.core.R;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/common/feedback/Sound;", "", "", "toJson", "()Ljava/lang/String;", "Companion", "Lcom/scandit/datacapture/core/common/feedback/AssetSound;", "Lcom/scandit/datacapture/core/common/feedback/ResourceSound;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public abstract class Sound {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/core/common/feedback/Sound$Companion;", "", "Lcom/scandit/datacapture/core/common/feedback/Sound;", "defaultSound", "()Lcom/scandit/datacapture/core/common/feedback/Sound;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final Sound defaultSound() {
            return new ResourceSound(R.raw.sc_beep);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final Sound defaultSound() {
        return INSTANCE.defaultSound();
    }

    public abstract String toJson();

    public Sound(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
