package com.scandit.datacapture.core.logger;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/logger/GlRenderThreadDisposedEvent;", "Lcom/scandit/datacapture/core/logger/Event;", "Lcom/scandit/datacapture/core/logger/GlRenderThreadState;", "threadState", "<init>", "(Lcom/scandit/datacapture/core/logger/GlRenderThreadState;)V", "b", "Lcom/scandit/datacapture/core/logger/GlRenderThreadState;", "getThreadState", "()Lcom/scandit/datacapture/core/logger/GlRenderThreadState;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class GlRenderThreadDisposedEvent extends Event {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final GlRenderThreadState threadState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlRenderThreadDisposedEvent(GlRenderThreadState threadState) {
        super(null);
        Intrinsics.j(threadState, "threadState");
        this.threadState = threadState;
    }

    public final GlRenderThreadState getThreadState() {
        return this.threadState;
    }
}
