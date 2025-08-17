package com.scandit.datacapture.barcode.find.capture;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindSession;", "", "trackedBarcodes", "", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "getTrackedBarcodes", "()Ljava/util/List;", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeFindSession {
    List<TrackedBarcode> getTrackedBarcodes();

    String toJson();
}
