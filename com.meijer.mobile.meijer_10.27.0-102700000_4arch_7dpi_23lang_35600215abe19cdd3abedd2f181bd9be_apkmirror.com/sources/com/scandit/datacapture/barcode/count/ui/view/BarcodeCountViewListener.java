package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.data.Cluster;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountViewListener;", "", "brushForAcceptedBarcode", "Lcom/scandit/datacapture/core/ui/style/Brush;", "view", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;", "trackedBarcode", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "brushForRecognizedBarcode", "brushForRecognizedBarcodeNotInList", "brushForRejectedBarcode", "onAcceptedBarcodeTapped", "", "onCaptureListCompleted", "onClusterTapped", "cluster", "Lcom/scandit/datacapture/barcode/data/Cluster;", "onFilteredBarcodeTapped", "filteredBarcode", "onRecognizedBarcodeNotInListTapped", "onRecognizedBarcodeTapped", "onRejectedBarcodeTapped", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeCountViewListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Brush brushForAcceptedBarcode(BarcodeCountViewListener barcodeCountViewListener, BarcodeCountView view, TrackedBarcode trackedBarcode) {
            Intrinsics.j(view, "view");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
            return null;
        }

        public static Brush brushForRecognizedBarcode(BarcodeCountViewListener barcodeCountViewListener, BarcodeCountView view, TrackedBarcode trackedBarcode) {
            Intrinsics.j(view, "view");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
            return null;
        }

        public static Brush brushForRecognizedBarcodeNotInList(BarcodeCountViewListener barcodeCountViewListener, BarcodeCountView view, TrackedBarcode trackedBarcode) {
            Intrinsics.j(view, "view");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
            return null;
        }

        public static Brush brushForRejectedBarcode(BarcodeCountViewListener barcodeCountViewListener, BarcodeCountView view, TrackedBarcode trackedBarcode) {
            Intrinsics.j(view, "view");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
            return null;
        }

        public static void onAcceptedBarcodeTapped(BarcodeCountViewListener barcodeCountViewListener, BarcodeCountView view, TrackedBarcode trackedBarcode) {
            Intrinsics.j(view, "view");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
        }

        public static void onCaptureListCompleted(BarcodeCountViewListener barcodeCountViewListener, BarcodeCountView view) {
            Intrinsics.j(view, "view");
        }

        public static void onClusterTapped(BarcodeCountViewListener barcodeCountViewListener, BarcodeCountView view, Cluster cluster) {
            Intrinsics.j(view, "view");
            Intrinsics.j(cluster, "cluster");
        }

        public static void onFilteredBarcodeTapped(BarcodeCountViewListener barcodeCountViewListener, BarcodeCountView view, TrackedBarcode filteredBarcode) {
            Intrinsics.j(view, "view");
            Intrinsics.j(filteredBarcode, "filteredBarcode");
        }

        public static void onRecognizedBarcodeNotInListTapped(BarcodeCountViewListener barcodeCountViewListener, BarcodeCountView view, TrackedBarcode trackedBarcode) {
            Intrinsics.j(view, "view");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
        }

        public static void onRecognizedBarcodeTapped(BarcodeCountViewListener barcodeCountViewListener, BarcodeCountView view, TrackedBarcode trackedBarcode) {
            Intrinsics.j(view, "view");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
        }

        public static void onRejectedBarcodeTapped(BarcodeCountViewListener barcodeCountViewListener, BarcodeCountView view, TrackedBarcode trackedBarcode) {
            Intrinsics.j(view, "view");
            Intrinsics.j(trackedBarcode, "trackedBarcode");
        }
    }

    Brush brushForAcceptedBarcode(BarcodeCountView view, TrackedBarcode trackedBarcode);

    Brush brushForRecognizedBarcode(BarcodeCountView view, TrackedBarcode trackedBarcode);

    Brush brushForRecognizedBarcodeNotInList(BarcodeCountView view, TrackedBarcode trackedBarcode);

    Brush brushForRejectedBarcode(BarcodeCountView view, TrackedBarcode trackedBarcode);

    void onAcceptedBarcodeTapped(BarcodeCountView view, TrackedBarcode trackedBarcode);

    void onCaptureListCompleted(BarcodeCountView view);

    void onClusterTapped(BarcodeCountView view, Cluster cluster);

    void onFilteredBarcodeTapped(BarcodeCountView view, TrackedBarcode filteredBarcode);

    void onRecognizedBarcodeNotInListTapped(BarcodeCountView view, TrackedBarcode trackedBarcode);

    void onRecognizedBarcodeTapped(BarcodeCountView view, TrackedBarcode trackedBarcode);

    void onRejectedBarcodeTapped(BarcodeCountView view, TrackedBarcode trackedBarcode);
}
