package com.scandit.datacapture.barcode.internal.module.count.ui.popover;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.C13083x;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.C13084y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes11.dex */
public final /* synthetic */ class d extends FunctionReferenceImpl implements Function0 {
    public d(Object obj) {
        super(0, obj, g.class, "onAcceptButtonTapped", "onAcceptButtonTapped()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TrackedBarcode trackedBarcode;
        C13084y c13084y = (C13084y) ((C13083x) ((g) this.receiver)).f121486a.get();
        if (c13084y != null && (trackedBarcode = c13084y.f121492e) != null) {
            c13084y.f121488a.didAcceptNotInListBarcode(trackedBarcode);
        }
        return Unit.f142422a;
    }
}
