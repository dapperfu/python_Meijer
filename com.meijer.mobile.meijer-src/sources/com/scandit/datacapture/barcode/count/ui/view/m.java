package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.hardwarebutton.HardwareKeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final /* synthetic */ class m extends FunctionReferenceImpl implements Function1 {
    public m(Object obj) {
        super(1, obj, BarcodeCountView.class, "onHardwareKeyEvent", "onHardwareKeyEvent(Lcom/scandit/datacapture/barcode/hardwarebutton/HardwareKeyEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HardwareKeyEvent p02 = (HardwareKeyEvent) obj;
        Intrinsics.j(p02, "p0");
        BarcodeCountView.access$onHardwareKeyEvent((BarcodeCountView) this.receiver, p02);
        return Unit.f143329a;
    }
}
