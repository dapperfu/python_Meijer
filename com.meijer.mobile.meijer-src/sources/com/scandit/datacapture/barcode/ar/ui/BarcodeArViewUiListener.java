package com.scandit.datacapture.barcode.ar.ui;

import android.view.View;
import com.scandit.datacapture.barcode.ar.capture.BarcodeAr;
import com.scandit.datacapture.barcode.ar.ui.highlight.BarcodeArHighlight;
import com.scandit.datacapture.barcode.data.Barcode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArViewUiListener;", "", "onHighlightForBarcodeTapped", "", "barcodeAr", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;", "barcode", "Lcom/scandit/datacapture/barcode/data/Barcode;", "highlight", "Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArHighlight;", "highlightView", "Landroid/view/View;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodeArViewUiListener {
    void onHighlightForBarcodeTapped(BarcodeAr barcodeAr, Barcode barcode, BarcodeArHighlight highlight, View highlightView);
}
