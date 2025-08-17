package com.scandit.datacapture.barcode.ar.ui;

import com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.BarcodeArAugmentation$Annotation;
import com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.BarcodeArAugmentation$Highlight;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final /* synthetic */ class t extends FunctionReferenceImpl implements Function2 {
    public t(com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.i iVar) {
        super(2, iVar, com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.g.class, "removeAnnotation", "removeAnnotation(Lcom/scandit/datacapture/barcode/internal/module/ar/ui/overlay/BarcodeArAugmentation$Annotation;Lcom/scandit/datacapture/barcode/internal/module/ar/ui/overlay/BarcodeArAugmentation$Highlight;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BarcodeArAugmentation$Annotation p02 = (BarcodeArAugmentation$Annotation) obj;
        Intrinsics.j(p02, "p0");
        ((com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.i) ((com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.g) this.receiver)).a(p02, (BarcodeArAugmentation$Highlight) obj2);
        return Unit.f142422a;
    }
}
