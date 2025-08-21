package com.scandit.datacapture.barcode.ui.overlay;

import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeEnumSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toJson", "", "Lcom/scandit/datacapture/barcode/ui/overlay/BarcodeCaptureOverlayStyle;", "scandit-barcode-capture"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BarcodeCaptureOverlayStyleUtilsKt {
    public static final /* synthetic */ String toJson(BarcodeCaptureOverlayStyle barcodeCaptureOverlayStyle) {
        Intrinsics.j(barcodeCaptureOverlayStyle, "<this>");
        String strBarcodeCaptureOverlayStyleToString = NativeBarcodeEnumSerializer.barcodeCaptureOverlayStyleToString(BarcodeCaptureOverlayStyleKt.toNative(barcodeCaptureOverlayStyle));
        Intrinsics.i(strBarcodeCaptureOverlayStyleToString, "barcodeCaptureOverlayStyleToString(...)");
        return strBarcodeCaptureOverlayStyleToString;
    }
}
