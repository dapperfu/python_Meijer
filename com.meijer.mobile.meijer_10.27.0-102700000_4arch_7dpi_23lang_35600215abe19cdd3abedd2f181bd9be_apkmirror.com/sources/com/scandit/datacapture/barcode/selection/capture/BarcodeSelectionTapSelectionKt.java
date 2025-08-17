package com.scandit.datacapture.barcode.selection.capture;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, d2 = {"toJson", "", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionFreezeBehavior;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionTapBehavior;", "scandit-barcode-capture"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeSelectionTapSelectionKt {
    public static final /* synthetic */ String toJson(BarcodeSelectionFreezeBehavior barcodeSelectionFreezeBehavior) {
        Intrinsics.j(barcodeSelectionFreezeBehavior, "<this>");
        return BarcodeSelectionFreezeBehaviorSerializer.toJson(barcodeSelectionFreezeBehavior);
    }

    public static final /* synthetic */ String toJson(BarcodeSelectionTapBehavior barcodeSelectionTapBehavior) {
        Intrinsics.j(barcodeSelectionTapBehavior, "<this>");
        return BarcodeSelectionTapBehaviorSerializer.toJson(barcodeSelectionTapBehavior);
    }
}
