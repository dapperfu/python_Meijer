package com.scandit.datacapture.barcode.ar.ui;

import com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.BarcodeArAugmentation$Highlight;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final /* synthetic */ class p extends FunctionReferenceImpl implements Function2 {
    public p(com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.i iVar) {
        super(2, iVar, com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.g.class, "updateHighlight", "updateHighlight(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;Lcom/scandit/datacapture/barcode/internal/module/ar/ui/overlay/BarcodeArAugmentation$Highlight;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Quadrilateral location = (Quadrilateral) obj;
        BarcodeArAugmentation$Highlight highlightData = (BarcodeArAugmentation$Highlight) obj2;
        Intrinsics.j(location, "p0");
        Intrinsics.j(highlightData, "p1");
        ((com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.i) ((com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.g) this.receiver)).getClass();
        Intrinsics.j(location, "location");
        Intrinsics.j(highlightData, "highlightData");
        highlightData.a().update(highlightData.b(), location);
        return Unit.f142422a;
    }
}
