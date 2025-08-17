package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\b\u0010\u0012\u001a\u00020\u0013H'J\b\u0010\u0014\u001a\u00020\u0015H'J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H'J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H'J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H'J\u001a\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleRectangularWithIconsProxy;", "", "<set-?>", "", "minimumHighlightHeight", "getMinimumHighlightHeight", "()I", "setMinimumHighlightHeight", "(I)V", "minimumHighlightWidth", "getMinimumHighlightWidth", "setMinimumHighlightWidth", "", "styleResponseCacheEnabled", "getStyleResponseCacheEnabled", "()Z", "setStyleResponseCacheEnabled", "(Z)V", "_highlightStyleImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleRectangularWithIcons;", "getBrushForState", "Lcom/scandit/datacapture/core/ui/style/Brush;", "state", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "getSelectedBrushForState", "setBrushForState", "", "brush", "setSelectedBrushForState", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodePickViewHighlightStyleRectangularWithIcons.class)
/* loaded from: classes11.dex */
public interface BarcodePickViewHighlightStyleRectangularWithIconsProxy {
    @NativeImpl
    NativeBarcodePickViewHighlightStyle _highlightStyleImpl();

    @NativeImpl
    NativeBarcodePickViewHighlightStyleRectangularWithIcons _impl();

    @ProxyFunction(nativeName = "brushForState")
    Brush getBrushForState(BarcodePickState state);

    @ProxyFunction(nativeName = "getMinimumHighlightHeight", property = "minimumHighlightHeight")
    int getMinimumHighlightHeight();

    @ProxyFunction(nativeName = "getMinimumHighlightWidth", property = "minimumHighlightWidth")
    int getMinimumHighlightWidth();

    @ProxyFunction(nativeName = "selectedBrushForState")
    Brush getSelectedBrushForState(BarcodePickState state);

    @ProxyFunction(nativeName = "getStyleResponseCacheEnabled", property = "styleResponseCacheEnabled")
    boolean getStyleResponseCacheEnabled();

    @ProxyFunction(nativeName = "setBrushForState")
    void setBrushForState(Brush brush, BarcodePickState state);

    @ProxyFunction(nativeName = "setMinimumHighlightHeight", property = "minimumHighlightHeight")
    void setMinimumHighlightHeight(int i10);

    @ProxyFunction(nativeName = "setMinimumHighlightWidth", property = "minimumHighlightWidth")
    void setMinimumHighlightWidth(int i10);

    @ProxyFunction(nativeName = "setSelectedBrushForState")
    void setSelectedBrushForState(Brush brush, BarcodePickState state);

    @ProxyFunction(nativeName = "setStyleResponseCacheEnabled", property = "styleResponseCacheEnabled")
    void setStyleResponseCacheEnabled(boolean z10);
}
