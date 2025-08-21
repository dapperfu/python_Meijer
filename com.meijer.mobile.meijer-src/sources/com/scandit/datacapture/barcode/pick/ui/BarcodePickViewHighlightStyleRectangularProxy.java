package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangular;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH'J\b\u0010\u000e\u001a\u00020\u000fH'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H'J\u001a\u0010\u0018\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleRectangularProxy;", "", "<set-?>", "", "minimumHighlightHeight", "getMinimumHighlightHeight", "()I", "setMinimumHighlightHeight", "(I)V", "minimumHighlightWidth", "getMinimumHighlightWidth", "setMinimumHighlightWidth", "_highlightStyleImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleRectangular;", "getBrushForState", "Lcom/scandit/datacapture/core/ui/style/Brush;", "state", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "getSelectedBrushForState", "setBrushForState", "", "brush", "setSelectedBrushForState", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodePickViewHighlightStyleRectangular.class)
/* loaded from: classes12.dex */
public interface BarcodePickViewHighlightStyleRectangularProxy {
    @NativeImpl
    NativeBarcodePickViewHighlightStyle _highlightStyleImpl();

    @NativeImpl
    NativeBarcodePickViewHighlightStyleRectangular _impl();

    @ProxyFunction(nativeName = "brushForState")
    Brush getBrushForState(BarcodePickState state);

    @ProxyFunction(nativeName = "getMinimumHighlightHeight", property = "minimumHighlightHeight")
    int getMinimumHighlightHeight();

    @ProxyFunction(nativeName = "getMinimumHighlightWidth", property = "minimumHighlightWidth")
    int getMinimumHighlightWidth();

    @ProxyFunction(nativeName = "selectedBrushForState")
    Brush getSelectedBrushForState(BarcodePickState state);

    @ProxyFunction(nativeName = "setBrushForState")
    void setBrushForState(Brush brush, BarcodePickState state);

    @ProxyFunction(nativeName = "setMinimumHighlightHeight", property = "minimumHighlightHeight")
    void setMinimumHighlightHeight(int i10);

    @ProxyFunction(nativeName = "setMinimumHighlightWidth", property = "minimumHighlightWidth")
    void setMinimumHighlightWidth(int i10);

    @ProxyFunction(nativeName = "setSelectedBrushForState")
    void setSelectedBrushForState(Brush brush, BarcodePickState state);
}
