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

/* loaded from: classes12.dex */
public final class h implements c {

    /* renamed from: e, reason: collision with root package name */
    public static final Lazy f123644e = LazyKt.b(g.f123643a);

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f123645f = LazyKt.b(f.f123642a);

    /* renamed from: a, reason: collision with root package name */
    public final Context f123646a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f123647b;

    /* renamed from: c, reason: collision with root package name */
    public final j f123648c;

    /* renamed from: d, reason: collision with root package name */
    public final BarcodePickViewHighlightStyle f123649d;

    public h(Context context, n quadrilateralMapper, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.c cache, BarcodePickViewHighlightStyle highlightStyle) {
        Intrinsics.j(context, "context");
        Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.j(cache, "cache");
        Intrinsics.j(highlightStyle, "highlightStyle");
        this.f123646a = context;
        this.f123647b = quadrilateralMapper;
        this.f123648c = cache;
        this.f123649d = highlightStyle;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata.c
    public final a a(TrackedObject track, BarcodePickState pickState, BarcodePickState barcodePickState) {
        int iIntValue;
        Intrinsics.j(track, "track");
        Intrinsics.j(pickState, "pickState");
        boolean z10 = false;
        boolean z11 = ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.g) this.f123648c.a(track.getData(), pickState, barcodePickState)).f123717a.a(this.f123646a) != null;
        BarcodePickViewHighlightStyle barcodePickViewHighlightStyle = this.f123649d;
        Lazy lazy = k.f123607a;
        Intrinsics.j(barcodePickViewHighlightStyle, "<this>");
        Intrinsics.j(pickState, "pickState");
        if (!z11 && (((barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Dot) || (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons)) && (pickState == BarcodePickState.IGNORE || pickState == BarcodePickState.UNKNOWN))) {
            z10 = true;
        }
        if (z10) {
            iIntValue = ((Number) f123644e.getValue()).intValue();
        } else {
            if (z10) {
                throw new NoWhenBranchMatchedException();
            }
            iIntValue = ((Number) f123645f.getValue()).intValue();
        }
        Point center = QuadrilateralUtilsKt.getCenter(QuadrilateralUtilsKt.boundingBox((Quadrilateral) this.f123647b.invoke(track.getLocationIgnoringLicense$scandit_barcode_capture())));
        float f10 = iIntValue;
        return new a(track.getIdentifier(), new Quadrilateral(new Point(center.getX() - f10, center.getY() - f10), new Point(center.getX() + f10, center.getY() - f10), new Point(center.getX() + f10, center.getY() + f10), new Point(center.getX() - f10, center.getY() + f10)), pickState);
    }
}
