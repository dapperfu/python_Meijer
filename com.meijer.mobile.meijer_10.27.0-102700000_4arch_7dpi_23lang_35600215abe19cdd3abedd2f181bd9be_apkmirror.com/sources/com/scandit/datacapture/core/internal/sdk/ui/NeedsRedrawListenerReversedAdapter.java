package com.scandit.datacapture.core.internal.sdk.ui;

import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/NeedsRedrawListenerReversedAdapter;", "Lcom/scandit/datacapture/core/internal/sdk/ui/NativeNeedsRedrawDelegate;", "Lcom/scandit/datacapture/core/internal/sdk/ui/NeedsRedrawListener;", "_NeedsRedrawListener", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/NeedsRedrawListener;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "", "millis", "", "setNeedsRedrawIn", "(I)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class NeedsRedrawListenerReversedAdapter extends NativeNeedsRedrawDelegate {

    /* renamed from: a, reason: collision with root package name */
    private final NeedsRedrawListener f125538a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public /* synthetic */ NeedsRedrawListenerReversedAdapter(NeedsRedrawListener needsRedrawListener, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(needsRedrawListener, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.NativeNeedsRedrawDelegate
    public void setNeedsRedrawIn(int millis) {
        this.f125538a.setNeedsRedrawInMillis(millis);
    }

    public NeedsRedrawListenerReversedAdapter(NeedsRedrawListener _NeedsRedrawListener, ProxyCache proxyCache) {
        Intrinsics.j(_NeedsRedrawListener, "_NeedsRedrawListener");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f125538a = _NeedsRedrawListener;
        this.proxyCache = proxyCache;
    }
}
