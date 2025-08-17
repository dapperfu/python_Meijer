package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer;

import android.graphics.RectF;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class n {
    public static final Quadrilateral a(Quadrilateral quadrilateral, BarcodePickViewHighlightStyle style, Size2 minSize) {
        Intrinsics.j(quadrilateral, "<this>");
        Intrinsics.j(style, "style");
        Intrinsics.j(minSize, "minSize");
        if (style instanceof BarcodePickViewHighlightStyle.Rectangular) {
            return com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.k.a(quadrilateral, minSize);
        }
        if (style instanceof BarcodePickViewHighlightStyle.RectangularWithIcons) {
            return com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.k.a(quadrilateral, minSize);
        }
        if (!(style instanceof BarcodePickViewHighlightStyle.Dot) && !(style instanceof BarcodePickViewHighlightStyle.DotWithIcons)) {
            if (!(style instanceof BarcodePickViewHighlightStyle.CustomView)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.j(quadrilateral, "<this>");
            RectF rectF = new RectF(ComparisonsKt.h(quadrilateral.getTopLeft().getX(), quadrilateral.getTopRight().getX(), quadrilateral.getBottomRight().getX(), quadrilateral.getBottomLeft().getX()), ComparisonsKt.h(quadrilateral.getTopLeft().getY(), quadrilateral.getTopRight().getY(), quadrilateral.getBottomRight().getY(), quadrilateral.getBottomLeft().getY()), ComparisonsKt.g(quadrilateral.getTopLeft().getX(), quadrilateral.getTopRight().getX(), quadrilateral.getBottomRight().getX(), quadrilateral.getBottomLeft().getX()), ComparisonsKt.g(quadrilateral.getTopLeft().getY(), quadrilateral.getTopRight().getY(), quadrilateral.getBottomRight().getY(), quadrilateral.getBottomLeft().getY()));
            float fHeight = rectF.height();
            float fWidth = rectF.width();
            if (fWidth > minSize.getWidth() && fHeight > minSize.getHeight()) {
                return QuadrilateralUtilsKt.Quadrilateral(rectF);
            }
            float f10 = 2;
            rectF.inset(-(Math.max(0.0f, minSize.getWidth() - fWidth) / f10), -(Math.max(0.0f, minSize.getHeight() - fHeight) / f10));
            return QuadrilateralUtilsKt.Quadrilateral(rectF);
        }
        return a(quadrilateral);
    }

    public static final Quadrilateral a(Quadrilateral quadrilateral) {
        Point center = QuadrilateralUtilsKt.getCenter(quadrilateral);
        float x10 = center.getX();
        Lazy lazy = k.f122655a;
        float fFloatValue = x10 - ((Number) lazy.getValue()).floatValue();
        float fFloatValue2 = ((Number) lazy.getValue()).floatValue() + center.getX();
        float y10 = center.getY() - ((Number) lazy.getValue()).floatValue();
        float fFloatValue3 = ((Number) lazy.getValue()).floatValue() + center.getY();
        return new Quadrilateral(new Point(fFloatValue, y10), new Point(fFloatValue2, y10), new Point(fFloatValue2, fFloatValue3), new Point(fFloatValue, fFloatValue3));
    }
}
