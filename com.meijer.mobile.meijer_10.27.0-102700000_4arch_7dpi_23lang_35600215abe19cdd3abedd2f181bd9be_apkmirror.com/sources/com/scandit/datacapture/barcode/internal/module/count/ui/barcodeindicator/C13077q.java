package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C13077q extends FunctionReferenceImpl implements Function1 {
    public C13077q(Object obj) {
        super(1, obj, C13079t.class, "onTouchConfirmed", "onTouchConfirmed(Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode p02 = (TrackedBarcode) obj;
        Intrinsics.j(p02, "p0");
        C13079t c13079t = (C13079t) this.receiver;
        Function4 function4 = c13079t.f121462f;
        N nD = c13079t.d(p02);
        M m10 = !c13079t.f121466j ? M.f121395a : c13079t.f121467k.contains(Integer.valueOf(p02.getGlobalId$scandit_barcode_capture())) ? M.f121396b : M.f121397c;
        int globalId$scandit_barcode_capture = p02.getGlobalId$scandit_barcode_capture();
        function4.invoke(p02, nD, m10, (!c13079t.f121466j || c13079t.f121467k.contains(Integer.valueOf(globalId$scandit_barcode_capture))) ? NativeBarcodeCountNotInListStatus.NONE : c13079t.f121468l.contains(Integer.valueOf(globalId$scandit_barcode_capture)) ? NativeBarcodeCountNotInListStatus.ACCEPTED : c13079t.f121469m.contains(Integer.valueOf(globalId$scandit_barcode_capture)) ? NativeBarcodeCountNotInListStatus.REJECTED : NativeBarcodeCountNotInListStatus.NONE);
        return Unit.f142422a;
    }
}
