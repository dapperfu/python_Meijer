package com.scandit.datacapture.barcode.count.capture.map;

import com.scandit.datacapture.barcode.count.capture.Coordinate2d;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH'J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H'J\b\u0010\u000e\u001a\u00020\u0005H'J\b\u0010\u000f\u001a\u00020\u0010H'¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridProxy;", "", "_impl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeSpatialGrid;", "columns", "", "coordinatesForElement", "", "Lcom/scandit/datacapture/barcode/count/capture/Coordinate2d;", "element", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridElement;", "elementAt", "row", "column", "rows", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeSpatialGrid.class)
/* loaded from: classes12.dex */
public interface BarcodeSpatialGridProxy {
    @NativeImpl
    NativeBarcodeSpatialGrid _impl();

    @ProxyFunction
    int columns();

    @ProxyFunction
    List<Coordinate2d> coordinatesForElement(BarcodeSpatialGridElement element);

    @ProxyFunction
    BarcodeSpatialGridElement elementAt(int row, int column);

    @ProxyFunction
    int rows();

    @ProxyFunction
    String toJson();
}
