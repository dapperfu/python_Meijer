package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C13202i extends FunctionReferenceImpl implements Function2 {
    public C13202i(Object obj) {
        super(2, obj, BarcodeCountBrushHandler.class, "brushForBarcode", "brushForBarcode(Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;Lcom/scandit/datacapture/barcode/internal/module/count/ui/barcodeindicator/TrackedBarcodeStatus;)Lcom/scandit/datacapture/core/ui/style/Brush;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        TrackedBarcode p02 = (TrackedBarcode) obj;
        W p12 = (W) obj2;
        Intrinsics.j(p02, "p0");
        Intrinsics.j(p12, "p1");
        return ((BarcodeCountBrushHandler) this.receiver).a(p02, p12);
    }
}
