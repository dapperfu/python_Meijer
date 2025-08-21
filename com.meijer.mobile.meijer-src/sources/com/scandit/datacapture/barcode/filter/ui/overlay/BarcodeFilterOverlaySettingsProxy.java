package com.scandit.datacapture.barcode.filter.ui.overlay;

import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH'J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007H'R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterOverlaySettingsProxy;", "", "brush", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "highlightType", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;", "getHighlightType", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;", "_impl", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterOverlaySettings;", "_setBrush", "", "_setHighlightType", "type", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeFilterOverlaySettings.class)
/* loaded from: classes12.dex */
public interface BarcodeFilterOverlaySettingsProxy {
    @NativeImpl
    NativeBarcodeFilterOverlaySettings _impl();

    @ProxyFunction(nativeName = "setBrush")
    void _setBrush(Brush brush);

    @ProxyFunction(nativeName = "setBarcodeFilterHighlightType")
    void _setHighlightType(BarcodeFilterHighlightType type);

    @ProxyFunction(nativeName = "getBrush", property = "brush")
    Brush getBrush();

    @ProxyFunction(nativeName = "getOverlayType", property = "highlightType")
    BarcodeFilterHighlightType getHighlightType();
}
