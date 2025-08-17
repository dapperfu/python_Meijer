package com.scandit.datacapture.core.internal.sdk.feedback;

import android.content.Context;
import com.scandit.datacapture.core.common.feedback.Sound;
import com.scandit.datacapture.core.common.feedback.Vibration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/feedback/FeedbackEmitterFactory;", "", "create", "Lcom/scandit/datacapture/core/internal/sdk/feedback/FeedbackEmitter;", "vibration", "Lcom/scandit/datacapture/core/common/feedback/Vibration;", "sound", "Lcom/scandit/datacapture/core/common/feedback/Sound;", "context", "Landroid/content/Context;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FeedbackEmitterFactory {
    FeedbackEmitter create(Vibration vibration, Sound sound, Context context);
}
