package com.scandit.datacapture.core.logger;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/core/logger/Event;", "", "", "a", "J", "getTimestamp", "()J", "timestamp", "Lcom/scandit/datacapture/core/logger/CameraInfoProviderEvent;", "Lcom/scandit/datacapture/core/logger/CreateDummySurface;", "Lcom/scandit/datacapture/core/logger/GlRenderThreadDisposedEvent;", "Lcom/scandit/datacapture/core/logger/GlRenderThreadObtainSurfaceEvent;", "Lcom/scandit/datacapture/core/logger/GlRenderThreadPreparedEvent;", "Lcom/scandit/datacapture/core/logger/UpdateTexImageCrashEvent;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public abstract class Event {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long timestamp = System.currentTimeMillis();

    public final long getTimestamp() {
        return this.timestamp;
    }

    public Event(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
