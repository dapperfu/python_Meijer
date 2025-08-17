package com.scandit.datacapture.barcode.filter.ui.overlay;

import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterOverlaySettingsProxyAdapter;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterOverlaySettingsProxy;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettings;", "_NativeBarcodeFilterOverlaySettings", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettings;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettings;", "Lcom/scandit/datacapture/core/ui/style/Brush;", "brush", "", "_setBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)V", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;", "type", "_setHighlightType", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;)V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "getHighlightType", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;", "highlightType", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeFilterOverlaySettingsProxyAdapter implements BarcodeFilterOverlaySettingsProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeFilterOverlaySettings f120929a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeFilterOverlaySettingsProxyAdapter(NativeBarcodeFilterOverlaySettings _NativeBarcodeFilterOverlaySettings, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeFilterOverlaySettings, "_NativeBarcodeFilterOverlaySettings");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f120929a = _NativeBarcodeFilterOverlaySettings;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterOverlaySettingsProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeFilterOverlaySettings getF120929a() {
        return this.f120929a;
    }

    @Override // com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterOverlaySettingsProxy
    public void _setBrush(Brush brush) {
        this.f120929a.setBrush(brush != null ? CoreNativeTypeFactory.INSTANCE.convert(brush) : null);
    }

    @Override // com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterOverlaySettingsProxy
    public void _setHighlightType(BarcodeFilterHighlightType type) {
        Intrinsics.j(type, "type");
        this.f120929a.setBarcodeFilterHighlightType(BarcodeNativeTypeFactory.INSTANCE.convert(type));
    }

    @Override // com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterOverlaySettingsProxy
    public Brush getBrush() {
        NativeBrush brush = this.f120929a.getBrush();
        if (brush != null) {
            return CoreNativeTypeFactory.INSTANCE.convert(brush);
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterOverlaySettingsProxy
    public BarcodeFilterHighlightType getHighlightType() {
        NativeBarcodeFilterHighlightType overlayType = this.f120929a.getOverlayType();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(overlayType);
        return barcodeNativeTypeFactory.convert(overlayType);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ BarcodeFilterOverlaySettingsProxyAdapter(NativeBarcodeFilterOverlaySettings nativeBarcodeFilterOverlaySettings, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeFilterOverlaySettings, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
