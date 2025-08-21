package com.scandit.datacapture.barcode.ar.ui;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.BarcodeArAugmentation$Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final /* synthetic */ class c extends FunctionReferenceImpl implements Function2 {
    public c(Object obj) {
        super(2, obj, BarcodeArView.class, "onAnnotationOrElementTap", "onAnnotationOrElementTap(Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;Lcom/scandit/datacapture/barcode/internal/module/ar/ui/overlay/BarcodeArAugmentation$Annotation;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        TrackedBarcode p02 = (TrackedBarcode) obj;
        BarcodeArAugmentation$Annotation p12 = (BarcodeArAugmentation$Annotation) obj2;
        Intrinsics.j(p02, "p0");
        Intrinsics.j(p12, "p1");
        BarcodeArView.access$onAnnotationOrElementTap((BarcodeArView) this.receiver, p02, p12);
        return Unit.f143329a;
    }
}
