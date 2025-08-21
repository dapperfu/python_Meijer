package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickStatusIconSettings;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0012\u001a\u00020\u0013H'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconSettingsProxy;", "", "<set-?>", "", "maxSize", "getMaxSize", "()I", "setMaxSize", "(I)V", "minSize", "getMinSize", "setMinSize", "", "ratioToHighlightSize", "getRatioToHighlightSize", "()F", "setRatioToHighlightSize", "(F)V", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/NativeBarcodePickStatusIconSettings;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodePickStatusIconSettings.class)
/* loaded from: classes12.dex */
public interface BarcodePickStatusIconSettingsProxy {
    @NativeImpl
    NativeBarcodePickStatusIconSettings _impl();

    @ProxyFunction(property = "maxSize")
    int getMaxSize();

    @ProxyFunction(property = "minSize")
    int getMinSize();

    @ProxyFunction(nativeName = "getSizeToHighlightSizeRatio", property = "ratioToHighlightSize")
    float getRatioToHighlightSize();

    @ProxyFunction(property = "maxSize")
    void setMaxSize(int i10);

    @ProxyFunction(property = "minSize")
    void setMinSize(int i10);

    @ProxyFunction(nativeName = "setSizeToHighlightSizeRatio", property = "ratioToHighlightSize")
    void setRatioToHighlightSize(float f10);
}
