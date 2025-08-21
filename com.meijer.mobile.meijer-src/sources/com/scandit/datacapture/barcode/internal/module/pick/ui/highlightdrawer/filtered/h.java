package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.filtered;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.k;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class h extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Quadrilateral coordinates) {
        super(k.a(coordinates));
        Intrinsics.j(coordinates, "coordinates");
    }
}
