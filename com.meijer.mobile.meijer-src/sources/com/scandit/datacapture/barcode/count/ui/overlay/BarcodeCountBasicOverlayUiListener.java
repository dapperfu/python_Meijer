package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayUiListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ProxyReversedAdapter(owner = BarcodeCountBasicOverlay.class, value = NativeBarcodeCountBasicOverlayUiListener.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlayUiListener;", "", "onExitButtonTapped", "", "overlay", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "onListButtonTapped", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodeCountBasicOverlayUiListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onExitButtonTapped(BarcodeCountBasicOverlayUiListener barcodeCountBasicOverlayUiListener, BarcodeCountBasicOverlay overlay) {
            Intrinsics.j(overlay, "overlay");
        }

        @ProxyFunction
        public static void onListButtonTapped(BarcodeCountBasicOverlayUiListener barcodeCountBasicOverlayUiListener, BarcodeCountBasicOverlay overlay) {
            Intrinsics.j(overlay, "overlay");
        }
    }

    @ProxyFunction
    void onExitButtonTapped(BarcodeCountBasicOverlay overlay);

    @ProxyFunction
    void onListButtonTapped(BarcodeCountBasicOverlay overlay);
}
