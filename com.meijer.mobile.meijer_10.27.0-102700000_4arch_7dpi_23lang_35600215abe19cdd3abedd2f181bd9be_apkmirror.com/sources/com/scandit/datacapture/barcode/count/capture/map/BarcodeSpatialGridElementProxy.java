package com.scandit.datacapture.barcode.count.capture.map;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGridElement;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH'R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridElementProxy;", "", "mainBarcode", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getMainBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "subBarcode", "getSubBarcode", "_impl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGridElement;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeSpatialGridElement.class)
/* loaded from: classes11.dex */
public interface BarcodeSpatialGridElementProxy {
    @NativeImpl
    /* renamed from: _impl */
    NativeBarcodeSpatialGridElement getF120689a();

    @ProxyFunction(nativeName = "mainBarcode", property = "mainBarcode")
    Barcode getMainBarcode();

    @ProxyFunction(nativeName = "subBarcode", property = "subBarcode")
    Barcode getSubBarcode();
}
