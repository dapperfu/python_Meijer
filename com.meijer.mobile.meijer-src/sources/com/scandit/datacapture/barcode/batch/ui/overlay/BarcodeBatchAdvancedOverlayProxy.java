package com.scandit.datacapture.barcode.batch.ui.overlay;

import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingAdvancedOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\t\u001a\u00020\nH'J\b\u0010\u000b\u001a\u00020\fH'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchAdvancedOverlayProxy;", "Lcom/scandit/datacapture/core/ui/overlay/DataCaptureOverlay;", "<set-?>", "", "shouldShowScanAreaGuides", "getShouldShowScanAreaGuides", "()Z", "setShouldShowScanAreaGuides", "(Z)V", "_dataCaptureOverlayImpl", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/NativeDataCaptureOverlay;", "_impl", "Lcom/scandit/datacapture/barcode/batch/internal/module/ui/overlay/NativeBarcodeTrackingAdvancedOverlay;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeTrackingAdvancedOverlay.class)
/* loaded from: classes12.dex */
public interface BarcodeBatchAdvancedOverlayProxy extends DataCaptureOverlay {
    @NativeImpl
    NativeDataCaptureOverlay _dataCaptureOverlayImpl();

    @NativeImpl
    NativeBarcodeTrackingAdvancedOverlay _impl();

    @ProxyFunction(property = "shouldShowScanAreaGuides")
    boolean getShouldShowScanAreaGuides();

    @ProxyFunction(property = "shouldShowScanAreaGuides")
    void setShouldShowScanAreaGuides(boolean z10);
}
