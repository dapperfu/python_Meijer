package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata;

import android.content.Context;
import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.k;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.j;
import com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.n;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class h implements c {

    /* renamed from: e, reason: collision with root package name */
    public static final Lazy f122692e = LazyKt.b(g.f122691a);

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f122693f = LazyKt.b(f.f122690a);

    /* renamed from: a, reason: collision with root package name */
    public final Context f122694a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f122695b;

    /* renamed from: c, reason: collision with root package name */
    public final j f122696c;

    /* renamed from: d, reason: collision with root package name */
    public final BarcodePickViewHighlightStyle f122697d;

    public h(Context context, n quadrilateralMapper, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.c cache, BarcodePickViewHighlightStyle highlightStyle) {
        Intrinsics.j(context, "context");
        Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.j(cache, "cache");
        Intrinsics.j(highlightStyle, "highlightStyle");
        this.f122694a = context;
        this.f122695b = quadrilateralMapper;
        this.f122696c = cache;
        this.f122697d = highlightStyle;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.c
    public final a a(TrackedObject track, BarcodePickState pickState, BarcodePickState barcodePickState) {
        int iIntValue;
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
        boolean z10 = false;
        boolean z11 = ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.g) this.f122696c.a(track.getData(), pickState, barcodePickState)).f122765a.a(this.f122694a) != null;
        BarcodePickViewHighlightStyle barcodePickViewHighlightStyle = this.f122697d;
        Lazy lazy = k.f122655a;
        Intrinsics.j(barcodePickViewHighlightStyle, "<this>");
        Intrinsics.j(pickState, "pickState");
        if (!z11 && (((barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Dot) || (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons)) && (pickState == BarcodePickState.IGNORE || pickState == BarcodePickState.UNKNOWN))) {
            z10 = true;
        }
        if (z10) {
            iIntValue = ((Number) f122692e.getValue()).intValue();
        } else {
            if (z10) {
                throw new NoWhenBranchMatchedException();
            }
            iIntValue = ((Number) f122693f.getValue()).intValue();
        }
        Point center = QuadrilateralUtilsKt.getCenter(QuadrilateralUtilsKt.boundingBox((Quadrilateral) this.f122695b.invoke(track.getLocationIgnoringLicense$scandit_barcode_capture())));
        float f10 = iIntValue;
        return new a(track.getIdentifier(), new Quadrilateral(new Point(center.getX() - f10, center.getY() - f10), new Point(center.getX() + f10, center.getY() - f10), new Point(center.getX() + f10, center.getY() + f10), new Point(center.getX() - f10, center.getY() + f10)), pickState);
    }
}
