package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush;

import android.content.Context;
import android.graphics.Paint;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class s {
    public static n a(BarcodePickBasicOverlay container, Function1 onTrackTap, BarcodePickViewHighlightStyle highlightStyle, Function1 quadrilateralMapper, j drawSettings, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.c elementsProvider, Function1 function1, int i10) {
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a aVar = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a.f122546a;
        Function1 statusIconViewDrawerProvider = (i10 & 64) != 0 ? o.f122584a : function1;
        Context context = container.getContext();
        Intrinsics.i(context, "getContext(...)");
        Intrinsics.j(context, "context");
        Intrinsics.j(elementsProvider, "elementsProvider");
        Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.j(drawSettings, "drawSettings");
        i drawDataFactory = new i(context, elementsProvider, quadrilateralMapper, drawSettings);
        LinkedHashMap drawingData = new LinkedHashMap();
        com.scandit.datacapture.barcode.internal.module.ui.i touchEventHandler = new com.scandit.datacapture.barcode.internal.module.ui.i(new p(drawingData), q.f122586a, new r(onTrackTap));
        Paint tapPaint = u.f122588a;
        Paint boundingBoxPaint = u.f122589b;
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(container, "container");
        Intrinsics.j(onTrackTap, "onTrackTap");
        Intrinsics.j(highlightStyle, "highlightStyle");
        Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.j(drawSettings, "drawSettings");
        Intrinsics.j(elementsProvider, "elementsProvider");
        Intrinsics.j(statusIconViewDrawerProvider, "statusIconViewDrawerProvider");
        Intrinsics.j(drawDataFactory, "drawDataFactory");
        Intrinsics.j(drawingData, "drawingData");
        Intrinsics.j(touchEventHandler, "touchEventHandler");
        Intrinsics.j(tapPaint, "tapPaint");
        Intrinsics.j(boundingBoxPaint, "boundingBoxPaint");
        return new n(container, highlightStyle, drawDataFactory, drawSettings, touchEventHandler, drawingData, tapPaint, boundingBoxPaint, statusIconViewDrawerProvider);
    }
}
