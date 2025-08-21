package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureListener;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ProxyReversedAdapter(owner = BarcodeCapture.class, value = NativeBarcodeCaptureListener.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureListener;", "", "onBarcodeScanned", "", "barcodeCapture", "Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "session", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSession;", "data", "Lcom/scandit/datacapture/core/data/FrameData;", "onObservationStarted", "onObservationStopped", "onSessionUpdated", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodeCaptureListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction(nativeName = "onScan")
        public static void onBarcodeScanned(BarcodeCaptureListener barcodeCaptureListener, BarcodeCapture barcodeCapture, BarcodeCaptureSession session, FrameData data) {
            Intrinsics.j(barcodeCapture, "barcodeCapture");
            Intrinsics.j(session, "session");
            Intrinsics.j(data, "data");
        }

        @ProxyFunction
        public static void onObservationStarted(BarcodeCaptureListener barcodeCaptureListener, BarcodeCapture barcodeCapture) {
            Intrinsics.j(barcodeCapture, "barcodeCapture");
        }

        @ProxyFunction
        public static void onObservationStopped(BarcodeCaptureListener barcodeCaptureListener, BarcodeCapture barcodeCapture) {
            Intrinsics.j(barcodeCapture, "barcodeCapture");
        }

        @ProxyFunction(nativeName = "onSessionUpdated")
        public static void onSessionUpdated(BarcodeCaptureListener barcodeCaptureListener, BarcodeCapture barcodeCapture, BarcodeCaptureSession session, FrameData data) {
            Intrinsics.j(barcodeCapture, "barcodeCapture");
            Intrinsics.j(session, "session");
            Intrinsics.j(data, "data");
        }
    }

    @ProxyFunction(nativeName = "onScan")
    void onBarcodeScanned(BarcodeCapture barcodeCapture, BarcodeCaptureSession session, FrameData data);

    @ProxyFunction
    void onObservationStarted(BarcodeCapture barcodeCapture);

    @ProxyFunction
    void onObservationStopped(BarcodeCapture barcodeCapture);

    @ProxyFunction(nativeName = "onSessionUpdated")
    void onSessionUpdated(BarcodeCapture barcodeCapture, BarcodeCaptureSession session, FrameData data);
}
