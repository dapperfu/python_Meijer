package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b implements j {
    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.j
    public final int a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.c viewHolder, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.a drawData) {
        Intrinsics.j(viewHolder, "viewHolder");
        Intrinsics.j(drawData, "drawData");
        return ((Number) h.f123630e.getValue()).intValue();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.j
    public final a b(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.c viewHolder, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.a drawData) {
        Intrinsics.j(viewHolder, "viewHolder");
        Intrinsics.j(drawData, "drawData");
        Point center = QuadrilateralUtilsKt.getCenter(drawData.f123635b);
        int y10 = (int) center.getY();
        int x10 = (int) center.getX();
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.h hVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.h) viewHolder;
        int i10 = hVar.f123680i + hVar.f123681j;
        int height = y10 - ((int) (((QuadrilateralUtilsKt.getHeight(drawData.f123635b) / 2) + ((Number) h.f123626a.getValue()).intValue()) + ((Number) h.f123627b.getValue()).intValue()));
        int i11 = x10 - (hVar.f123680i / 2);
        ViewParent parent = hVar.f123673b.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        int width = ((viewGroup != null ? viewGroup.getWidth() : 0) - i11) - i10;
        if (i11 < 0) {
            i11 = 0;
        } else if (width < 0) {
            i11 += width;
        }
        return new a(height, i11, true, (int) ((center.getX() - i11) - (((Number) h.f123628c.getValue()).intValue() / 2)));
    }
}
