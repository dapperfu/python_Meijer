package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTracking;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'J\b\u0010\f\u001a\u00020\rH'J\b\u0010\u000e\u001a\u00020\u000fH'J\b\u0010\u0010\u001a\u00020\tH'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchProxy;", "", "<set-?>", "", "isEnabled", "()Z", "setEnabled", "(Z)V", "_activateState", "", "identifier", "", "_dataCaptureModeImpl", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_impl", "Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTracking;", "reset", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeTracking.class)
/* loaded from: classes12.dex */
public interface BarcodeBatchProxy {
    @ProxyFunction(nativeName = "activateState")
    void _activateState(String identifier);

    @NativeImpl
    NativeDataCaptureMode _dataCaptureModeImpl();

    @NativeImpl
    NativeBarcodeTracking _impl();

    @ProxyFunction(property = "isEnabled")
    boolean isEnabled();

    @ProxyFunction(nativeName = "clear")
    void reset();

    @ProxyFunction(property = "isEnabled")
    void setEnabled(boolean z10);
}
