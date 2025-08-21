package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickStatusIconSettings;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes12.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodePickStatusIconSettings f123631a;

    public i(BarcodePickStatusIconSettings statusIconSettings) {
        Intrinsics.j(statusIconSettings, "statusIconSettings");
        this.f123631a = statusIconSettings;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.j
    public final int a(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.c viewHolder, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.a drawData) {
        Intrinsics.j(viewHolder, "viewHolder");
        Intrinsics.j(drawData, "drawData");
        float height = QuadrilateralUtilsKt.getHeight(drawData.f123635b);
        float width = QuadrilateralUtilsKt.getWidth(drawData.f123635b);
        int iMax = Math.max(0, this.f123631a.getMinSize());
        int iMax2 = Math.max(iMax, this.f123631a.getMaxSize());
        return RangesKt.o((int) (this.f123631a.getRatioToHighlightSize() * Math.min(height, width)), PixelExtensionsKt.pxFromDp$default(iMax, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(iMax2, (Context) null, 1, (Object) null));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour.j
    public final a b(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.c viewHolder, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.a drawData) {
        Intrinsics.j(viewHolder, "viewHolder");
        Intrinsics.j(drawData, "drawData");
        Iterator it = CollectionsKt.p(drawData.f123635b.getTopLeft(), drawData.f123635b.getTopRight(), drawData.f123635b.getBottomRight(), drawData.f123635b.getBottomLeft()).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            Point point = (Point) next;
            float x10 = point.getX() - point.getY();
            do {
                Object next2 = it.next();
                Point point2 = (Point) next2;
                float x11 = point2.getX() - point2.getY();
                if (Float.compare(x10, x11) < 0) {
                    next = next2;
                    x10 = x11;
                }
            } while (it.hasNext());
        }
        Point point3 = (Point) next;
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.h hVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.viewholder.h) viewHolder;
        int i10 = hVar.f123680i / 2;
        int x12 = ((int) point3.getX()) - i10;
        int y10 = ((int) point3.getY()) - i10;
        ViewParent parent = hVar.f123673b.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        int width = ((viewGroup != null ? viewGroup.getWidth() : 0) - x12) - (hVar.f123680i + hVar.f123681j);
        if (width < 0 && (x12 = x12 + width) < 0) {
            x12 = 0;
        }
        return new a(y10, x12, false, 0);
    }
}
