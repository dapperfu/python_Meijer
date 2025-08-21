package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.core.data.FrameData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountListener;", "", "onObservationStarted", "", "mode", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "onObservationStopped", "onScan", "session", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSession;", "data", "Lcom/scandit/datacapture/core/data/FrameData;", "onSessionUpdated", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodeCountListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onObservationStarted(BarcodeCountListener barcodeCountListener, BarcodeCount mode) {
            Intrinsics.j(mode, "mode");
        }

        public static void onObservationStopped(BarcodeCountListener barcodeCountListener, BarcodeCount mode) {
            Intrinsics.j(mode, "mode");
        }

        public static void onScan(BarcodeCountListener barcodeCountListener, BarcodeCount mode, BarcodeCountSession session, FrameData data) {
            Intrinsics.j(mode, "mode");
            Intrinsics.j(session, "session");
            Intrinsics.j(data, "data");
        }

        public static void onSessionUpdated(BarcodeCountListener barcodeCountListener, BarcodeCount mode, BarcodeCountSession session, FrameData data) {
            Intrinsics.j(mode, "mode");
            Intrinsics.j(session, "session");
            Intrinsics.j(data, "data");
        }
    }

    void onObservationStarted(BarcodeCount mode);

    void onObservationStopped(BarcodeCount mode);

    void onScan(BarcodeCount mode, BarcodeCountSession session, FrameData data);

    void onSessionUpdated(BarcodeCount mode, BarcodeCountSession session, FrameData data);
}
