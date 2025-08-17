package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicSession;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\ba\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u0004H'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSessionProxy;", "", "addedItems", "", "", "getAddedItems", "()Ljava/util/Set;", "addedObjects", "Lcom/scandit/datacapture/barcode/batch/data/TrackedObject;", "getAddedObjects", "trackedItems", "getTrackedItems", "trackedObjects", "getTrackedObjects", "toJson", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodePickPublicSession.class)
/* loaded from: classes11.dex */
public interface BarcodePickSessionProxy {
    @ProxyFunction(property = "addedItems")
    Set<String> getAddedItems();

    @ProxyFunction(property = "addedObjects")
    Set<TrackedObject> getAddedObjects();

    @ProxyFunction(property = "trackedItems")
    Set<String> getTrackedItems();

    @ProxyFunction(property = "trackedObjects")
    Set<TrackedObject> getTrackedObjects();

    @ProxyFunction
    String toJson();
}
