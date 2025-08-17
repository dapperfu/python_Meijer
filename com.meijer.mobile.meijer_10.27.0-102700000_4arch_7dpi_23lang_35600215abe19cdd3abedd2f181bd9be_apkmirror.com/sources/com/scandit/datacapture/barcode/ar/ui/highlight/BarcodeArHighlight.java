package com.scandit.datacapture.barcode.ar.ui.highlight;

import android.view.View;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH'¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArHighlight;", "", "createView", "Landroid/view/View;", "update", "", "view", "barcodeLocation", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeArHighlight {
    View createView();

    void update(View view, Quadrilateral barcodeLocation);
}
