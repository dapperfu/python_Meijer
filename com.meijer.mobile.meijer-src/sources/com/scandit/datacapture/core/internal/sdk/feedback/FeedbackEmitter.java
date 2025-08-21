package com.scandit.datacapture.core.internal.sdk.feedback;

import android.content.Context;
import com.scandit.datacapture.core.common.feedback.Sound;
import com.scandit.datacapture.core.common.feedback.Vibration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/feedback/FeedbackEmitter;", "", "emitAsync", "", "loadAsync", "releaseAsync", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FeedbackEmitter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f126428a;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/feedback/FeedbackEmitter$Companion;", "", "Lcom/scandit/datacapture/core/common/feedback/Vibration;", "vibration", "Lcom/scandit/datacapture/core/common/feedback/Sound;", "sound", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/internal/sdk/feedback/FeedbackEmitter;", "createDefault", "(Lcom/scandit/datacapture/core/common/feedback/Vibration;Lcom/scandit/datacapture/core/common/feedback/Sound;Landroid/content/Context;)Lcom/scandit/datacapture/core/internal/sdk/feedback/FeedbackEmitter;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f126428a = new Companion();

        public final FeedbackEmitter createDefault(Vibration vibration, Sound sound, Context context) {
            Intrinsics.j(context, "context");
            return new b(vibration, sound, context);
        }

        private Companion() {
        }
    }

    void emitAsync();

    void loadAsync();

    void releaseAsync();
}
