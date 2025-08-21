package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeEnumDeserializer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionFreezeBehaviorDeserializer;", "", "", "jsonData", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionFreezeBehavior;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionFreezeBehavior;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeSelectionFreezeBehaviorDeserializer {
    public static final BarcodeSelectionFreezeBehaviorDeserializer INSTANCE = new BarcodeSelectionFreezeBehaviorDeserializer();

    @JvmStatic
    public static final BarcodeSelectionFreezeBehavior fromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        BarcodeSelectionFreezeBehavior barcodeSelectionFreezeBehaviorFreezeBehaviorFromJsonString = NativeBarcodeEnumDeserializer.freezeBehaviorFromJsonString(jsonData);
        Intrinsics.i(barcodeSelectionFreezeBehaviorFreezeBehaviorFromJsonString, "freezeBehaviorFromJsonString(...)");
        return barcodeSelectionFreezeBehaviorFreezeBehaviorFromJsonString;
    }

    private BarcodeSelectionFreezeBehaviorDeserializer() {
    }
}
