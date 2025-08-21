package com.scandit.datacapture.barcode.spark.feedback;

import com.scandit.datacapture.barcode.data.Barcode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanFeedbackDelegate;", "", "getFeedbackForBarcode", "Lcom/scandit/datacapture/barcode/spark/feedback/SparkScanBarcodeFeedback;", "barcode", "Lcom/scandit/datacapture/barcode/data/Barcode;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface SparkScanFeedbackDelegate {
    SparkScanBarcodeFeedback getFeedbackForBarcode(Barcode barcode);
}
