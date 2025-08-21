package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelection;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\ba\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u000fH'J\b\u0010\u0010\u001a\u00020\u0011H'J\b\u0010\u0012\u001a\u00020\u0013H'J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H'J\b\u0010\u0017\u001a\u00020\u0013H'J\b\u0010\u0018\u001a\u00020\u0013H'J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0003H'J\b\u0010\u001b\u001a\u00020\u0013H'J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\b8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionProxy;", "", "<set-?>", "", "isEnabled", "()Z", "setEnabled", "(Z)V", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "pointOfInterest", "getPointOfInterest", "()Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "setPointOfInterest", "(Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "_dataCaptureModeImpl", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_impl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelection;", "freezeCamera", "", "increaseCountForBarcodesFromJsonString", "json", "", "selectAimedBarcode", "selectUnselectedBarcodes", "setSelectBarcodeEnabledFromJsonString", "enabled", "unfreezeCamera", "unselectBarcodesFromJsonString", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeSelection.class)
/* loaded from: classes12.dex */
public interface BarcodeSelectionProxy {
    @NativeImpl
    NativeDataCaptureMode _dataCaptureModeImpl();

    @NativeImpl
    NativeBarcodeSelection _impl();

    @ProxyFunction
    void freezeCamera();

    @ProxyFunction(property = "pointOfInterest")
    PointWithUnit getPointOfInterest();

    @ProxyFunction
    void increaseCountForBarcodesFromJsonString(String json);

    @ProxyFunction(property = "isEnabled")
    boolean isEnabled();

    @ProxyFunction
    void selectAimedBarcode();

    @ProxyFunction(nativeName = "selectAllUnselectedBarcodes")
    void selectUnselectedBarcodes();

    @ProxyFunction(property = "isEnabled")
    void setEnabled(boolean z10);

    @ProxyFunction(property = "pointOfInterest")
    void setPointOfInterest(PointWithUnit pointWithUnit);

    @ProxyFunction
    void setSelectBarcodeEnabledFromJsonString(String json, boolean enabled);

    @ProxyFunction
    void unfreezeCamera();

    @ProxyFunction
    void unselectBarcodesFromJsonString(String json);
}
