package com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;

/* loaded from: classes12.dex */
public interface BarcodePickDataCaptureViewWrapper {
    void a();

    void a(float f10);

    void a(ViewGroup viewGroup, RelativeLayout.LayoutParams layoutParams);

    void a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.f fVar);

    void a(DataCaptureContext dataCaptureContext);

    void a(DataCaptureOverlay dataCaptureOverlay);

    void b();

    void b(DataCaptureOverlay dataCaptureOverlay);

    Quadrilateral mapFrameQuadrilateralToView(Quadrilateral quadrilateral);
}
