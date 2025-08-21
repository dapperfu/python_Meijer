package com.scandit.datacapture.barcode.batch.ui.overlay;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayListener;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ProxyReversedAdapter(owner = BarcodeBatchBasicOverlay.class, value = NativeBarcodeTrackingBasicOverlayListener.class)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlayListener;", "", "brushForTrackedBarcode", "Lcom/scandit/datacapture/core/ui/style/Brush;", "overlay", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlay;", "trackedBarcode", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "onTrackedBarcodeTapped", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodeBatchBasicOverlayListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onTrackedBarcodeTapped(BarcodeBatchBasicOverlayListener barcodeBatchBasicOverlayListener, BarcodeBatchBasicOverlay overlay, TrackedBarcode trackedBarcode) {
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
        }
    }

    @ProxyFunction
    Brush brushForTrackedBarcode(BarcodeBatchBasicOverlay overlay, TrackedBarcode trackedBarcode);

    @ProxyFunction
    void onTrackedBarcodeTapped(BarcodeBatchBasicOverlay overlay, TrackedBarcode trackedBarcode);
}
