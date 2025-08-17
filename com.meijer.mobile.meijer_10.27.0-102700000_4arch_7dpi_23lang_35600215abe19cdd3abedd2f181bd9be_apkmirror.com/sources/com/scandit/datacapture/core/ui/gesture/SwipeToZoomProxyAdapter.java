package com.scandit.datacapture.core.ui.gesture;

import com.scandit.datacapture.core.internal.module.ui.NativeSwipeToZoom;
import com.scandit.datacapture.core.internal.module.ui.NativeZoomGesture;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/core/ui/gesture/SwipeToZoomProxyAdapter;", "Lcom/scandit/datacapture/core/ui/gesture/SwipeToZoomProxy;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeSwipeToZoom;", "_NativeSwipeToZoom", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeSwipeToZoom;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/core/internal/module/ui/NativeSwipeToZoom;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeZoomGesture;", "_zoomGestureImpl", "()Lcom/scandit/datacapture/core/internal/module/ui/NativeZoomGesture;", "", "triggerZoomIn", "()V", "triggerZoomOut", "", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SwipeToZoomProxyAdapter implements SwipeToZoomProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeSwipeToZoom f126092a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeZoomGesture f126094c;

    public SwipeToZoomProxyAdapter(NativeSwipeToZoom _NativeSwipeToZoom, ProxyCache proxyCache) {
        Intrinsics.j(_NativeSwipeToZoom, "_NativeSwipeToZoom");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f126092a = _NativeSwipeToZoom;
        this.proxyCache = proxyCache;
        NativeZoomGesture nativeZoomGestureAsZoomGesture = _NativeSwipeToZoom.asZoomGesture();
        Intrinsics.i(nativeZoomGestureAsZoomGesture, "asZoomGesture(...)");
        this.f126094c = nativeZoomGestureAsZoomGesture;
    }

    @Override // com.scandit.datacapture.core.ui.gesture.SwipeToZoomProxy
    /* renamed from: _impl, reason: from getter */
    public NativeSwipeToZoom getF126092a() {
        return this.f126092a;
    }

    @Override // com.scandit.datacapture.core.ui.gesture.SwipeToZoomProxy
    /* renamed from: _zoomGestureImpl, reason: from getter */
    public NativeZoomGesture getF126094c() {
        return this.f126094c;
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.gesture.SwipeToZoomProxy
    public String toJson() {
        String json = this.f126092a.toJson();
        Intrinsics.g(json);
        return json;
    }

    @Override // com.scandit.datacapture.core.ui.gesture.SwipeToZoomProxy
    public void triggerZoomIn() {
        this.f126092a.triggerZoomIn();
    }

    @Override // com.scandit.datacapture.core.ui.gesture.SwipeToZoomProxy
    public void triggerZoomOut() {
        this.f126092a.triggerZoomOut();
    }

    public /* synthetic */ SwipeToZoomProxyAdapter(NativeSwipeToZoom nativeSwipeToZoom, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeSwipeToZoom, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
