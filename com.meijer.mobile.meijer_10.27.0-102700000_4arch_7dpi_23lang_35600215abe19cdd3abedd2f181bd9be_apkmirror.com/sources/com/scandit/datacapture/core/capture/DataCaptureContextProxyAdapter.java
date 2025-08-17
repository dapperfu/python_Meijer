package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010!\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureContextProxyAdapter;", "Lcom/scandit/datacapture/core/capture/DataCaptureContextProxy;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "_NativeDataCaptureContext", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "_setContext", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "_context", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;", "settings", "applySettings", "(Lcom/scandit/datacapture/core/capture/DataCaptureContextSettings;)V", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "mode", "Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "_addModeAsyncWrapped", "(Lcom/scandit/datacapture/core/capture/DataCaptureMode;)Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "_setModeAsyncWrapped", "_removeModeAsyncWrapped", "_removeCurrentModeAsyncWrapped", "()Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "_removeAllModesAsyncWrapped", "Lcom/scandit/datacapture/core/source/FrameSource;", "frameSource", "_setFrameSourceAsyncWrapped", "(Lcom/scandit/datacapture/core/source/FrameSource;)Lcom/scandit/datacapture/core/internal/sdk/common/async/NativeWrappedFuture;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class DataCaptureContextProxyAdapter implements DataCaptureContextProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeDataCaptureContext f124053a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private DataCaptureContext f124055c;

    public DataCaptureContextProxyAdapter(NativeDataCaptureContext _NativeDataCaptureContext, ProxyCache proxyCache) {
        Intrinsics.j(_NativeDataCaptureContext, "_NativeDataCaptureContext");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f124053a = _NativeDataCaptureContext;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    public NativeWrappedFuture _setFrameSourceAsyncWrapped(FrameSource frameSource) {
        NativeFrameSource nativeFrameSource = null;
        if (frameSource != null) {
            NativeFrameSource nativeFrameSource_frameSourceImpl = frameSource.getF125879c();
            this.proxyCache.put(Reflection.b(NativeFrameSource.class), null, nativeFrameSource_frameSourceImpl, frameSource);
            nativeFrameSource = nativeFrameSource_frameSourceImpl;
        }
        NativeWrappedFuture frameSourceAsyncWrapped = this.f124053a.setFrameSourceAsyncWrapped(nativeFrameSource);
        Intrinsics.g(frameSourceAsyncWrapped);
        return frameSourceAsyncWrapped;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    public NativeWrappedFuture _addModeAsyncWrapped(DataCaptureMode mode) {
        Intrinsics.j(mode, "mode");
        NativeDataCaptureMode f120428c = mode.getF120428c();
        this.proxyCache.put(Reflection.b(NativeDataCaptureMode.class), null, f120428c, mode);
        NativeWrappedFuture nativeWrappedFutureAddModeAsyncWrapped = this.f124053a.addModeAsyncWrapped(f120428c);
        Intrinsics.g(nativeWrappedFutureAddModeAsyncWrapped);
        return nativeWrappedFutureAddModeAsyncWrapped;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    public DataCaptureContext _context() {
        DataCaptureContext dataCaptureContext = this.f124055c;
        if (dataCaptureContext != null) {
            return dataCaptureContext;
        }
        Intrinsics.y("_setContext_backing_field");
        return null;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    /* renamed from: _impl, reason: from getter */
    public NativeDataCaptureContext getF124053a() {
        return this.f124053a;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    public NativeWrappedFuture _removeAllModesAsyncWrapped() {
        NativeWrappedFuture nativeWrappedFutureRemoveAllModesAsyncWrapped = this.f124053a.removeAllModesAsyncWrapped();
        Intrinsics.g(nativeWrappedFutureRemoveAllModesAsyncWrapped);
        return nativeWrappedFutureRemoveAllModesAsyncWrapped;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    public NativeWrappedFuture _removeCurrentModeAsyncWrapped() {
        NativeWrappedFuture nativeWrappedFutureRemoveCurrentModeAsyncWrapped = this.f124053a.removeCurrentModeAsyncWrapped();
        Intrinsics.g(nativeWrappedFutureRemoveCurrentModeAsyncWrapped);
        return nativeWrappedFutureRemoveCurrentModeAsyncWrapped;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    public NativeWrappedFuture _removeModeAsyncWrapped(DataCaptureMode mode) {
        Intrinsics.j(mode, "mode");
        NativeDataCaptureMode f120428c = mode.getF120428c();
        this.proxyCache.put(Reflection.b(NativeDataCaptureMode.class), null, f120428c, mode);
        NativeWrappedFuture nativeWrappedFutureRemoveModeAsyncWrapped = this.f124053a.removeModeAsyncWrapped(f120428c);
        Intrinsics.g(nativeWrappedFutureRemoveModeAsyncWrapped);
        return nativeWrappedFutureRemoveModeAsyncWrapped;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    public void _setContext(DataCaptureContext dataCaptureContext) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        this.f124055c = dataCaptureContext;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    public NativeWrappedFuture _setModeAsyncWrapped(DataCaptureMode mode) {
        Intrinsics.j(mode, "mode");
        NativeDataCaptureMode f120428c = mode.getF120428c();
        this.proxyCache.put(Reflection.b(NativeDataCaptureMode.class), null, f120428c, mode);
        NativeWrappedFuture modeAsyncWrapped = this.f124053a.setModeAsyncWrapped(f120428c);
        Intrinsics.g(modeAsyncWrapped);
        return modeAsyncWrapped;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextProxy
    public void applySettings(DataCaptureContextSettings settings) {
        Intrinsics.j(settings, "settings");
        NativeDataCaptureContextSettings f124057a = settings.getF124057a();
        this.proxyCache.put(Reflection.b(NativeDataCaptureContextSettings.class), null, f124057a, settings);
        this.f124053a.applySettings(f124057a);
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ DataCaptureContextProxyAdapter(NativeDataCaptureContext nativeDataCaptureContext, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeDataCaptureContext, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
