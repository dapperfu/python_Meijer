package com.scandit.datacapture.core.ui.gesture;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.module.ui.NativeFocusGesture;
import com.scandit.datacapture.core.internal.module.ui.NativeFocusGestureListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/core/ui/gesture/FocusGestureListenerReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeFocusGestureListener;", "Lcom/scandit/datacapture/core/ui/gesture/FocusGestureListener;", "_FocusGestureListener", "Lcom/scandit/datacapture/core/ui/gesture/FocusGesture;", "_FocusGesture", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/ui/gesture/FocusGestureListener;Lcom/scandit/datacapture/core/ui/gesture/FocusGesture;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/core/internal/module/ui/NativeFocusGesture;", "focusGesture", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "point", "", "onFocusGesture", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeFocusGesture;Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class FocusGestureListenerReversedAdapter extends NativeFocusGestureListener {

    /* renamed from: a, reason: collision with root package name */
    private final FocusGestureListener f126087a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f126089c;

    public /* synthetic */ FocusGestureListenerReversedAdapter(FocusGestureListener focusGestureListener, FocusGesture focusGesture, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(focusGestureListener, focusGesture, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativeFocusGestureListener
    public void onFocusGesture(NativeFocusGesture focusGesture, PointWithUnit point) {
        Intrinsics.j(focusGesture, "focusGesture");
        Intrinsics.j(point, "point");
        FocusGesture focusGesture2 = (FocusGesture) this.f126089c.get();
        if (focusGesture2 != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.b(NativeFocusGesture.class), null, focusGesture, new a(focusGesture2));
            Intrinsics.i(orPut, "getOrPut(...)");
            this.f126087a.onFocusGesture((FocusGesture) orPut, point);
        }
    }

    public FocusGestureListenerReversedAdapter(FocusGestureListener _FocusGestureListener, FocusGesture _FocusGesture, ProxyCache proxyCache) {
        Intrinsics.j(_FocusGestureListener, "_FocusGestureListener");
        Intrinsics.j(_FocusGesture, "_FocusGesture");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f126087a = _FocusGestureListener;
        this.proxyCache = proxyCache;
        this.f126089c = new WeakReference(_FocusGesture);
    }
}
