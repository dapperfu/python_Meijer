package com.scandit.datacapture.barcode.ar.ui;

import com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.BarcodeArAugmentation$Annotation;
import com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.BarcodeArAugmentation$Highlight;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final /* synthetic */ class s extends FunctionReferenceImpl implements Function3 {
    public s(com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.i iVar) {
        super(3, iVar, com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.g.class, "updateAnnotation", "updateAnnotation(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;Lcom/scandit/datacapture/barcode/internal/module/ar/ui/overlay/BarcodeArAugmentation$Annotation;Lcom/scandit/datacapture/barcode/internal/module/ar/ui/overlay/BarcodeArAugmentation$Highlight;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Quadrilateral location = (Quadrilateral) obj;
        BarcodeArAugmentation$Annotation annotationData = (BarcodeArAugmentation$Annotation) obj2;
        BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight = (BarcodeArAugmentation$Highlight) obj3;
        Intrinsics.j(location, "p0");
        Intrinsics.j(annotationData, "p1");
        ((com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.i) ((com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.g) this.receiver)).getClass();
        Intrinsics.j(location, "location");
        Intrinsics.j(annotationData, "annotationData");
        annotationData.a().update(location, barcodeArAugmentation$Highlight != null ? barcodeArAugmentation$Highlight.c() : null, annotationData.b());
        return Unit.f143329a;
    }
}
