package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.filtered;

import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class e {
    public static d a(BarcodePickBasicOverlay container, Function1 quadrilateralMapper, f drawSettings) {
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a aVar = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a.f123498a;
        Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.j(drawSettings, "drawSettings");
        c drawDataFactory = new c(quadrilateralMapper, drawSettings);
        LinkedHashMap drawingData = new LinkedHashMap();
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(container, "container");
        Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.j(drawSettings, "drawSettings");
        Intrinsics.j(drawDataFactory, "drawDataFactory");
        Intrinsics.j(drawingData, "drawingData");
        return new d(container, drawDataFactory, drawingData);
    }
}
