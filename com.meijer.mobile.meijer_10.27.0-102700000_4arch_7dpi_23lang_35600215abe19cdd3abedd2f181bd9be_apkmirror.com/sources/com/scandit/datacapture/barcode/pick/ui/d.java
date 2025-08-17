package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.hardwarebutton.HardwareKeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final /* synthetic */ class d extends FunctionReferenceImpl implements Function1 {
    public d(Object obj) {
        super(1, obj, BarcodePickView.class, "onHardwareKeyEvent", "onHardwareKeyEvent(Lcom/scandit/datacapture/barcode/hardwarebutton/HardwareKeyEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HardwareKeyEvent p02 = (HardwareKeyEvent) obj;
        Intrinsics.j(p02, "p0");
        BarcodePickView.access$onHardwareKeyEvent((BarcodePickView) this.receiver, p02);
        return Unit.f142422a;
    }
}
