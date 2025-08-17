package com.scandit.datacapture.barcode.internal.module.count.ui;

import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final /* synthetic */ class c extends FunctionReferenceImpl implements Function1 {
    public c(Object obj) {
        super(1, obj, DataCaptureView.class, "mapFrameQuadrilateralToView", "mapFrameQuadrilateralToView(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;)Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Quadrilateral p02 = (Quadrilateral) obj;
        Intrinsics.j(p02, "p0");
        return ((DataCaptureView) this.receiver).mapFrameQuadrilateralToView(p02);
    }
}
