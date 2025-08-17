package com.scandit.datacapture.barcode.internal.module.ui.popover;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final /* synthetic */ class G extends FunctionReferenceImpl implements Function2 {
    public G(Object obj) {
        super(2, obj, K.class, "changeToVerticalAbove", "changeToVerticalAbove(Lcom/scandit/datacapture/barcode/internal/module/ui/popover/PopoverIndicatorData;Lcom/scandit/datacapture/barcode/internal/module/ui/popover/PopoverSizes;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        O p02 = (O) obj;
        P p12 = (P) obj2;
        Intrinsics.j(p02, "p0");
        Intrinsics.j(p12, "p1");
        K.c((K) this.receiver, p02, p12);
        return Unit.f142422a;
    }
}
