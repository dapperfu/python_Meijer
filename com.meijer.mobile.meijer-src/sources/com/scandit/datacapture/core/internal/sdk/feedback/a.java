package com.scandit.datacapture.core.internal.sdk.feedback;

import android.content.Context;
import com.scandit.datacapture.core.common.feedback.Sound;
import com.scandit.datacapture.core.common.feedback.Vibration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a implements FeedbackEmitterFactory {
    @Override // com.scandit.datacapture.core.internal.sdk.feedback.FeedbackEmitterFactory
    public final FeedbackEmitter create(Vibration vibration, Sound sound, Context context) {
        Intrinsics.j(context, "context");
        return FeedbackEmitter.INSTANCE.createDefault(vibration, sound, context);
    }
}
