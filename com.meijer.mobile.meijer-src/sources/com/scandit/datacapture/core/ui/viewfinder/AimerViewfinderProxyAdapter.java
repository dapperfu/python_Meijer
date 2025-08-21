package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeAimerViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/AimerViewfinderProxyAdapter;", "Lcom/scandit/datacapture/core/ui/viewfinder/AimerViewfinderProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeAimerViewfinder;", "_NativeAimerViewfinder", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeAimerViewfinder;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeAimerViewfinder;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "_viewfinderImpl", "()Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "p0", "getFrameColor", "()I", "setFrameColor", "(I)V", "frameColor", "getDotColor", "setDotColor", "dotColor", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class AimerViewfinderProxyAdapter implements AimerViewfinderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeAimerViewfinder f127127a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final NativeViewfinder f127129c;

    public AimerViewfinderProxyAdapter(NativeAimerViewfinder _NativeAimerViewfinder, ProxyCache proxyCache) {
        Intrinsics.j(_NativeAimerViewfinder, "_NativeAimerViewfinder");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f127127a = _NativeAimerViewfinder;
        this.proxyCache = proxyCache;
        NativeViewfinder nativeViewfinderAsViewfinder = _NativeAimerViewfinder.asViewfinder();
        Intrinsics.i(nativeViewfinderAsViewfinder, "asViewfinder(...)");
        this.f127129c = nativeViewfinderAsViewfinder;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.AimerViewfinderProxy
    /* renamed from: _impl, reason: from getter */
    public NativeAimerViewfinder getF127127a() {
        return this.f127127a;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.AimerViewfinderProxy, com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    /* renamed from: _viewfinderImpl, reason: from getter */
    public NativeViewfinder getF127129c() {
        return this.f127129c;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.AimerViewfinderProxy
    public int getDotColor() {
        NativeColor dotColor = this.f127127a.getDotColor();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(dotColor);
        return coreNativeTypeFactory.convert(dotColor);
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.AimerViewfinderProxy
    public int getFrameColor() {
        NativeColor frameColor = this.f127127a.getFrameColor();
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        Intrinsics.g(frameColor);
        return coreNativeTypeFactory.convert(frameColor);
    }

    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.AimerViewfinderProxy
    public void setDotColor(int i10) {
        this.f127127a.setDotColor(CoreNativeTypeFactory.INSTANCE.convert(i10));
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.AimerViewfinderProxy
    public void setFrameColor(int i10) {
        this.f127127a.setFrameColor(CoreNativeTypeFactory.INSTANCE.convert(i10));
    }

    public /* synthetic */ AimerViewfinderProxyAdapter(NativeAimerViewfinder nativeAimerViewfinder, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeAimerViewfinder, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
