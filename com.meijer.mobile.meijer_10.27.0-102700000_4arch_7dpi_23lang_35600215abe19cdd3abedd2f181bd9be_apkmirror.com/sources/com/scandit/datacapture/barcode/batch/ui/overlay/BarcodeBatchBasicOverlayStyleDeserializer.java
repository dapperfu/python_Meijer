package com.scandit.datacapture.barcode.batch.ui.overlay;

import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayStyle;
import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeEnumDeserializer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlayStyleDeserializer;", "", "", "json", "Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlayStyle;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/ui/overlay/BarcodeBatchBasicOverlayStyle;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeBatchBasicOverlayStyleDeserializer {
    public static final BarcodeBatchBasicOverlayStyleDeserializer INSTANCE = new BarcodeBatchBasicOverlayStyleDeserializer();

    @JvmStatic
    public static final BarcodeBatchBasicOverlayStyle fromJson(String json) {
        Intrinsics.j(json, "json");
        NativeBarcodeTrackingBasicOverlayStyle nativeBarcodeTrackingBasicOverlayStyleBarcodeTrackingBasicOverlayStyleFromJsonString = NativeBarcodeEnumDeserializer.barcodeTrackingBasicOverlayStyleFromJsonString(json);
        Intrinsics.i(nativeBarcodeTrackingBasicOverlayStyleBarcodeTrackingBasicOverlayStyleFromJsonString, "barcodeTrackingBasicOver…yStyleFromJsonString(...)");
        return BarcodeBatchBasicOverlayStyleKt.fromNative(nativeBarcodeTrackingBasicOverlayStyleBarcodeTrackingBasicOverlayStyleFromJsonString);
    }

    private BarcodeBatchBasicOverlayStyleDeserializer() {
    }
}
