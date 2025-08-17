package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSession;
import com.scandit.datacapture.core.internal.module.framesave.NativeSequenceFrameSaveSession;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/scandit/datacapture/core/framesave/SequenceFrameSaveSessionProxyAdapter;", "Lcom/scandit/datacapture/core/framesave/SequenceFrameSaveSessionProxy;", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeSequenceFrameSaveSession;", "_NativeSequenceFrameSaveSession", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/internal/module/framesave/NativeSequenceFrameSaveSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/core/internal/module/framesave/NativeSequenceFrameSaveSession;", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSession;", "_frameSaveSessionImpl", "()Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSession;", "Lcom/scandit/datacapture/core/framesave/FrameSaveSession;", "frameSaveSession", "", "_setFrameSaveSession", "(Lcom/scandit/datacapture/core/framesave/FrameSaveSession;)V", "_getFrameSaveSession", "()Lcom/scandit/datacapture/core/framesave/FrameSaveSession;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "addToContext", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "removeFromContext", "start", "()V", "stop", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SequenceFrameSaveSessionProxyAdapter implements SequenceFrameSaveSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeSequenceFrameSaveSession f124176a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeFrameSaveSession f124178c;

    /* renamed from: d, reason: collision with root package name */
    private FrameSaveSession f124179d;

    public SequenceFrameSaveSessionProxyAdapter(NativeSequenceFrameSaveSession _NativeSequenceFrameSaveSession, ProxyCache proxyCache) {
        Intrinsics.j(_NativeSequenceFrameSaveSession, "_NativeSequenceFrameSaveSession");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124176a = _NativeSequenceFrameSaveSession;
        this.proxyCache = proxyCache;
        NativeFrameSaveSession nativeFrameSaveSessionAsFrameSaveSession = _NativeSequenceFrameSaveSession.asFrameSaveSession();
        Intrinsics.i(nativeFrameSaveSessionAsFrameSaveSession, "asFrameSaveSession(...)");
        this.f124178c = nativeFrameSaveSessionAsFrameSaveSession;
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy, com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    /* renamed from: _frameSaveSessionImpl, reason: from getter */
    public NativeFrameSaveSession getF124178c() {
        return this.f124178c;
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    public FrameSaveSession _getFrameSaveSession() {
        FrameSaveSession frameSaveSession = this.f124179d;
        if (frameSaveSession != null) {
            return frameSaveSession;
        }
        Intrinsics.y("_setFrameSaveSession_backing_field");
        return null;
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    /* renamed from: _impl, reason: from getter */
    public NativeSequenceFrameSaveSession getF124176a() {
        return this.f124176a;
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    public void _setFrameSaveSession(FrameSaveSession frameSaveSession) {
        Intrinsics.j(frameSaveSession, "frameSaveSession");
        this.f124179d = frameSaveSession;
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy, com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    public void addToContext(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        NativeDataCaptureContext nativeDataCaptureContext_impl = dataCaptureContext.getF124053a();
        this.proxyCache.put(Reflection.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, dataCaptureContext);
        this.f124176a.addToContext(nativeDataCaptureContext_impl);
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy, com.scandit.datacapture.core.framesave.FrameSaveSession, com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    public void removeFromContext(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        NativeDataCaptureContext nativeDataCaptureContext_impl = dataCaptureContext.getF124053a();
        this.proxyCache.put(Reflection.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, dataCaptureContext);
        this.f124176a.removeFromContext(nativeDataCaptureContext_impl);
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    public void start() {
        this.f124176a.start();
    }

    @Override // com.scandit.datacapture.core.framesave.SequenceFrameSaveSessionProxy
    public void stop() {
        this.f124176a.stop();
    }

    public /* synthetic */ SequenceFrameSaveSessionProxyAdapter(NativeSequenceFrameSaveSession nativeSequenceFrameSaveSession, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeSequenceFrameSaveSession, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
