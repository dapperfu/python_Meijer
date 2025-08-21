package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSession;
import com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSessionListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/core/framesave/FrameSaveSessionListenerReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSessionListener;", "Lcom/scandit/datacapture/core/framesave/FrameSaveSessionListener;", "_FrameSaveSessionListener", "Lcom/scandit/datacapture/core/framesave/FrameSaveSession;", "_FrameSaveSession", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/framesave/FrameSaveSessionListener;Lcom/scandit/datacapture/core/framesave/FrameSaveSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSession;", "session", "", "onObservationStarted", "(Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSession;)V", "onObservationStopped", "", "message", "", "remainingQueueSize", "onFrameSaveSuccess", "(Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSession;Ljava/lang/String;J)V", "onFrameSaveFailure", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class FrameSaveSessionListenerReversedAdapter extends NativeFrameSaveSessionListener {

    /* renamed from: a, reason: collision with root package name */
    private final FrameSaveSessionListener f125125a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f125127c;

    public /* synthetic */ FrameSaveSessionListenerReversedAdapter(FrameSaveSessionListener frameSaveSessionListener, FrameSaveSession frameSaveSession, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(frameSaveSessionListener, frameSaveSession, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSessionListener
    public void onFrameSaveFailure(NativeFrameSaveSession session, String message, long remainingQueueSize) {
        Intrinsics.j(session, "session");
        Intrinsics.j(message, "message");
        FrameSaveSession frameSaveSession = (FrameSaveSession) this.f125127c.get();
        if (frameSaveSession != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeFrameSaveSession.class), null, session, new f(frameSaveSession));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f125125a.onFrameSaveFailure((FrameSaveSession) orPut, message, remainingQueueSize);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSessionListener
    public void onFrameSaveSuccess(NativeFrameSaveSession session, String message, long remainingQueueSize) {
        Intrinsics.j(session, "session");
        Intrinsics.j(message, "message");
        FrameSaveSession frameSaveSession = (FrameSaveSession) this.f125127c.get();
        if (frameSaveSession != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeFrameSaveSession.class), null, session, new g(frameSaveSession));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f125125a.onFrameSaveSuccess((FrameSaveSession) orPut, message, remainingQueueSize);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSessionListener
    public void onObservationStarted(NativeFrameSaveSession session) {
        Intrinsics.j(session, "session");
        FrameSaveSession frameSaveSession = (FrameSaveSession) this.f125127c.get();
        if (frameSaveSession != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeFrameSaveSession.class), null, session, new h(frameSaveSession));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f125125a.onObservationStarted((FrameSaveSession) orPut);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSessionListener
    public void onObservationStopped(NativeFrameSaveSession session) {
        Intrinsics.j(session, "session");
        FrameSaveSession frameSaveSession = (FrameSaveSession) this.f125127c.get();
        if (frameSaveSession != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeFrameSaveSession.class), null, session, new i(frameSaveSession));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f125125a.onObservationStopped((FrameSaveSession) orPut);
        }
    }

    public FrameSaveSessionListenerReversedAdapter(FrameSaveSessionListener _FrameSaveSessionListener, FrameSaveSession _FrameSaveSession, ProxyCache proxyCache) {
        Intrinsics.j(_FrameSaveSessionListener, "_FrameSaveSessionListener");
        Intrinsics.j(_FrameSaveSession, "_FrameSaveSession");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f125125a = _FrameSaveSessionListener;
        this.proxyCache = proxyCache;
        this.f125127c = new WeakReference(_FrameSaveSession);
    }
}
