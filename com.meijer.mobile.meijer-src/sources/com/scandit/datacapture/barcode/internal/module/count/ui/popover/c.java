package com.scandit.datacapture.barcode.internal.module.count.ui.popover;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.C13216x;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.C13217y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes12.dex */
public final /* synthetic */ class c extends FunctionReferenceImpl implements Function0 {
    public c(Object obj) {
        super(0, obj, g.class, "onRejectButtonTapped", "onRejectButtonTapped()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TrackedBarcode trackedBarcode;
        C13217y c13217y = (C13217y) ((C13216x) ((g) this.receiver)).f122438a.get();
        if (c13217y != null && (trackedBarcode = c13217y.f122444e) != null) {
            c13217y.f122440a.didRejectNotInListBarcode(trackedBarcode);
        }
        return Unit.f143329a;
    }
}
