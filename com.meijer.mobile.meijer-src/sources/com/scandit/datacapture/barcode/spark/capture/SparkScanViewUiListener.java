package com.scandit.datacapture.barcode.spark.capture;

import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanView;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/capture/SparkScanViewUiListener;", "", "onBarcodeCountButtonTap", "", "view", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanView;", "onBarcodeFindButtonTap", "onLabelCaptureButtonTap", "onScanningModeChange", "newScanningMode", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "onViewStateChanged", "newState", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewState;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface SparkScanViewUiListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onBarcodeCountButtonTap(SparkScanViewUiListener sparkScanViewUiListener, SparkScanView view) {
            Intrinsics.j(view, "view");
        }

        public static void onBarcodeFindButtonTap(SparkScanViewUiListener sparkScanViewUiListener, SparkScanView view) {
            Intrinsics.j(view, "view");
        }

        public static void onLabelCaptureButtonTap(SparkScanViewUiListener sparkScanViewUiListener, SparkScanView view) {
            Intrinsics.j(view, "view");
        }

        public static void onScanningModeChange(SparkScanViewUiListener sparkScanViewUiListener, SparkScanScanningMode newScanningMode) {
            Intrinsics.j(newScanningMode, "newScanningMode");
        }

        public static void onViewStateChanged(SparkScanViewUiListener sparkScanViewUiListener, SparkScanViewState newState) {
            Intrinsics.j(newState, "newState");
        }
    }

    void onBarcodeCountButtonTap(SparkScanView view);

    void onBarcodeFindButtonTap(SparkScanView view);

    void onLabelCaptureButtonTap(SparkScanView view);

    void onScanningModeChange(SparkScanScanningMode newScanningMode);

    void onViewStateChanged(SparkScanViewState newState);
}
