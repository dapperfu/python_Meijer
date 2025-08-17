package com.scandit.datacapture.barcode.ar.ui;

import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final /* synthetic */ class n extends FunctionReferenceImpl implements Function1 {
    public n(DataCaptureView dataCaptureView) {
        super(1, dataCaptureView, DataCaptureView.class, "mapFrameQuadrilateralToView", "mapFrameQuadrilateralToView(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;)Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Quadrilateral p02 = (Quadrilateral) obj;
        Intrinsics.j(p02, "p0");
        return ((DataCaptureView) this.receiver).mapFrameQuadrilateralToView(p02);
    }
}
