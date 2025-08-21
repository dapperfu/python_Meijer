package com.scandit.datacapture.core.capture;

import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/core/capture/DataCaptureContextSettingsProxyAdapter;", "Lcom/scandit/datacapture/core/capture/DataCaptureContextSettingsProxy;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContextSettings;", "_NativeDataCaptureContextSettings", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContextSettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContextSettings;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class DataCaptureContextSettingsProxyAdapter implements DataCaptureContextSettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeDataCaptureContextSettings f125009a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public DataCaptureContextSettingsProxyAdapter(NativeDataCaptureContextSettings _NativeDataCaptureContextSettings, ProxyCache proxyCache) {
        Intrinsics.j(_NativeDataCaptureContextSettings, "_NativeDataCaptureContextSettings");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f125009a = _NativeDataCaptureContextSettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextSettingsProxy
    /* renamed from: _impl, reason: from getter */
    public NativeDataCaptureContextSettings getF125009a() {
        return this.f125009a;
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ DataCaptureContextSettingsProxyAdapter(NativeDataCaptureContextSettings nativeDataCaptureContextSettings, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeDataCaptureContextSettings, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
