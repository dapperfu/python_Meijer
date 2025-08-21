package com.scandit.datacapture.core.logger;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/core/logger/UpdateTexImageCrashEvent;", "Lcom/scandit/datacapture/core/logger/Event;", "", "throwable", "", "frameTimeNanos", "Lcom/scandit/datacapture/core/logger/GlRenderThreadState;", "threadState", "<init>", "(Ljava/lang/Throwable;JLcom/scandit/datacapture/core/logger/GlRenderThreadState;)V", "b", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "c", "J", "getFrameTimeNanos", "()J", "d", "Lcom/scandit/datacapture/core/logger/GlRenderThreadState;", "getThreadState", "()Lcom/scandit/datacapture/core/logger/GlRenderThreadState;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class UpdateTexImageCrashEvent extends Event {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Throwable throwable;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long frameTimeNanos;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final GlRenderThreadState threadState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateTexImageCrashEvent(Throwable throwable, long j10, GlRenderThreadState threadState) {
        super(null);
        Intrinsics.j(throwable, "throwable");
        Intrinsics.j(threadState, "threadState");
        this.throwable = throwable;
        this.frameTimeNanos = j10;
        this.threadState = threadState;
    }

    public final long getFrameTimeNanos() {
        return this.frameTimeNanos;
    }

    public final GlRenderThreadState getThreadState() {
        return this.threadState;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }
}
