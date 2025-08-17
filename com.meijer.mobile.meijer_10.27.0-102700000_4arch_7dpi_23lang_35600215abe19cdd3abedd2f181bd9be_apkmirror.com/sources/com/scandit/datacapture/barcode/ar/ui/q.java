package com.scandit.datacapture.barcode.ar.ui;

import android.view.View;
import com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.BarcodeArAugmentation$Highlight;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final /* synthetic */ class q extends FunctionReferenceImpl implements Function1 {
    public q(com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.i iVar) {
        super(1, iVar, com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.g.class, "removeHighlight", "removeHighlight(Lcom/scandit/datacapture/barcode/internal/module/ar/ui/overlay/BarcodeArAugmentation$Highlight;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodeArAugmentation$Highlight highlightData = (BarcodeArAugmentation$Highlight) obj;
        Intrinsics.j(highlightData, "p0");
        com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.i iVar = (com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.i) ((com.scandit.datacapture.barcode.internal.module.ar.ui.overlay.g) this.receiver);
        iVar.getClass();
        Intrinsics.j(highlightData, "highlightData");
        View viewB = highlightData.b();
        viewB.setOnClickListener(null);
        iVar.removeView(viewB);
        return Unit.f142422a;
    }
}
