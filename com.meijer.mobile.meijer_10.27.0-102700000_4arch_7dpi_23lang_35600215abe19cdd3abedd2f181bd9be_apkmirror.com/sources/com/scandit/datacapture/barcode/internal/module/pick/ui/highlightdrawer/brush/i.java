package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class i implements b {

    /* renamed from: e, reason: collision with root package name */
    public static final List f122561e = CollectionsKt.p(new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.l(((Number) LazyKt.b(e.f122557a).getValue()).floatValue(), ((Number) LazyKt.b(d.f122556a).getValue()).floatValue(), ((Number) LazyKt.b(c.f122555a).getValue()).intValue()), new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.l(((Number) LazyKt.b(h.f122560a).getValue()).floatValue(), ((Number) LazyKt.b(g.f122559a).getValue()).floatValue(), ((Number) LazyKt.b(f.f122558a).getValue()).intValue()));

    /* renamed from: a, reason: collision with root package name */
    public final Context f122562a;

    /* renamed from: b, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.j f122563b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f122564c;

    /* renamed from: d, reason: collision with root package name */
    public final j f122565d;

    public i(Context context, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.c elementsProvider, Function1 quadrilateralMapper, j drawSettings) {
        Intrinsics.j(context, "context");
        Intrinsics.j(elementsProvider, "elementsProvider");
        Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.j(drawSettings, "drawSettings");
        this.f122562a = context;
        this.f122563b = elementsProvider;
        this.f122564c = quadrilateralMapper;
        this.f122565d = drawSettings;
    }

    public final a a(TrackedObject track, BarcodePickState pickState, BarcodePickViewHighlightStyle highlightStyle) {
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.m mVarA;
        v tVar;
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
        Intrinsics.j(highlightStyle, "highlightStyle");
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.g gVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.g) this.f122563b.a(track.getData(), pickState, null);
        Drawable drawableA = gVar.f122765a.a(this.f122562a);
        Quadrilateral quadrilateral = (Quadrilateral) this.f122564c.invoke(track.getLocationIgnoringLicense$scandit_barcode_capture());
        Quadrilateral quadrilateralA = k.a(quadrilateral, this.f122565d.f122571f);
        Quadrilateral quadrilateralBoundingBox = QuadrilateralUtilsKt.boundingBox(quadrilateral);
        Quadrilateral quadrilateralA2 = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.n.a(quadrilateral, highlightStyle, this.f122565d.f122567b);
        BarcodePickBrush barcodePickBrush = gVar.f122766b;
        boolean z10 = highlightStyle instanceof BarcodePickViewHighlightStyle.Dot;
        if (z10 ? true : highlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons) {
            mVarA = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.a.a(barcodePickBrush, f122561e);
        } else {
            if (!(highlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular ? true : highlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons)) {
                if (highlightStyle instanceof BarcodePickViewHighlightStyle.CustomView) {
                    throw new IllegalStateException("Cannot create brush data for CustomView style");
                }
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.j(barcodePickBrush, "<this>");
            mVarA = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.a.a(barcodePickBrush, CollectionsKt.m());
        }
        boolean z11 = drawableA != null;
        if (highlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular ? true : highlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons) {
            tVar = new w(quadrilateralA);
        } else {
            if (!(z10 ? true : highlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons)) {
                if (highlightStyle instanceof BarcodePickViewHighlightStyle.CustomView) {
                    throw new IllegalStateException("Cannot create brush DrawData for CustomView style");
                }
                throw new NoWhenBranchMatchedException();
            }
            Lazy lazy = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.k.f122655a;
            Intrinsics.j(highlightStyle, "<this>");
            Intrinsics.j(pickState, "pickState");
            boolean z12 = !z11 && (z10 || (highlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons)) && (pickState == BarcodePickState.IGNORE || pickState == BarcodePickState.UNKNOWN);
            if (z12) {
                tVar = new x(quadrilateralA);
            } else {
                if (z12) {
                    throw new NoWhenBranchMatchedException();
                }
                tVar = new t(quadrilateralA);
            }
        }
        return new a(mVarA, tVar, new w(quadrilateralA2), new w(quadrilateralBoundingBox), pickState, track, drawableA);
    }
}
