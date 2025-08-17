package com.scandit.datacapture.core.internal.sdk.extensions;

import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, d2 = {"loadSoundResource", "", "Lcom/scandit/datacapture/core/common/feedback/Feedback;", "toNativeFeedback", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeFeedback;", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FeedbackExtensionsKt {
    public static final void loadSoundResource(Feedback feedback) {
        Intrinsics.j(feedback, "<this>");
        feedback.loadSoundResourceInternal$scandit_capture_core();
    }

    public static final NativeFeedback toNativeFeedback(final Feedback feedback) {
        Intrinsics.j(feedback, "<this>");
        return new NativeFeedback() { // from class: com.scandit.datacapture.core.internal.sdk.extensions.FeedbackExtensionsKt.toNativeFeedback.1
            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void emit() {
                feedback.emit();
            }

            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void onFreeResources() {
                feedback.release();
            }

            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void onLoadResources() {
                FeedbackExtensionsKt.loadSoundResource(feedback);
            }
        };
    }
}
