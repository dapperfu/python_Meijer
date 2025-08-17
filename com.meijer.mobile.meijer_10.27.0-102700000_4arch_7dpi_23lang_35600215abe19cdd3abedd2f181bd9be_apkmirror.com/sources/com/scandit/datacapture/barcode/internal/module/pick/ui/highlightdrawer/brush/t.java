package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush;

import android.graphics.Path;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class t extends v {
    public t(Quadrilateral coordinates) {
        Intrinsics.j(coordinates, "coordinates");
        Path path = new Path();
        Point center = QuadrilateralUtilsKt.getCenter(coordinates);
        path.addCircle(center.getX(), center.getY(), ((Number) com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.k.f122655a.getValue()).floatValue(), Path.Direction.CW);
        super(coordinates, path);
    }
}
