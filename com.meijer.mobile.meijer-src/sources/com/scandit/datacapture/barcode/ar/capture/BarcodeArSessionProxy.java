package com.scandit.datacapture.barcode.ar.capture;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSession;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u000fH'J\b\u0010\u0010\u001a\u00020\u0011H'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u000b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSessionProxy;", "", "addedTrackedBarcodes", "", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "getAddedTrackedBarcodes", "()Ljava/util/List;", "removedTrackedBarcodes", "", "getRemovedTrackedBarcodes", "trackedBarcodes", "", "getTrackedBarcodes", "()Ljava/util/Map;", "reset", "", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeArSession.class)
/* loaded from: classes12.dex */
public interface BarcodeArSessionProxy {
    @ProxyFunction(property = "addedTrackedBarcodes")
    List<TrackedBarcode> getAddedTrackedBarcodes();

    @ProxyFunction(property = "removedTrackedBarcodes")
    List<Integer> getRemovedTrackedBarcodes();

    @ProxyFunction(property = "trackedBarcodes")
    Map<Integer, TrackedBarcode> getTrackedBarcodes();

    @ProxyFunction
    void reset();

    @ProxyFunction
    String toJson();
}
