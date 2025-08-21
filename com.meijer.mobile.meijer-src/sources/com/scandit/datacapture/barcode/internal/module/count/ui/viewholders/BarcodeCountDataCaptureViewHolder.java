package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.ui.hint.HintHolderV2;
import com.scandit.datacapture.core.ui.control.Control;

/* loaded from: classes12.dex */
public interface BarcodeCountDataCaptureViewHolder {
    void a(ViewGroup viewGroup);

    void a(RelativeLayout.LayoutParams layoutParams);

    void a(BarcodeCountBasicOverlay barcodeCountBasicOverlay);

    void a(HintHolderV2 hintHolderV2);

    void a(Control control);

    void a(Control control, Anchor anchor, PointWithUnit pointWithUnit);

    void b(BarcodeCountBasicOverlay barcodeCountBasicOverlay);
}
