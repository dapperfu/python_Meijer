package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSelectItemActionCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"asNative", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickSelectItemActionCallback;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSelectItemActionCallback;", "scandit-barcode-capture"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodePickSelectItemActionCallbackKt {
    public static final NativeBarcodePickSelectItemActionCallback asNative(final BarcodePickSelectItemActionCallback barcodePickSelectItemActionCallback) {
        Intrinsics.j(barcodePickSelectItemActionCallback, "<this>");
        return new NativeBarcodePickSelectItemActionCallback() { // from class: com.scandit.datacapture.barcode.pick.capture.BarcodePickSelectItemActionCallbackKt.asNative.1
            @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSelectItemActionCallback
            public void onFinish(BarcodePickAction result) {
                Intrinsics.j(result, "result");
                barcodePickSelectItemActionCallback.onFinish(result);
            }
        };
    }
}
