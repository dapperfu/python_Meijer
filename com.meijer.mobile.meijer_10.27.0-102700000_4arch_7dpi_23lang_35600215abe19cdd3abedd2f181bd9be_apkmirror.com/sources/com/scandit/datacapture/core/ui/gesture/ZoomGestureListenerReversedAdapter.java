package com.scandit.datacapture.core.ui.gesture;

import com.scandit.datacapture.core.internal.module.ui.NativeZoomGesture;
import com.scandit.datacapture.core.internal.module.ui.NativeZoomGestureListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/core/ui/gesture/ZoomGestureListenerReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeZoomGestureListener;", "Lcom/scandit/datacapture/core/ui/gesture/ZoomGestureListener;", "_ZoomGestureListener", "Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;", "_ZoomGesture", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/ui/gesture/ZoomGestureListener;Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/core/internal/module/ui/NativeZoomGesture;", "zoomGesture", "", "onZoomInGesture", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeZoomGesture;)V", "onZoomOutGesture", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ZoomGestureListenerReversedAdapter extends NativeZoomGestureListener {

    /* renamed from: a, reason: collision with root package name */
    private final ZoomGestureListener f126100a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f126102c;

    public /* synthetic */ ZoomGestureListenerReversedAdapter(ZoomGestureListener zoomGestureListener, ZoomGesture zoomGesture, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(zoomGestureListener, zoomGesture, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativeZoomGestureListener
    public void onZoomInGesture(NativeZoomGesture zoomGesture) {
        Intrinsics.j(zoomGesture, "zoomGesture");
        ZoomGesture zoomGesture2 = (ZoomGesture) this.f126102c.get();
        if (zoomGesture2 != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeZoomGesture.class), null, zoomGesture, new d(zoomGesture2));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f126100a.onZoomInGesture((ZoomGesture) orPut);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativeZoomGestureListener
    public void onZoomOutGesture(NativeZoomGesture zoomGesture) {
        Intrinsics.j(zoomGesture, "zoomGesture");
        ZoomGesture zoomGesture2 = (ZoomGesture) this.f126102c.get();
        if (zoomGesture2 != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeZoomGesture.class), null, zoomGesture, new e(zoomGesture2));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f126100a.onZoomOutGesture((ZoomGesture) orPut);
        }
    }

    public ZoomGestureListenerReversedAdapter(ZoomGestureListener _ZoomGestureListener, ZoomGesture _ZoomGesture, ProxyCache proxyCache) {
        Intrinsics.j(_ZoomGestureListener, "_ZoomGestureListener");
        Intrinsics.j(_ZoomGesture, "_ZoomGesture");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f126100a = _ZoomGestureListener;
        this.proxyCache = proxyCache;
        this.f126102c = new WeakReference(_ZoomGesture);
    }
}
