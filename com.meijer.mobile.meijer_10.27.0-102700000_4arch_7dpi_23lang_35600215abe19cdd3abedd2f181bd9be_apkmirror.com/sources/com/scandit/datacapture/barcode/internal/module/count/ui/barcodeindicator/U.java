package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.graphics.RectF;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes11.dex */
public final class U implements S {

    /* renamed from: b, reason: collision with root package name */
    public final DataCaptureView f121410b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f121411c = new RectF();

    public final V a(TrackedBarcode trackedBarcode) {
        Quadrilateral locationIgnoringLicense$scandit_barcode_capture;
        Point center;
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        int globalId$scandit_barcode_capture = trackedBarcode.getGlobalId$scandit_barcode_capture();
        DataCaptureView dataCaptureView = this.f121410b;
        if (dataCaptureView == null || (locationIgnoringLicense$scandit_barcode_capture = dataCaptureView.mapFrameQuadrilateralToView(trackedBarcode.getLocationIgnoringLicense$scandit_barcode_capture())) == null) {
            locationIgnoringLicense$scandit_barcode_capture = trackedBarcode.getLocationIgnoringLicense$scandit_barcode_capture();
        }
        DataCaptureView dataCaptureView2 = this.f121410b;
        if (dataCaptureView2 == null || (center = dataCaptureView2.mapFramePointToView(QuadrilateralUtilsKt.getCenter(trackedBarcode.getLocationIgnoringLicense$scandit_barcode_capture()))) == null) {
            center = QuadrilateralUtilsKt.getCenter(trackedBarcode.getLocationIgnoringLicense$scandit_barcode_capture());
        }
        return new V(globalId$scandit_barcode_capture, locationIgnoringLicense$scandit_barcode_capture, center, a(trackedBarcode.getLocationIgnoringLicense$scandit_barcode_capture()));
    }

    public U(DataCaptureView dataCaptureView) {
        this.f121410b = dataCaptureView;
    }

    public final float a(Quadrilateral quadrilateral) {
        Quadrilateral quadrilateralMapFrameQuadrilateralToView;
        RectF rectF = this.f121411c;
        DataCaptureView dataCaptureView = this.f121410b;
        if (dataCaptureView != null && (quadrilateralMapFrameQuadrilateralToView = dataCaptureView.mapFrameQuadrilateralToView(quadrilateral)) != null) {
            quadrilateral = quadrilateralMapFrameQuadrilateralToView;
        }
        rectF.left = ComparisonsKt.h(quadrilateral.getTopLeft().getX(), quadrilateral.getTopRight().getX(), quadrilateral.getBottomRight().getX(), quadrilateral.getBottomLeft().getX());
        rectF.top = ComparisonsKt.h(quadrilateral.getTopLeft().getY(), quadrilateral.getTopRight().getY(), quadrilateral.getBottomRight().getY(), quadrilateral.getBottomLeft().getY());
        rectF.right = ComparisonsKt.g(quadrilateral.getTopLeft().getX(), quadrilateral.getTopRight().getX(), quadrilateral.getBottomRight().getX(), quadrilateral.getBottomLeft().getX());
        rectF.bottom = ComparisonsKt.g(quadrilateral.getTopLeft().getY(), quadrilateral.getTopRight().getY(), quadrilateral.getBottomRight().getY(), quadrilateral.getBottomLeft().getY());
        float fMin = Math.min(rectF.width(), rectF.height());
        S.f121408a.getClass();
        return RangesKt.n(fMin / ((Number) Q.f121407b.getValue()).floatValue(), 0.5f, 1.0f);
    }
}
