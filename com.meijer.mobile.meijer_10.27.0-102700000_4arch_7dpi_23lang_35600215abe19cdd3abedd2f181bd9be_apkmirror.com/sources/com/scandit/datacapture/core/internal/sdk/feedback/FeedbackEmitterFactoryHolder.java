package com.scandit.datacapture.core.internal.sdk.feedback;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/feedback/FeedbackEmitterFactoryHolder;", "", "Lcom/scandit/datacapture/core/internal/sdk/feedback/FeedbackEmitterFactory;", "a", "Lcom/scandit/datacapture/core/internal/sdk/feedback/FeedbackEmitterFactory;", "getInstance", "()Lcom/scandit/datacapture/core/internal/sdk/feedback/FeedbackEmitterFactory;", "setInstance", "(Lcom/scandit/datacapture/core/internal/sdk/feedback/FeedbackEmitterFactory;)V", "instance", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class FeedbackEmitterFactoryHolder {
    public static final FeedbackEmitterFactoryHolder INSTANCE = new FeedbackEmitterFactoryHolder();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static FeedbackEmitterFactory instance = new a();

    public final FeedbackEmitterFactory getInstance() {
        return instance;
    }

    public final void setInstance(FeedbackEmitterFactory feedbackEmitterFactory) {
        Intrinsics.j(feedbackEmitterFactory, "<set-?>");
        instance = feedbackEmitterFactory;
    }

    private FeedbackEmitterFactoryHolder() {
    }
}
