package com.scandit.datacapture.barcode.filter.ui.overlay;

import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterOverlaySettingsBrushProxyAdapter;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterOverlaySettingsBrushProxy;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettingsBrush;", "_NativeBarcodeFilterOverlaySettingsBrush", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettingsBrush;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettingsBrush;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeFilterOverlaySettingsBrushProxyAdapter implements BarcodeFilterOverlaySettingsBrushProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeFilterOverlaySettingsBrush f121879a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeFilterOverlaySettingsBrushProxyAdapter(NativeBarcodeFilterOverlaySettingsBrush _NativeBarcodeFilterOverlaySettingsBrush, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeFilterOverlaySettingsBrush, "_NativeBarcodeFilterOverlaySettingsBrush");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121879a = _NativeBarcodeFilterOverlaySettingsBrush;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterOverlaySettingsBrushProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeFilterOverlaySettingsBrush getF121879a() {
        return this.f121879a;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ BarcodeFilterOverlaySettingsBrushProxyAdapter(NativeBarcodeFilterOverlaySettingsBrush nativeBarcodeFilterOverlaySettingsBrush, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeFilterOverlaySettingsBrush, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
