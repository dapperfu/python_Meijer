package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
    public b(BarcodePickViewHighlightStyle.Dot dot) {
        super(1, dot, BarcodePickViewHighlightStyle.Dot.class, "getSelectedBrushForState", "getSelectedBrushForState(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;)Lcom/scandit/datacapture/core/ui/style/Brush;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodePickState p02 = (BarcodePickState) obj;
        Intrinsics.j(p02, "p0");
        return ((BarcodePickViewHighlightStyle.Dot) this.receiver).getSelectedBrushForState(p02);
    }
}
