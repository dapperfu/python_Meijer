package com.scandit.datacapture.barcode.ar.ui.annotations;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes11.dex */
public final /* synthetic */ class m extends FunctionReferenceImpl implements Function0 {
    public m(Object obj) {
        super(0, obj, BarcodeArInfoAnnotation.class, "annotationTapped", "annotationTapped()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeArInfoAnnotation barcodeArInfoAnnotation = (BarcodeArInfoAnnotation) this.receiver;
        barcodeArInfoAnnotation.f120229n.onInfoAnnotationTapped(barcodeArInfoAnnotation);
        return Unit.f142422a;
    }
}
