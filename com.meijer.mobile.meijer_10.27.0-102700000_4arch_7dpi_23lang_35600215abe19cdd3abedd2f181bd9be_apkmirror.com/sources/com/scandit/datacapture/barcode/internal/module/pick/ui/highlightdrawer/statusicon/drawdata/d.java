package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata;

import android.view.View;
import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickElementsCache;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodePickElementsCache f122686a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f122687b;

    public d(com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.f customViewCache, com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.i quadrilateralMapper) {
        Intrinsics.j(customViewCache, "customViewCache");
        Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
        this.f122686a = customViewCache;
        this.f122687b = quadrilateralMapper;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.c
    public final a a(TrackedObject track, BarcodePickState pickState, BarcodePickState barcodePickState) {
        View view;
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
        Quadrilateral quadrilateralBoundingBox = QuadrilateralUtilsKt.boundingBox((Quadrilateral) this.f122687b.invoke(track.getLocationIgnoringLicense$scandit_barcode_capture()));
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.h hVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.h) this.f122686a.a(track.getData(), pickState, barcodePickState);
        if (hVar == null || (view = hVar.f122768a) == null) {
            return new a(track.getIdentifier(), quadrilateralBoundingBox, pickState);
        }
        Intrinsics.j(view, "view");
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        Size2 size2 = new Size2(view.getMeasuredWidth(), view.getMeasuredHeight());
        float f10 = 2;
        float width = size2.getWidth() / f10;
        float height = size2.getHeight() / f10;
        Point center = QuadrilateralUtilsKt.getCenter(quadrilateralBoundingBox);
        return new a(track.getIdentifier(), new Quadrilateral(new Point(center.getX() - width, center.getY() - height), new Point(center.getX() + width, center.getY() - height), new Point(center.getX() + width, center.getY() + height), new Point(center.getX() - width, center.getY() + height)), pickState);
    }
}
