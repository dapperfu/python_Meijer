package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.core.data.FrameData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\"\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionListener;", "", "onObservationStarted", "", "barcodeSelection", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;", "onObservationStopped", "onSelectionUpdated", "session", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSession;", "frameData", "Lcom/scandit/datacapture/core/data/FrameData;", "onSessionUpdated", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodeSelectionListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onObservationStarted(BarcodeSelectionListener barcodeSelectionListener, BarcodeSelection barcodeSelection) {
            Intrinsics.j(barcodeSelection, "barcodeSelection");
        }

        public static void onObservationStopped(BarcodeSelectionListener barcodeSelectionListener, BarcodeSelection barcodeSelection) {
            Intrinsics.j(barcodeSelection, "barcodeSelection");
        }

        public static void onSelectionUpdated(BarcodeSelectionListener barcodeSelectionListener, BarcodeSelection barcodeSelection, BarcodeSelectionSession session, FrameData frameData) {
            Intrinsics.j(barcodeSelection, "barcodeSelection");
            Intrinsics.j(session, "session");
        }

        public static void onSessionUpdated(BarcodeSelectionListener barcodeSelectionListener, BarcodeSelection barcodeSelection, BarcodeSelectionSession session, FrameData frameData) {
            Intrinsics.j(barcodeSelection, "barcodeSelection");
            Intrinsics.j(session, "session");
        }
    }

    void onObservationStarted(BarcodeSelection barcodeSelection);

    void onObservationStopped(BarcodeSelection barcodeSelection);

    void onSelectionUpdated(BarcodeSelection barcodeSelection, BarcodeSelectionSession session, FrameData frameData);

    void onSessionUpdated(BarcodeSelection barcodeSelection, BarcodeSelectionSession session, FrameData frameData);
}
