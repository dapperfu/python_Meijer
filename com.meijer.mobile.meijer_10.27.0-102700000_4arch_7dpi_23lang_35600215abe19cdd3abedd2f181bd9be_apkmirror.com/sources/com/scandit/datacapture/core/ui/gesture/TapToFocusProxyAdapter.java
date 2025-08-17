package com.scandit.datacapture.core.ui.gesture;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.module.ui.NativeFocusGesture;
import com.scandit.datacapture.core.internal.module.ui.NativeTapToFocus;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/core/ui/gesture/TapToFocusProxyAdapter;", "Lcom/scandit/datacapture/core/ui/gesture/TapToFocusProxy;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeTapToFocus;", "_NativeTapToFocus", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeTapToFocus;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/core/internal/module/ui/NativeTapToFocus;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeFocusGesture;", "_focusGestureImpl", "()Lcom/scandit/datacapture/core/internal/module/ui/NativeFocusGesture;", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "point", "", "triggerFocus", "(Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TapToFocusProxyAdapter implements TapToFocusProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeTapToFocus f126097a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeFocusGesture f126099c;

    public TapToFocusProxyAdapter(NativeTapToFocus _NativeTapToFocus, ProxyCache proxyCache) {
        Intrinsics.j(_NativeTapToFocus, "_NativeTapToFocus");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f126097a = _NativeTapToFocus;
        this.proxyCache = proxyCache;
        NativeFocusGesture nativeFocusGestureAsFocusGesture = _NativeTapToFocus.asFocusGesture();
        Intrinsics.i(nativeFocusGestureAsFocusGesture, "asFocusGesture(...)");
        this.f126099c = nativeFocusGestureAsFocusGesture;
    }

    @Override // com.scandit.datacapture.core.ui.gesture.TapToFocusProxy
    /* renamed from: _focusGestureImpl, reason: from getter */
    public NativeFocusGesture getF126099c() {
        return this.f126099c;
    }

    @Override // com.scandit.datacapture.core.ui.gesture.TapToFocusProxy
    /* renamed from: _impl, reason: from getter */
    public NativeTapToFocus getF126097a() {
        return this.f126097a;
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.gesture.TapToFocusProxy
    public String toJson() {
        String json = this.f126097a.toJson();
        Intrinsics.g(json);
        return json;
    }

    @Override // com.scandit.datacapture.core.ui.gesture.TapToFocusProxy
    public void triggerFocus(PointWithUnit point) {
        Intrinsics.j(point, "point");
        this.f126097a.triggerFocus(point);
    }

    public /* synthetic */ TapToFocusProxyAdapter(NativeTapToFocus nativeTapToFocus, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeTapToFocus, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
