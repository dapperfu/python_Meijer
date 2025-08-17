package com.scandit.datacapture.barcode.ar.ui.annotations;

import android.content.Context;
import com.scandit.datacapture.barcode.data.Barcode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\nJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationProvider;", "", "annotationForBarcode", "", "context", "Landroid/content/Context;", "barcode", "Lcom/scandit/datacapture/barcode/data/Barcode;", "callback", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationProvider$Callback;", "Callback", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeArAnnotationProvider {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationProvider$Callback;", "", "onData", "", "annotation", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotation;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Callback {
        void onData(BarcodeArAnnotation annotation);
    }

    void annotationForBarcode(Context context, Barcode barcode, Callback callback);
}
