package com.scandit.datacapture.barcode.ar.ui;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.BarcodeArAugmentation$Annotation;
import com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.BarcodeArAugmentation$Highlight;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final /* synthetic */ class r extends FunctionReferenceImpl implements Function3 {
    public r(com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.i iVar) {
        super(3, iVar, com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.g.class, "addAnnotation", "addAnnotation(Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;Lcom/scandit/datacapture/barcode/internal/module/ar/ui/overlay/BarcodeArAugmentation$Annotation;Lcom/scandit/datacapture/barcode/internal/module/ar/ui/overlay/BarcodeArAugmentation$Highlight;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TrackedBarcode p02 = (TrackedBarcode) obj;
        BarcodeArAugmentation$Annotation p12 = (BarcodeArAugmentation$Annotation) obj2;
        Intrinsics.j(p02, "p0");
        Intrinsics.j(p12, "p1");
        ((com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.i) ((com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.g) this.receiver)).a(p02, p12, (BarcodeArAugmentation$Highlight) obj3);
        return Unit.f142422a;
    }
}
