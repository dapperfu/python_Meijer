package com.scandit.datacapture.barcode.batch.ui.overlay;

import android.view.View;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlayListener;", "", "anchorForTrackedBarcode", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "overlay", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlay;", "trackedBarcode", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "offsetForTrackedBarcode", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "view", "Landroid/view/View;", "viewForTrackedBarcode", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodeBatchAdvancedOverlayListener {
    Anchor anchorForTrackedBarcode(BarcodeBatchAdvancedOverlay overlay, TrackedBarcode trackedBarcode);

    PointWithUnit offsetForTrackedBarcode(BarcodeBatchAdvancedOverlay overlay, TrackedBarcode trackedBarcode, View view);

    View viewForTrackedBarcode(BarcodeBatchAdvancedOverlay overlay, TrackedBarcode trackedBarcode);
}
