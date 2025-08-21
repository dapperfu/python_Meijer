package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements Function2 {
    public a(Object obj) {
        super(2, obj, e.class, "setupViewHolderForTrackedObjectLocation", "setupViewHolderForTrackedObjectLocation(Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightdrawer/statusicon/viewholder/BarcodePickStatusIconViewHolder;Lcom/scandit/datacapture/barcode/internal/module/pick/ui/highlightdrawer/statusicon/drawdata/BarcodePickStatusIconDrawData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.c p02 = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.c) obj;
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.a p12 = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.a) obj2;
        Intrinsics.j(p02, "p0");
        Intrinsics.j(p12, "p1");
        ((e) this.receiver).a(p02, p12);
        return Unit.f143329a;
    }
}
