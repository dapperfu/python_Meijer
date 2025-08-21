package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u000fH'J\b\u0010\u0010\u001a\u00020\u0011H'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\b8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureProxy;", "", "<set-?>", "", "isEnabled", "()Z", "setEnabled", "(Z)V", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "pointOfInterest", "getPointOfInterest", "()Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "setPointOfInterest", "(Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "_dataCaptureModeImpl", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCapture;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeCapture.class)
/* loaded from: classes12.dex */
public interface BarcodeCaptureProxy {
    @NativeImpl
    NativeDataCaptureMode _dataCaptureModeImpl();

    @NativeImpl
    NativeBarcodeCapture _impl();

    @ProxyFunction(property = "pointOfInterest")
    PointWithUnit getPointOfInterest();

    @ProxyFunction(property = "isEnabled")
    boolean isEnabled();

    @ProxyFunction(property = "isEnabled")
    void setEnabled(boolean z10);

    @ProxyFunction(property = "pointOfInterest")
    void setPointOfInterest(PointWithUnit pointWithUnit);
}
