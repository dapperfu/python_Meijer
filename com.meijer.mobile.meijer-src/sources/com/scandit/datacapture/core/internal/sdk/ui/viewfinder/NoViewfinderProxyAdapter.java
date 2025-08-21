package com.scandit.datacapture.core.internal.sdk.ui.viewfinder;

import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NoViewfinderProxyAdapter;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NoViewfinderProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeNoViewfinder;", "_NativeNoViewfinder", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeNoViewfinder;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeNoViewfinder;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "_viewfinderImpl", "()Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class NoViewfinderProxyAdapter implements NoViewfinderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeNoViewfinder f126778a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeViewfinder f126780c;

    public NoViewfinderProxyAdapter(NativeNoViewfinder _NativeNoViewfinder, ProxyCache proxyCache) {
        Intrinsics.j(_NativeNoViewfinder, "_NativeNoViewfinder");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f126778a = _NativeNoViewfinder;
        this.proxyCache = proxyCache;
        NativeViewfinder nativeViewfinderAsViewfinder = _NativeNoViewfinder.asViewfinder();
        Intrinsics.i(nativeViewfinderAsViewfinder, "asViewfinder(...)");
        this.f126780c = nativeViewfinderAsViewfinder;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NoViewfinderProxy
    /* renamed from: _impl, reason: from getter */
    public NativeNoViewfinder getF126778a() {
        return this.f126778a;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NoViewfinderProxy, com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    /* renamed from: _viewfinderImpl, reason: from getter */
    public NativeViewfinder getF126780c() {
        return this.f126780c;
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ NoViewfinderProxyAdapter(NativeNoViewfinder nativeNoViewfinder, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeNoViewfinder, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
