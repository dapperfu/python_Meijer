package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureList;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH'J\b\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH'J\b\u0010\u0010\u001a\u00020\u0003H'J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H'J\b\u0010\u0013\u001a\u00020\rH'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountProxy;", "", "<set-?>", "", "isEnabled", "()Z", "setEnabled", "(Z)V", "_dataCaptureModeImpl", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_impl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;", "_setBarcodeCountCaptureList", "", "list", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureList;", "_shouldDisableModeWhenCaptureListCompleted", "beginClusterEditing", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeClusterEditor;", "clearAdditionalBarcodes", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeCount.class)
/* loaded from: classes11.dex */
public interface BarcodeCountProxy {
    @NativeImpl
    NativeDataCaptureMode _dataCaptureModeImpl();

    @NativeImpl
    NativeBarcodeCount _impl();

    @ProxyFunction(nativeName = "setBarcodeCountCaptureList")
    void _setBarcodeCountCaptureList(BarcodeCountCaptureList list);

    @ProxyFunction(nativeName = "shouldDisableModeWhenCaptureListCompleted")
    boolean _shouldDisableModeWhenCaptureListCompleted();

    @ProxyFunction
    BarcodeClusterEditor beginClusterEditing();

    @ProxyFunction(nativeName = "clearAdditionalBarcodes")
    void clearAdditionalBarcodes();

    @ProxyFunction(property = "isEnabled")
    boolean isEnabled();

    @ProxyFunction(property = "isEnabled")
    void setEnabled(boolean z10);
}
