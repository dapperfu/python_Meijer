package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.W;
import com.scandit.datacapture.core.ui.style.Brush;

/* loaded from: classes11.dex */
public interface BarcodeCountBrushHandler {
    Brush a();

    Brush a(TrackedBarcode trackedBarcode, W w10);

    void a(TrackedBarcode trackedBarcode, Brush brush);

    void b(TrackedBarcode trackedBarcode, Brush brush);

    void c(TrackedBarcode trackedBarcode, Brush brush);

    void d(TrackedBarcode trackedBarcode, Brush brush);
}
