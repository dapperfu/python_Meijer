package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleCustomView;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0012\u001a\u00020\u0013H'J\b\u0010\u0014\u001a\u00020\u0015H'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleCustomViewProxy;", "", "<set-?>", "", "fitViewsToBarcode", "getFitViewsToBarcode", "()Z", "setFitViewsToBarcode", "(Z)V", "", "minimumHighlightHeight", "getMinimumHighlightHeight", "()I", "setMinimumHighlightHeight", "(I)V", "minimumHighlightWidth", "getMinimumHighlightWidth", "setMinimumHighlightWidth", "_highlightStyleImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyle;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickViewHighlightStyleCustomView;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodePickViewHighlightStyleCustomView.class)
/* loaded from: classes11.dex */
public interface BarcodePickViewHighlightStyleCustomViewProxy {
    @NativeImpl
    NativeBarcodePickViewHighlightStyle _highlightStyleImpl();

    @NativeImpl
    NativeBarcodePickViewHighlightStyleCustomView _impl();

    @ProxyFunction(nativeName = "getFitViewsToBarcode", property = "fitViewsToBarcode")
    boolean getFitViewsToBarcode();

    @ProxyFunction(nativeName = "getMinimumHighlightHeight", property = "minimumHighlightHeight")
    int getMinimumHighlightHeight();

    @ProxyFunction(nativeName = "getMinimumHighlightWidth", property = "minimumHighlightWidth")
    int getMinimumHighlightWidth();

    @ProxyFunction(nativeName = "setFitViewsToBarcode", property = "fitViewsToBarcode")
    void setFitViewsToBarcode(boolean z10);

    @ProxyFunction(nativeName = "setMinimumHighlightHeight", property = "minimumHighlightHeight")
    void setMinimumHighlightHeight(int i10);

    @ProxyFunction(nativeName = "setMinimumHighlightWidth", property = "minimumHighlightWidth")
    void setMinimumHighlightWidth(int i10);
}
