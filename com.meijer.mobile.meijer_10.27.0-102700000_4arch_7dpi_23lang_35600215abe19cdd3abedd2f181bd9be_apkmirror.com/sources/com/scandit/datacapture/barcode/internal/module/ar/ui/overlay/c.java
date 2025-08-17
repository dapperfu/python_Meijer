package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f121200a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar) {
        super(1);
        this.f121200a = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodeArAnnotation barcodeArAnnotation = (BarcodeArAnnotation) obj;
        this.f121200a.invoke(barcodeArAnnotation != null ? new BarcodeArAugmentation$Annotation(barcodeArAnnotation, barcodeArAnnotation.createView()) : null);
        return Unit.f142422a;
    }
}
