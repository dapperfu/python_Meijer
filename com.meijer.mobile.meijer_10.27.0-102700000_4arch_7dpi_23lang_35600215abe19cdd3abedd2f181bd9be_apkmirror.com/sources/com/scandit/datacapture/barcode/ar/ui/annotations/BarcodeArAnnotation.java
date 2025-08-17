package com.scandit.datacapture.barcode.ar.ui.annotations;

import android.view.View;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH'J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\tH'R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotation;", "", "annotationTrigger", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;", "getAnnotationTrigger", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;", "setAnnotationTrigger", "(Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;)V", "createView", "Landroid/view/View;", "update", "", "barcodeLocation", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "highlightViewLocation", "view", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeArAnnotation {
    View createView();

    BarcodeArAnnotationTrigger getAnnotationTrigger();

    void setAnnotationTrigger(BarcodeArAnnotationTrigger barcodeArAnnotationTrigger);

    void update(Quadrilateral barcodeLocation, Quadrilateral highlightViewLocation, View view);
}
