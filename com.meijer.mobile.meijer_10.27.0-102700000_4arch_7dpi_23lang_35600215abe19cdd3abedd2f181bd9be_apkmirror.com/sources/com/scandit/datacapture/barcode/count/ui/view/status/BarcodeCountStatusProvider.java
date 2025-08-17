package com.scandit.datacapture.barcode.count.ui.view.status;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u00052\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusProvider;", "", "onStatusRequested", "", "barcodes", "", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "Lkotlin/jvm/JvmSuppressWildcards;", "callback", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusProviderCallback;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeCountStatusProvider {
    void onStatusRequested(List<TrackedBarcode> barcodes, BarcodeCountStatusProviderCallback callback);
}
