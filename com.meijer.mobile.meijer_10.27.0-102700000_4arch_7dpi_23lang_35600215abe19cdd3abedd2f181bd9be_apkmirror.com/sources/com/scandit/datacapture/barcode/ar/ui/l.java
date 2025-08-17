package com.scandit.datacapture.barcode.ar.ui;

import com.scandit.datacapture.barcode.data.Barcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final /* synthetic */ class l extends FunctionReferenceImpl implements Function2 {
    public l(Object obj) {
        super(2, obj, BarcodeArView.class, "requestHighlight", "requestHighlight(Lcom/scandit/datacapture/barcode/data/Barcode;Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Barcode p02 = (Barcode) obj;
        Function1 p12 = (Function1) obj2;
        Intrinsics.j(p02, "p0");
        Intrinsics.j(p12, "p1");
        BarcodeArView.access$requestHighlight((BarcodeArView) this.receiver, p02, p12);
        return Unit.f142422a;
    }
}
