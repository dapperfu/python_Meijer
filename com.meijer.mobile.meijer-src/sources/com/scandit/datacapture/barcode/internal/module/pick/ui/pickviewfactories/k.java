package com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories;

import com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.BarcodePickDataCaptureViewWrapper;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final /* synthetic */ class k extends FunctionReferenceImpl implements Function1 {
    public k(com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.j jVar) {
        super(1, jVar, BarcodePickDataCaptureViewWrapper.class, "mapFrameQuadrilateralToView", "mapFrameQuadrilateralToView(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;)Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Quadrilateral p02 = (Quadrilateral) obj;
        Intrinsics.j(p02, "p0");
        return ((BarcodePickDataCaptureViewWrapper) this.receiver).mapFrameQuadrilateralToView(p02);
    }
}
