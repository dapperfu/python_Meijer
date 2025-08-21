package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderAnimation;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimationProxyAdapter;", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimationProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderAnimation;", "_NativeRectangularViewfinderAnimation", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderAnimation;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderAnimation;", "", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "isLooping", "()Z", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class RectangularViewfinderAnimationProxyAdapter implements RectangularViewfinderAnimationProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeRectangularViewfinderAnimation f127136a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public RectangularViewfinderAnimationProxyAdapter(NativeRectangularViewfinderAnimation _NativeRectangularViewfinderAnimation, ProxyCache proxyCache) {
        Intrinsics.j(_NativeRectangularViewfinderAnimation, "_NativeRectangularViewfinderAnimation");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f127136a = _NativeRectangularViewfinderAnimation;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderAnimationProxy
    /* renamed from: _impl, reason: from getter */
    public NativeRectangularViewfinderAnimation getF127136a() {
        return this.f127136a;
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderAnimationProxy
    public boolean isLooping() {
        return this.f127136a.isLooping();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderAnimationProxy
    public String toJson() {
        String json = this.f127136a.toJson();
        Intrinsics.g(json);
        return json;
    }

    public /* synthetic */ RectangularViewfinderAnimationProxyAdapter(NativeRectangularViewfinderAnimation nativeRectangularViewfinderAnimation, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeRectangularViewfinderAnimation, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
