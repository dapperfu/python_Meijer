package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.framesave.NativeBurstFrameSaveSession;
import com.scandit.datacapture.core.internal.module.framesave.NativeFrameSaveSession;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSessionProxyAdapter;", "Lcom/scandit/datacapture/core/framesave/BurstFrameSaveSessionProxy;", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeBurstFrameSaveSession;", "_NativeBurstFrameSaveSession", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/internal/module/framesave/NativeBurstFrameSaveSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/core/internal/module/framesave/NativeBurstFrameSaveSession;", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSession;", "_frameSaveSessionImpl", "()Lcom/scandit/datacapture/core/internal/module/framesave/NativeFrameSaveSession;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "addToContext", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "removeFromContext", "enable", "()V", "disable", "save", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BurstFrameSaveSessionProxyAdapter implements BurstFrameSaveSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBurstFrameSaveSession f125109a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeFrameSaveSession f125111c;

    public BurstFrameSaveSessionProxyAdapter(NativeBurstFrameSaveSession _NativeBurstFrameSaveSession, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBurstFrameSaveSession, "_NativeBurstFrameSaveSession");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f125109a = _NativeBurstFrameSaveSession;
        this.proxyCache = proxyCache;
        NativeFrameSaveSession nativeFrameSaveSessionAsFrameSaveSession = _NativeBurstFrameSaveSession.asFrameSaveSession();
        Intrinsics.i(nativeFrameSaveSessionAsFrameSaveSession, "asFrameSaveSession(...)");
        this.f125111c = nativeFrameSaveSessionAsFrameSaveSession;
    }

    @Override // com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    /* renamed from: _frameSaveSessionImpl, reason: from getter */
    public NativeFrameSaveSession getF125130c() {
        return this.f125111c;
    }

    @Override // com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBurstFrameSaveSession getF125109a() {
        return this.f125109a;
    }

    @Override // com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    public void addToContext(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        NativeDataCaptureContext nativeDataCaptureContext_impl = dataCaptureContext.getF125005a();
        this.proxyCache.put(Reflection.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, dataCaptureContext);
        this.f125109a.addToContext(nativeDataCaptureContext_impl);
    }

    @Override // com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    public void disable() {
        this.f125109a.disable();
    }

    @Override // com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    public void enable() {
        this.f125109a.enable();
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    public void removeFromContext(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        NativeDataCaptureContext nativeDataCaptureContext_impl = dataCaptureContext.getF125005a();
        this.proxyCache.put(Reflection.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, dataCaptureContext);
        this.f125109a.removeFromContext(nativeDataCaptureContext_impl);
    }

    @Override // com.scandit.datacapture.core.framesave.BurstFrameSaveSessionProxy
    public void save() {
        this.f125109a.save();
    }

    public /* synthetic */ BurstFrameSaveSessionProxyAdapter(NativeBurstFrameSaveSession nativeBurstFrameSaveSession, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBurstFrameSaveSession, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
