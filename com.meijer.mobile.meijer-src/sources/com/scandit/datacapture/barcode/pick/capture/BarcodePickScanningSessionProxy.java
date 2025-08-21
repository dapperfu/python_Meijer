package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickScanningSession;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\ba\u0018\u00002\u00020\u0001J\b\u0010\t\u001a\u00020\u0004H'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickScanningSessionProxy;", "", "pickedItems", "", "", "getPickedItems", "()Ljava/util/Set;", "scannedItems", "getScannedItems", "toJson", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodePickScanningSession.class)
/* loaded from: classes12.dex */
public interface BarcodePickScanningSessionProxy {
    @ProxyFunction(nativeName = "getPickedObjects", property = "pickedItems")
    Set<String> getPickedItems();

    @ProxyFunction(nativeName = "getScannedObjects", property = "scannedItems")
    Set<String> getScannedItems();

    @ProxyFunction(nativeName = "toJson")
    String toJson();
}
