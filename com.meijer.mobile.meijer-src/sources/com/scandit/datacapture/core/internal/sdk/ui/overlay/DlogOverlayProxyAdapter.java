package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DlogOverlayProxyAdapter;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DlogOverlayProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDlogOverlay;", "_NativeDlogOverlay", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDlogOverlay;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDlogOverlay;", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_dataCaptureOverlayImpl", "()Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "", "globFilter", "", "setGlobFilter", "(Ljava/lang/String;)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class DlogOverlayProxyAdapter implements DlogOverlayProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeDlogOverlay f126716a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeDataCaptureOverlay f126718c;

    public DlogOverlayProxyAdapter(NativeDlogOverlay _NativeDlogOverlay, ProxyCache proxyCache) {
        Intrinsics.j(_NativeDlogOverlay, "_NativeDlogOverlay");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f126716a = _NativeDlogOverlay;
        this.proxyCache = proxyCache;
        NativeDataCaptureOverlay nativeDataCaptureOverlayAsDataCaptureOverlay = _NativeDlogOverlay.asDataCaptureOverlay();
        Intrinsics.i(nativeDataCaptureOverlayAsDataCaptureOverlay, "asDataCaptureOverlay(...)");
        this.f126718c = nativeDataCaptureOverlayAsDataCaptureOverlay;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.DlogOverlayProxy, com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    /* renamed from: _dataCaptureOverlayImpl, reason: from getter */
    public NativeDataCaptureOverlay getF126718c() {
        return this.f126718c;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.DlogOverlayProxy
    /* renamed from: _impl, reason: from getter */
    public NativeDlogOverlay getF126716a() {
        return this.f126716a;
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.DlogOverlayProxy
    public void setGlobFilter(String globFilter) {
        Intrinsics.j(globFilter, "globFilter");
        this.f126716a.setGlobFilter(globFilter);
    }

    public /* synthetic */ DlogOverlayProxyAdapter(NativeDlogOverlay nativeDlogOverlay, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeDlogOverlay, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
