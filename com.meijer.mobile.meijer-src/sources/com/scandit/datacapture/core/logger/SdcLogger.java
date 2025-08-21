package com.scandit.datacapture.core.logger;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/core/logger/SdcLogger;", "", "<init>", "()V", "Lcom/scandit/datacapture/core/logger/Event;", "event", "", "onEvent$scandit_capture_core", "(Lcom/scandit/datacapture/core/logger/Event;)Z", "onEvent", "a", "Z", "isEnabled", "()Z", "setEnabled", "(Z)V", "Lcom/scandit/datacapture/core/logger/SdcLogger$Listener;", "b", "Lcom/scandit/datacapture/core/logger/SdcLogger$Listener;", "getListener", "()Lcom/scandit/datacapture/core/logger/SdcLogger$Listener;", "setListener", "(Lcom/scandit/datacapture/core/logger/SdcLogger$Listener;)V", "listener", "Companion", "Listener", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class SdcLogger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Lazy f126816c = LazyKt.b(a.f126822a);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isEnabled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Listener listener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/logger/SdcLogger$Listener;", "", "onEvent", "", "event", "Lcom/scandit/datacapture/core/logger/Event;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Listener {
        void onEvent(Event event);
    }

    @JvmStatic
    public static final SdcLogger get() {
        return INSTANCE.get();
    }

    public final synchronized boolean onEvent$scandit_capture_core(Event event) {
        Intrinsics.j(event, "event");
        Listener listener = this.listener;
        if (listener != null && this.isEnabled) {
            listener.onEvent(event);
            return true;
        }
        return false;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/scandit/datacapture/core/logger/SdcLogger$Companion;", "", "Lcom/scandit/datacapture/core/logger/SdcLogger;", "get", "()Lcom/scandit/datacapture/core/logger/SdcLogger;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final SdcLogger get() {
            return (SdcLogger) SdcLogger.f126816c.getValue();
        }
    }

    public final Listener getListener() {
        return this.listener;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
    }

    public final void setListener(Listener listener) {
        this.listener = listener;
    }
}
