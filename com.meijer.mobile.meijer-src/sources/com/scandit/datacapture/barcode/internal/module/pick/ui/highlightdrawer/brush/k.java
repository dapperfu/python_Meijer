package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush;

import android.graphics.Path;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import com.scandit.datacapture.core.internal.sdk.common.geometry.Vector;
import com.scandit.datacapture.core.internal.sdk.extensions.PointExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class k {
    public static final Quadrilateral a(Quadrilateral quadrilateral, Size2 minSize) {
        Intrinsics.j(quadrilateral, "<this>");
        Intrinsics.j(minSize, "minSize");
        Vector vector = new Vector(QuadrilateralUtilsKt.getCenterLeft(quadrilateral), QuadrilateralUtilsKt.getCenterRight(quadrilateral));
        Vector vector2 = new Vector(QuadrilateralUtilsKt.getTopCenter(quadrilateral), QuadrilateralUtilsKt.getBottomCenter(quadrilateral));
        float length = vector.getLength();
        float length2 = vector2.getLength();
        if (length >= minSize.getWidth() && length2 >= minSize.getHeight()) {
            return quadrilateral;
        }
        float fMax = Math.max(length, minSize.getWidth());
        float fMax2 = Math.max(length2, minSize.getHeight());
        Quadrilateral Quadrilateral = QuadrilateralUtilsKt.Quadrilateral(PointExtensionsKt.plus(QuadrilateralUtilsKt.getCenter(quadrilateral), new Point((-fMax) / 2.0f, (-fMax2) / 2.0f)), new Size2(fMax, fMax2));
        return QuadrilateralUtilsKt.rotatedByVector(Quadrilateral, QuadrilateralUtilsKt.getCenter(Quadrilateral), vector);
    }

    public static final Path a(Quadrilateral quadrilateral) {
        Intrinsics.j(quadrilateral, "<this>");
        Path path = new Path();
        path.moveTo(quadrilateral.getTopLeft().getX(), quadrilateral.getTopLeft().getY());
        path.lineTo(quadrilateral.getTopRight().getX(), quadrilateral.getTopRight().getY());
        path.lineTo(quadrilateral.getBottomRight().getX(), quadrilateral.getBottomRight().getY());
        path.lineTo(quadrilateral.getBottomLeft().getX(), quadrilateral.getBottomLeft().getY());
        path.close();
        return path;
    }
}
