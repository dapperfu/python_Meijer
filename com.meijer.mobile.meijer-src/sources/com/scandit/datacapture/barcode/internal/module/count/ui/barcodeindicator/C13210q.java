package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C13210q extends FunctionReferenceImpl implements Function1 {
    public C13210q(Object obj) {
        super(1, obj, C13212t.class, "onTouchConfirmed", "onTouchConfirmed(Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode p02 = (TrackedBarcode) obj;
        Intrinsics.j(p02, "p0");
        C13212t c13212t = (C13212t) this.receiver;
        Function4 function4 = c13212t.f122414f;
        N nD = c13212t.d(p02);
        M m10 = !c13212t.f122418j ? M.f122347a : c13212t.f122419k.contains(Integer.valueOf(p02.getGlobalId$scandit_barcode_capture())) ? M.f122348b : M.f122349c;
        int globalId$scandit_barcode_capture = p02.getGlobalId$scandit_barcode_capture();
        function4.invoke(p02, nD, m10, (!c13212t.f122418j || c13212t.f122419k.contains(Integer.valueOf(globalId$scandit_barcode_capture))) ? NativeBarcodeCountNotInListStatus.NONE : c13212t.f122420l.contains(Integer.valueOf(globalId$scandit_barcode_capture)) ? NativeBarcodeCountNotInListStatus.ACCEPTED : c13212t.f122421m.contains(Integer.valueOf(globalId$scandit_barcode_capture)) ? NativeBarcodeCountNotInListStatus.REJECTED : NativeBarcodeCountNotInListStatus.NONE);
        return Unit.f143329a;
    }
}
