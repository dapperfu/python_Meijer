package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayListener;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ProxyReversedAdapter(owner = BarcodeCountBasicOverlay.class, value = NativeBarcodeCountBasicOverlayListener.class)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0007H\u0017J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayListener;", "", "brushForAcceptedBarcode", "Lcom/scandit/datacapture/core/ui/style/Brush;", "overlay", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "trackedBarcode", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "brushForRecognizedBarcode", "brushForRecognizedBarcodeNotInList", "brushForRejectedBarcode", "brushForUnrecognizedBarcode", "onAcceptedTrackedBarcodeTapped", "", "onClusterTapped", "cluster", "Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeCluster;", "onFilteredBarcodeTapped", "filteredBarcode", "onRecognizedBarcodeNotInListTapped", "onRecognizedBarcodeTapped", "onRejectedTrackedBarcodeTapped", "onUnrecognizedBarcodeTapped", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeCountBasicOverlayListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction(nativeName = "brushForAcceptedBarcode")
        public static Brush brushForAcceptedBarcode(BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
            return null;
        }

        @ProxyFunction(nativeName = "brushForTrackedBarcode")
        public static Brush brushForRecognizedBarcode(BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
            return null;
        }

        @ProxyFunction(nativeName = "brushForTrackedBarcodeNotInList")
        public static Brush brushForRecognizedBarcodeNotInList(BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
            return null;
        }

        @ProxyFunction(nativeName = "brushForRejectedBarcode")
        public static Brush brushForRejectedBarcode(BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
            return null;
        }

        @ProxyFunction(nativeName = "brushForUntrackedBarcode")
        public static Brush brushForUnrecognizedBarcode(BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
            return null;
        }

        @ProxyFunction(nativeName = "onAcceptedTrackedBarcodeTapped")
        public static void onAcceptedTrackedBarcodeTapped(BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
        }

        @ProxyFunction(nativeName = "onClusterTapped")
        public static void onClusterTapped(BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, BarcodeCountBasicOverlay overlay, NativeCluster cluster) {
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(cluster, "cluster");
        }

        @ProxyFunction(nativeName = "onFilteredBarcodeTapped")
        public static void onFilteredBarcodeTapped(BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, BarcodeCountBasicOverlay overlay, TrackedBarcode filteredBarcode) {
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(filteredBarcode, "filteredBarcode");
        }

        @ProxyFunction(nativeName = "onTrackedBarcodeNotInListTapped")
        public static void onRecognizedBarcodeNotInListTapped(BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
        }

        @ProxyFunction(nativeName = "onTrackedBarcodeTapped")
        public static void onRecognizedBarcodeTapped(BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
        }

        @ProxyFunction(nativeName = "onRejectedTrackedBarcodeTapped")
        public static void onRejectedTrackedBarcodeTapped(BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
        }

        @ProxyFunction(nativeName = "onUnTrackedBarcodeTapped")
        public static void onUnrecognizedBarcodeTapped(BarcodeCountBasicOverlayListener barcodeCountBasicOverlayListener, BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
            Intrinsics.j(overlay, "overlay");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
        }
    }

    @ProxyFunction(nativeName = "brushForAcceptedBarcode")
    Brush brushForAcceptedBarcode(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode);

    @ProxyFunction(nativeName = "brushForTrackedBarcode")
    Brush brushForRecognizedBarcode(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode);

    @ProxyFunction(nativeName = "brushForTrackedBarcodeNotInList")
    Brush brushForRecognizedBarcodeNotInList(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode);

    @ProxyFunction(nativeName = "brushForRejectedBarcode")
    Brush brushForRejectedBarcode(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode);

    @ProxyFunction(nativeName = "brushForUntrackedBarcode")
    Brush brushForUnrecognizedBarcode(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode);

    @ProxyFunction(nativeName = "onAcceptedTrackedBarcodeTapped")
    void onAcceptedTrackedBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode);

    @ProxyFunction(nativeName = "onClusterTapped")
    void onClusterTapped(BarcodeCountBasicOverlay overlay, NativeCluster cluster);

    @ProxyFunction(nativeName = "onFilteredBarcodeTapped")
    void onFilteredBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode filteredBarcode);

    @ProxyFunction(nativeName = "onTrackedBarcodeNotInListTapped")
    void onRecognizedBarcodeNotInListTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode);

    @ProxyFunction(nativeName = "onTrackedBarcodeTapped")
    void onRecognizedBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode);

    @ProxyFunction(nativeName = "onRejectedTrackedBarcodeTapped")
    void onRejectedTrackedBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode);

    @ProxyFunction(nativeName = "onUnTrackedBarcodeTapped")
    void onUnrecognizedBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode);
}
